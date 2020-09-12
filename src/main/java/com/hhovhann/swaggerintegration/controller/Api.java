package com.hhovhann.swaggerintegration.controller;

import com.hhovhann.swaggerintegration.domain.PhoneStartCheck;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Api {

    @PostMapping("/sec/api/phone-start-check")
    public PhoneStartCheck postPhoneStartCheck(String phone) throws Exception {
        // TODO: some business logic ehre
        return PhoneStartCheck.builder().build();
    }

    @PostMapping("/sec/api/phone-finish-check")
    public PhoneStartCheck postPhoneStartCheck(int code) throws Exception {
        // TODO: some business logic ehre
        return PhoneStartCheck.builder().build();
    }
}