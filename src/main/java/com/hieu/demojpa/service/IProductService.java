package com.hieu.demojpa.service;

import com.hieu.demojpa.entity.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface IProductService {
    Optional<Products> findById(Long id);

    Page<Products> findAllProductsPageable(Pageable pageable);
}
