package com.google.android.gms.measurement;

import a.o.a.a;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.k.b.s4;
import c.f.a.c.k.b.t4;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementReceiver extends a implements s4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t4 f24280d;

    @Override // c.f.a.c.k.b.s4
    public void a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
        if (this.f24280d == null) {
            this.f24280d = new t4(this);
        }
        this.f24280d.b(context, intent);
    }
}
