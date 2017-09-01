package com.jamcity.CrashReportAndroid;

public class CrashNULLPointer extends Crash {
    public CrashNULLPointer() {
        super();

        category = "SIGSEGV";
        title = "NULL Pointer";
        description = "Throw a null exception to trigger the NULL pointer exception.";

        classPath = "com.jamcity.CrashReportAndroid.CrashNULLPointer";
    }

    @Override
    public void crash() {
        RuntimeException nullException = null;
        throw nullException;
    }
}
