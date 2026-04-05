package com.google.ads.interactivemedia.v3.internal;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lv implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, anp, oj, is, io, lz, lh, jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx f22362a;

    public /* synthetic */ lv(lx lxVar) {
        this.f22362a = lxVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void A(pw pwVar) {
        this.f22362a.f22373k.A(pwVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void B(ke keVar, qa qaVar) {
        this.f22362a.f22373k.B(keVar, qaVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void C(long j2) {
        this.f22362a.f22373k.C(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void D(Exception exc) {
        this.f22362a.f22373k.D(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void E(int i2, long j2, long j3) {
        this.f22362a.f22373k.E(i2, j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void F(int i2, long j2) {
        this.f22362a.f22373k.F(i2, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void G(Object obj, long j2) {
        this.f22362a.f22373k.G(obj, j2);
        if (this.f22362a.s == obj) {
            Iterator it = this.f22362a.f22370h.iterator();
            while (it.hasNext()) {
                ((anf) it.next()).ai();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void H(boolean z) {
        if (this.f22362a.C == z) {
            return;
        }
        this.f22362a.C = z;
        lx.v(this.f22362a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void I(Exception exc) {
        this.f22362a.f22373k.I(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void J(String str, long j2, long j3) {
        this.f22362a.f22373k.J(str, j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void K(String str) {
        this.f22362a.f22373k.K(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void L(pw pwVar) {
        this.f22362a.f22373k.L(pwVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void M(pw pwVar) {
        this.f22362a.f22373k.M(pwVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void N(long j2, int i2) {
        this.f22362a.f22373k.N(j2, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void O(ke keVar, qa qaVar) {
        this.f22362a.f22373k.O(keVar, qaVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jc
    public final /* synthetic */ void a() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void al(anq anqVar) {
        this.f22362a.f22373k.al(anqVar);
        for (anf anfVar : this.f22362a.f22370h) {
            anfVar.al(anqVar);
            anfVar.am(anqVar.f20262b, anqVar.f20263c, anqVar.f20265e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jc
    public final void b() {
        lx.G(this.f22362a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void d(Exception exc) {
        this.f22362a.f22373k.d(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void e(String str, long j2, long j3) {
        this.f22362a.f22373k.e(str, j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void f(String str) {
        this.f22362a.f22373k.f(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void g(boolean z) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void h(boolean z) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void i(kn knVar, int i2) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void j(kp kpVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void k(boolean z, int i2) {
        lx.G(this.f22362a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void l(le leVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void m(int i2) {
        lx.G(this.f22362a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void n(int i2) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void o(jb jbVar) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        lx.y(this.f22362a, surfaceTexture);
        this.f22362a.Y(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f22362a.ab(null);
        this.f22362a.Y(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f22362a.Y(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void p(boolean z, int i2) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void q(lj ljVar, lj ljVar2, int i2) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void r() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void s(List list) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.f22362a.Y(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f22362a.v) {
            this.f22362a.ab(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f22362a.v) {
            this.f22362a.ab(null);
        }
        this.f22362a.Y(0, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void t(act actVar, aim aimVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void u() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void v() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void w() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void x() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void y(int i2) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void z(pw pwVar) {
        this.f22362a.f22373k.z(pwVar);
    }
}
