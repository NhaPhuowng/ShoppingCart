package com.hieu.demojpa.service.Impl;

import com.hieu.demojpa.entity.Products;
import com.hieu.demojpa.repository.IProductsRepository;
import com.hieu.demojpa.service.IProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {

    private final IProductsRepository productRepository;

    public ProductService(IProductsRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Page<Products> findAllProductsPageable(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Products> findById(Long id) {
        return productRepository.findById(id);
    }

}
