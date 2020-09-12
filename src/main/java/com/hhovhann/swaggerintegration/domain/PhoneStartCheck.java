package com.hhovhann.swaggerintegration.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PhoneStartCheck implements Serializable {
    String err;
}
