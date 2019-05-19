package cn.lisheng.showpicture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lisheng.showpicture.po.Demo;
import cn.lisheng.showpicture.service.DemoService;

@Controller
public class DemoController {
	
	//注入service
	@Autowired
	private DemoService demoService;
	
	//获取demo对象数据
	@RequestMapping("/queryDemo")
	public String getDemo(Model model,int id) throws Exception{
		//调用service获取对象信息，并传到页面展示
		Demo demo = demoService.findDemoById(id);
		model.addAttribute("demoinfo", demo);
		return "queryDemo";
	}

}
