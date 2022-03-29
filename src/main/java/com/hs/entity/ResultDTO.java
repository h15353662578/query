package com.hs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO {

    public ResultDTO(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 状态码
     */
    public int code;

    /**
     * 描述
     */
    public String msg;

    /**
     * 数据结果集
     */
    public Object data;

    /**
     * 分页结果记录数
     */
    public int count;
}
