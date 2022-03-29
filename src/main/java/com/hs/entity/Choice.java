package com.hs.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Choice {

    private transient String userId;

    private transient String commondityId;

    private transient LocalDateTime startTime;

    private transient LocalDateTime endTime;
}
