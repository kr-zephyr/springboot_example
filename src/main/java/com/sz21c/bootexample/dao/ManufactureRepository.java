package com.sz21c.bootexample.dao;

import com.sz21c.bootexample.domain.ManufactureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureRepository extends JpaRepository<ManufactureEntity, Long> {
}
