package com.google.ads.interactivemedia.v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import c.f.a.c.a.a.a;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class fo {
    public final String deviceId;
    public final String idType;
    public final boolean isLimitedAdTracking;

    public fo(Context context) {
        String str = BuildConfig.FLAVOR;
        fn fnVar = new fn(BuildConfig.FLAVOR, false);
        try {
            try {
                fnVar = getInfoFromPlayServices(context);
                str = "adid";
            } catch (Exception | NoClassDefFoundError unused) {
                fnVar = getInfoFromContentResolver(context);
                str = "afai";
            }
        } catch (Settings.SettingNotFoundException unused2) {
            Log.w("IMASDK", "Failed to get advertising ID.");
        }
        this.idType = str;
        this.deviceId = fnVar.f21801a;
        this.isLimitedAdTracking = fnVar.f21802b;
    }

    public fn getInfoFromContentResolver(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return new fn(Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 1);
    }

    public fn getInfoFromPlayServices(Context context) {
        a.C0150a c0150aA = c.f.a.c.a.a.a.a(context);
        return new fn(c0150aA.a(), c0150aA.b());
    }
}
