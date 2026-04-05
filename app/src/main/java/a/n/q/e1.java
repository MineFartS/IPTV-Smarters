package a.n.q;

/* JADX INFO: loaded from: classes.dex */
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2759a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f2762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f2763e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2768e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2769f = 3;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2770g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f2771h = 50.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f2772i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2773j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2774k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f2775l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f2776m;

        public a(String str) {
            s();
            this.f2776m = str;
        }

        public final void A(float f2) {
            if ((f2 < 0.0f || f2 > 100.0f) && f2 != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f2771h = f2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r2 = r4.f2765b - r4.f2773j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        
            r4.f2766c = (r4.f2764a - r4.f2773j) - r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void B(int r5, int r6, int r7, int r8) {
            /*
                r4 = this;
                r4.f2765b = r5
                r4.f2764a = r6
                int r5 = r4.c()
                int r6 = r4.a()
                boolean r0 = r4.p()
                boolean r1 = r4.o()
                if (r0 != 0) goto L34
                boolean r2 = r4.f2775l
                if (r2 != 0) goto L21
                int r2 = r4.f2769f
                r2 = r2 & 1
                if (r2 == 0) goto L2f
                goto L27
            L21:
                int r2 = r4.f2769f
                r2 = r2 & 2
                if (r2 == 0) goto L2f
            L27:
                int r2 = r4.f2765b
                int r3 = r4.f2773j
                int r2 = r2 - r3
            L2c:
                r4.f2767d = r2
                goto L34
            L2f:
                int r2 = r4.b(r7, r6)
                goto L2c
            L34:
                if (r1 != 0) goto L56
                boolean r2 = r4.f2775l
                if (r2 != 0) goto L41
                int r2 = r4.f2769f
                r2 = r2 & 2
                if (r2 == 0) goto L50
                goto L47
            L41:
                int r2 = r4.f2769f
                r2 = r2 & 1
                if (r2 == 0) goto L50
            L47:
                int r2 = r4.f2764a
                int r3 = r4.f2773j
                int r2 = r2 - r3
                int r2 = r2 - r5
                r4.f2766c = r2
                goto L56
            L50:
                int r5 = r4.b(r8, r6)
                r4.f2766c = r5
            L56:
                if (r1 != 0) goto Lba
                if (r0 != 0) goto Lba
                boolean r5 = r4.f2775l
                if (r5 != 0) goto L8c
                int r5 = r4.f2769f
                r0 = r5 & 1
                if (r0 == 0) goto L81
                boolean r5 = r4.r()
                if (r5 == 0) goto L76
            L6a:
                int r5 = r4.f2767d
                int r6 = r4.b(r8, r6)
                int r5 = java.lang.Math.min(r5, r6)
                r4.f2767d = r5
            L76:
                int r5 = r4.f2767d
                int r6 = r4.f2766c
                int r5 = java.lang.Math.max(r5, r6)
                r4.f2766c = r5
                goto Lba
            L81:
                r5 = r5 & 2
                if (r5 == 0) goto Lba
                boolean r5 = r4.q()
                if (r5 == 0) goto La4
                goto L98
            L8c:
                int r5 = r4.f2769f
                r0 = r5 & 1
                if (r0 == 0) goto Laf
                boolean r5 = r4.r()
                if (r5 == 0) goto La4
            L98:
                int r5 = r4.f2766c
                int r6 = r4.b(r7, r6)
                int r5 = java.lang.Math.max(r5, r6)
                r4.f2766c = r5
            La4:
                int r5 = r4.f2767d
                int r6 = r4.f2766c
                int r5 = java.lang.Math.min(r5, r6)
                r4.f2767d = r5
                goto Lba
            Laf:
                r5 = r5 & 2
                if (r5 == 0) goto Lba
                boolean r5 = r4.q()
                if (r5 == 0) goto L76
                goto L6a
            Lba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.n.q.e1.a.B(int, int, int, int):void");
        }

        public final int a() {
            if (this.f2775l) {
                int i2 = this.f2770g;
                int i3 = i2 >= 0 ? this.f2772i - i2 : -i2;
                float f2 = this.f2771h;
                return f2 != -1.0f ? i3 - ((int) ((this.f2772i * f2) / 100.0f)) : i3;
            }
            int i4 = this.f2770g;
            if (i4 < 0) {
                i4 += this.f2772i;
            }
            float f3 = this.f2771h;
            return f3 != -1.0f ? i4 + ((int) ((this.f2772i * f3) / 100.0f)) : i4;
        }

        public final int b(int i2, int i3) {
            return i2 - i3;
        }

        public final int c() {
            return (this.f2772i - this.f2773j) - this.f2774k;
        }

        public final int d() {
            return this.f2766c;
        }

        public final int e() {
            return this.f2767d;
        }

        public final int f() {
            return this.f2774k;
        }

        public final int g() {
            return this.f2773j;
        }

        public final int h(int i2) {
            int i3;
            int i4;
            int i5 = i();
            int iA = a();
            boolean zP = p();
            boolean zO = o();
            if (!zP) {
                int i6 = this.f2773j;
                int i7 = iA - i6;
                if (this.f2775l ? (this.f2769f & 2) != 0 : (this.f2769f & 1) != 0) {
                    int i8 = this.f2765b;
                    if (i2 - i8 <= i7) {
                        int i9 = i8 - i6;
                        return (zO || i9 <= (i4 = this.f2766c)) ? i9 : i4;
                    }
                }
            }
            if (!zO) {
                int i10 = this.f2774k;
                int i11 = (i5 - iA) - i10;
                if (this.f2775l ? (this.f2769f & 1) != 0 : (this.f2769f & 2) != 0) {
                    int i12 = this.f2764a;
                    if (i12 - i2 <= i11) {
                        int i13 = i12 - (i5 - i10);
                        return (zP || i13 >= (i3 = this.f2767d)) ? i13 : i3;
                    }
                }
            }
            return b(i2, iA);
        }

        public final int i() {
            return this.f2772i;
        }

        public final int j() {
            return this.f2769f;
        }

        public final int k() {
            return this.f2770g;
        }

        public final float l() {
            return this.f2771h;
        }

        public final void m() {
            this.f2764a = Integer.MAX_VALUE;
            this.f2766c = Integer.MAX_VALUE;
        }

        public final void n() {
            this.f2765b = Integer.MIN_VALUE;
            this.f2767d = Integer.MIN_VALUE;
        }

        public final boolean o() {
            return this.f2764a == Integer.MAX_VALUE;
        }

        public final boolean p() {
            return this.f2765b == Integer.MIN_VALUE;
        }

        public final boolean q() {
            return (this.f2768e & 2) != 0;
        }

        public final boolean r() {
            return (this.f2768e & 1) != 0;
        }

        public void s() {
            this.f2765b = Integer.MIN_VALUE;
            this.f2764a = Integer.MAX_VALUE;
        }

        public final void t(int i2, int i3) {
            this.f2773j = i2;
            this.f2774k = i3;
        }

        public String toString() {
            return " min:" + this.f2765b + " " + this.f2767d + " max:" + this.f2764a + " " + this.f2766c;
        }

        public final void u(boolean z) {
            this.f2768e = z ? this.f2768e | 2 : this.f2768e & (-3);
        }

        public final void v(boolean z) {
            this.f2768e = z ? this.f2768e | 1 : this.f2768e & (-2);
        }

        public final void w(boolean z) {
            this.f2775l = z;
        }

        public final void x(int i2) {
            this.f2772i = i2;
        }

        public final void y(int i2) {
            this.f2769f = i2;
        }

        public final void z(int i2) {
            this.f2770g = i2;
        }
    }

    public e1() {
        a aVar = new a("vertical");
        this.f2760b = aVar;
        a aVar2 = new a("horizontal");
        this.f2761c = aVar2;
        this.f2762d = aVar2;
        this.f2763e = aVar;
    }

    public final a a() {
        return this.f2762d;
    }

    public final void b() {
        a().s();
    }

    public final a c() {
        return this.f2763e;
    }

    public final void d(int i2) {
        a aVar;
        this.f2759a = i2;
        if (i2 == 0) {
            this.f2762d = this.f2761c;
            aVar = this.f2760b;
        } else {
            this.f2762d = this.f2760b;
            aVar = this.f2761c;
        }
        this.f2763e = aVar;
    }

    public String toString() {
        return "horizontal=" + this.f2761c + "; vertical=" + this.f2760b;
    }
}
