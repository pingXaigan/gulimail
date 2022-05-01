package com.aigan.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aigan.common.utils.PageUtils;
import com.aigan.gulimail.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-29 23:47:02
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

