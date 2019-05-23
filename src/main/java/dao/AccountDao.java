package dao;

import domain.Account;

public interface AccountDao {
    public Account selectAccountByUsernameAndPassword(Account account);
}
