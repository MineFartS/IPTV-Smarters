package c.f.a.c.j.c;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class l9 extends n9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12924b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m9 f12926d;

    public l9(m9 m9Var) {
        this.f12926d = m9Var;
        this.f12925c = m9Var.size();
    }

    @Override // c.f.a.c.j.c.r9
    public final byte d() {
        int i2 = this.f12924b;
        if (i2 >= this.f12925c) {
            throw new NoSuchElementException();
        }
        this.f12924b = i2 + 1;
        return this.f12926d.g(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12924b < this.f12925c;
    }
}
