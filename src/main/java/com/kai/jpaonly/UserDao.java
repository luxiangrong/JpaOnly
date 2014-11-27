package com.kai.jpaonly;

import org.springframework.data.repository.Repository;

public interface UserDao extends Repository<AccountInfo, Long> {
	AccountInfo save(AccountInfo accountInfo);

	AccountInfo findByAccountId(Long accountId);
	
	AccountInfo findByUserInfoUsername(String username);
}
