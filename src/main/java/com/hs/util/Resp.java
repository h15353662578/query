package com.hs.util;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hs.entity.ResultDTO;


public class Resp {

    public static ResultDTO ok() {
        return ok(null);
    }

    public static ResultDTO ok(Object object) {
        if (object instanceof IPage) {
            IPage page = (IPage) object;
            return new ResultDTO(ResultCodeEnum.SUCCESS.value(),ResultCodeEnum.SUCCESS.message(), page.getRecords(), (int) page.getTotal());
        }
        return new ResultDTO(ResultCodeEnum.SUCCESS.value(),ResultCodeEnum.SUCCESS.message(), object);
    }



    public static ResultDTO fail(ResultCodeEnum resultCodeEnum) {
        return new ResultDTO(resultCodeEnum.value(), resultCodeEnum.message(), null);
    }

    public static ResultDTO fail(int code, String message) {
        return new ResultDTO(code, message, null);
    }

    public static ResultDTO fail(ResultCodeEnum resultCodeEnum, String message) {
        return new ResultDTO(resultCodeEnum.value(), StrUtil.isBlank(message) ? resultCodeEnum.message() : message, null);
    }
}
