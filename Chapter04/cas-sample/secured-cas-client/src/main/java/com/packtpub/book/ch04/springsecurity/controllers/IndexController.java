package com.packtpub.book.ch02.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

  @GetMapping("/")
  public String index() {
    return "index";
  }
}
