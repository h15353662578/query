package com.hs.common;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hs.entity.Base;

public interface BaseService <T extends Base> extends IService<T> {
}
