package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by user on 2016/8/2.
 */
public class SimpleApplication extends Application{
    @Override
    public void onCreate(){
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("Uz948obT5wYwkfFbHCUi1F2quaqltFKPdiUlodO7")
        .server("https://parseapi.back4app.com/")
        .clientKey("GH7Fz7pzfKAfXkgCGX4AVjf26v4Jk7v0UhxcJ9RP")
        .build());
    }

}
