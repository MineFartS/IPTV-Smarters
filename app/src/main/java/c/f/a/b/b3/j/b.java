package c.f.a.b.b3.j;

import c.f.a.b.b3.e;
import c.f.a.b.b3.h;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h {
    @Override // c.f.a.b.b3.h
    public c.f.a.b.b3.a b(e eVar, ByteBuffer byteBuffer) {
        return new c.f.a.b.b3.a(c(new i0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(i0 i0Var) {
        return new a((String) g.e(i0Var.x()), (String) g.e(i0Var.x()), i0Var.w(), i0Var.w(), Arrays.copyOfRange(i0Var.d(), i0Var.e(), i0Var.f()));
    }
}
