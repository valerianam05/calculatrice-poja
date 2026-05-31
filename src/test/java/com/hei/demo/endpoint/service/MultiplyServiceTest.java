package com.hei.demo.endpoint.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplyServiceTest {

  private MultiplyService multiplyService;

  @BeforeEach
  void setUp() {
    this.multiplyService = new MultiplyService();
  }

  @Test
  void shouldMultiplyTwoNumbers() {
    assertEquals(15, multiplyService.multiply(5, 3));
  }

  @Test
  void shouldThrowExceptionWhenMultiplyingByZero() {
    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> multiplyService.multiply(10, 0));

    assertEquals("a and b must be positive numbers", exception.getMessage());
  }
}
