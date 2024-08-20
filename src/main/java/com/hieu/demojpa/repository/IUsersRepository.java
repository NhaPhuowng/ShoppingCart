package com.hieu.demojpa.repository;

import com.hieu.demojpa.entity.Products;
import com.hieu.demojpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);
}
