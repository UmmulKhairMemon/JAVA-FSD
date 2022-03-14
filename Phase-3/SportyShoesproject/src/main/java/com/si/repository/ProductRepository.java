package com.si.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.si.entity.*;


public interface ProductRepository extends JpaRepository<Product, Long>{

}