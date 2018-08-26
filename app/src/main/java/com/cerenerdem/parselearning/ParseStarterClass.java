package com.cerenerdem.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        //Build.gradle' dosyasına Parse sınıfını implemente ettiğimiz için artık Parse ile ilgili kodları görebiliyoruz.
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG); //Parse ile ilgili debug olanları logcat'te göster.


        //Burada tanımlanan bilgiler:
        //https://parse-dashboard.back4app.com/apps/9d51c12c-c8cd-462f-a3a4-7e45f54a6277/server-settings
        //adresinden gelmektedir.
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("EVCLQa1DuY4V7F6khXBESWbMFIEmdiJKWKMlU3My")
                .clientKey("OKlz6wZAntignyjrnA6xqTguWzOOnI8c6TfRGonf")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
