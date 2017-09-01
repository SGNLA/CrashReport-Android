package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashDupThreadHook extends Crash {
    public CrashDupThreadHook() {
        super();

        category = "Argument";
        title = "Illegal Argument";
        description = "Add current Thread hook in to runtime shutdown.";

        classPath = "com.jamcity.CrashReportAndroid.CrashDupThreadHook";
    }

    @Override
    public void crash(Context context) {
        Runtime.getRuntime().addShutdownHook(Thread.currentThread());
    }
}