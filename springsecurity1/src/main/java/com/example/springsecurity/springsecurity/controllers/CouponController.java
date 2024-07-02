package com.example.springsecurity.springsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.springsecurity.model.Coupon;
import com.example.springsecurity.springsecurity.repos.CouponRepo;



@RestController
public class CouponController {


    @Autowired
    CouponRepo couponRepo;

    @PostMapping("/coupon")
    public Coupon createCoupon(@RequestBody Coupon coupon){
        couponRepo.save(coupon);
        return coupon;
    }

    @GetMapping("/coupon/{code}")
    public Coupon getCoupon(@PathVariable String code) {
        return couponRepo.findByCode(code);
    }
    
    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello";
    }
    


    
}
