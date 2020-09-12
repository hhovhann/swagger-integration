package com.hhovhann.swaggerintegration.controller;

import com.hhovhann.swaggerintegration.domain.UploadFileRet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestApi {
    @GetMapping("/api/test")
    public UploadFileRet getConfirm() throws Exception {
        // TODO: some business logic here
        return null;
    }
}
