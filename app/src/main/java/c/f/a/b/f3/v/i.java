package c.f.a.b.f3.v;

import android.text.TextUtils;
import c.f.a.b.j3.i0;
import c.f.a.b.w1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends c.f.a.b.f3.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f8383o;
    public final e p;

    public i() {
        super("WebvttDecoder");
        this.f8383o = new i0();
        this.p = new e();
    }

    public static int B(i0 i0Var) {
        int i2 = -1;
        int iE = 0;
        while (i2 == -1) {
            iE = i0Var.e();
            String strP = i0Var.p();
            i2 = strP == null ? 0 : "STYLE".equals(strP) ? 2 : strP.startsWith("NOTE") ? 1 : 3;
        }
        i0Var.P(iE);
        return i2;
    }

    public static void C(i0 i0Var) {
        while (!TextUtils.isEmpty(i0Var.p())) {
        }
    }

    @Override // c.f.a.b.f3.d
    public c.f.a.b.f3.f y(byte[] bArr, int i2, boolean z) throws c.f.a.b.f3.h {
        g gVarM;
        this.f8383o.N(bArr, i2);
        ArrayList arrayList = new ArrayList();
        try {
            j.e(this.f8383o);
            while (!TextUtils.isEmpty(this.f8383o.p())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iB = B(this.f8383o);
                if (iB == 0) {
                    return new k(arrayList2);
                }
                if (iB == 1) {
                    C(this.f8383o);
                } else if (iB == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new c.f.a.b.f3.h("A style block was found after the first cue.");
                    }
                    this.f8383o.p();
                    arrayList.addAll(this.p.d(this.f8383o));
                } else if (iB == 3 && (gVarM = h.m(this.f8383o, arrayList)) != null) {
                    arrayList2.add(gVarM);
                }
            }
        } catch (w1 e2) {
            throw new c.f.a.b.f3.h(e2);
        }
    }
}
