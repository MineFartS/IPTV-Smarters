package c.f.a.b.f3.v;

import c.f.a.b.f3.c;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import java.util.ArrayList;
import java.util.Collections;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends c.f.a.b.f3.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f8335o;

    public c() {
        super("Mp4WebvttDecoder");
        this.f8335o = new i0();
    }

    public static c.f.a.b.f3.c B(i0 i0Var, int i2) throws c.f.a.b.f3.h {
        CharSequence charSequenceQ = null;
        c.b bVarO = null;
        while (i2 > 0) {
            if (i2 < 8) {
                throw new c.f.a.b.f3.h("Incomplete vtt cue box header found.");
            }
            int iN = i0Var.n();
            int iN2 = i0Var.n();
            int i3 = iN - 8;
            String strF = x0.F(i0Var.d(), i0Var.e(), i3);
            i0Var.Q(i3);
            i2 = (i2 - 8) - i3;
            if (iN2 == 1937011815) {
                bVarO = h.o(strF);
            } else if (iN2 == 1885436268) {
                charSequenceQ = h.q(null, strF.trim(), Collections.emptyList());
            }
        }
        if (charSequenceQ == null) {
            charSequenceQ = BuildConfig.FLAVOR;
        }
        return bVarO != null ? bVarO.o(charSequenceQ).a() : h.l(charSequenceQ);
    }

    @Override // c.f.a.b.f3.d
    public c.f.a.b.f3.f y(byte[] bArr, int i2, boolean z) throws c.f.a.b.f3.h {
        this.f8335o.N(bArr, i2);
        ArrayList arrayList = new ArrayList();
        while (this.f8335o.a() > 0) {
            if (this.f8335o.a() < 8) {
                throw new c.f.a.b.f3.h("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iN = this.f8335o.n();
            if (this.f8335o.n() == 1987343459) {
                arrayList.add(B(this.f8335o, iN - 8));
            } else {
                this.f8335o.Q(iN - 8);
            }
        }
        return new d(arrayList);
    }
}
