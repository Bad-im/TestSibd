package com.mkyong.examples.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ArrayElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer elementValue;

    private Long sortId;

    public ArrayElement() {}

    public ArrayElement(Integer elementValue, Long sortId) {
        this.elementValue = elementValue;
        this.sortId = sortId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getElementValue() {
        return elementValue;
    }

    public void setElementValue(Integer elementValue) {
        this.elementValue = elementValue;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }
}
