package com.dkm.qlda.common.service;

import com.dkm.qlda.common.exception.NotFoundException;

import java.util.List;

public interface BaseService<T, E> {
    List<T> findAll();
    T findById(E id);
    List<T> findAllById(E id);
    int save(T object);
    void delete(E id);
}
