package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashDivideByZero extends Crash {
    public CrashDivideByZero() {
        super();

        category = "Arithmetic";
        title = "Divide by Zero";
        description = "Crash on int divide by 0 int.";

        classPath = "com.jamcity.CrashReportAndroid.CrashDivideByZero";
    }

    @Override
    public void crash(Context context) {
        Float value = new Float(1/0);
    }
}
