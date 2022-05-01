package com.aigan.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aigan.common.utils.PageUtils;
import com.aigan.gulimail.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-29 23:47:02
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

