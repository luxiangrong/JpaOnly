package com.kai.jpaonly;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_account_info")
public class AccountInfo implements Serializable {
	private static final long serialVersionUID = 317701630074626418L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	private Integer balance;

	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "userInfo_accountId")
	private UserInfo userInfo;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return "AccountInfo [accountId=" + accountId + ", balance=" + balance
				+ ", userInfo=" + userInfo + "]";
	}

}
