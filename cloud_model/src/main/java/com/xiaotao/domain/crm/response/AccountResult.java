package com.xiaotao.domain.crm.response;

import com.xiaotao.domain.crm.Account;
import lombok.Data;
import model.response.ResponseResult;
import model.response.ResultCode;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/4/25 19:37
 */
@Data
public class AccountResult extends ResponseResult {
    /**
     * 账户信息
     */
    private Account account;

    public AccountResult(ResultCode resultCode, Account account) {
        super(resultCode);
        this.account = account;
    }
}
