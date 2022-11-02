package org.example.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class FlowLimitController
{

    @GetMapping("/testA")
    public String testA()
    {

        try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }
}