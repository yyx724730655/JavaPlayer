package yyx.ssm.dao;

import org.springframework.stereotype.Repository;
import yyx.ssm.domain.Account;

import java.util.List;

@Repository
public interface AccountDao {

//    @Select("select * from Account")
    public List<Account> findAll();

//    @Insert("insert into account(id,name,money) values (account_seq.nextval,#{name},#{money})")
    public void saveAccount(Account account);

//    @Select("select * from account where id=#{acid}")
    public Account getAccount(int acid);

    void deleteAccountBySid(String sid);
}
