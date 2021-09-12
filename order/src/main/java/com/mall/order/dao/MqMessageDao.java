package com.mall.order.dao;

import com.mall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author gaoyuan
 * @email gaoyuan206@gmail.com
 * @date 2021-09-04 16:32:57
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
