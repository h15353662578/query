package com.hs.entity;

import lombok.Data;

@Data
public class UserCommondityQuery extends Commondity{

    private transient String userName;
}
