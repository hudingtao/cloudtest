package com.xiaotao.controller;

import com.xiaotao.api.crm.CrmControllerApi;
import com.xiaotao.domain.crm.response.AccountResult;
import com.xiaotao.domain.crm.response.UserResult;
import com.xiaotao.service.CrmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/4/25 22:34
 */
@RestController
@RequestMapping("/crm")
public class CrmController implements CrmControllerApi {

    /**
     *
     */
    @Autowired
    private CrmService crmService;

    /**
     *
     * @param uid
     * @return
     */
    @Override
    @GetMapping("/user/{id}")
    public UserResult findUserById(@PathVariable("id") Integer uid) {
        return crmService.findUserById(uid);
    }

    /**
     *
     * @param aid
     * @return
     */
    @Override
    @GetMapping("/account/{id}")
    public AccountResult findAccountById(@PathVariable("id") Integer aid) {
        return crmService.findAccountById(aid);
    }
}
