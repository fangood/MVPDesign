package com.lib.base.presenter;

import android.content.Context;
import android.widget.Toast;

import com.lib.base.view.ICommonView;

import javax.inject.Inject;

public class LoginPresenter {
    private ICommonView iCommonView;

    @Inject
    public LoginPresenter(ICommonView iCommonView) {
        this.iCommonView = iCommonView;
    }

    public void login(String name, String password) {
        Context context = iCommonView.getContext();
        Toast.makeText(context, "登录成功", Toast.LENGTH_SHORT).show();
    }
}
