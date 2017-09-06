#include <jni.h>
#include <string> 
extern "C"
JNIEXPORT void JNICALL
Java_com_jamcity_CrashReportAndroid_JNIUtil_throwCException(JNIEnv *env, jobject) {
    throw std::exception();
}

extern "C"
JNIEXPORT void JNICALL
Java_com_jamcity_CrashReportAndroid_JNIUtil_accessNonObject(JNIEnv *env, jobject) {
    printf("%s", (void *)11119);
}