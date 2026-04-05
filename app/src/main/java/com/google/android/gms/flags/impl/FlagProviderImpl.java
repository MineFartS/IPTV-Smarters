package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import c.f.a.c.g.a;
import c.f.a.c.i.a.b;
import c.f.a.c.i.a.d;
import c.f.a.c.i.a.f;
import c.f.a.c.i.a.h;
import c.f.a.c.i.a.j;
import c.f.a.c.i.c;
import com.google.android.gms.common.util.DynamiteApi;

/* JADX INFO: loaded from: classes2.dex */
@DynamiteApi
public class FlagProviderImpl extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24274b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f24275c;

    @Override // c.f.a.c.i.b
    public boolean getBooleanFlagValue(String str, boolean z, int i2) {
        return !this.f24274b ? z : b.a(this.f24275c, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // c.f.a.c.i.b
    public int getIntFlagValue(String str, int i2, int i3) {
        return !this.f24274b ? i2 : d.a(this.f24275c, str, Integer.valueOf(i2)).intValue();
    }

    @Override // c.f.a.c.i.b
    public long getLongFlagValue(String str, long j2, int i2) {
        return !this.f24274b ? j2 : f.a(this.f24275c, str, Long.valueOf(j2)).longValue();
    }

    @Override // c.f.a.c.i.b
    public String getStringFlagValue(String str, String str2, int i2) {
        return !this.f24274b ? str2 : h.a(this.f24275c, str, str2);
    }

    @Override // c.f.a.c.i.b
    public void init(a aVar) {
        Context context = (Context) c.f.a.c.g.b.I2(aVar);
        if (this.f24274b) {
            return;
        }
        try {
            this.f24275c = j.a(context.createPackageContext("com.google.android.gms", 0));
            this.f24274b = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
