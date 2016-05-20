package com.tarena.biz;

import java.util.List;

import com.tarena.entity.User;

public interface IUserServ {
	List<User> findAllUser();

	int deleteUserById(User user);

	int saveUser(User user);
}
