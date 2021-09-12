package com.mall.member.dao;

import com.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author gaoyuan
 * @email gaoyuan206@gmail.com
 * @date 2021-09-03 21:02:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
