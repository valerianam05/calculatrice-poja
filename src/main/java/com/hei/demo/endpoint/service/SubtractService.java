package com.hei.demo.endpoint.service;

import org.springframework.stereotype.Service;

@Service
public class SubtractService {
  public long subtract(long a, long b) {
    if (a <= 0 || b <= 0) {
      throw new IllegalArgumentException("a and b must be positive numbers");
    }
    return a - b;
  }
}
