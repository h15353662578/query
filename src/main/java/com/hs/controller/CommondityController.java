package com.hs.controller;

import com.hs.entity.Choice;
import com.hs.entity.Commondity;
import com.hs.entity.ResultDTO;
import com.hs.service.CommondityService;
import com.hs.util.Resp;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commondity")
@RequiredArgsConstructor
public class CommondityController {

    final CommondityService commondityService;

    final MongoTemplate mongoTemplate;

    @PostMapping("/add")
    public ResultDTO addCommondity(@RequestBody Commondity commondity) {
        return commondityService.addCommondity(commondity) == 0 ? Resp.ok("添加成功") : Resp.fail(500,"添加失败");
    }


    @PostMapping("/del")
    public ResultDTO delCommondity(@RequestBody Choice choice) {
        return commondityService.delCommondity(choice) == 0 ? Resp.ok("删除成功") : Resp.fail(500,"删除失败");
    }

    @PostMapping("/select")
    public ResultDTO selectCommondity(@RequestBody Choice choice) {
        return Resp.ok(commondityService.select(choice));
    }
}
