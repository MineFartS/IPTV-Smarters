package c.f.a.b.b3.i;

import c.f.a.b.b3.e;
import c.f.a.b.b3.h;
import c.f.a.b.j3.h0;
import c.f.b.a.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends h {
    public static c.f.a.b.b3.a c(h0 h0Var) {
        h0Var.r(12);
        int iD = (h0Var.d() + h0Var.h(12)) - 4;
        h0Var.r(44);
        h0Var.s(h0Var.h(12));
        h0Var.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (h0Var.d() >= iD) {
                break;
            }
            h0Var.r(48);
            int iH = h0Var.h(8);
            h0Var.r(4);
            int iD2 = h0Var.d() + h0Var.h(12);
            String strL2 = null;
            while (h0Var.d() < iD2) {
                int iH2 = h0Var.h(8);
                int iH3 = h0Var.h(8);
                int iD3 = h0Var.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = h0Var.h(16);
                    h0Var.r(8);
                    if (iH4 == 3) {
                        while (h0Var.d() < iD3) {
                            strL = h0Var.l(h0Var.h(8), d.f15782a);
                            int iH5 = h0Var.h(8);
                            for (int i2 = 0; i2 < iH5; i2++) {
                                h0Var.s(h0Var.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = h0Var.l(iH3, d.f15782a);
                }
                h0Var.p(iD3 * 8);
            }
            h0Var.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c.f.a.b.b3.a(arrayList);
    }

    @Override // c.f.a.b.b3.h
    public c.f.a.b.b3.a b(e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new h0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
