package com.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author gaoyuan
 * @email gaoyuan206@gmail.com
 * @date 2021-09-04 16:32:57
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

