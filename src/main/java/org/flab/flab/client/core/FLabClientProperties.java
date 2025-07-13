package org.flab.flab.client.core;

import lombok.Getter;

import java.time.Duration;

@Getter
public class FLabClientProperties {
    private int connectionTimeout;
    private int readTimeout;
    private String host;
    private int maxConnPerRoute;
    private Duration idleConnectionTimeout;
}
