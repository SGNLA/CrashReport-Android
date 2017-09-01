package com.jamcity.CrashReportAndroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Constructor;

public class CrashDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash_detail);

        try{
            // create crash instance from class paths in Crash.java
            Class<?> crashClass = Class.forName(this.getIntent().getStringExtra("CRASH_CLASS_PATH"));
            Constructor<?> ctor = crashClass.getConstructor();
            final Crash crashInstance = (Crash)ctor.newInstance();

            ((TextView)findViewById(R.id.CrashTitle)).setText(crashInstance.title);
            ((TextView)findViewById(R.id.CrashDescription)).setText(crashInstance.description);
            ((Button)findViewById(R.id.CrashButton)).setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    crashInstance.crash(CrashDetailActivity.this);
                }
            });
        }
        catch(Exception e)
        {
        }
    }
}
