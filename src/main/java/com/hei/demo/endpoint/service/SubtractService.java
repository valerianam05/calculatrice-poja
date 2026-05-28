package com.hei.demo.endpoint.service;

import org.springframework.stereotype.Service;

@Service
public class SubtractService {
  public int subtract(int a, int b) {
    return a - b;
  }
}
