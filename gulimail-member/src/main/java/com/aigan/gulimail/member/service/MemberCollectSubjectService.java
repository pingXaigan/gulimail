package com.aigan.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aigan.common.utils.PageUtils;
import com.aigan.gulimail.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author aigan
 * @email aigan@gmail.com
 * @date 2022-04-30 00:36:15
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

