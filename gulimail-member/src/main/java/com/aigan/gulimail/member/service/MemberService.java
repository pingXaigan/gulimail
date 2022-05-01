package com.aigan.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aigan.common.utils.PageUtils;
import com.aigan.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-30 00:36:15
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

