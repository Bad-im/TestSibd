package com.mkyong.examples.service;

import com.mkyong.examples.model.ArrayElement;
import com.mkyong.examples.repository.ArrayElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SortingService {

    @Autowired
    private ArrayElementRepository repository;

    public List<ArrayElement> BubbleSort(List<Integer> values) {
        int n = values.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (values.get(j) > values.get(j + 1)) {
                    int temp = values.get(j);
                    values.set(j, values.get(j + 1));
                    values.set(j + 1, temp);
                }
            }
        }
        Long sortId = System.currentTimeMillis();
        return saveSortedArray(values, sortId);
    }

    private List<ArrayElement> saveSortedArray(List<Integer> sortedValues, Long sortId) {
        repository.deleteAll();
        for (Integer value : sortedValues) {
            ArrayElement element = new ArrayElement(value, sortId);
            repository.save(element);
        }
        return repository.findAll();
    }

    public List<ArrayElement> getSortedArrayBySortId(Long sortId) {
        return repository.findBySortId(sortId);
    }
}
