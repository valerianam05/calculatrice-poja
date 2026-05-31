package com.hei.demo.endpoint.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddServiceTest {

  private AddService addService;

  @BeforeEach
  void setUp() {
    this.addService = new AddService();
  }

  @Test
  void shouldAddTwoPositiveNumbers() {
    assertEquals(8, addService.add(5, 3));
  }

  @Test
  void shouldThrowExceptionWhenAddingWithZero() {
    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> addService.add(10, 0));
    assertEquals("a and b must be positive numbers", exception.getMessage());
  }

  @Test
  void shouldThrowExceptionWhenAddingNegativeNumbers() {
    IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> addService.add(-5, 3));
    assertEquals("a and b must be positive numbers", exception.getMessage());
  }
}
