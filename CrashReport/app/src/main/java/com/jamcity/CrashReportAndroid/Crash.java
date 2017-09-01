package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class Crash {
    static public String[] ALL_CRASH_PATH_ARRAY = {
        // "com.jamcity.CrashReportAndroid.CrashTestCase",
        "com.jamcity.CrashReportAndroid.CrashCXXException",
        "com.jamcity.CrashReportAndroid.CrashNULLPointer",
        "com.jamcity.CrashReportAndroid.CrashStackOverflow",
        "com.jamcity.CrashReportAndroid.CrashJavaException",
        "com.jamcity.CrashReportAndroid.CrashCast",
        "com.jamcity.CrashReportAndroid.CrashOutOfMemory",
        "com.jamcity.CrashReportAndroid.CrashDivideByZero",
        "com.jamcity.CrashReportAndroid.CrashAccessNonObject",
        "com.jamcity.CrashReportAndroid.CrashPrivCommand",
        "com.jamcity.CrashReportAndroid.CrashDupThreadHook",
        "com.jamcity.CrashReportAndroid.CrashConcurrentModification",
        "com.jamcity.CrashReportAndroid.CrashSecurity",
        "com.jamcity.CrashReportAndroid.CrashLoadLibrary"
    };

    public String category = "Default crash category";
    public String title = "Default crash title";
    public String description = "Default crash description";

    public String classPath = "com.jamcity.CrashReportAndroid.Crash";

    public Crash() {

    }

    public void crash(Context context) {

    }
}
