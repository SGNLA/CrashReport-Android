# CrashReport-Android
CrashReport contains sets of crash cases on Android for testing reporting services.

# Default crash reporting tools implementation
HocketApp: Default version: 4.1.5 , [Official tutorial website](https://support.hockeyapp.net/kb/client-integration-android/hockeyapp-for-android-sdk)
1. Open the build.gradle under app.
2. Uncomment following line in dependencies:
```
// compile 'net.hockeyapp.android:HockeySDK:4.1.5'
```
3. In the same file, uncommnet following line in defaultConfig and update $APP_ID:
```
// manifestPlaceholders = [HOCKEYAPP_APP_ID: "$APP_ID"]
```
4. In AmdroidManifest.xml uncomment following line:
```
<!-- meta-data android:name="net.hockeyapp.android.appIdentifier" android:value="${HOCKEYAPP_APP_ID}" /-->
```
5. In MainActivity, uncomment the import part and the register:
```
// HockeyApp import
/*import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.CrashManagerListener;
import net.hockeyapp.android.metrics.MetricsManager;
import net.hockeyapp.android.utils.Util;*/

// HockeyApp register
/*CrashManager.register(this, Util.getAppIdentifier(this), new CrashManagerListener() {
    @Override
    public boolean shouldAutoUploadCrashes() {
        return true;
    }
});*/
```

# Add new crash case
1. Create a new java file and make sure it extends from Crash.java.
2. Setup category, title, description, and classPath.
3. Customize crash function.
4. Add the class path inside the ALL_CRASH_PATH_ARRAY in Crash.java.
