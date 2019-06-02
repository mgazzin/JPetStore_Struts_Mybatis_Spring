package service;

import domain.Account;
import dao.AccountDAO;

public class AccountService {

  private AccountDAO accountDAO;


  public Account getAccount(String username) {
    return accountDAO.getAccountByUsername(username);
  }

  public Account getAccount(String username, String password) {
    Account account = new Account();
    account.setUsername(username);
    account.setPassword(password);
    return accountDAO.getAccountByUsernameAndPassword(account);
  }

  public void insertAccount(Account account) {
    accountDAO.insertAccount(account);
    accountDAO.insertProfile(account);
    accountDAO.insertSignon(account);
  }

  public void updateAccount(Account account) {
    accountDAO.updateAccount(account);
    accountDAO.updateProfile(account);

    if (account.getPassword() != null && account.getPassword().length() > 0) {
      accountDAO.updateSignon(account);
    }
  }

    public boolean usernameIsExist(String username) {
        return accountDAO.getAccountByUsername(username)!=null;}
    }

