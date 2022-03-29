package com.hs.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Commondity extends Base{

    private BigDecimal price;

    private int quantity;

    private String unit;

    private String commondityName;

    private int state;

    private String commondityType;

    private String userId;

    private String commondityFormat;
}
