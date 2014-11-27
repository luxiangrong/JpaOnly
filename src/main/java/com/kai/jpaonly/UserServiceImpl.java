package com.kai.jpaonly;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public AccountInfo createNewAccount(String username, String password,
			Integer initBalance) {
		// 封装域对象
		AccountInfo accountInfo = new AccountInfo();

		UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);

		accountInfo.setBalance(initBalance);
		accountInfo.setUserInfo(userInfo);
		// 调用持久层，完成数据的保存
		userDao.save(accountInfo);
		return accountInfo;
	}

	public AccountInfo getAccountInfoById(Long accountId) {
		return userDao.findByAccountId(accountId);
	}

	public AccountInfo getAccountInfoByUsername(String username) {
		return userDao.findByUserInfoUsername(username);
	}

}
