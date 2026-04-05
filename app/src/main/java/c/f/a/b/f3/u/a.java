package c.f.a.b.f3.u;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import c.f.a.b.f3.c;
import c.f.a.b.f3.d;
import c.f.a.b.f3.f;
import c.f.a.b.f3.h;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f8330o;
    public final boolean p;
    public final int q;
    public final int r;
    public final String s;
    public final float t;
    public final int u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f8330o = new i0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.q = 0;
            this.r = -1;
            this.s = "sans-serif";
            this.p = false;
            this.t = 0.85f;
            this.u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.q = bArr[24];
        this.r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.s = "Serif".equals(x0.F(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * DateTimeFieldType.SECOND_OF_DAY;
        this.u = i2;
        boolean z = (bArr[0] & 32) != 0;
        this.p = z;
        if (z) {
            this.t = x0.q(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.t = 0.85f;
        }
    }

    public static void C(boolean z) throws h {
        if (!z) {
            throw new h("Unexpected subtitle format.");
        }
    }

    public static void D(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void E(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = 1
            goto Ld
        Lc:
            r10 = 0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r1)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            if (r1 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r1 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.u.a.E(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    public static void F(SpannableStringBuilder spannableStringBuilder, String str, int i2, int i3) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i2, i3, 16711713);
        }
    }

    public static String G(i0 i0Var) throws h {
        char cG;
        C(i0Var.a() >= 2);
        int iJ = i0Var.J();
        if (iJ == 0) {
            return BuildConfig.FLAVOR;
        }
        return i0Var.B(iJ, (i0Var.a() < 2 || !((cG = i0Var.g()) == 65279 || cG == 65534)) ? c.f.b.a.d.f15784c : c.f.b.a.d.f15787f);
    }

    public final void B(i0 i0Var, SpannableStringBuilder spannableStringBuilder) throws h {
        int length;
        C(i0Var.a() >= 12);
        int iJ = i0Var.J();
        int iJ2 = i0Var.J();
        i0Var.Q(2);
        int iD = i0Var.D();
        i0Var.Q(1);
        int iN = i0Var.n();
        if (iJ2 > spannableStringBuilder.length()) {
            z.i("Tx3gDecoder", "Truncating styl end (" + iJ2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            length = spannableStringBuilder.length();
        } else {
            length = iJ2;
        }
        if (iJ < length) {
            int i2 = length;
            E(spannableStringBuilder, iD, this.q, iJ, i2, 0);
            D(spannableStringBuilder, iN, this.r, iJ, i2, 0);
            return;
        }
        z.i("Tx3gDecoder", "Ignoring styl with start (" + iJ + ") >= end (" + length + ").");
    }

    @Override // c.f.a.b.f3.d
    public f y(byte[] bArr, int i2, boolean z) throws h {
        this.f8330o.N(bArr, i2);
        String strG = G(this.f8330o);
        if (strG.isEmpty()) {
            return b.f8331b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strG);
        E(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.s, 0, spannableStringBuilder.length());
        float fQ = this.t;
        while (this.f8330o.a() >= 8) {
            int iE = this.f8330o.e();
            int iN = this.f8330o.n();
            int iN2 = this.f8330o.n();
            if (iN2 == 1937013100) {
                C(this.f8330o.a() >= 2);
                int iJ = this.f8330o.J();
                for (int i3 = 0; i3 < iJ; i3++) {
                    B(this.f8330o, spannableStringBuilder);
                }
            } else if (iN2 == 1952608120 && this.p) {
                C(this.f8330o.a() >= 2);
                fQ = x0.q(this.f8330o.J() / this.u, 0.0f, 0.95f);
            }
            this.f8330o.P(iE + iN);
        }
        return new b(new c.b().o(spannableStringBuilder).h(fQ, 0).i(0).a());
    }
}
