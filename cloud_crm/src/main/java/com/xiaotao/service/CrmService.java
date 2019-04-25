package com.xiaotao.service;

import com.xiaotao.dao.AccountMapper;
import com.xiaotao.dao.UserMapper;
import com.xiaotao.domain.crm.Account;
import com.xiaotao.domain.crm.User;
import com.xiaotao.domain.crm.response.AccountResult;
import com.xiaotao.domain.crm.response.UserResult;
import model.response.CommonCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/4/25 22:32
 */
@Service
public class CrmService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AccountMapper accountMapper;

    /**
     *
     * @param uid
     * @return
     */
    public UserResult findUserById(Integer uid) {
        User user = userMapper.selectByPrimaryKey(uid);

        return new UserResult(CommonCode.SUCCESS, user);
    }

    /**
     *
     * @param aid
     * @return
     */
    public AccountResult findAccountById(Integer aid) {
        Account account = accountMapper.selectByPrimaryKey(aid);

        return new AccountResult(CommonCode.SUCCESS, account);
    }
}
