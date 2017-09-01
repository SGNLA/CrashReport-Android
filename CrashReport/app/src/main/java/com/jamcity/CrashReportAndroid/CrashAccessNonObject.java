package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashAccessNonObject extends Crash {
    public CrashAccessNonObject() {
        super();

        category = "JNI";
        title = "Access Non Object";
        description = "Access non object in native code to make it crash. print(\"%s\", (void*)16)";

        classPath = "com.jamcity.CrashReportAndroid.CrashAccessNonObject";
    }

    @Override
    public void crash(Context context) {
        JNIUtil.accessNonObject();
    }
}
