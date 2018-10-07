package com.example.altimetrik;

import android.app.Application;
import android.content.Context;

import com.example.altimetrik.data.DataService;
import com.example.altimetrik.di.AltimetrikApplicationComponent;
import com.example.altimetrik.di.ContextModule;
import com.example.altimetrik.di.DaggerAltimetrikApplicationComponent;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

public class AltimetrikApplication extends Application {

    private static final Object TAG = AltimetrikApplication.class.getSimpleName();
    private DataService dataService;
    private Scheduler scheduler;
    private AltimetrikApplicationComponent component;


    private static AltimetrikApplication get(Context context) {
        return (AltimetrikApplication) context.getApplicationContext();
    }


    public static AltimetrikApplication create(Context context) {
        return AltimetrikApplication.get(context);
    }

    public DataService getDataService() {

        return dataService;
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) {
            scheduler = Schedulers.io();
        }

        return scheduler;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        component = DaggerAltimetrikApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        dataService = component.getDataService();
    }
}
