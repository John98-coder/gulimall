package com.xunqi.gulimall.product.feign;


import com.xunqi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("gulimall-cart")
@Component
public interface CartFeignService {


    @GetMapping(value = "/getCart")
    R getCart();
}
