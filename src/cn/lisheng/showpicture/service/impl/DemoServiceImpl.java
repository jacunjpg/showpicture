package cn.lisheng.showpicture.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.lisheng.showpicture.dao.mapper.DemoMapper;
import cn.lisheng.showpicture.po.Demo;
import cn.lisheng.showpicture.service.DemoService;

public class DemoServiceImpl implements DemoService {
	//自动注入
	@Autowired
	DemoMapper demoMapper;

	@Override
	public Demo findDemoById(int id) throws Exception {
		//调用mapper接口
		return demoMapper.findDemoById(id);
	}

	@Override
	public void saveDemo() throws Exception {
		//插入一个正常数据
		Demo demo = new Demo();
		demo.setId(6);
		demo.setName("赵六22");
		demoMapper.insertDemo(demo);
		
		//插入一个错误数据
		Demo demo2 = new Demo();
		demo2.setId(7);
		demo2.setName("王五22");
		demoMapper.insertDemo(demo2);
		
	}

}
