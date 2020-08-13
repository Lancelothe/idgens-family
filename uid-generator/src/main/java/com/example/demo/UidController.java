package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lancelot
 * @date 2020/8/11
 */
@RestController
public class UidController {

    @Autowired
    private UidGenService uidGenService;

    @GetMapping("/testGet")
    public Long testGet() {
        return uidGenService.nextId();
    }

    @GetMapping("/testParse/{uid}")
    public String testParse(@PathVariable("uid") Long uid) {
        return uidGenService.parse(uid);
    }

}