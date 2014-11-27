package com.kai.jpaonly;

public interface UserService {
	public AccountInfo createNewAccount(String user, String pwd, Integer init);

	public AccountInfo getAccountInfoById(Long accountId);
	
	public AccountInfo getAccountInfoByUsername(String username);
}
