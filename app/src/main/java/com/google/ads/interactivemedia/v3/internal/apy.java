package com.google.ads.interactivemedia.v3.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ apz f20355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20358d;

    public /* synthetic */ apy(apz apzVar, byte[] bArr) {
        this.f20355a = apzVar;
        this.f20356b = bArr;
    }

    public final synchronized void a() {
        try {
            apz apzVar = this.f20355a;
            if (apzVar.f20360b) {
                apzVar.f20359a.h(this.f20356b);
                this.f20355a.f20359a.g(this.f20357c);
                this.f20355a.f20359a.f(this.f20358d);
                this.f20355a.f20359a.j();
                this.f20355a.f20359a.e();
            }
        } catch (RemoteException e2) {
            Log.d("GASS", "Clearcut log failed", e2);
        }
    }

    public final void b(int i2) {
        this.f20358d = i2;
    }

    public final void c(int i2) {
        this.f20357c = i2;
    }
}
