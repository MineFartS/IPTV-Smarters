package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class ov implements nz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nx f22651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nx f22652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nx f22653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private nx f22654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f22655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f22656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22657h;

    public ov() {
        ByteBuffer byteBuffer = nz.f22577a;
        this.f22655f = byteBuffer;
        this.f22656g = byteBuffer;
        nx nxVar = nx.f22572a;
        this.f22653d = nxVar;
        this.f22654e = nxVar;
        this.f22651b = nxVar;
        this.f22652c = nxVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final nx a(nx nxVar) {
        this.f22653d = nxVar;
        this.f22654e = i(nxVar);
        return g() ? this.f22654e : nx.f22572a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f22656g;
        this.f22656g = nz.f22577a;
        return byteBuffer;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void c() {
        this.f22656g = nz.f22577a;
        this.f22657h = false;
        this.f22651b = this.f22653d;
        this.f22652c = this.f22654e;
        k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void d() {
        this.f22657h = true;
        l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public final void f() {
        c();
        this.f22655f = nz.f22577a;
        nx nxVar = nx.f22572a;
        this.f22653d = nxVar;
        this.f22654e = nxVar;
        this.f22651b = nxVar;
        this.f22652c = nxVar;
        m();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public boolean g() {
        return this.f22654e != nx.f22572a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nz
    public boolean h() {
        return this.f22657h && this.f22656g == nz.f22577a;
    }

    public nx i(nx nxVar) {
        throw null;
    }

    public final ByteBuffer j(int i2) {
        if (this.f22655f.capacity() < i2) {
            this.f22655f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f22655f.clear();
        }
        ByteBuffer byteBuffer = this.f22655f;
        this.f22656g = byteBuffer;
        return byteBuffer;
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public final boolean n() {
        return this.f22656g.hasRemaining();
    }
}
