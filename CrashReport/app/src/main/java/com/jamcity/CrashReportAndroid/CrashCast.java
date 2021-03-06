package com.jamcity.CrashReportAndroid;

import android.content.Context;

public class CrashCast extends Crash {
    public CrashCast() {
        super();

        category = "SIGSEGV";
        title = "Invalid Cast";
        description = "Crash after invalid cast from integer to Exception.";

        classPath = "com.jamcity.CrashReportAndroid.CrashCast";
    }

    @Override
    public void crash(Context context) {
        Integer value = new Integer(0);
        Exception testException = cast(value);
        testException.toString();
    }

    public static <TSource, TTarget> TTarget cast(TSource toCast){
        return (TTarget) toCast;
    }
}
