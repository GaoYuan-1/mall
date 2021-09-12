package com.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author gaoyuan
 * @email gaoyuan206@gmail.com
 * @date 2021-09-04 16:37:22
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

