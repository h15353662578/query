package com.hs.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class User extends Base{

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("user_head_photo")
    private String userHeadPhoto;

}
