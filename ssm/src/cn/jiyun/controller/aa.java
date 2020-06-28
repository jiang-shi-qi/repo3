package cn.jiyun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("aa")
public class aa {
	@RequestMapping
	@ResponseBody
	public String aa(){
		return "aaaaaa GIT";
	}
}
