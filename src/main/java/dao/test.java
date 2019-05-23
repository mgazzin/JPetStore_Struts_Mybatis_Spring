package dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import static dao.SqlSessionFactoryUtil.getSqlSessionFactory;

public class test {

    public static void main(String[] args) throws IOException {
        //mybatis的配置文件

        getSqlSessionFactory();

        Account login= new Account();
        login.setUsername("admin");
        login.setPassword("1234");

        SqlSession session = getSqlSessionFactory().openSession();

        AccountDao accountDao = session.getMapper(AccountDao.class);

        Account result =accountDao.selectAccountByUsernameAndPassword(login);

        System.out.println(result.getPassword());

    }
}