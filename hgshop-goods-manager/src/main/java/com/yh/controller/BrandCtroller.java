package com.yh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 品牌管理
 * @author yh
 *
 */
@Controller
@RequestMapping("brand")
public class BrandCtroller {
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1") int page) {
		return "brand/list";
	}

}
