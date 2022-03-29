package com.hs.impl;

import com.hs.entity.Choice;
import com.hs.entity.Commondity;
import com.hs.entity.User;
import com.hs.entity.UserCommondityQuery;
import com.hs.mapper.UserMapper;
import com.hs.service.CommondityService;
import com.hs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommondityServiceImpl implements CommondityService {

    final MongoTemplate mongoTemplate;

    final UserMapper userMapper;

    @Override
    public int addCommondity(Commondity commondity) {
        try {
            commondity.setCreateTime(LocalDateTime.now());
            commondity.setUpdateTime(LocalDateTime.now());
            mongoTemplate.save(commondity, "commondity");
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }

    @Override
    public int delCommondity(Choice choice) {
        try {
            Criteria criteria = Criteria.where("id").is(choice.getCommondityId());
            Query query = Query.query(criteria);
            Update update = Update.update("isDel", 1);
            update.set("updateTime", LocalDateTime.now());
            mongoTemplate.upsert(query, update, Commondity.class, "commondity");
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }

    @Override
    public List<UserCommondityQuery> select(Choice choice) {
        Criteria criteria = Criteria.where("isDel").is(0);
        Query query = Query.query(criteria);
        if (null != choice.getUserId()) {
            query.addCriteria(Criteria.where("userId").is(choice.getUserId()));
        }
        if (null != choice.getCommondityId()) {
            query.addCriteria(Criteria.where("id").is(choice.getCommondityId()));
        }
        User users = userMapper.selectById(choice.getUserId());
        System.out.println(users);
        System.out.println(mongoTemplate.find(query, UserCommondityQuery.class, "commondity"));
        return mongoTemplate.find(query, UserCommondityQuery.class, "commondity");
    }
}
