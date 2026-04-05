package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ari implements arh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20418a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final arc<Void> f20420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Exception f20424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20425h;

    public ari(int i2, arc<Void> arcVar) {
        this.f20419b = i2;
        this.f20420c = arcVar;
    }

    private final void a() {
        int i2 = this.f20421d;
        int i3 = this.f20422e;
        int i4 = this.f20423f;
        int i5 = this.f20419b;
        if (i2 + i3 + i4 == i5) {
            if (this.f20424g == null) {
                if (this.f20425h) {
                    this.f20420c.o();
                    return;
                } else {
                    this.f20420c.l(null);
                    return;
                }
            }
            arc<Void> arcVar = this.f20420c;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i3);
            sb.append(" out of ");
            sb.append(i5);
            sb.append(" underlying tasks failed");
            arcVar.k(new ExecutionException(sb.toString(), this.f20424g));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aql
    public final void c() {
        synchronized (this.f20418a) {
            this.f20423f++;
            this.f20425h = true;
            a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqq
    public final void e(Exception exc) {
        synchronized (this.f20418a) {
            this.f20422e++;
            this.f20424g = exc;
            a();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqt
    public final void f(Object obj) {
        synchronized (this.f20418a) {
            this.f20421d++;
            a();
        }
    }
}
