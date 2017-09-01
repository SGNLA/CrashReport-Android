package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashDivideByZero extends Crash {
    public CrashDivideByZero() {
        super();

        category = "Arithmetic";
        title = "Divide by Zero";
        description = "Test all kind of case befor it become official!";

        classPath = "com.jamcity.CrashReportAndroid.CrashDivideByZero";
    }

    @Override
    public void crash(Context context) {
        Float value = new Float(1/0);
    }
}
