package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class acq<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f19200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final akw<V> f19201c;

    public acq() {
        acp acpVar = acp.f19196a;
        throw null;
    }

    public acq(akw<V> akwVar) {
        this.f19200b = new SparseArray<>();
        this.f19201c = akwVar;
        this.f19199a = -1;
    }

    public final V a(int i2) {
        if (this.f19199a == -1) {
            this.f19199a = 0;
        }
        while (true) {
            int i3 = this.f19199a;
            if (i3 <= 0 || i2 >= this.f19200b.keyAt(i3)) {
                break;
            }
            this.f19199a--;
        }
        while (this.f19199a < this.f19200b.size() - 1 && i2 >= this.f19200b.keyAt(this.f19199a + 1)) {
            this.f19199a++;
        }
        return this.f19200b.valueAt(this.f19199a);
    }

    public final V b() {
        return this.f19200b.valueAt(r0.size() - 1);
    }

    public final void c(int i2, V v) {
        if (this.f19199a == -1) {
            ajr.f(this.f19200b.size() == 0);
            this.f19199a = 0;
        }
        if (this.f19200b.size() > 0) {
            int iKeyAt = this.f19200b.keyAt(r0.size() - 1);
            ajr.d(i2 >= iKeyAt);
            if (iKeyAt == i2) {
                this.f19201c.a(this.f19200b.valueAt(r1.size() - 1));
            }
        }
        this.f19200b.append(i2, v);
    }

    public final void d() {
        for (int i2 = 0; i2 < this.f19200b.size(); i2++) {
            this.f19201c.a(this.f19200b.valueAt(i2));
        }
        this.f19199a = -1;
        this.f19200b.clear();
    }

    public final void e(int i2) {
        for (int size = this.f19200b.size() - 1; size >= 0 && i2 < this.f19200b.keyAt(size); size--) {
            this.f19201c.a(this.f19200b.valueAt(size));
            this.f19200b.removeAt(size);
        }
        this.f19199a = this.f19200b.size() > 0 ? Math.min(this.f19199a, this.f19200b.size() - 1) : -1;
    }

    public final void f(int i2) {
        int i3 = 0;
        while (i3 < this.f19200b.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.f19200b.keyAt(i4)) {
                return;
            }
            this.f19201c.a(this.f19200b.valueAt(i3));
            this.f19200b.removeAt(i3);
            int i5 = this.f19199a;
            if (i5 > 0) {
                this.f19199a = i5 - 1;
            }
            i3 = i4;
        }
    }

    public final boolean g() {
        return this.f19200b.size() == 0;
    }
}
