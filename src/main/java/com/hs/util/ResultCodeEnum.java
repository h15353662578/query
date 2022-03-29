package com.hs.util;

public enum ResultCodeEnum {
    SUCCESS(200, "成功"),
    REGISTER_FAIL_ACCOUNT_EXIST(31302, "账号已存在"),
    REGISTER_FAIL_ACCOUNT_PHONE_EXIST(31202, "手机号已被占用"),
    LOGIN_FAIL(31303, "登录失败"),
    LOGIN_FAIL_ACCOUNT_LOCKED(31304, "用户被锁定"),
    LOGIN_FAIL_ACCOUNT_DISABLED(31305, "用户未启用"),
    LOGIN_FAIL_ACCOUNT_EXPIRED(31306, "用户过期"),
    LOGIN_FAIL_ACCOUNT_UNKNOWN(31307, "不存在该用户"),
    LOGIN_FAIL_INCORRECT_CREDENTIALS(31308, "密码不正确"),
    LOGIN_FAIL_CAPTCHA_ERROR(31309, "验证码错误"),
    PASSWORD_NOT_MATCH(31310, "密码不匹配"),
    BAD_REQUEST(31400, "请求出错"),
    UNAUTHORIZED(31401, "未经授权"),
    FORBIDDEN(31403, "禁止访问"),
    UNSUPPORTED_MEDIA_TYPE(31415, "不支持的媒体类型,请使用application/json;charset=UTF-8"),
    VALIDATE_CODE_NOT_FOUND(31478, "验证码不翼而飞"),
    INTERNAL_SERVER_ERROR(31000, "服务器出错"),
    DATA_DUPLICATE_KEY(31601, "数据重复"),
    SMS_SYSTEM_ERROR(31701, "短信平台系统异常"),
    SMS_SYSTEM_EXPIRED(31702, "短信验证码已过期");

    private final int value;
    private final String message;

    ResultCodeEnum(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public int value() {
        return this.value;
    }

    public String message() {
        return this.message;
    }
}
