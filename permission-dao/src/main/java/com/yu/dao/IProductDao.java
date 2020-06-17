package com.yu.dao;

import com.yu.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDao {
    List<Product> findAll();
}
