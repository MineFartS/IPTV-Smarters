package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class amj implements alc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<ami> f20124a = new ArrayList(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f20125b;

    public amj(Handler handler) {
        this.f20125b = handler;
    }

    public static /* synthetic */ void l(ami amiVar) {
        List<ami> list = f20124a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(amiVar);
            }
        }
    }

    private static ami m() {
        ami amiVar;
        List<ami> list = f20124a;
        synchronized (list) {
            amiVar = list.isEmpty() ? new ami(null) : list.remove(list.size() - 1);
        }
        return amiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final alb a(int i2) {
        ami amiVarM = m();
        amiVarM.c(this.f20125b.obtainMessage(i2));
        return amiVarM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final alb b(int i2, Object obj) {
        ami amiVarM = m();
        amiVarM.c(this.f20125b.obtainMessage(i2, obj));
        return amiVarM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final alb c(int i2, int i3, int i4, Object obj) {
        ami amiVarM = m();
        amiVarM.c(this.f20125b.obtainMessage(1, 1036, 0, obj));
        return amiVarM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final boolean d() {
        return this.f20125b.hasMessages(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final alb e(int i2, int i3) {
        ami amiVarM = m();
        amiVarM.c(this.f20125b.obtainMessage(1, i2, i3));
        return amiVarM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final void f(Runnable runnable) {
        this.f20125b.post(runnable);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final void g() {
        this.f20125b.removeCallbacksAndMessages(null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final void h() {
        this.f20125b.removeMessages(2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final void i(int i2) {
        this.f20125b.sendEmptyMessage(i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final void j(long j2) {
        this.f20125b.sendEmptyMessageAtTime(2, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alc
    public final void k(alb albVar) {
        ((ami) albVar).b(this.f20125b);
    }
}
