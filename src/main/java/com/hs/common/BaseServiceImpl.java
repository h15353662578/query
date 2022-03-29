package com.hs.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hs.entity.Base;

public abstract class BaseServiceImpl <M extends BaseMapper<T>, T extends Base>  extends ServiceImpl<BaseMapper<T>, T> implements BaseService<T>{

}
