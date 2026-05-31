package com.hei.demo.endpoint.service;

import org.springframework.stereotype.Service;

@Service
public class DivideService {
  public double divide(long a, long b) {
    if (a <= 0 || b <= 0) {
      throw new IllegalArgumentException("a and b must be positive numbers");
    }
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed");
    }
    return (double) a / b;
  }
}
