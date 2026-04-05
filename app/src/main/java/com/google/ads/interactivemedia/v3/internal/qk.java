package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abg f22828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<qj> f22829c;

    public qk() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private qk(CopyOnWriteArrayList<qj> copyOnWriteArrayList, int i2, abg abgVar) {
        this.f22829c = copyOnWriteArrayList;
        this.f22827a = i2;
        this.f22828b = abgVar;
    }

    public final qk a(int i2, abg abgVar) {
        return new qk(this.f22829c, i2, abgVar);
    }

    public final void b(Handler handler, ql qlVar) {
        ajr.b(handler);
        ajr.b(qlVar);
        this.f22829c.add(new qj(handler, qlVar));
    }

    public final void c(ql qlVar) {
        for (qj qjVar : this.f22829c) {
            if (qjVar.f22826b == qlVar) {
                this.f22829c.remove(qjVar);
            }
        }
    }
}
