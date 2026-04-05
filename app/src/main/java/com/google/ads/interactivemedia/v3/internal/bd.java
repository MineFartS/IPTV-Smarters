package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bd f20913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f20914b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private av f20915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private aw f20916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final hd f20917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final pn f20918f;

    public bd(hd hdVar, pn pnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f20917e = hdVar;
        this.f20918f = pnVar;
    }

    public static bd b() {
        if (f20913a == null) {
            f20913a = new bd(new hd(), new pn(), null, null, null);
        }
        return f20913a;
    }

    public final float a() {
        return this.f20914b;
    }

    public final void c(Context context) {
        this.f20915c = new av(new Handler(), context, new ly(), this, null, null, null);
    }

    public final void d(float f2) {
        this.f20914b = f2;
        if (this.f20916d == null) {
            this.f20916d = aw.a();
        }
        Iterator<ap> it = this.f20916d.b().iterator();
        while (it.hasNext()) {
            it.next().h().h(f2);
        }
    }

    public final void e() {
        ay.a().g(this);
        ay.a().d();
        if (ay.a().f()) {
            bw.d().i();
        }
        this.f20915c.a();
    }

    public final void f() {
        bw.d().j();
        ay.a().e();
        this.f20915c.b();
    }
}
