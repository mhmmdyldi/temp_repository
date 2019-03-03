package com.mhmmdyldi.daggersample;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private final Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Provides
    @GithubApplicationScope
    @ApplicationContext
    public Context context(){
        return context;
    }
}
