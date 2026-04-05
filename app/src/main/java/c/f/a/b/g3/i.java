package c.f.a.b.g3;

import c.f.a.b.e3.z0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f8479i;

    public i(z0 z0Var, int i2, int i3) {
        this(z0Var, i2, i3, 0, null);
    }

    public i(z0 z0Var, int i2, int i3, int i4, Object obj) {
        super(z0Var, new int[]{i2}, i3);
        this.f8478h = i4;
        this.f8479i = obj;
    }

    @Override // c.f.a.b.g3.h
    public int b() {
        return 0;
    }

    @Override // c.f.a.b.g3.h
    public void k(long j2, long j3, long j4, List<? extends c.f.a.b.e3.d1.n> list, c.f.a.b.e3.d1.o[] oVarArr) {
    }

    @Override // c.f.a.b.g3.h
    public int n() {
        return this.f8478h;
    }

    @Override // c.f.a.b.g3.h
    public Object p() {
        return this.f8479i;
    }
}
