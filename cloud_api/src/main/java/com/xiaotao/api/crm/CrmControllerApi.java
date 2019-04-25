package com.xiaotao.api.crm;

import com.xiaotao.domain.crm.response.AccountResult;
import com.xiaotao.domain.crm.response.UserResult;
import io.swagger.annotations.Api;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/4/25 19:40
 */
@Api(value = "crm管理", description = "crm，提供用户和账户的增删改查")
public interface CrmControllerApi {

    /**
     * 根据id查询用户
     * @param uid
     * @return
     */
    UserResult findUserById(Integer uid);

    /**
     * 根据id查询账户
     * @param aid
     * @return
     */
    AccountResult findAccountById(Integer aid);
}
