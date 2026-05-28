package com.hei.demo.endpoint.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddServiceTest {
  private final AddService addService = new AddService();

  @Test
  void shouldAddTwoPositiveNumbers() {
    assertEquals(8, addService.add(5, 3));
  }

  @Test
  void shouldAddWithZero() {
    assertEquals(10, addService.add(10, 0));
  }
}
