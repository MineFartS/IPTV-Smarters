package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import c.f.c.e;
import c.f.c.f;
import c.f.c.g;
import c.f.c.k.d;
import c.f.c.k.i;
import c.f.c.v.c;
import c.f.c.v.h;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements i {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : BuildConfig.FLAVOR;
    }

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? BuildConfig.FLAVOR : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String c(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i2 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? BuildConfig.FLAVOR : "embedded" : "auto" : "watch" : "tv";
    }

    public static /* synthetic */ String d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : BuildConfig.FLAVOR;
    }

    public static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // c.f.c.k.i
    public List<d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.b());
        arrayList.add(c.f.c.p.d.b());
        arrayList.add(h.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.a("fire-core", "19.5.0"));
        arrayList.add(h.a("device-name", e(Build.PRODUCT)));
        arrayList.add(h.a("device-model", e(Build.DEVICE)));
        arrayList.add(h.a("device-brand", e(Build.BRAND)));
        arrayList.add(h.b("android-target-sdk", c.f.c.d.b()));
        arrayList.add(h.b("android-min-sdk", e.b()));
        arrayList.add(h.b("android-platform", f.b()));
        arrayList.add(h.b("android-installer", g.b()));
        String strA = c.f.c.v.e.a();
        if (strA != null) {
            arrayList.add(h.a("kotlin", strA));
        }
        return arrayList;
    }
}
