package com.jamcity.CrashReportAndroid;

public class CrashDivideByZero extends Crash {
    public CrashDivideByZero() {
        super();

        category = "Arithmetic";
        title = "Divide by Zero";
        description = "Test all kind of case befor it become official!";

        classPath = "com.jamcity.CrashReportAndroid.CrashDivideByZero";
    }

    @Override
    public void crash() {
        Float value = new Float(1/0);
    }
}
