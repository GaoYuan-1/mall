package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.mall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author gaoyuan
 * @email gaoyuan206@gmail.com
 * @date 2021-09-03 00:03:02
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

