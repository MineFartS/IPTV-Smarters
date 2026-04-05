package c.f.a.b.k3.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9398d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b[] f9399a;

        public a(b... bVarArr) {
            this.f9399a = bVarArr;
        }

        public b a(int i2) {
            return this.f9399a[i2];
        }

        public int b() {
            return this.f9399a.length;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f9402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f9403d;

        public b(int i2, float[] fArr, float[] fArr2, int i3) {
            this.f9400a = i2;
            c.f.a.b.j3.g.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f9402c = fArr;
            this.f9403d = fArr2;
            this.f9401b = i3;
        }

        public int a() {
            return this.f9402c.length / 3;
        }
    }

    public h(a aVar, int i2) {
        this(aVar, aVar, i2);
    }

    public h(a aVar, a aVar2, int i2) {
        this.f9395a = aVar;
        this.f9396b = aVar2;
        this.f9397c = i2;
        this.f9398d = aVar == aVar2;
    }

    public static h a(float f2, int i2, int i3, float f3, float f4, int i4) {
        int i5;
        float f5;
        int i6;
        int i7;
        int i8;
        float[] fArr;
        int i9 = i2;
        int i10 = i3;
        c.f.a.b.j3.g.a(f2 > 0.0f);
        c.f.a.b.j3.g.a(i9 >= 1);
        c.f.a.b.j3.g.a(i10 >= 1);
        c.f.a.b.j3.g.a(f3 > 0.0f && f3 <= 180.0f);
        c.f.a.b.j3.g.a(f4 > 0.0f && f4 <= 360.0f);
        float radians = (float) Math.toRadians(f3);
        float radians2 = (float) Math.toRadians(f4);
        float f6 = radians / i9;
        float f7 = radians2 / i10;
        int i11 = i10 + 1;
        int i12 = ((i11 * 2) + 2) * i9;
        float[] fArr2 = new float[i12 * 3];
        float[] fArr3 = new float[i12 * 2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i9) {
            float f8 = radians / 2.0f;
            float f9 = (i13 * f6) - f8;
            int i16 = i13 + 1;
            float f10 = (i16 * f6) - f8;
            int i17 = 0;
            while (i17 < i11) {
                float f11 = f9;
                int i18 = i16;
                int i19 = 0;
                while (i19 < 2) {
                    if (i19 == 0) {
                        f5 = f11;
                        i5 = i11;
                    } else {
                        i5 = i11;
                        f5 = f10;
                    }
                    float f12 = i17 * f7;
                    float f13 = f7;
                    int i20 = i14 + 1;
                    int i21 = i17;
                    double d2 = f2;
                    float f14 = f6;
                    int i22 = i19;
                    double d3 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    double dSin = Math.sin(d3);
                    Double.isNaN(d2);
                    double d4 = f5;
                    float[] fArr4 = fArr3;
                    float f15 = f10;
                    fArr2[i14] = -((float) (dSin * d2 * Math.cos(d4)));
                    int i23 = i20 + 1;
                    double dSin2 = Math.sin(d4);
                    Double.isNaN(d2);
                    int i24 = i13;
                    fArr2[i20] = (float) (d2 * dSin2);
                    int i25 = i23 + 1;
                    double dCos = Math.cos(d3);
                    Double.isNaN(d2);
                    fArr2[i23] = (float) (d2 * dCos * Math.cos(d4));
                    int i26 = i15 + 1;
                    fArr4[i15] = f12 / radians2;
                    int i27 = i26 + 1;
                    fArr4[i26] = ((i24 + i22) * f14) / radians;
                    if (i21 == 0 && i22 == 0) {
                        i6 = i3;
                        i7 = i21;
                        i8 = i22;
                    } else {
                        i6 = i3;
                        i7 = i21;
                        i8 = i22;
                        if (i7 != i6 || i8 != 1) {
                            fArr = fArr4;
                        }
                        i15 = i27;
                        i14 = i25;
                        i19 = i8 + 1;
                        i10 = i6;
                        i17 = i7;
                        fArr3 = fArr;
                        i13 = i24;
                        i11 = i5;
                        f7 = f13;
                        f6 = f14;
                        f10 = f15;
                    }
                    System.arraycopy(fArr2, i25 - 3, fArr2, i25, 3);
                    i25 += 3;
                    fArr = fArr4;
                    System.arraycopy(fArr, i27 - 2, fArr, i27, 2);
                    i27 += 2;
                    i15 = i27;
                    i14 = i25;
                    i19 = i8 + 1;
                    i10 = i6;
                    i17 = i7;
                    fArr3 = fArr;
                    i13 = i24;
                    i11 = i5;
                    f7 = f13;
                    f6 = f14;
                    f10 = f15;
                }
                float f16 = f6;
                int i28 = i17;
                int i29 = i10;
                int i30 = i28 + 1;
                f9 = f11;
                i16 = i18;
                i11 = i11;
                f7 = f7;
                f6 = f16;
                f10 = f10;
                i10 = i29;
                i17 = i30;
            }
            i9 = i2;
            i13 = i16;
        }
        return new h(new a(new b(0, fArr2, fArr3, 1)), i4);
    }

    public static h b(int i2) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i2);
    }
}
