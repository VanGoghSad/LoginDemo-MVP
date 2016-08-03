package com.bzt.logindemo.persenter;

import android.content.Context;
import android.os.Handler;

import com.bzt.logindemo.bean.LoginUserMsgEntity;
import com.bzt.logindemo.biz.ILoginBiz;
import com.bzt.logindemo.biz.LoginBiz;
import com.bzt.logindemo.biz.OnLoginListener;
import com.bzt.logindemo.view.ILoginView;

/**
 * Created by LW on 2016/8/3.
 */

public class LoginPresenter {
    private ILoginBiz iLoginBiz;
    private ILoginView iLoginView;

    private Handler mHandler=new Handler();

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        this.iLoginBiz = new LoginBiz();
    }

    public void login(Context context) {
        iLoginBiz.login(context, iLoginView.getUserName(), iLoginView.getPassWord(), new OnLoginListener() {
            @Override
            public void loginSuccess(final LoginUserMsgEntity loginUserMsgEntity, final String string) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iLoginView.toMainActivity(loginUserMsgEntity, string);
                    }
                });
            }

            @Override
            public void loginFailed() {

            }
        });
    }
}
