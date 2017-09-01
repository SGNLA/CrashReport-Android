package com.jamcity.CrashReportAndroid;

public class CrashDupThreadHook extends Crash {
    public CrashDupThreadHook() {
        super();

        category = "Argument";
        title = "Illegal Argument";
        description = "Add current Thread hook in to runtime shutdown.";

        classPath = "com.jamcity.CrashReportAndroid.CrashDupThreadHook";
    }

    @Override
    public void crash() {
        Runtime.getRuntime().addShutdownHook(Thread.currentThread());
    }
}