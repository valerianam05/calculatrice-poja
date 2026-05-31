package com.hei.demo.endpoint.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivideServiceTest {

  private DivideService divideService;

  @BeforeEach
  void setUp() {
    this.divideService = new DivideService();
  }

  @Test
  void shouldDivideTwoNumbers() {
    assertEquals(2.5, divideService.divide(5, 2));
  }

  @Test
  void shouldDivideExactNumber() {
    assertEquals(3.0, divideService.divide(6, 2));
  }

  @Test
  void shouldThrowExceptionWhenDividingByZero() {

    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> divideService.divide(10, 0));

    assertEquals("a and b must be positive numbers", exception.getMessage());
  }
}
