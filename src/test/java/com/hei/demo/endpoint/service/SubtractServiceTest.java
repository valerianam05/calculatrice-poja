package com.hei.demo.endpoint.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractServiceTest {
  private final SubtractService subtractService = new SubtractService();

  @Test
  void shouldSubtractTwoNumbers() {
    assertEquals(6, subtractService.subtract(10, 4));
  }
}
