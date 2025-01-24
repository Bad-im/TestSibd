package com.mkyong.examples.controller;

import com.mkyong.examples.model.ArrayElement;
import com.mkyong.examples.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sort")
public class SortingController {

    @Autowired
    private SortingService sortingService;

    @PostMapping
    public List<ArrayElement> sortArray(@RequestBody List<Integer> values) {
        return sortingService.BubbleSort(values);
    }

    @GetMapping("/by-sort-id/{sortId}")
    public List<ArrayElement> getSortedArrayBySortId(@PathVariable Long sortId) {
        return sortingService.getSortedArrayBySortId(sortId);
    }

}
