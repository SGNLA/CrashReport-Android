package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashJavaException extends Crash {
    public CrashJavaException() {
        super();

        category = "Exceptions";
        title = "Throw Java exception";
        description = "Just directly throw Java uncaught exception.";

        classPath = "com.jamcity.CrashReportAndroid.CrashJavaException";
    }

    @Override
    public void crash(Context context) {
        RuntimeException exception = new RuntimeException();
        throw exception;
    }
}
