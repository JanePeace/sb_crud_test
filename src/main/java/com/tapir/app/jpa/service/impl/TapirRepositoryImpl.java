package com.tapir.app.jpa.service.impl;

import com.tapir.app.jpa.dao.TapirDAO;
import com.tapir.app.jpa.model.Tapir;
import com.tapir.app.jpa.service.TapirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TapirRepositoryImpl implements TapirRepository {

    @Autowired
    private TapirDAO tapirDAO;

    @Override
    public Tapir persist(Tapir tapir) {
        return tapirDAO.save(tapir);
    }

    @Override
    public List<Tapir> findAll() {
        return tapirDAO.findAll();
    }

    @Override
    public Tapir findById(Long id) {
        return tapirDAO.getOne(id);
    }

    @Override
    public boolean delete(Tapir tapir) {
        tapirDAO.delete(tapir);
        return true;
    }
}
