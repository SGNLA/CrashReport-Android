package com.jamcity.CrashReportAndroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

// HockeyApp import
/*import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.CrashManagerListener;
import net.hockeyapp.android.metrics.MetricsManager;
import net.hockeyapp.android.utils.Util;*/

// MobileCenter import
/*import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.analytics.Analytics;
import com.microsoft.azure.mobile.crashes.Crashes;*/

// Crashlytics import
/*import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;*/

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Used to load the 'native-lib' library on application startup. 
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // MobileCenter start
        // MobileCenter.start(getApplication(), "$APP_SECRET", Analytics.class, Crashes.class);

        // Crashlytics with
        // Fabric.with(this, new Crashlytics());

        setContentView(R.layout.activity_main);

        final LinearLayout verticalLayout = (LinearLayout) findViewById(R.id.VerticalLayout);

        HashMap<String, List<Crash>> allCrashes = new HashMap<String, List<Crash>>();
        // gather all crash data
        for(String crashClassPath : Crash.ALL_CRASH_PATH_ARRAY) {
            try{
                // create crash instance from class paths in Crash.java
                Class<?> crashClass = Class.forName(crashClassPath);
                Constructor<?> ctor = crashClass.getConstructor();
                Crash crashInstance = (Crash)ctor.newInstance();

                // if new category, create a new ArrayList
                if(!allCrashes.containsKey(crashInstance.category)) {
                    allCrashes.put(crashInstance.category, new ArrayList<Crash>());
                }

                // add crash to related category
                allCrashes.get(crashInstance.category).add(crashInstance);
            }
            catch(Exception e)
            {
            }
        }

        // get all category and create UI layout
        for (String key : allCrashes.keySet()) {
            // add category text view
            TextView categoryTextView = new TextView(this);
            categoryTextView.setText(key);
            verticalLayout.addView(categoryTextView);

            List<Crash> crashesInCertainCategory = allCrashes.get(key);
            for(Crash crash : crashesInCertainCategory) {
                // add button for each crash
                Button activityChangeButton = new Button(this);
                activityChangeButton.setText(crash.title);
                final String classPath = crash.classPath;
                activityChangeButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, CrashDetailActivity.class);
                        intent.putExtra("CRASH_CLASS_PATH", classPath);
                        startActivity(intent);
                    }
                });
                verticalLayout.addView(activityChangeButton);
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        // ... your own onResume implementation
        checkForCrashes();
    }

    private void checkForCrashes() {
        // HockeyApp register
        /*CrashManager.register(this, Util.getAppIdentifier(this), new CrashManagerListener() {
            @Override
            public boolean shouldAutoUploadCrashes() {
                return true;
            }
        });*/
    }
}
