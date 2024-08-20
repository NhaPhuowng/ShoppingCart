package com.hieu.demojpa.service;

import com.hieu.demojpa.entity.Users;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUsersService extends UserDetailsService {
    public void createUser(Users newUser);

    public Users getUserByUserName(String username);

    public UserDetails loadUserByUsername(String username);
}
