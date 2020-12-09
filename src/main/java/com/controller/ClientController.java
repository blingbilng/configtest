package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 杭州人参大健康管理有限公司 版权所有 © Copyright 2019<br>
 *
 * @Description:
 * @Project: healthyPro <br>
 * @CreateDate: Created in 2020/12/9 <br>
 * @Author: <a href="zhangll@healthpro.vip">blingbling</a>
 */
@RestController
public class ClientController {
    @Value("${word}")
    private String word;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name + "," + this.word;
    }
}
