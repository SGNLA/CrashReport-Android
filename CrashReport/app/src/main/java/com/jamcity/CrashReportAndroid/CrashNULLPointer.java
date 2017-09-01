package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashNULLPointer extends Crash {
    public CrashNULLPointer() {
        super();

        category = "SIGSEGV";
        title = "NULL Pointer";
        description = "Throw a null exception to trigger the NULL pointer exception.";

        classPath = "com.jamcity.CrashReportAndroid.CrashNULLPointer";
    }

    @Override
    public void crash(Context context) {
        RuntimeException nullException = null;
        throw nullException;
    }
}
