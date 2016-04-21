package com.example.diego.trabalhoandroidagenda;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Diego on 21/04/2016.
 */
public class TrabalhoAndroidAgenda extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}



