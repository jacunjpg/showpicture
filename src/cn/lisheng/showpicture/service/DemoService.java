package cn.lisheng.showpicture.service;

import cn.lisheng.showpicture.po.Demo;

public interface DemoService {

	//根据ID查询对象信息
	public Demo findDemoById(int id) throws Exception;
	
	//插入对象信息
	public void saveDemo() throws Exception;
}
