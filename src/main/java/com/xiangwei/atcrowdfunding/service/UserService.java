package com.xiangwei.atcrowdfunding.service;

import java.util.List;

import com.xiangwei.atcrowdfunding.bean.User;

public interface UserService {

	List<User> queryAll();

	User query4Login(User user);

}
