package com.hei.demo.endpoint.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubtractServiceTest {

  private SubtractService subtractService;

  @BeforeEach
  void setUp() {
    this.subtractService = new SubtractService();
  }

  @Test
  void shouldSubtractTwoNumbers() {
    assertEquals(2, subtractService.subtract(5, 3));
  }

  @Test
  void shouldSubtractResultingInNegative() {
    assertEquals(-4, subtractService.subtract(2, 6));
  }
}
