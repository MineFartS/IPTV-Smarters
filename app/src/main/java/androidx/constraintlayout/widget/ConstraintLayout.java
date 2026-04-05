package androidx.constraintlayout.widget;

import a.g.b.k.e;
import a.g.b.k.f;
import a.g.b.k.g;
import a.g.b.k.m.b;
import a.g.c.d;
import a.g.c.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray<View> f4277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<a.g.c.b> f4278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f4279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f4286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a.g.c.c f4287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap<String, Integer> f4289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4290o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public SparseArray<e> u;
    public c v;
    public int w;
    public int x;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4291a;

        static {
            int[] iArr = new int[e.b.values().length];
            f4291a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4291a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4291a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4291a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public float C;
        public int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4292a;
        public boolean a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4293b;
        public boolean b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4294c;
        public boolean c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4295d;
        public int d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4296e;
        public int e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4297f;
        public int f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4298g;
        public int g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4299h;
        public int h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4300i;
        public int i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f4301j;
        public float j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f4302k;
        public int k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f4303l;
        public int l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4304m;
        public float m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f4305n;
        public e n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f4306o;
        public boolean o0;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f4307a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f4307a = sparseIntArray;
                sparseIntArray.append(i.M1, 8);
                sparseIntArray.append(i.N1, 9);
                sparseIntArray.append(i.P1, 10);
                sparseIntArray.append(i.Q1, 11);
                sparseIntArray.append(i.W1, 12);
                sparseIntArray.append(i.V1, 13);
                sparseIntArray.append(i.u1, 14);
                sparseIntArray.append(i.t1, 15);
                sparseIntArray.append(i.r1, 16);
                sparseIntArray.append(i.v1, 2);
                sparseIntArray.append(i.x1, 3);
                sparseIntArray.append(i.w1, 4);
                sparseIntArray.append(i.e2, 49);
                sparseIntArray.append(i.f2, 50);
                sparseIntArray.append(i.B1, 5);
                sparseIntArray.append(i.C1, 6);
                sparseIntArray.append(i.D1, 7);
                sparseIntArray.append(i.b1, 1);
                sparseIntArray.append(i.R1, 17);
                sparseIntArray.append(i.S1, 18);
                sparseIntArray.append(i.A1, 19);
                sparseIntArray.append(i.z1, 20);
                sparseIntArray.append(i.i2, 21);
                sparseIntArray.append(i.l2, 22);
                sparseIntArray.append(i.j2, 23);
                sparseIntArray.append(i.g2, 24);
                sparseIntArray.append(i.k2, 25);
                sparseIntArray.append(i.h2, 26);
                sparseIntArray.append(i.I1, 29);
                sparseIntArray.append(i.X1, 30);
                sparseIntArray.append(i.y1, 44);
                sparseIntArray.append(i.K1, 45);
                sparseIntArray.append(i.Z1, 46);
                sparseIntArray.append(i.J1, 47);
                sparseIntArray.append(i.Y1, 48);
                sparseIntArray.append(i.p1, 27);
                sparseIntArray.append(i.o1, 28);
                sparseIntArray.append(i.a2, 31);
                sparseIntArray.append(i.E1, 32);
                sparseIntArray.append(i.c2, 33);
                sparseIntArray.append(i.b2, 34);
                sparseIntArray.append(i.d2, 35);
                sparseIntArray.append(i.G1, 36);
                sparseIntArray.append(i.F1, 37);
                sparseIntArray.append(i.H1, 38);
                sparseIntArray.append(i.L1, 39);
                sparseIntArray.append(i.U1, 40);
                sparseIntArray.append(i.O1, 41);
                sparseIntArray.append(i.s1, 42);
                sparseIntArray.append(i.q1, 43);
                f4307a.append(i.T1, 51);
            }
        }

        public b(int i2, int i3) {
            super(i2, i3);
            this.f4292a = -1;
            this.f4293b = -1;
            this.f4294c = -1.0f;
            this.f4295d = -1;
            this.f4296e = -1;
            this.f4297f = -1;
            this.f4298g = -1;
            this.f4299h = -1;
            this.f4300i = -1;
            this.f4301j = -1;
            this.f4302k = -1;
            this.f4303l = -1;
            this.f4304m = -1;
            this.f4305n = 0;
            this.f4306o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new e();
            this.o0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            String str;
            int i2;
            float fAbs;
            super(context, attributeSet);
            this.f4292a = -1;
            this.f4293b = -1;
            this.f4294c = -1.0f;
            this.f4295d = -1;
            this.f4296e = -1;
            this.f4297f = -1;
            this.f4298g = -1;
            this.f4299h = -1;
            this.f4300i = -1;
            this.f4301j = -1;
            this.f4302k = -1;
            this.f4303l = -1;
            this.f4304m = -1;
            this.f4305n = 0;
            this.f4306o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new e();
            this.o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = a.f4307a.get(index);
                switch (i4) {
                    case 1:
                        this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4304m);
                        this.f4304m = resourceId;
                        if (resourceId == -1) {
                            this.f4304m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.f4305n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4305n);
                        continue;
                        break;
                    case 4:
                        float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.f4306o) % 360.0f;
                        this.f4306o = f2;
                        if (f2 < 0.0f) {
                            this.f4306o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f4292a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4292a);
                        continue;
                        break;
                    case 6:
                        this.f4293b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4293b);
                        continue;
                        break;
                    case 7:
                        this.f4294c = typedArrayObtainStyledAttributes.getFloat(index, this.f4294c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4295d);
                        this.f4295d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f4295d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4296e);
                        this.f4296e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f4296e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4297f);
                        this.f4297f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f4297f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4298g);
                        this.f4298g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f4298g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4299h);
                        this.f4299h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f4299h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4300i);
                        this.f4300i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f4300i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4301j);
                        this.f4301j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f4301j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4302k);
                        this.f4302k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f4302k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4303l);
                        this.f4303l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f4303l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                        break;
                    case 22:
                        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                        break;
                    case 23:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                        break;
                    case 24:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                        break;
                    case 25:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                        break;
                    case 26:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                        break;
                    case 27:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                        break;
                    case 28:
                        this.U = typedArrayObtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                        break;
                    case 29:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        continue;
                        break;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        continue;
                        break;
                    case 31:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        }
                        break;
                    case 32:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.J = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        }
                        break;
                    case 33:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        continue;
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i2 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.B.substring(i2);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                            this.C = fAbs;
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(i2, iIndexOf2);
                                        String strSubstring4 = this.B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f3 = Float.parseFloat(strSubstring3);
                                                float f4 = Float.parseFloat(strSubstring4);
                                                if (f3 > 0.0f && f4 > 0.0f) {
                                                    fAbs = this.D == 1 ? Math.abs(f4 / f3) : Math.abs(f3 / f4);
                                                    this.C = fAbs;
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = typedArrayObtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = typedArrayObtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4292a = -1;
            this.f4293b = -1;
            this.f4294c = -1.0f;
            this.f4295d = -1;
            this.f4296e = -1;
            this.f4297f = -1;
            this.f4298g = -1;
            this.f4299h = -1;
            this.f4300i = -1;
            this.f4301j = -1;
            this.f4302k = -1;
            this.f4303l = -1;
            this.f4304m = -1;
            this.f4305n = 0;
            this.f4306o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new e();
            this.o0 = false;
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.W = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.X = false;
                if (i3 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f4294c == -1.0f && this.f4292a == -1 && this.f4293b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.n0 instanceof g)) {
                this.n0 = new g();
            }
            ((g) this.n0).O0(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    public class c implements b.InterfaceC0023b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f4308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4313f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4314g;

        public c(ConstraintLayout constraintLayout) {
            this.f4308a = constraintLayout;
        }

        @Override // a.g.b.k.m.b.InterfaceC0023b
        public final void a() {
            int childCount = this.f4308a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f4308a.getChildAt(i2);
                if (childAt instanceof a.g.c.g) {
                    ((a.g.c.g) childAt).a(this.f4308a);
                }
            }
            int size = this.f4308a.f4278c.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((a.g.c.b) this.f4308a.f4278c.get(i3)).j(this.f4308a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x016c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
        @Override // a.g.b.k.m.b.InterfaceC0023b
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(a.g.b.k.e r20, a.g.b.k.m.b.a r21) {
            /*
                Method dump skipped, instruction units count: 613
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(a.g.b.k.e, a.g.b.k.m.b$a):void");
        }

        public void c(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f4309b = i4;
            this.f4310c = i5;
            this.f4311d = i6;
            this.f4312e = i7;
            this.f4313f = i2;
            this.f4314g = i3;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4277b = new SparseArray<>();
        this.f4278c = new ArrayList<>(4);
        this.f4279d = new f();
        this.f4280e = 0;
        this.f4281f = 0;
        this.f4282g = Integer.MAX_VALUE;
        this.f4283h = Integer.MAX_VALUE;
        this.f4284i = true;
        this.f4285j = 263;
        this.f4286k = null;
        this.f4287l = null;
        this.f4288m = -1;
        this.f4289n = new HashMap<>();
        this.f4290o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = new SparseArray<>();
        this.v = new c(this);
        this.w = 0;
        this.x = 0;
        j(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4277b = new SparseArray<>();
        this.f4278c = new ArrayList<>(4);
        this.f4279d = new f();
        this.f4280e = 0;
        this.f4281f = 0;
        this.f4282g = Integer.MAX_VALUE;
        this.f4283h = Integer.MAX_VALUE;
        this.f4284i = true;
        this.f4285j = 263;
        this.f4286k = null;
        this.f4287l = null;
        this.f4288m = -1;
        this.f4289n = new HashMap<>();
        this.f4290o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = new SparseArray<>();
        this.v = new c(this);
        this.w = 0;
        this.x = 0;
        j(attributeSet, i2, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return iMax2 > 0 ? iMax2 : iMax;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(boolean r20, android.view.View r21, a.g.b.k.e r22, androidx.constraintlayout.widget.ConstraintLayout.b r23, android.util.SparseArray<a.g.b.k.e> r24) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, a.g.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<a.g.c.b> arrayList = this.f4278c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f4278c.get(i2).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i7;
                        float f3 = i8;
                        float f4 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f4289n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f4289n.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final e g(int i2) {
        if (i2 == 0) {
            return this.f4279d;
        }
        View viewFindViewById = this.f4277b.get(i2);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f4279d;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).n0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f4283h;
    }

    public int getMaxWidth() {
        return this.f4282g;
    }

    public int getMinHeight() {
        return this.f4281f;
    }

    public int getMinWidth() {
        return this.f4280e;
    }

    public int getOptimizationLevel() {
        return this.f4279d.S0();
    }

    public View h(int i2) {
        return this.f4277b.get(i2);
    }

    public final e i(View view) {
        if (view == this) {
            return this.f4279d;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).n0;
    }

    public final void j(AttributeSet attributeSet, int i2, int i3) {
        this.f4279d.Z(this);
        this.f4279d.b1(this.v);
        this.f4277b.put(getId(), this);
        this.f4286k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1, i2, i3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == i.f1) {
                    this.f4280e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4280e);
                } else if (index == i.g1) {
                    this.f4281f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4281f);
                } else if (index == i.d1) {
                    this.f4282g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4282g);
                } else if (index == i.e1) {
                    this.f4283h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4283h);
                } else if (index == i.m2) {
                    this.f4285j = typedArrayObtainStyledAttributes.getInt(index, this.f4285j);
                } else if (index == i.n1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4287l = null;
                        }
                    }
                } else if (index == i.l1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f4286k = dVar;
                        dVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4286k = null;
                    }
                    this.f4288m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4279d.c1(this.f4285j);
    }

    public boolean k() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    public final void l() {
        this.f4284i = true;
        this.f4290o = -1;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = 0;
        this.t = 0;
    }

    public void m(int i2) {
        this.f4287l = new a.g.c.c(getContext(), this, i2);
    }

    public void n(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        c cVar = this.v;
        int i6 = cVar.f4312e;
        int i7 = i4 + cVar.f4311d;
        int i8 = i5 + i6;
        if (Build.VERSION.SDK_INT < 11) {
            setMeasuredDimension(i7, i8);
            this.f4290o = i7;
            this.p = i8;
            return;
        }
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i7, i2, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i8, i3, 0) & 16777215;
        int iMin = Math.min(this.f4282g, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f4283h, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f4290o = iMin;
        this.p = iMin2;
    }

    public void o(f fVar, int i2, int i3, int i4) {
        int iMax;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int iMax2 = Math.max(0, getPaddingTop());
        int iMax3 = Math.max(0, getPaddingBottom());
        int i5 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.v.c(i3, i4, iMax2, iMax3, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int iMax4 = Math.max(0, getPaddingStart());
            int iMax5 = Math.max(0, getPaddingEnd());
            if (iMax4 <= 0 && iMax5 <= 0) {
                iMax4 = Math.max(0, getPaddingLeft());
            } else if (k()) {
                iMax4 = iMax5;
            }
            iMax = iMax4;
        } else {
            iMax = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        r(fVar, mode, i6, mode2, i7);
        fVar.Y0(i2, mode, i6, mode2, i7, this.f4290o, this.p, iMax, iMax2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.a0 || bVar.c0 || zIsInEditMode) && !bVar.b0) {
                int iO = eVar.O();
                int iP = eVar.P();
                int iN = eVar.N() + iO;
                int iT = eVar.t() + iP;
                childAt.layout(iO, iP, iN, iT);
                if ((childAt instanceof a.g.c.g) && (content = ((a.g.c.g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iO, iP, iN, iT);
                }
            }
        }
        int size = this.f4278c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f4278c.get(i7).i(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        this.w = i2;
        this.x = i3;
        this.f4279d.d1(k());
        if (this.f4284i) {
            this.f4284i = false;
            if (s()) {
                this.f4279d.f1();
            }
        }
        o(this.f4279d, this.f4285j, i2, i3);
        n(i2, i3, this.f4279d.N(), this.f4279d.t(), this.f4279d.X0(), this.f4279d.V0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        e eVarI = i(view);
        if ((view instanceof Guideline) && !(eVarI instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.n0 = gVar;
            bVar.Z = true;
            gVar.O0(bVar.S);
        }
        if (view instanceof a.g.c.b) {
            a.g.c.b bVar2 = (a.g.c.b) view;
            bVar2.m();
            ((b) view.getLayoutParams()).a0 = true;
            if (!this.f4278c.contains(bVar2)) {
                this.f4278c.add(bVar2);
            }
        }
        this.f4277b.put(view.getId(), view);
        this.f4284i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f4277b.remove(view.getId());
        this.f4279d.I0(i(view));
        this.f4278c.remove(view);
        this.f4284i = true;
    }

    public final void p() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            e eVarI = i(getChildAt(i2));
            if (eVarI != null) {
                eVarI.W();
            }
        }
        if (zIsInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f4288m != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.f4288m && (childAt2 instanceof a.g.c.e)) {
                    this.f4286k = ((a.g.c.e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.f4286k;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f4279d.J0();
        int size = this.f4278c.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f4278c.get(i5).l(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof a.g.c.g) {
                ((a.g.c.g) childAt3).b(this);
            }
        }
        this.u.clear();
        this.u.put(0, this.f4279d);
        this.u.put(getId(), this.f4279d);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.u.put(childAt4.getId(), i(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            e eVarI2 = i(childAt5);
            if (eVarI2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f4279d.a(eVarI2);
                c(zIsInEditMode, childAt5, eVarI2, bVar, this.u);
            }
        }
    }

    public void q(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f4289n == null) {
                this.f4289n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f4289n.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r9
  0x002c: PHI (r9v2 a.g.b.k.e$b) = (r9v1 a.g.b.k.e$b), (r9v8 a.g.b.k.e$b) binds: [B:13:0x002a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r2
  0x004b: PHI (r2v2 a.g.b.k.e$b) = (r2v1 a.g.b.k.e$b), (r2v4 a.g.b.k.e$b) binds: [B:24:0x0049, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(a.g.b.k.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.v
            int r1 = r0.f4312e
            int r0 = r0.f4311d
            a.g.b.k.e$b r2 = a.g.b.k.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L32
        L1a:
            int r9 = r7.f4282g
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            a.g.b.k.e$b r9 = a.g.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            a.g.b.k.e$b r9 = a.g.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.f4280e
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = 0
            goto L51
        L3a:
            int r11 = r7.f4283h
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            a.g.b.k.e$b r2 = a.g.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            a.g.b.k.e$b r2 = a.g.b.k.e.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f4281f
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.N()
            if (r10 != r11) goto L5d
            int r11 = r8.t()
            if (r12 == r11) goto L60
        L5d:
            r8.U0()
        L60:
            r8.C0(r6)
            r8.D0(r6)
            int r11 = r7.f4282g
            int r11 = r11 - r0
            r8.p0(r11)
            int r11 = r7.f4283h
            int r11 = r11 - r1
            r8.o0(r11)
            r8.r0(r6)
            r8.q0(r6)
            r8.i0(r9)
            r8.B0(r10)
            r8.x0(r2)
            r8.e0(r12)
            int r9 = r7.f4280e
            int r9 = r9 - r0
            r8.r0(r9)
            int r9 = r7.f4281f
            int r9 = r9 - r1
            r8.q0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(a.g.b.k.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public final boolean s() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            p();
        }
        return z;
    }

    public void setConstraintSet(d dVar) {
        this.f4286k = dVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f4277b.remove(getId());
        super.setId(i2);
        this.f4277b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f4283h) {
            return;
        }
        this.f4283h = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f4282g) {
            return;
        }
        this.f4282g = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f4281f) {
            return;
        }
        this.f4281f = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f4280e) {
            return;
        }
        this.f4280e = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(a.g.c.f fVar) {
        a.g.c.c cVar = this.f4287l;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f4285j = i2;
        this.f4279d.c1(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
