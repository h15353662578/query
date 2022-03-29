package com.hs.controller;

import com.hs.entity.ResultDTO;
import com.hs.entity.User;
import com.hs.service.UserService;
import com.hs.util.Resp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/join")
    public ResultDTO join(@RequestBody User user) {
        return Resp.ok(userService.join(user));
    }
}
