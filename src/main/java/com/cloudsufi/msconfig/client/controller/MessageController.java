package com.cloudsufi.msconfig.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

  @Value("${example.message}")
  private String msg;

  @Value("${encrypted.property}")
  private String testProperty;

  @RequestMapping("/message")
  String getMsg() {
    StringBuilder builder = new StringBuilder();
    builder.append("global property - ").append(testProperty).append(" || ")
      .append("local property - ").append(msg).append(" || ");
    return builder.toString();
  }

}
