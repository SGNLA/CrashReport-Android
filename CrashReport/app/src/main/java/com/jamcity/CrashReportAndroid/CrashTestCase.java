package com.jamcity.CrashReportAndroid;

public class CrashTestCase extends Crash {
    public CrashTestCase() {
        super();

        category = "All";
        title = "Crash Test Case";
        description = "Test all kind of case before it become official!";

        classPath = "com.jamcity.CrashReportAndroid.CrashTestCase";
    }

    @Override
    public void crash() {
    }
}
