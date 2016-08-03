package com.bzt.logindemo.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bzt.logindemo.R;
import com.bzt.logindemo.bean.LoginUserMsgEntity;
import com.bzt.logindemo.persenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements ILoginView {
    public static final String USER = "user";
    private EditText mUserName;
    private EditText mPassWord;
    private Button mLogin;

    private LoginPresenter loginPresenter = new LoginPresenter(this);
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setOnClick();
    }

    private void setOnClick() {
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = mUserName.getText().toString();
                password = mPassWord.getText().toString();
                loginPresenter.login(LoginActivity.this);
            }
        });
    }

    private void initView() {
        mUserName = (EditText) findViewById(R.id.et_login_username);
        mPassWord = (EditText) findViewById(R.id.et_login_password);
        mLogin = (Button) findViewById(R.id.btn_login);
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassWord() {
        return password;
   }

    @Override
    public void toMainActivity(LoginUserMsgEntity loginUserMsgEntity, String string) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        Bundle bundle = new Bundle();

        intent.putExtra(USER, loginUserMsgEntity);
        startActivity(intent);
    }
}
