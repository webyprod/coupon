package com.devops.couponservice.controller;


import com.devops.couponservice.model.Coupon;
import com.devops.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class CouponController {

    @Autowired
    CouponRepository couponRepository;

    @PostMapping
    public Coupon create (@RequestBody Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon findCoupon (@PathVariable("code") String code) {
        return couponRepository.findByCode(code);
    }

}
