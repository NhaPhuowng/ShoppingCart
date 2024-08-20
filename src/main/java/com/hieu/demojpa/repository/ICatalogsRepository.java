package com.hieu.demojpa.repository;

import com.hieu.demojpa.entity.Catalogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICatalogsRepository extends JpaRepository<Catalogs, Long> {
}
