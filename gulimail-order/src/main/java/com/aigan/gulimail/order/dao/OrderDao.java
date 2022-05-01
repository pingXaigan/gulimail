package com.aigan.gulimail.order.dao;

import com.aigan.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-30 00:52:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
