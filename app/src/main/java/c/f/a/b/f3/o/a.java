package c.f.a.b.f3.o;

import c.f.a.b.f3.d;
import c.f.a.b.f3.f;
import c.f.a.b.j3.i0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f8163o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        i0 i0Var = new i0(list.get(0));
        this.f8163o = new b(i0Var.J(), i0Var.J());
    }

    @Override // c.f.a.b.f3.d
    public f y(byte[] bArr, int i2, boolean z) {
        if (z) {
            this.f8163o.r();
        }
        return new c(this.f8163o.b(bArr, i2));
    }
}
