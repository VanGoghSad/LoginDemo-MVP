package com.bzt.logindemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bzt.logindemo.R;
import com.bzt.logindemo.bean.LoginUserMsgEntity;
import com.bzt.logindemo.util.LoadPictureUtils;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView mAvatar;
    private TextView mName;

    private LoginUserMsgEntity loginUserMsgEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginUserMsgEntity = (LoginUserMsgEntity) getIntent().getSerializableExtra(LoginActivity.USER);

        initView();
        loadData();
    }

    private void initView() {
        mAvatar = (ImageView) findViewById(R.id.avatar);
        mName = (TextView) findViewById(R.id.name);
    }

    private void loadData() {
        Picasso.with(this)
                .load(LoadPictureUtils.loadPicture(loginUserMsgEntity.getData().getAvatarsImg()))
                .into(mAvatar);
        mName.setText(loginUserMsgEntity.getData().getUserName());

    }
}
