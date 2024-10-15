package com.gzzsy.backend.core.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
public class RollingPage<T> implements Serializable {
    private Integer page;

    private Integer size;

    private Boolean hasNext;

    private List<T> list;

    public RollingPage(Integer page, Integer size, Boolean hasNext, List<T> list) {
        this.page = page;
        this.size = size;
        this.hasNext = hasNext;
        this.list = list;
    }

    public static <T> RollingPage<T> empty(Integer page, Integer size) {
        return new RollingPage<>(page, size, false, Collections.emptyList());
    }
}
