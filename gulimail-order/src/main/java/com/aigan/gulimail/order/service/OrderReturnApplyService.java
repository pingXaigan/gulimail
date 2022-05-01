package com.aigan.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aigan.common.utils.PageUtils;
import com.aigan.gulimail.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-30 00:52:33
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

