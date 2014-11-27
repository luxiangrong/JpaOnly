package com.kai.jpaonly;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager em;

	public Long save(AccountInfo accountInfo) {
		em.persist(accountInfo);
		return accountInfo.getAccountId();
	}

	public AccountInfo findByAccountId(Long accountId) {
		return em.find(AccountInfo.class, accountId);
	}

}
