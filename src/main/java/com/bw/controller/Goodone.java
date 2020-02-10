package com.bw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Goodone {

	@RequestMapping("list")
	public String hello() {
		return "list";
	}
}
