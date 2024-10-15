package com.gzzsy.backend.core.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
public class Page<T> implements Serializable {
    private Integer page;

    private Integer size;

    private Integer total;

    private Boolean hasNext;

    private List<T> list;

    public Page() {

    }

    public Page(Integer page, Integer size, List<T> list, Integer total) {
        this.page = page;
        this.size = size;
        this.list = list;
        this.total = total;
        this.hasNext = total > page * size;
    }

    public static <T> Page<T> empty(Integer page, Integer size) {
        return new Page<>(page, size, Collections.emptyList(), 0);
    }
}
