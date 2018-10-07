package com.example.altimetrik.di;



import com.example.altimetrik.data.DataService;

import dagger.Component;


@AltimetrikApplicationScope
@Component(modules = {DataServiceModule.class})
public interface AltimetrikApplicationComponent {

    DataService getDataService();
}
