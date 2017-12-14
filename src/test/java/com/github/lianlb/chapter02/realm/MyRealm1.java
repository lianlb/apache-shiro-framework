package com.github.lianlb.chapter02.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;
import org.omg.CORBA.UnknownUserException;

/**
 * @author Created by lianlb on 2017/12/14 14:21.
 */
public class MyRealm1 implements Realm {

    public String getName() {
        return "myRealm1";
    }

    public boolean supports(AuthenticationToken authenticationToken) {
        //仅支持UsernamePasswordToken类型的Token
        return authenticationToken instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        String password = new String((char[]) authenticationToken.getCredentials());
        if (!"zhang".equals(username)) {
            throw new UnknownAccountException();
        }
        if (!"123".equals(password)) {
            throw new IncorrectCredentialsException();
        }
        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
