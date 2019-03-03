package com.mhmmdyldi.daggersample.screens;

import com.mhmmdyldi.daggersample.GithubApplicationComponent;
import com.mhmmdyldi.daggersample.network.GithubService;

import dagger.Component;

@HomeActivityScope
@Component(modules = HomeActivityModule.class, dependencies = GithubApplicationComponent.class)
public interface HomeActivityComponent {

    void injectHomeActivity(HomeActivity homeActivity);
}
