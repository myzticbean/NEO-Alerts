package com.neoalerts.neodiscoveryservice.service.neows;

import lombok.Getter;

@Getter
public enum ResponseHeadersEnum {
    X_RATELIMIT_REMAINING("X-Ratelimit-Remaining"),
    X_RATELIMIT_LIMIT("X-Ratelimit-Limit");

    private final String headerName;

    ResponseHeadersEnum(String headerName) {
        this.headerName = headerName;
    }

}
