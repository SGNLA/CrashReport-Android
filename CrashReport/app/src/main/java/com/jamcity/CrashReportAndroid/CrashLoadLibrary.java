package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashLoadLibrary extends Crash {
    public CrashLoadLibrary() {
        super();

        category = "JVM";
        title = "Load Non Exist Lib";
        description = "Load non-exist library to make it crash.";

        classPath = "com.jamcity.CrashReportAndroid.CrashLoadLibrary";
    }

    @Override
    public void crash(Context context) {
        System.loadLibrary("nonExistLib");
    }
}
