package com.tapir.app.jpa.dao;

import com.tapir.app.jpa.model.Tapir;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TapirDAO extends JpaRepository<Tapir, Long> {
}
