package com.xiangwei.atcrowdfunding.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xiangwei.atcrowdfunding.bean.User;

public interface UserDao {
    
	@Select("select * from t_user")  // myBabatis的注解查询全部
	public List<User> queryAll();
    @Select("select * from t_user where loginacct=#{loginacct}") //登陆获取登陆名
	public User query4Login(User user);//myBabatis的注解查询全部 #{参数必须是user的属性}
}
