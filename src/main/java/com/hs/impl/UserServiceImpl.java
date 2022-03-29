package com.hs.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hs.common.BaseServiceImpl;
import com.hs.entity.Choice;
import com.hs.entity.User;
import com.hs.mapper.UserMapper;
import com.hs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User> implements UserService{

    final MongoTemplate mongoTemplate;

    final UserMapper userMapper;

    @Override
    public int join(User user) {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        System.out.println(baseMapper.selectList(null));
        return 0;
    }

}
