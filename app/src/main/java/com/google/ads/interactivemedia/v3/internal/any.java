package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public class any {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public anx f20270a;

    public final Uri a(Uri uri, Context context) throws anz {
        apm apmVarC = this.f20270a.c(apn.c(uri), apn.c(context));
        if (apmVarC != null) {
            return (Uri) apn.d(apmVarC);
        }
        throw new anz();
    }

    public final String b(Context context) {
        return this.f20270a.f(apn.c(context), null);
    }

    public final boolean c(Uri uri) {
        return this.f20270a.l(apn.c(uri));
    }
}
