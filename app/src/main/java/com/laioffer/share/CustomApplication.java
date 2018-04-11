package com.laioffer.share;

import android.app.Application;
import android.content.res.Configuration;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by supersu on 4/8/18.
 */
// this will be ran when application first initializes, executed before all activities.
public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        String token = FirebaseInstanceId.getInstance().getToken();
        FirebaseMessaging.getInstance().subscribeToTopic("android");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
