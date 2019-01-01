package com.tapir.app.jpa.service;

import com.tapir.app.jpa.model.Tapir;

import java.util.List;

public interface TapirRepository {
    Tapir persist(Tapir tapir);

    List<Tapir> findAll();

    Tapir findById(Long id);

    boolean delete(Tapir tapir);
}
