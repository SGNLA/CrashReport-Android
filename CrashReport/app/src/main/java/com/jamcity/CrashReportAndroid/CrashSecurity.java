package com.jamcity.CrashReportAndroid;

import android.content.Context;
import android.telephony.TelephonyManager;

public class CrashSecurity extends Crash {
    public CrashSecurity() {
        super();

        category = "Permission";
        title = "READ_PHONE_STATE Crash";
        description = "Call functionality that need READ_PHONE_STATE without getting permission.";

        classPath = "com.jamcity.CrashReportAndroid.CrashSecurity";
    }

    @Override
    public void crash(Context context) {
        TelephonyManager mngr = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        String IMEI = mngr.getDeviceId();
    }
}