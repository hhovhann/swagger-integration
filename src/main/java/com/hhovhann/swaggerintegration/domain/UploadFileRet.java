package com.hhovhann.swaggerintegration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
public class UploadFileRet implements Serializable {
    @NotNull
    private String url;
    @NotNull
    private UUID id;
}
