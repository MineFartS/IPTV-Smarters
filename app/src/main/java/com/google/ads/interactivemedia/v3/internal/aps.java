package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c.f.a.c.f.q.c;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class aps extends aoa<apx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20347a;

    public aps(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, aVar, bVar);
        this.f20347a = 9200000;
    }

    public final apx a() {
        return (apx) super.getService();
    }

    @Override // c.f.a.c.f.q.c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof apx ? (apx) iInterfaceQueryLocalInterface : new apw(iBinder);
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return this.f20347a;
    }

    @Override // c.f.a.c.f.q.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // c.f.a.c.f.q.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }
}
