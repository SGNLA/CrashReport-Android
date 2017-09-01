package com.jamcity.CrashReportAndroid;

public class CrashJavaException extends Crash {
    public CrashJavaException() {
        super();

        category = "Exceptions";
        title = "Throw Java exception";
        description = "Just directly throw Java uncaught exception.";

        classPath = "com.jamcity.CrashReportAndroid.CrashJavaException";
    }

    @Override
    public void crash() {
        RuntimeException exception = new RuntimeException();
        throw exception;
    }
}
