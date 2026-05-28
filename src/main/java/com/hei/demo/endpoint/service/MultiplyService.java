package com.hei.demo.endpoint.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplyService {
  public int multiply(int a, int b) {
    return a * b;
  }
}
