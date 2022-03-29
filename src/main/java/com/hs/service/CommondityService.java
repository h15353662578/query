package com.hs.service;

import com.hs.entity.Choice;
import com.hs.entity.Commondity;
import com.hs.entity.UserCommondityQuery;

import java.util.List;

public interface CommondityService {

    int addCommondity(Commondity commondity);

    int delCommondity(Choice choice);

    List<UserCommondityQuery> select(Choice choice);
}
