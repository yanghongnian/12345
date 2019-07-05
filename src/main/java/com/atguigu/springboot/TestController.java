package com.atguigu.springboot;


import javax.annotation.Generated;


import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api("asd")
@Controller
public class TestController {
	
	
	
	@ApiOperation("asd")
	@ResponseBody
	@RequestMapping("hello1")
	public String hello() {
		
		return "success";
	}

}
