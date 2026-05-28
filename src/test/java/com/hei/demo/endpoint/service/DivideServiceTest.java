package com.hei.demo.endpoint.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideServiceTest {
  private final DivideService divideService = new DivideService();

  @Test
  void shouldDivideTwoNumbers() {
    assertEquals(5, divideService.divide(20, 4));
  }

  @Test
  void shouldThrowExceptionWhenDivideByZero() {
    assertThrows(
        ArithmeticException.class,
        () -> {
          divideService.divide(10, 0);
        });
  }
}
