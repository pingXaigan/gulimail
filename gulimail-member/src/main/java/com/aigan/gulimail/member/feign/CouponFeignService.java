package com.aigan.gulimail.member.feign;

import com.aigan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aigan
 * @date 2022/5/1 19:09
 */
@Component
@FeignClient("gulimail-coupon")
public interface CouponFeignService {
    @RequestMapping ("/coupon/coupon/member/list")
    public R membercoupons();
}
