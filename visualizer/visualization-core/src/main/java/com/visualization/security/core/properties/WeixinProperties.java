package com.visualization.security.core.properties;

import lombok.Data;

@Data
public class WeixinProperties {

    /**
     * 第三方id，用来决定发起第三方登录的url，默认是 weixin。
     */
    private String providerId = "weixin";
    private String appId;
    private String appSecret;
}
