package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f18906a = new AtomicBoolean();

    public static class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f18907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18908c;

        public a(Context context, String str) {
            this.f18907b = context;
            this.f18908c = str;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|85|3|(3:75|4|5)|(2:73|6)|(2:63|7)|(5:83|8|(1:10)(1:87)|44|45)|11|67|12|81|16|44|45|(1:(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|85|3|75|4|5|73|6|(2:63|7)|(5:83|8|(1:10)(1:87)|44|45)|11|67|12|81|16|44|45|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x013d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x013e, code lost:
        
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Can't close connection.", r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0146, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0147, code lost:
        
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Can't close connection.", r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:65:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.a.run():void");
        }
    }

    public static void b(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d2) {
        AtomicBoolean atomicBoolean = f18906a;
        if (atomicBoolean.get() || Math.random() >= d2) {
            return;
        }
        atomicBoolean.set(true);
        new a(context, str).start();
    }
}
