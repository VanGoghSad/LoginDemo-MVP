package com.bzt.logindemo.biz;

import android.content.Context;

/**
 * Created by zhangld on 2016/8/3.
 */

public interface ILoginBiz {
    void login(Context context, String username, String password, OnLoginListener onLoginListener);
}
