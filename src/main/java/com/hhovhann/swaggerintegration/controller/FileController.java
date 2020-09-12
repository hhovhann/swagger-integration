package com.hhovhann.swaggerintegration.controller;

import com.hhovhann.swaggerintegration.domain.UploadFileRet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.UUID;

@RestController
@Slf4j
public class FileController {

    @PostMapping("/sec/upload")
    public UploadFileRet uploadFile(@RequestParam("upload") MultipartFile file, @RequestParam(required = false) String desc, HttpServletRequest request, HttpServletResponse response) {
        // TODO: some business logic here
        return null;
    }

    @GetMapping("/sec/file/{uuidFileName}")
    public void getFile(@PathVariable("uuidFileName") String fileName, HttpServletResponse response, HttpServletRequest request) throws IOException {
        // TODO: some business logic here
    }
}