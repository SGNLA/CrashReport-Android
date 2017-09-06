# CrashReport-Android
CrashReport contains sets of crash cases on Android for testing reporting services.

# Preparations
Download Android Studio from [here](https://developer.android.com/studio/index.html)
Since some crash case need to use NDK so make sure your SDK include LLDB, CMake, and NDK.
For the detail please see [this](https://developer.android.com/studio/projects/add-native-code.html)

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
4. In AndroidManifest.xml uncomment following line:
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

MobileCenter: Default version: 0.11.2, [Official tutorial website](https://docs.microsoft.com/en-us/mobile-center/sdk/getting-started/android)
1. Open the build.gradle under app.
2. Uncomment following line in dependencies:
```
// def mobileCenterSdkVersion = '0.11.2'
// compile "com.microsoft.azure.mobile:mobile-center-analytics:${mobileCenterSdkVersion}"
// compile "com.microsoft.azure.mobile:mobile-center-crashes:${mobileCenterSdkVersion}"
```
3. In MainActivity, uncomment the import part and the start, also update the $APP_SECRET:
```
// MobileCenter import
/*import com.microsoft.azure.mobile.MobileCenter;
import com.microsoft.azure.mobile.analytics.Analytics;
import com.microsoft.azure.mobile.crashes.Crashes;*/

// MobileCenter start
// MobileCenter.start(getApplication(), "$APP_SECRET", Analytics.class, Crashes.class);
```

Crashlytics: Default version: 2.5.8, [Official tutorial website](https://fabric.io/kits/android/crashlytics/install)
1. Open the build.gradle under app.
2. Uncomment following parts: buildscript, plugin, repositories, and dependencies
```
/*buildscript {
    repositories {
        maven { url 'https://maven.fabric.io/public' }
    }

    dependencies {
        // These docs use an open ended version so that our plugin
        // can be updated quickly in response to Android tooling updates

        // We recommend changing it to the latest version from our changelog:
        // https://docs.fabric.io/android/changelog.html#fabric-gradle-plugin
        classpath 'io.fabric.tools:gradle:1.+'
    }
}*/

// apply plugin: 'io.fabric'

/*repositories {
    maven { url 'https://maven.fabric.io/public' }
}*/

// Crashlytics
// compile('com.crashlytics.sdk.android:crashlytics:2.6.8@aar') {
//     transitive = true;
// }
```
3. In AndroidManifest.xml uncomment meta-data and permission, also update $API_KEY:
```
<!-- Crashlytics meta-data -->
<!-- meta-data android:name="io.fabric.ApiKey" android:value="$API_KEY" /-->

<!-- Crashlytics permission -->
<!-- uses-permission android:name="android.permission.INTERNET" /-->
```
4. In MainActivity, uncomment the import part and the with
```
// Crashlytics import
/*import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;*/

// Crashlytics with
// Fabric.with(this, new Crashlytics());
```

# Add new crash case
1. Create a new java file and make sure it extends from Crash.java.
2. Setup category, title, description, and classPath.
3. Customize crash function.
4. Add the class path inside the ALL_CRASH_PATH_ARRAY in Crash.java.
