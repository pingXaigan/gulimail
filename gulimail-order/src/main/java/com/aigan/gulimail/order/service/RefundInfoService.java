package com.aigan.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aigan.common.utils.PageUtils;
import com.aigan.gulimail.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-30 00:52:33
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

