package cn.lisheng.showpicture.dao.mapper;

import java.util.List;

import cn.lisheng.showpicture.po.Demo;

public interface DemoMapper {
	
	//根据id查询信息
	public Demo findDemoById(int id) throws Exception;
	
	//插入数据
	public void insertDemo(Demo demo) throws Exception;
}
