package com.dkm.qlda.taskservice.service;

import java.util.List;

public interface BaseService<T, E> {
    List<T> findAll();
}
