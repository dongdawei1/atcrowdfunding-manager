package com.xiangwei.atcrowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangwei.atcrowdfunding.bean.User;
import com.xiangwei.atcrowdfunding.dao.UserDao;
import com.xiangwei.atcrowdfunding.service.UserService;
@Service   //ʵ��ҵ���߼�����
public class UserServiceImpl implements UserService {
@Autowired //�Զ�װ��
public  UserDao userDao;

public List<User> queryAll() {
	return userDao.queryAll();
}

public User query4Login(User user) {
	
	return userDao.query4Login(user);
}	
	
}
