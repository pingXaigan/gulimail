package com.aigan.gulimail.member.dao;

import com.aigan.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-30 00:36:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
