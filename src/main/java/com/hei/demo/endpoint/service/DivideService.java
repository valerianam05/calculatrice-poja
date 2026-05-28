package com.hei.demo.endpoint.service;

import org.springframework.stereotype.Service;

@Service
public class DivideService {
  public int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed");
    }
    return a / b;
  }
}
