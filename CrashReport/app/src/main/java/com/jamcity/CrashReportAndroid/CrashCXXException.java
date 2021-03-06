package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashCXXException extends Crash {
    public CrashCXXException() {
        super();

        category = "JNI";
        title = "Throw C++ exception";
        description = "Throw an uncaught C++ exception from native code.";

        classPath = "com.jamcity.CrashReportAndroid.CrashCXXException";
    }

    @Override
    public void crash(Context context) {
        JNIUtil.throwCException();
    }
}
