package com.xiaotao.domain.crm.response;

import com.xiaotao.domain.crm.User;
import lombok.Data;
import model.response.ResponseResult;
import model.response.ResultCode;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/4/25 19:35
 */
@Data
public class UserResult extends ResponseResult {
    /**
     * 用户
     */
    private User user;

    public UserResult(ResultCode resultCode, User user) {
        super(resultCode);
        this.user = user;
    }

}
