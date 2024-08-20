package com.hieu.demojpa.controller;

import com.hieu.demojpa.entity.Products;
import com.hieu.demojpa.repository.IProductsRepository;
import com.hieu.demojpa.service.Impl.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UsersService userService;

    //Demo nen dung truc tiep product repository
    @Autowired
    IProductsRepository productRepository;

    @GetMapping("/")
    public String welcome(final Model model)
    {
        List<Products> lstProducts = productRepository.findAll();
        model.addAttribute("products", lstProducts);

        return "welcome";
    }

    @GetMapping("/home")
    public String Home()
    {
        return "welcome";
    }
}
