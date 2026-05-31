package com.hei.demo.endpoint.rest.controller;

import com.hei.demo.endpoint.service.AddService;
import com.hei.demo.endpoint.service.DivideService;
import com.hei.demo.endpoint.service.MultiplyService;
import com.hei.demo.endpoint.service.SubtractService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ArithmeticController {

  private final AddService addService;
  private final SubtractService subtractService;
  private final MultiplyService multiplyService;
  private final DivideService divideService;

  public ArithmeticController(
      AddService addService,
      SubtractService subtractService,
      MultiplyService multiplyService,
      DivideService divideService) {
    this.addService = addService;
    this.subtractService = subtractService;
    this.multiplyService = multiplyService;
    this.divideService = divideService;
  }

  @GetMapping("/add")
  public long add(@RequestParam long a, @RequestParam long b) {
    return addService.add(a, b);
  }

  @GetMapping("/subtract")
  public long subtract(@RequestParam long a, @RequestParam long b) {
    return subtractService.subtract(a, b);
  }

  @GetMapping("/multiply")
  public long multiply(@RequestParam long a, @RequestParam long b) {
    return multiplyService.multiply(a, b);
  }

  @GetMapping("/divide")
  public double divide(@RequestParam long a, @RequestParam long b) {
    return divideService.divide(a, b);
  }
}
