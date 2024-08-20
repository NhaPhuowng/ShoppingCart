package com.hieu.demojpa.repository;

import com.hieu.demojpa.entity.Catalogs;
import com.hieu.demojpa.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductsRepository extends JpaRepository<Products, Long> {
}
