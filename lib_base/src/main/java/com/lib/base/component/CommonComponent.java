package com.lib.base.component;

import com.lib.base.BaseActivity;
import com.lib.base.module.CommonModule;
import com.lib.base.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = CommonModule.class)
public interface CommonComponent {

    void inject(BaseActivity activity);
}

