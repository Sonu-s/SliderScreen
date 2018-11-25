package com.example.user.welcomslider;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context mContext;


    private int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "Welcome";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {

        this.mContext = context;
        pref = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();

    }

    public void SetFirstTimeLunch(Boolean isFirstTime) {

        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLunch() {

        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);

    }
}
