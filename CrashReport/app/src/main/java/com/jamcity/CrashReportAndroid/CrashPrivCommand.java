package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashPrivCommand extends Crash {
    public CrashPrivCommand() {
        super();

        category = "SIGILL";
        title = "Privileged Command";
        description = "Run command that should only be used by supervisor";

        classPath = "com.jamcity.CrashReportAndroid.CrashPrivCommand";
    }

    @Override
    public void crash(Context context) {
        try {
            Process p = Runtime.getRuntime().exec("w");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
