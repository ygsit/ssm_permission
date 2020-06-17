package com.yu.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yu.domain.Product;
import com.yu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() throws JsonProcessingException {
        List<Product> products = productService.findAll();
        return new ObjectMapper().writeValueAsString(products);
    }
}
