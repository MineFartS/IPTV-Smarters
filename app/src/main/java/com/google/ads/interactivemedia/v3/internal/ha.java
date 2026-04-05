package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ha implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hc f21889b;

    public ha(hc hcVar, int i2) {
        this.f21889b = hcVar;
        this.f21888a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVarA;
        hc hcVar = this.f21889b;
        if (this.f21888a > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = hcVar.f21893a.getPackageManager().getPackageInfo(hcVar.f21893a.getPackageName(), 0);
            Context context = hcVar.f21893a;
            uVarA = apq.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            uVarA = null;
        }
        this.f21889b.f21904m = uVarA;
        if (this.f21888a < 4) {
            if (uVarA != null && uVarA.ad() && !uVarA.f().equals("0000000000000000000000000000000000000000000000000000000000000000") && uVarA.ae() && uVarA.e().e() && uVarA.e().a() != -2) {
                return;
            }
            this.f21889b.r(this.f21888a + 1);
        }
    }
}
