package com.mhmmdyldi.daggersample;

import com.mhmmdyldi.daggersample.network.GithubService;
import com.squareup.picasso.Picasso;

import dagger.Component;

@GithubApplicationScope
@Component(modules = {GithubServiceModule.class, PicassoModule.class})
public interface GithubApplicationComponent {
    Picasso getPicasso();

    GithubService getGithubService();
}
