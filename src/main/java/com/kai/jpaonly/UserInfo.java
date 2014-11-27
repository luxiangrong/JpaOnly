package com.kai.jpaonly;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_user_info")
public class UserInfo {
	@Id
	@GeneratedValue
	private Long accountId;

	private String username;
	private String password;

	@OneToOne(mappedBy = "userInfo", cascade = { CascadeType.REMOVE,
			CascadeType.MERGE, CascadeType.REFRESH }, optional = true, fetch = FetchType.EAGER)
	private AccountInfo accountInfo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public AccountInfo getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	@Override
	public String toString() {
		return "UserInfo [accountId=" + accountId + ", username=" + username
				+ ", password=" + password + "]";
	}

}
