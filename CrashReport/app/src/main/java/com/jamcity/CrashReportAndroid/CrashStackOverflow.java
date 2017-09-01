package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashStackOverflow extends Crash {
    public CrashStackOverflow() {
        super();

        category = "SIGSEGV";
        title = "Stack Overflow";
        description = "Execute an infinitely recursive method, which overflows the stack and causes a crash.";

        classPath = "com.jamcity.CrashReportAndroid.CrashStackOverflow";
    }

    @Override
    public void crash(Context context) {
        this.crash(context);
    }
}
