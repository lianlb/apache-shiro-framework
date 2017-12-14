package com.github.lianlb.chapter02.authenticationstrategy;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.pam.AbstractAuthenticationStrategy;
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.apache.shiro.realm.Realm;

import java.util.Collection;

/**
 * 自定义验证策略 继承抽象类，选择性重写方法
 * @author Created by lianlb on 2017/12/14 15:48.
 */
public class CustomAuthenticationStrategy extends AbstractAuthenticationStrategy {

    /**
     * 在所以realm之后调用
     * @param token
     * @param aggregate
     * @return
     * @throws AuthenticationException
     */
    @Override
    public AuthenticationInfo afterAllAttempts(AuthenticationToken token, AuthenticationInfo aggregate) throws AuthenticationException {

        return super.afterAllAttempts(token, aggregate);
    }
}
