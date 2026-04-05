package c.f.a.b.f3.n;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c.f.a.b.f3.c;
import c.f.a.b.f3.k;
import c.f.a.b.f3.n.d;
import c.f.a.b.j3.g;
import c.f.a.b.j3.h0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.j;
import c.f.a.b.j3.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f8123g = new i0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f8124h = new h0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8125i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f8126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b[] f8128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f8129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<c.f.a.b.f3.c> f8130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<c.f.a.b.f3.c> f8131o;
    public c p;
    public int q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Comparator<a> f8132a = new Comparator() { // from class: c.f.a.b.f3.n.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.f.a.b.e3.e1.e.a(((d.a) obj2).f8134c, ((d.a) obj).f8134c);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.f3.c f8133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8134c;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5, int i6) {
            c.b bVarN = new c.b().o(charSequence).p(alignment).h(f2, i2).i(i3).k(f3).l(i4).n(f4);
            if (z) {
                bVarN.s(i5);
            }
            this.f8133b = bVarN.a();
            this.f8134c = i6;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f8135a = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f8136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f8137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int[] f8138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int[] f8139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int[] f8140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final boolean[] f8141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int[] f8142h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int[] f8143i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int[] f8144j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int[] f8145k;
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List<SpannableString> f8146l = new ArrayList();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final SpannableStringBuilder f8147m = new SpannableStringBuilder();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f8148n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f8149o;
        public int p;
        public boolean q;
        public int r;
        public int s;
        public int t;
        public int u;
        public boolean v;
        public int w;
        public int x;
        public int y;
        public int z;

        static {
            int iH = h(0, 0, 0, 0);
            f8136b = iH;
            int iH2 = h(0, 0, 0, 3);
            f8137c = iH2;
            f8138d = new int[]{0, 0, 0, 0, 0, 2, 0};
            f8139e = new int[]{0, 0, 0, 0, 0, 0, 2};
            f8140f = new int[]{3, 3, 3, 3, 3, 3, 1};
            f8141g = new boolean[]{false, false, false, true, true, true, false};
            f8142h = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f8143i = new int[]{0, 1, 2, 3, 4, 3, 4};
            f8144j = new int[]{0, 0, 0, 0, 0, 3, 3};
            f8145k = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i2, int i3, int i4) {
            return h(i2, i3, i4, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                c.f.a.b.j3.g.c(r4, r0, r1)
                c.f.a.b.j3.g.c(r5, r0, r1)
                c.f.a.b.j3.g.c(r6, r0, r1)
                c.f.a.b.j3.g.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = 0
                goto L23
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L23
            L21:
                r7 = 255(0xff, float:3.57E-43)
            L23:
                if (r4 <= r1) goto L28
                r4 = 255(0xff, float:3.57E-43)
                goto L29
            L28:
                r4 = 0
            L29:
                if (r5 <= r1) goto L2e
                r5 = 255(0xff, float:3.57E-43)
                goto L2f
            L2e:
                r5 = 0
            L2f:
                if (r6 <= r1) goto L33
                r0 = 255(0xff, float:3.57E-43)
            L33:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.n.d.b.h(int, int, int, int):int");
        }

        public void a(char c2) {
            if (c2 != '\n') {
                this.f8147m.append(c2);
                return;
            }
            this.f8146l.add(d());
            this.f8147m.clear();
            if (this.A != -1) {
                this.A = 0;
            }
            if (this.B != -1) {
                this.B = 0;
            }
            if (this.C != -1) {
                this.C = 0;
            }
            if (this.E != -1) {
                this.E = 0;
            }
            while (true) {
                if ((!this.v || this.f8146l.size() < this.u) && this.f8146l.size() < 15) {
                    return;
                } else {
                    this.f8146l.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f8147m.length();
            if (length > 0) {
                this.f8147m.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f2;
            float f3;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.f8146l.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.f8146l.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i3 = this.w;
            if (i3 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i3 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.w);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.q) {
                f2 = this.s / 99.0f;
                f3 = this.r / 99.0f;
            } else {
                f2 = this.s / 209.0f;
                f3 = this.r / 74.0f;
            }
            float f4 = (f2 * 0.9f) + 0.05f;
            float f5 = (f3 * 0.9f) + 0.05f;
            int i4 = this.t;
            return new a(spannableStringBuilder, alignment2, f5, 0, i4 / 3 == 0 ? 0 : i4 / 3 == 1 ? 1 : 2, f4, i4 % 3 == 0 ? 0 : i4 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.z != f8136b, this.z, this.p);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8147m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.A, length, 33);
                }
                if (this.B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.B, length, 33);
                }
                if (this.C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.D), this.C, length, 33);
                }
                if (this.E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.F), this.E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f8146l.clear();
            this.f8147m.clear();
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.E = -1;
            this.G = 0;
        }

        public void f(boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f8148n = true;
            this.f8149o = z;
            this.v = z2;
            this.p = i2;
            this.q = z4;
            this.r = i3;
            this.s = i4;
            this.t = i7;
            int i10 = i5 + 1;
            if (this.u != i10) {
                this.u = i10;
                while (true) {
                    if ((!z2 || this.f8146l.size() < this.u) && this.f8146l.size() < 15) {
                        break;
                    } else {
                        this.f8146l.remove(0);
                    }
                }
            }
            if (i8 != 0 && this.x != i8) {
                this.x = i8;
                int i11 = i8 - 1;
                q(f8142h[i11], f8137c, f8141g[i11], 0, f8139e[i11], f8140f[i11], f8138d[i11]);
            }
            if (i9 == 0 || this.y == i9) {
                return;
            }
            this.y = i9;
            int i12 = i9 - 1;
            m(0, 1, 1, false, false, f8144j[i12], f8143i[i12]);
            n(f8135a, f8145k[i12], f8136b);
        }

        public boolean i() {
            return this.f8148n;
        }

        public boolean j() {
            return !i() || (this.f8146l.isEmpty() && this.f8147m.length() == 0);
        }

        public boolean k() {
            return this.f8149o;
        }

        public void l() {
            e();
            this.f8148n = false;
            this.f8149o = false;
            this.p = 4;
            this.q = false;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 15;
            this.v = true;
            this.w = 0;
            this.x = 0;
            this.y = 0;
            int i2 = f8136b;
            this.z = i2;
            this.D = f8135a;
            this.F = i2;
        }

        public void m(int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6) {
            if (this.A != -1) {
                if (!z) {
                    this.f8147m.setSpan(new StyleSpan(2), this.A, this.f8147m.length(), 33);
                    this.A = -1;
                }
            } else if (z) {
                this.A = this.f8147m.length();
            }
            if (this.B == -1) {
                if (z2) {
                    this.B = this.f8147m.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f8147m.setSpan(new UnderlineSpan(), this.B, this.f8147m.length(), 33);
                this.B = -1;
            }
        }

        public void n(int i2, int i3, int i4) {
            if (this.C != -1 && this.D != i2) {
                this.f8147m.setSpan(new ForegroundColorSpan(this.D), this.C, this.f8147m.length(), 33);
            }
            if (i2 != f8135a) {
                this.C = this.f8147m.length();
                this.D = i2;
            }
            if (this.E != -1 && this.F != i3) {
                this.f8147m.setSpan(new BackgroundColorSpan(this.F), this.E, this.f8147m.length(), 33);
            }
            if (i3 != f8136b) {
                this.E = this.f8147m.length();
                this.F = i3;
            }
        }

        public void o(int i2, int i3) {
            if (this.G != i2) {
                a('\n');
            }
            this.G = i2;
        }

        public void p(boolean z) {
            this.f8149o = z;
        }

        public void q(int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
            this.z = i2;
            this.w = i7;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f8152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8153d = 0;

        public c(int i2, int i3) {
            this.f8150a = i2;
            this.f8151b = i3;
            this.f8152c = new byte[(i3 * 2) - 1];
        }
    }

    public d(int i2, List<byte[]> list) {
        this.f8127k = i2 == -1 ? 1 : i2;
        this.f8126j = list != null && j.h(list);
        this.f8128l = new b[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f8128l[i3] = new b();
        }
        this.f8129m = this.f8128l[0];
    }

    public final void A() {
        int iH = b.h(this.f8124h.h(2), this.f8124h.h(2), this.f8124h.h(2), this.f8124h.h(2));
        int iH2 = b.h(this.f8124h.h(2), this.f8124h.h(2), this.f8124h.h(2), this.f8124h.h(2));
        this.f8124h.r(2);
        this.f8129m.n(iH, iH2, b.g(this.f8124h.h(2), this.f8124h.h(2), this.f8124h.h(2)));
    }

    public final void B() {
        this.f8124h.r(4);
        int iH = this.f8124h.h(4);
        this.f8124h.r(2);
        this.f8129m.o(iH, this.f8124h.h(6));
    }

    public final void C() {
        int iH = b.h(this.f8124h.h(2), this.f8124h.h(2), this.f8124h.h(2), this.f8124h.h(2));
        int iH2 = this.f8124h.h(2);
        int iG = b.g(this.f8124h.h(2), this.f8124h.h(2), this.f8124h.h(2));
        if (this.f8124h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f8124h.g();
        int iH3 = this.f8124h.h(2);
        int iH4 = this.f8124h.h(2);
        int iH5 = this.f8124h.h(2);
        this.f8124h.r(8);
        this.f8129m.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    public final void D() {
        StringBuilder sb;
        String str;
        c cVar = this.p;
        if (cVar.f8153d != (cVar.f8151b * 2) - 1) {
            z.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.f8151b * 2) - 1) + ", but current index is " + this.p.f8153d + " (sequence number " + this.p.f8150a + ");");
        }
        h0 h0Var = this.f8124h;
        c cVar2 = this.p;
        h0Var.o(cVar2.f8152c, cVar2.f8153d);
        int iH = this.f8124h.h(3);
        int iH2 = this.f8124h.h(5);
        if (iH == 7) {
            this.f8124h.r(2);
            iH = this.f8124h.h(6);
            if (iH < 7) {
                z.i("Cea708Decoder", "Invalid extended service number: " + iH);
            }
        }
        if (iH2 == 0) {
            if (iH != 0) {
                z.i("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (iH != this.f8127k) {
            return;
        }
        boolean z = false;
        while (this.f8124h.b() > 0) {
            int iH3 = this.f8124h.h(8);
            if (iH3 == 16) {
                iH3 = this.f8124h.h(8);
                if (iH3 <= 31) {
                    s(iH3);
                } else {
                    if (iH3 <= 127) {
                        x(iH3);
                    } else if (iH3 <= 159) {
                        t(iH3);
                    } else if (iH3 <= 255) {
                        y(iH3);
                    } else {
                        sb = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb.append(str);
                        sb.append(iH3);
                        z.i("Cea708Decoder", sb.toString());
                    }
                    z = true;
                }
            } else if (iH3 <= 31) {
                q(iH3);
            } else {
                if (iH3 <= 127) {
                    v(iH3);
                } else if (iH3 <= 159) {
                    r(iH3);
                } else if (iH3 <= 255) {
                    w(iH3);
                } else {
                    sb = new StringBuilder();
                    str = "Invalid base command: ";
                    sb.append(str);
                    sb.append(iH3);
                    z.i("Cea708Decoder", sb.toString());
                }
                z = true;
            }
        }
        if (z) {
            this.f8130n = p();
        }
    }

    public final void E() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.f8128l[i2].l();
        }
    }

    @Override // c.f.a.b.f3.n.e, c.f.a.b.f3.g
    public /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }

    @Override // c.f.a.b.f3.n.e
    public c.f.a.b.f3.f e() {
        List<c.f.a.b.f3.c> list = this.f8130n;
        this.f8131o = list;
        return new f((List) g.e(list));
    }

    @Override // c.f.a.b.f3.n.e
    public void f(c.f.a.b.f3.j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) g.e(jVar.f10276c);
        this.f8123g.N(byteBuffer.array(), byteBuffer.limit());
        while (this.f8123g.a() >= 3) {
            int iD = this.f8123g.D() & 7;
            int i2 = iD & 3;
            boolean z = (iD & 4) == 4;
            byte bD = (byte) this.f8123g.D();
            byte bD2 = (byte) this.f8123g.D();
            if (i2 == 2 || i2 == 3) {
                if (z) {
                    if (i2 == 3) {
                        o();
                        int i3 = (bD & 192) >> 6;
                        int i4 = this.f8125i;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            E();
                            z.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f8125i + " current=" + i3);
                        }
                        this.f8125i = i3;
                        int i5 = bD & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        c cVar = new c(i3, i5);
                        this.p = cVar;
                        byte[] bArr = cVar.f8152c;
                        int i6 = cVar.f8153d;
                        cVar.f8153d = i6 + 1;
                        bArr[i6] = bD2;
                    } else {
                        g.a(i2 == 2);
                        c cVar2 = this.p;
                        if (cVar2 == null) {
                            z.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f8152c;
                            int i7 = cVar2.f8153d;
                            int i8 = i7 + 1;
                            cVar2.f8153d = i8;
                            bArr2[i7] = bD;
                            cVar2.f8153d = i8 + 1;
                            bArr2[i8] = bD2;
                        }
                    }
                    c cVar3 = this.p;
                    if (cVar3.f8153d == (cVar3.f8151b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // c.f.a.b.f3.n.e, c.f.a.b.v2.c
    public void flush() {
        super.flush();
        this.f8130n = null;
        this.f8131o = null;
        this.q = 0;
        this.f8129m = this.f8128l[0];
        E();
        this.p = null;
    }

    @Override // c.f.a.b.f3.n.e
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ c.f.a.b.f3.j c() {
        return super.c();
    }

    @Override // c.f.a.b.v2.c
    public String getName() {
        return "Cea708Decoder";
    }

    @Override // c.f.a.b.f3.n.e
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ k b() {
        return super.b();
    }

    @Override // c.f.a.b.f3.n.e
    public boolean k() {
        return this.f8130n != this.f8131o;
    }

    @Override // c.f.a.b.f3.n.e
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void d(c.f.a.b.f3.j jVar) {
        super.d(jVar);
    }

    public final void o() {
        if (this.p == null) {
            return;
        }
        D();
        this.p = null;
    }

    public final List<c.f.a.b.f3.c> p() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.f8128l[i2].j() && this.f8128l[i2].k() && (aVarC = this.f8128l[i2].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f8132a);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(((a) arrayList.get(i3)).f8133b);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void q(int i2) {
        h0 h0Var;
        if (i2 != 0) {
            if (i2 == 3) {
                this.f8130n = p();
            }
            int i3 = 8;
            if (i2 == 8) {
                this.f8129m.b();
                return;
            }
            switch (i2) {
                case 12:
                    E();
                    break;
                case 13:
                    this.f8129m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i2 >= 17 && i2 <= 23) {
                        z.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i2);
                        h0Var = this.f8124h;
                    } else if (i2 < 24 || i2 > 31) {
                        z.i("Cea708Decoder", "Invalid C0 command: " + i2);
                    } else {
                        z.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i2);
                        h0Var = this.f8124h;
                        i3 = 16;
                    }
                    h0Var.r(i3);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void r(int i2) {
        b bVar;
        h0 h0Var;
        int i3 = 16;
        int i4 = 1;
        switch (i2) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i5 = i2 - 128;
                if (this.q != i5) {
                    this.q = i5;
                    bVar = this.f8128l[i5];
                    this.f8129m = bVar;
                }
                break;
            case 136:
                while (i4 <= 8) {
                    if (this.f8124h.g()) {
                        this.f8128l[8 - i4].e();
                    }
                    i4++;
                }
                break;
            case 137:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.f8124h.g()) {
                        this.f8128l[8 - i6].p(true);
                    }
                }
                break;
            case 138:
                while (i4 <= 8) {
                    if (this.f8124h.g()) {
                        this.f8128l[8 - i4].p(false);
                    }
                    i4++;
                }
                break;
            case 139:
                for (int i7 = 1; i7 <= 8; i7++) {
                    if (this.f8124h.g()) {
                        this.f8128l[8 - i7].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i4 <= 8) {
                    if (this.f8124h.g()) {
                        this.f8128l[8 - i4].l();
                    }
                    i4++;
                }
                break;
            case 141:
                this.f8124h.r(8);
                break;
            case 142:
                break;
            case 143:
                E();
                break;
            case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /* 144 */:
                if (this.f8129m.i()) {
                    z();
                }
                h0Var = this.f8124h;
                h0Var.r(i3);
                break;
            case 145:
                if (this.f8129m.i()) {
                    A();
                } else {
                    h0Var = this.f8124h;
                    i3 = 24;
                    h0Var.r(i3);
                }
                break;
            case 146:
                if (this.f8129m.i()) {
                    B();
                }
                h0Var = this.f8124h;
                h0Var.r(i3);
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                z.i("Cea708Decoder", "Invalid C1 command: " + i2);
                break;
            case 151:
                if (this.f8129m.i()) {
                    C();
                } else {
                    h0Var = this.f8124h;
                    i3 = 32;
                    h0Var.r(i3);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i8 = i2 - 152;
                u(i8);
                if (this.q != i8) {
                    this.q = i8;
                    bVar = this.f8128l[i8];
                    this.f8129m = bVar;
                }
                break;
        }
    }

    @Override // c.f.a.b.f3.n.e, c.f.a.b.v2.c
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i2) {
        h0 h0Var;
        int i3;
        if (i2 <= 7) {
            return;
        }
        if (i2 <= 15) {
            h0Var = this.f8124h;
            i3 = 8;
        } else if (i2 <= 23) {
            h0Var = this.f8124h;
            i3 = 16;
        } else {
            if (i2 > 31) {
                return;
            }
            h0Var = this.f8124h;
            i3 = 24;
        }
        h0Var.r(i3);
    }

    public final void t(int i2) {
        h0 h0Var;
        int i3;
        if (i2 <= 135) {
            h0Var = this.f8124h;
            i3 = 32;
        } else {
            if (i2 > 143) {
                if (i2 <= 159) {
                    this.f8124h.r(2);
                    this.f8124h.r(this.f8124h.h(6) * 8);
                    return;
                }
                return;
            }
            h0Var = this.f8124h;
            i3 = 40;
        }
        h0Var.r(i3);
    }

    public final void u(int i2) {
        b bVar = this.f8128l[i2];
        this.f8124h.r(2);
        boolean zG = this.f8124h.g();
        boolean zG2 = this.f8124h.g();
        boolean zG3 = this.f8124h.g();
        int iH = this.f8124h.h(3);
        boolean zG4 = this.f8124h.g();
        int iH2 = this.f8124h.h(7);
        int iH3 = this.f8124h.h(8);
        int iH4 = this.f8124h.h(4);
        int iH5 = this.f8124h.h(4);
        this.f8124h.r(2);
        int iH6 = this.f8124h.h(6);
        this.f8124h.r(2);
        bVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f8124h.h(3), this.f8124h.h(3));
    }

    public final void v(int i2) {
        if (i2 == 127) {
            this.f8129m.a((char) 9835);
        } else {
            this.f8129m.a((char) (i2 & 255));
        }
    }

    public final void w(int i2) {
        this.f8129m.a((char) (i2 & 255));
    }

    public final void x(int i2) {
        b bVar;
        char c2 = ' ';
        if (i2 == 32) {
            bVar = this.f8129m;
        } else if (i2 == 33) {
            bVar = this.f8129m;
            c2 = 160;
        } else if (i2 == 37) {
            bVar = this.f8129m;
            c2 = 8230;
        } else if (i2 == 42) {
            bVar = this.f8129m;
            c2 = 352;
        } else if (i2 == 44) {
            bVar = this.f8129m;
            c2 = 338;
        } else if (i2 == 63) {
            bVar = this.f8129m;
            c2 = 376;
        } else if (i2 == 57) {
            bVar = this.f8129m;
            c2 = 8482;
        } else if (i2 == 58) {
            bVar = this.f8129m;
            c2 = 353;
        } else if (i2 == 60) {
            bVar = this.f8129m;
            c2 = 339;
        } else if (i2 != 61) {
            switch (i2) {
                case 48:
                    bVar = this.f8129m;
                    c2 = 9608;
                    break;
                case 49:
                    bVar = this.f8129m;
                    c2 = 8216;
                    break;
                case 50:
                    bVar = this.f8129m;
                    c2 = 8217;
                    break;
                case 51:
                    bVar = this.f8129m;
                    c2 = 8220;
                    break;
                case 52:
                    bVar = this.f8129m;
                    c2 = 8221;
                    break;
                case 53:
                    bVar = this.f8129m;
                    c2 = 8226;
                    break;
                default:
                    switch (i2) {
                        case 118:
                            bVar = this.f8129m;
                            c2 = 8539;
                            break;
                        case 119:
                            bVar = this.f8129m;
                            c2 = 8540;
                            break;
                        case 120:
                            bVar = this.f8129m;
                            c2 = 8541;
                            break;
                        case 121:
                            bVar = this.f8129m;
                            c2 = 8542;
                            break;
                        case 122:
                            bVar = this.f8129m;
                            c2 = 9474;
                            break;
                        case 123:
                            bVar = this.f8129m;
                            c2 = 9488;
                            break;
                        case 124:
                            bVar = this.f8129m;
                            c2 = 9492;
                            break;
                        case 125:
                            bVar = this.f8129m;
                            c2 = 9472;
                            break;
                        case 126:
                            bVar = this.f8129m;
                            c2 = 9496;
                            break;
                        case 127:
                            bVar = this.f8129m;
                            c2 = 9484;
                            break;
                        default:
                            z.i("Cea708Decoder", "Invalid G2 character: " + i2);
                            return;
                    }
                    break;
            }
        } else {
            bVar = this.f8129m;
            c2 = 8480;
        }
        bVar.a(c2);
    }

    public final void y(int i2) {
        b bVar;
        char c2;
        if (i2 == 160) {
            bVar = this.f8129m;
            c2 = 13252;
        } else {
            z.i("Cea708Decoder", "Invalid G3 character: " + i2);
            bVar = this.f8129m;
            c2 = '_';
        }
        bVar.a(c2);
    }

    public final void z() {
        this.f8129m.m(this.f8124h.h(4), this.f8124h.h(2), this.f8124h.h(2), this.f8124h.g(), this.f8124h.g(), this.f8124h.h(3), this.f8124h.h(3));
    }
}
