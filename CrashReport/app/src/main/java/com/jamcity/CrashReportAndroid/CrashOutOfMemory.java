package com.jamcity.CrashReportAndroid;

public class CrashOutOfMemory extends Crash {
    public CrashOutOfMemory() {
        super();

        category = "SIGSEGV";
        title = "Out of Memory";
        description = "Keep allocating empty object array containing presious allocated array to crash by out of memory.";

        classPath = "com.jamcity.CrashReportAndroid.CrashOutOfMemory";
    }

    @Override
    public void crash() {
        Object[] emptyObjectArray = null;
        while (true) {
            emptyObjectArray = new Object[] {emptyObjectArray};
        }
    }
}