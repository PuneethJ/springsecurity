package com.example.springsecurity.springsecurity.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springsecurity.springsecurity.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String code);
    
}
