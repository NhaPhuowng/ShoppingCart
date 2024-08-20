package com.hieu.demojpa.service.Impl;

import com.hieu.demojpa.configuration.CustomUserDetail;
import com.hieu.demojpa.entity.Users;
import com.hieu.demojpa.repository.IUsersRepository;
import com.hieu.demojpa.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersService implements IUsersService {
    @Autowired
    private IUsersRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //1.
        //Call our repository to work with db
        Users user = userRepository.findByUsername(username);
        if(user==null)
            throw new UsernameNotFoundException(username);
            //2. return custom user details
        else return new CustomUserDetail(user);
    }

    @Override
    public void createUser(Users newUser)
    {
        userRepository.save(newUser);
    }

    @Override
    public Users getUserByUserName(String username)
    {
        return userRepository.findByUsername(username);
    }
}
