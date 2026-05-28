package com.hei.demo.endpoint.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyServiceTest {

  private final MultiplyService multiplyService = new MultiplyService();

  @Test
  void shouldMultiplyTwoNumbers() {
    assertEquals(42, multiplyService.multiply(6, 7));
  }
}
