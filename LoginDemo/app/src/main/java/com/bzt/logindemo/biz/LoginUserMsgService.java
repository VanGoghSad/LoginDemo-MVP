package com.bzt.logindemo.biz;

import com.bzt.logindemo.bean.LoginUserMsgEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Lw on 2016/8/3.
 */

public interface LoginUserMsgService {
    @GET("public/login")
    Call<LoginUserMsgEntity> getLoginMsg(@Query("loginAccount") String loginAc,
                                         @Query("password") String psd,
                                         @Query("_sessionid4pad_") String _sessionid4pad_);
}
