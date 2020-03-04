package com.yh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*import com.yh.config.MyConfigProperties;*/

//import com.yh.config.ConfigProperties;
//import com.yh.service.impl.ValidatorFactory;

@Controller 
public class IndexController {
	
	
/*	@Autowired
	MyConfigProperties  cp;
	*/
	
	
	@RequestMapping({"/","index"})
	public String index(){
	//	System.out.println("cp " + cp.getPort());
		return "index";
	}

}
