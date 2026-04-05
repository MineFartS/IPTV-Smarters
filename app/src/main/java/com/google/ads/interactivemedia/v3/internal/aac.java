package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class aac implements abi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<abh> f18957a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<abh> f18958b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final abo f18959c = new abo();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qk f18960d = new qk();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f18961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private mg f18962f;

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public /* synthetic */ mg Y() {
        return null;
    }

    public final qk b(abg abgVar) {
        return this.f18960d.a(0, abgVar);
    }

    public final qk c(int i2, abg abgVar) {
        return this.f18960d.a(i2, abgVar);
    }

    public final abo d(abg abgVar) {
        return this.f18959c.a(0, abgVar, 0L);
    }

    public final abo e(abg abgVar, long j2) {
        return this.f18959c.a(0, abgVar, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void f(Handler handler, ql qlVar) {
        ajr.b(handler);
        ajr.b(qlVar);
        this.f18960d.b(handler, qlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void g(Handler handler, abp abpVar) {
        ajr.b(handler);
        ajr.b(abpVar);
        this.f18959c.b(handler, abpVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void h(abh abhVar) {
        boolean zIsEmpty = this.f18958b.isEmpty();
        this.f18958b.remove(abhVar);
        if ((!zIsEmpty) && this.f18958b.isEmpty()) {
            i();
        }
    }

    public void i() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void j(abh abhVar) {
        ajr.b(this.f18961e);
        boolean zIsEmpty = this.f18958b.isEmpty();
        this.f18958b.add(abhVar);
        if (zIsEmpty) {
            k();
        }
    }

    public void k() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void l(abh abhVar, akq akqVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f18961e;
        boolean z = true;
        if (looper != null && looper != looperMyLooper) {
            z = false;
        }
        ajr.d(z);
        mg mgVar = this.f18962f;
        this.f18957a.add(abhVar);
        if (this.f18961e == null) {
            this.f18961e = looperMyLooper;
            this.f18958b.add(abhVar);
            m(akqVar);
        } else if (mgVar != null) {
            j(abhVar);
            abhVar.a(this, mgVar);
        }
    }

    public abstract void m(akq akqVar);

    public final void n(mg mgVar) {
        this.f18962f = mgVar;
        ArrayList<abh> arrayList = this.f18957a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).a(this, mgVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void o(abh abhVar) {
        this.f18957a.remove(abhVar);
        if (!this.f18957a.isEmpty()) {
            h(abhVar);
            return;
        }
        this.f18961e = null;
        this.f18962f = null;
        this.f18958b.clear();
        p();
    }

    public abstract void p();

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void q(ql qlVar) {
        this.f18960d.c(qlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void r(abp abpVar) {
        this.f18959c.l(abpVar);
    }

    public final boolean s() {
        return !this.f18958b.isEmpty();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public /* synthetic */ boolean t() {
        return true;
    }

    public final abo u(int i2, abg abgVar) {
        return this.f18959c.a(i2, abgVar, 0L);
    }
}
