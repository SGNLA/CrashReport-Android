package com.jamcity.CrashReportAndroid;

import android.content.Context;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CrashConcurrentModification extends Crash {
    public CrashConcurrentModification() {
        super();

        category = "Runtime";
        title = "Fast-Fail Iterator";
        description = "Crash app by removing element in collector when iterate through it.";

        classPath = "com.jamcity.CrashReportAndroid.CrashConcurrentModification";
    }

    @Override
    public void crash(Context context) {
        List<String> testList = new ArrayList<String>();
        testList.add("Value1");
        testList.add("Value2");
        testList.add("Value3");
        Iterator<String> it = testList.iterator();
        while(it.hasNext()) {
            String value = it.next();
            if(value.equals("Value2")) {
                testList.remove(value);
            }
        }
    }
}
