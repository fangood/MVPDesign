package com.lib.base.module;

import com.lib.base.scope.ActivityScope;
import com.lib.base.view.ICommonView;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

    private ICommonView iView;

    public CommonModule(ICommonView iView) {
        this.iView = iView;
    }


    @Provides
    @ActivityScope
    public ICommonView provideIcommonView() {
        return this.iView;
    }

}
