package c.f.a.c.j.h;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class a5 extends c5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13195b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5 f13197d;

    public a5(l5 l5Var) {
        this.f13197d = l5Var;
        this.f13196c = l5Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13195b < this.f13196c;
    }

    @Override // c.f.a.c.j.h.g5
    public final byte zza() {
        int i2 = this.f13195b;
        if (i2 >= this.f13196c) {
            throw new NoSuchElementException();
        }
        this.f13195b = i2 + 1;
        return this.f13197d.b(i2);
    }
}
