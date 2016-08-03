package com.bzt.logindemo.view;

import com.bzt.logindemo.bean.LoginUserMsgEntity;

/**
 * Created by LW on 2016/8/3.
 */

public interface ILoginView {
    String getUserName();
    String getPassWord();
    void toMainActivity(LoginUserMsgEntity loginUserMsgEntity, String string);

}
