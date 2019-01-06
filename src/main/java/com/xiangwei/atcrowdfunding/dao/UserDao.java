package com.xiangwei.atcrowdfunding.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xiangwei.atcrowdfunding.bean.User;

public interface UserDao {
    
	@Select("select * from t_user")  // myBabatis��ע���ѯȫ��
	public List<User> queryAll();
    @Select("select * from t_user where loginacct=#{loginacct}") //��½��ȡ��½��
	public User query4Login(User user);//myBabatis��ע���ѯȫ�� #{����������user������}
}
