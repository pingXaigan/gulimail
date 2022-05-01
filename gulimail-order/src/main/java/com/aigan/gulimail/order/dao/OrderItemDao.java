package com.aigan.gulimail.order.dao;

import com.aigan.gulimail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-30 00:52:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
