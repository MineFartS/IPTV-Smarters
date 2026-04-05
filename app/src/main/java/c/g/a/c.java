package c.g.a;

import c.g.a.a;

/* JADX INFO: loaded from: classes2.dex */
public class c<S extends a<C>, C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S f16668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f16669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16671e;

    public c(S s, int i2) {
        this.f16667a = true;
        this.f16668b = s;
        this.f16670d = i2;
        this.f16671e = -1;
    }

    public c(C c2, int i2, int i3) {
        this.f16669c = c2;
        this.f16670d = i2;
        this.f16667a = false;
        this.f16671e = i3;
    }

    public C a() {
        return this.f16669c;
    }

    public int b() {
        int i2 = this.f16671e;
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalAccessError("This is not child");
    }

    public S c() {
        return this.f16668b;
    }

    public int d() {
        return this.f16670d;
    }

    public boolean e() {
        return this.f16667a;
    }
}
