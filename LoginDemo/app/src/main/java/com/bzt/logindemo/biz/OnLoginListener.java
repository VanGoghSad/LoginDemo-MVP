package com.bzt.logindemo.biz;

import com.bzt.logindemo.bean.LoginUserMsgEntity;

/**
 * Created by zhangld on 2016/8/3.
 */

public interface OnLoginListener {
    void loginSuccess(LoginUserMsgEntity loginUserMsgEntity, String string);
    void loginFailed();
}
