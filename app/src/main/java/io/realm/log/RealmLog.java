package io.realm.log;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class RealmLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f30417a = "REALM_JAVA";

    public static void a(String str, Object... objArr) {
        b(null, str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        c(7, th, str, objArr);
    }

    public static void c(int i2, Throwable th, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (th != null) {
            sb.append(Log.getStackTraceString(th));
        }
        if (str != null) {
            if (th != null) {
                sb.append("\n");
            }
            sb.append(str);
        }
        nativeLog(i2, f30417a, th, sb.toString());
    }

    public static native void nativeLog(int i2, String str, Throwable th, String str2);
}
