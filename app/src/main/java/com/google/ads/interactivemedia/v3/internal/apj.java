package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c.f.a.c.f.o.f;

/* JADX INFO: loaded from: classes.dex */
public final class apj extends c.f.a.c.f.q.g<aoz> {
    public apj(Context context, Looper looper, c.f.a.c.f.q.d dVar, f.a aVar, f.b bVar) {
        super(context, looper, 203, dVar, aVar, bVar);
    }

    @Override // c.f.a.c.f.q.c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return aoy.b(iBinder);
    }

    @Override // c.f.a.c.f.q.c
    public final c.f.a.c.f.d[] getApiFeatures() {
        return aqe.f20370c;
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return 17108000;
    }

    @Override // c.f.a.c.f.q.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.signalsdk.ISignalSdkService";
    }

    @Override // c.f.a.c.f.q.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.SDK_SIGNAL";
    }
}
