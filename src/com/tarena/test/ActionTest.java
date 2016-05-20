package com.tarena.test;

import com.tarena.biz.IUserServ;
import com.tarena.biz.impl.UserServImpl;
import com.tarena.entity.User;
import com.tarena.handler.LogHandler;

public class ActionTest {
	public static void main(String[] args) {
		// 创建代理对象iuserServ
		LogHandler handler = new LogHandler();
		IUserServ iuserServ = (IUserServ) handler.createProxy(new UserServImpl());
		iuserServ.deleteUserById(new User());
	}
}
