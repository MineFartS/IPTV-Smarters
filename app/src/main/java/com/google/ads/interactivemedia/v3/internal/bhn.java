package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bhn<T> extends bfv<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bgw<T> f21142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, bho> f21143b;

    public bhn(bgw<T> bgwVar, Map<String, bho> map) {
        this.f21142a = bgwVar;
        this.f21143b = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final T read(bjj bjjVar) throws IOException {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        T tA = this.f21142a.a();
        try {
            bjjVar.h();
            while (bjjVar.n()) {
                bho bhoVar = this.f21143b.get(bjjVar.e());
                if (bhoVar == null || !bhoVar.f21146c) {
                    bjjVar.m();
                } else {
                    bhoVar.a(bjjVar, tA);
                }
            }
            bjjVar.j();
            return tA;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (IllegalStateException e3) {
            throw new bfs(e3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final void write(bjl bjlVar, T t) throws IOException {
        if (t == null) {
            bjlVar.g();
            return;
        }
        bjlVar.c();
        try {
            for (bho bhoVar : this.f21143b.values()) {
                if (bhoVar.c(t)) {
                    bjlVar.f(bhoVar.f21144a);
                    bhoVar.b(bjlVar, t);
                }
            }
            bjlVar.e();
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
