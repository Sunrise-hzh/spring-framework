package com.sunrise.sf.core.containerOverview.service;

import com.sunrise.sf.core.containerOverview.dao.AccountDao;

/**
 * @author huangzihua
 * @date 2021-12-13
 */
public class AccountServiceImpl {
    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void getName() {
        System.out.println("service print : " + accountDao.getName());
    }
}
