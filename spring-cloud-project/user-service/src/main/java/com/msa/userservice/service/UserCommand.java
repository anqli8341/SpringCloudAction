package com.msa.userservice.service;

import org.springframework.web.client.RestTemplate;

import com.msa.userservice.entity.User;
import com.netflix.hystrix.HystrixCommand;

/**
 * @author anquan li
 */
public class UserCommand extends HystrixCommand<User> {

  private RestTemplate restTemplate;
  private Long id;

  public UserCommand(Setter setter, RestTemplate restTemplate, Long id) {
    super(setter);
    this.restTemplate = restTemplate;
    this.id = id;
  }

  @Override
  protected User run() throws Exception {
    return restTemplate.getForObject("http://USER-SERVICE/users/{1}", User.class, id);
  }
}
