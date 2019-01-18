package com.zj.mvp.demo.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.lib.base.BaseActivity;
import com.lib.base.component.DaggerCommonComponent;
import com.lib.base.module.CommonModule;
import com.lib.base.presenter.LoginPresenter;
import com.lib.base.view.ICommonView;

import javax.inject.Inject;

import androidx.annotation.Nullable;

/**
 * 登录
 */
public class LoginActivity extends BaseActivity implements ICommonView {

    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DaggerCommonComponent.
                builder().
                commonModule(new CommonModule(this)).
                build().
                inject(this);

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login("aaaaaaa", "111111111111111");
            }
        });
    }

    @Override
    public Context getContext() {
        return this;
    }
}
