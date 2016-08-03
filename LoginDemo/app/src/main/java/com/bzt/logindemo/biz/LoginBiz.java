package com.bzt.logindemo.biz;

import android.content.Context;

import com.bzt.logindemo.Constants;
import com.bzt.logindemo.bean.LoginUserMsgEntity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhangld on 2016/8/3.
 */

public class LoginBiz implements ILoginBiz {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.PUBLIC_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @Override
    public void login(Context context, String username, String password, final OnLoginListener onLoginListener) {
        LoginUserMsgService loginUserMsgService = retrofit.create(LoginUserMsgService.class);
        loginUserMsgService.getLoginMsg(username, password, username).enqueue(new Callback<LoginUserMsgEntity>() {
            @Override
            public void onResponse(Call<LoginUserMsgEntity> call, Response<LoginUserMsgEntity> response) {
                if (response.isSuccessful()) {
                    if (response.body().isSuccess()) {
                        onLoginListener.loginSuccess(response.body(), null);
                    }
                } else {
                    onLoginListener.loginFailed();
                }
            }

            @Override
            public void onFailure(Call<LoginUserMsgEntity> call, Throwable t) {
                onLoginListener.loginFailed();
            }
        });
    }
}
