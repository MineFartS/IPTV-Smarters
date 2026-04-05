package a.g.c;

import a.g.c.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1525a = {0, 4, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SparseIntArray f1526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, a.g.c.a> f1527c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1528d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<Integer, a> f1529e = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0025d f1531b = new C0025d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f1532c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f1533d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e f1534e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap<String, a.g.c.a> f1535f = new HashMap<>();

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f1533d;
            bVar.f4295d = bVar2.f1544i;
            bVar.f4296e = bVar2.f1545j;
            bVar.f4297f = bVar2.f1546k;
            bVar.f4298g = bVar2.f1547l;
            bVar.f4299h = bVar2.f1548m;
            bVar.f4300i = bVar2.f1549n;
            bVar.f4301j = bVar2.f1550o;
            bVar.f4302k = bVar2.p;
            bVar.f4303l = bVar2.q;
            bVar.p = bVar2.r;
            bVar.q = bVar2.s;
            bVar.r = bVar2.t;
            bVar.s = bVar2.u;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.H;
            bVar.x = bVar2.P;
            bVar.y = bVar2.O;
            bVar.u = bVar2.L;
            bVar.w = bVar2.N;
            bVar.z = bVar2.v;
            bVar.A = bVar2.w;
            bVar.f4304m = bVar2.y;
            bVar.f4305n = bVar2.z;
            b bVar3 = this.f1533d;
            bVar.f4306o = bVar3.A;
            bVar.B = bVar3.x;
            bVar.Q = bVar3.B;
            bVar.R = bVar3.C;
            bVar.F = bVar3.Q;
            bVar.E = bVar3.R;
            bVar.H = bVar3.T;
            bVar.G = bVar3.S;
            bVar.T = bVar3.i0;
            bVar.U = bVar3.j0;
            bVar.I = bVar3.U;
            bVar.J = bVar3.V;
            bVar.M = bVar3.W;
            bVar.N = bVar3.X;
            bVar.K = bVar3.Y;
            bVar.L = bVar3.Z;
            bVar.O = bVar3.a0;
            bVar.P = bVar3.b0;
            bVar.S = bVar3.D;
            bVar.f4294c = bVar3.f1543h;
            bVar.f4292a = bVar3.f1541f;
            bVar.f4293b = bVar3.f1542g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar3.f1539d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar3.f1540e;
            String str = bVar3.h0;
            if (str != null) {
                bVar.V = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f1533d.J);
                bVar.setMarginEnd(this.f1533d.I);
            }
            bVar.a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1533d.a(this.f1533d);
            aVar.f1532c.a(this.f1532c);
            aVar.f1531b.a(this.f1531b);
            aVar.f1534e.a(this.f1534e);
            aVar.f1530a = this.f1530a;
            return aVar;
        }

        public final void f(int i2, ConstraintLayout.b bVar) {
            this.f1530a = i2;
            b bVar2 = this.f1533d;
            bVar2.f1544i = bVar.f4295d;
            bVar2.f1545j = bVar.f4296e;
            bVar2.f1546k = bVar.f4297f;
            bVar2.f1547l = bVar.f4298g;
            bVar2.f1548m = bVar.f4299h;
            bVar2.f1549n = bVar.f4300i;
            bVar2.f1550o = bVar.f4301j;
            bVar2.p = bVar.f4302k;
            bVar2.q = bVar.f4303l;
            bVar2.r = bVar.p;
            bVar2.s = bVar.q;
            bVar2.t = bVar.r;
            bVar2.u = bVar.s;
            bVar2.v = bVar.z;
            bVar2.w = bVar.A;
            bVar2.x = bVar.B;
            bVar2.y = bVar.f4304m;
            bVar2.z = bVar.f4305n;
            bVar2.A = bVar.f4306o;
            bVar2.B = bVar.Q;
            bVar2.C = bVar.R;
            bVar2.D = bVar.S;
            bVar2.f1543h = bVar.f4294c;
            bVar2.f1541f = bVar.f4292a;
            bVar2.f1542g = bVar.f4293b;
            b bVar3 = this.f1533d;
            bVar3.f1539d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar3.f1540e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar3.E = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar3.F = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar3.G = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar3.H = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar3.Q = bVar.F;
            bVar3.R = bVar.E;
            bVar3.T = bVar.H;
            bVar3.S = bVar.G;
            bVar3.i0 = bVar.T;
            bVar3.j0 = bVar.U;
            bVar3.U = bVar.I;
            bVar3.V = bVar.J;
            bVar3.W = bVar.M;
            bVar3.X = bVar.N;
            bVar3.Y = bVar.K;
            bVar3.Z = bVar.L;
            bVar3.a0 = bVar.O;
            bVar3.b0 = bVar.P;
            bVar3.h0 = bVar.V;
            bVar3.L = bVar.u;
            bVar3.N = bVar.w;
            bVar3.K = bVar.t;
            bVar3.M = bVar.v;
            b bVar4 = this.f1533d;
            bVar4.P = bVar.x;
            bVar4.O = bVar.y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar4.I = bVar.getMarginEnd();
                this.f1533d.J = bVar.getMarginStart();
            }
        }

        public final void g(int i2, e.a aVar) {
            f(i2, aVar);
            this.f1531b.f1562d = aVar.p0;
            e eVar = this.f1534e;
            eVar.f1566c = aVar.s0;
            eVar.f1567d = aVar.t0;
            eVar.f1568e = aVar.u0;
            eVar.f1569f = aVar.v0;
            eVar.f1570g = aVar.w0;
            eVar.f1571h = aVar.x0;
            eVar.f1572i = aVar.y0;
            eVar.f1573j = aVar.z0;
            eVar.f1574k = aVar.A0;
            eVar.f1575l = aVar.B0;
            eVar.f1577n = aVar.r0;
            eVar.f1576m = aVar.q0;
        }

        public final void h(a.g.c.b bVar, int i2, e.a aVar) {
            g(i2, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f1533d;
                bVar2.e0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.c0 = barrier.getType();
                this.f1533d.f0 = barrier.getReferencedIds();
                this.f1533d.d0 = barrier.getMargin();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f1536a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1540e;
        public int[] f0;
        public String g0;
        public String h0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1537b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1538c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1541f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1542g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1543h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1544i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1545j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1546k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1547l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1548m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1549n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1550o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public float v = 0.5f;
        public float w = 0.5f;
        public String x = null;
        public int y = -1;
        public int z = 0;
        public float A = 0.0f;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public int P = -1;
        public float Q = -1.0f;
        public float R = -1.0f;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = 0;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;
        public float a0 = 1.0f;
        public float b0 = 1.0f;
        public int c0 = -1;
        public int d0 = 0;
        public int e0 = -1;
        public boolean i0 = false;
        public boolean j0 = false;
        public boolean k0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1536a = sparseIntArray;
            sparseIntArray.append(i.E3, 24);
            f1536a.append(i.F3, 25);
            f1536a.append(i.H3, 28);
            f1536a.append(i.I3, 29);
            f1536a.append(i.N3, 35);
            f1536a.append(i.M3, 34);
            f1536a.append(i.p3, 4);
            f1536a.append(i.o3, 3);
            f1536a.append(i.m3, 1);
            f1536a.append(i.S3, 6);
            f1536a.append(i.T3, 7);
            f1536a.append(i.w3, 17);
            f1536a.append(i.x3, 18);
            f1536a.append(i.y3, 19);
            f1536a.append(i.X2, 26);
            f1536a.append(i.J3, 31);
            f1536a.append(i.K3, 32);
            f1536a.append(i.v3, 10);
            f1536a.append(i.u3, 9);
            f1536a.append(i.W3, 13);
            f1536a.append(i.Z3, 16);
            f1536a.append(i.X3, 14);
            f1536a.append(i.U3, 11);
            f1536a.append(i.Y3, 15);
            f1536a.append(i.V3, 12);
            f1536a.append(i.Q3, 38);
            f1536a.append(i.C3, 37);
            f1536a.append(i.B3, 39);
            f1536a.append(i.P3, 40);
            f1536a.append(i.A3, 20);
            f1536a.append(i.O3, 36);
            f1536a.append(i.t3, 5);
            f1536a.append(i.D3, 76);
            f1536a.append(i.L3, 76);
            f1536a.append(i.G3, 76);
            f1536a.append(i.n3, 76);
            f1536a.append(i.l3, 76);
            f1536a.append(i.a3, 23);
            f1536a.append(i.c3, 27);
            f1536a.append(i.e3, 30);
            f1536a.append(i.f3, 8);
            f1536a.append(i.b3, 33);
            f1536a.append(i.d3, 2);
            f1536a.append(i.Y2, 22);
            f1536a.append(i.Z2, 21);
            f1536a.append(i.q3, 61);
            f1536a.append(i.s3, 62);
            f1536a.append(i.r3, 63);
            f1536a.append(i.R3, 69);
            f1536a.append(i.z3, 70);
            f1536a.append(i.j3, 71);
            f1536a.append(i.h3, 72);
            f1536a.append(i.i3, 73);
            f1536a.append(i.k3, 74);
            f1536a.append(i.g3, 75);
        }

        public void a(b bVar) {
            this.f1537b = bVar.f1537b;
            this.f1539d = bVar.f1539d;
            this.f1538c = bVar.f1538c;
            this.f1540e = bVar.f1540e;
            this.f1541f = bVar.f1541f;
            this.f1542g = bVar.f1542g;
            this.f1543h = bVar.f1543h;
            this.f1544i = bVar.f1544i;
            this.f1545j = bVar.f1545j;
            this.f1546k = bVar.f1546k;
            this.f1547l = bVar.f1547l;
            this.f1548m = bVar.f1548m;
            this.f1549n = bVar.f1549n;
            this.f1550o = bVar.f1550o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.h0 = bVar.h0;
            int[] iArr = bVar.f0;
            if (iArr != null) {
                this.f0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f0 = null;
            }
            this.g0 = bVar.g0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.k0 = bVar.k0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.W2);
            this.f1538c = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = f1536a.get(index);
                if (i3 == 80) {
                    this.i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.i0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.q = d.o(typedArrayObtainStyledAttributes, index, this.q);
                            break;
                        case 2:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 3:
                            this.p = d.o(typedArrayObtainStyledAttributes, index, this.p);
                            break;
                        case 4:
                            this.f1550o = d.o(typedArrayObtainStyledAttributes, index, this.f1550o);
                            break;
                        case 5:
                            this.x = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 7:
                            this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            }
                            break;
                        case 9:
                            this.u = d.o(typedArrayObtainStyledAttributes, index, this.u);
                            break;
                        case 10:
                            this.t = d.o(typedArrayObtainStyledAttributes, index, this.t);
                            break;
                        case 11:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 12:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 13:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 14:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 15:
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 16:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 17:
                            this.f1541f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1541f);
                            break;
                        case 18:
                            this.f1542g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1542g);
                            break;
                        case 19:
                            this.f1543h = typedArrayObtainStyledAttributes.getFloat(index, this.f1543h);
                            break;
                        case 20:
                            this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 21:
                            this.f1540e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1540e);
                            break;
                        case 22:
                            this.f1539d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1539d);
                            break;
                        case 23:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 24:
                            this.f1544i = d.o(typedArrayObtainStyledAttributes, index, this.f1544i);
                            break;
                        case 25:
                            this.f1545j = d.o(typedArrayObtainStyledAttributes, index, this.f1545j);
                            break;
                        case 26:
                            this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
                            break;
                        case 27:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 28:
                            this.f1546k = d.o(typedArrayObtainStyledAttributes, index, this.f1546k);
                            break;
                        case 29:
                            this.f1547l = d.o(typedArrayObtainStyledAttributes, index, this.f1547l);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            }
                            break;
                        case 31:
                            this.r = d.o(typedArrayObtainStyledAttributes, index, this.r);
                            break;
                        case 32:
                            this.s = d.o(typedArrayObtainStyledAttributes, index, this.s);
                            break;
                        case 33:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 34:
                            this.f1549n = d.o(typedArrayObtainStyledAttributes, index, this.f1549n);
                            break;
                        case 35:
                            this.f1548m = d.o(typedArrayObtainStyledAttributes, index, this.f1548m);
                            break;
                        case 36:
                            this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
                            break;
                        case 37:
                            this.R = typedArrayObtainStyledAttributes.getFloat(index, this.R);
                            break;
                        case 38:
                            this.Q = typedArrayObtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 39:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        case 40:
                            this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 55:
                                    this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                                    break;
                                case 56:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 57:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 58:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                case 59:
                                    this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.y = d.o(typedArrayObtainStyledAttributes, index, this.y);
                                            break;
                                        case 62:
                                            this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                                            break;
                                        case 63:
                                            this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.b0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.c0 = typedArrayObtainStyledAttributes.getInt(index, this.c0);
                                                    continue;
                                                case 73:
                                                    this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                                    continue;
                                                case 74:
                                                    this.g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.k0 = typedArrayObtainStyledAttributes.getBoolean(index, this.k0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.h0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f1536a.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.j0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f1551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1552b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1553c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1554d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1555e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1556f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1557g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1558h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1551a = sparseIntArray;
            sparseIntArray.append(i.k4, 1);
            f1551a.append(i.m4, 2);
            f1551a.append(i.n4, 3);
            f1551a.append(i.j4, 4);
            f1551a.append(i.i4, 5);
            f1551a.append(i.l4, 6);
        }

        public void a(c cVar) {
            this.f1552b = cVar.f1552b;
            this.f1553c = cVar.f1553c;
            this.f1554d = cVar.f1554d;
            this.f1555e = cVar.f1555e;
            this.f1556f = cVar.f1556f;
            this.f1558h = cVar.f1558h;
            this.f1557g = cVar.f1557g;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.h4);
            this.f1552b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f1551a.get(index)) {
                    case 1:
                        this.f1558h = typedArrayObtainStyledAttributes.getFloat(index, this.f1558h);
                        break;
                    case 2:
                        this.f1555e = typedArrayObtainStyledAttributes.getInt(index, this.f1555e);
                        break;
                    case 3:
                        this.f1554d = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : a.g.a.a.a.f1310b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1556f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1553c = d.o(typedArrayObtainStyledAttributes, index, this.f1553c);
                        break;
                    case 6:
                        this.f1557g = typedArrayObtainStyledAttributes.getFloat(index, this.f1557g);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a.g.c.d$d, reason: collision with other inner class name */
    public static class C0025d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1559a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1560b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1561c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1562d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1563e = Float.NaN;

        public void a(C0025d c0025d) {
            this.f1559a = c0025d.f1559a;
            this.f1560b = c0025d.f1560b;
            this.f1562d = c0025d.f1562d;
            this.f1563e = c0025d.f1563e;
            this.f1561c = c0025d.f1561c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.w4);
            this.f1559a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.y4) {
                    this.f1562d = typedArrayObtainStyledAttributes.getFloat(index, this.f1562d);
                } else if (index == i.x4) {
                    this.f1560b = typedArrayObtainStyledAttributes.getInt(index, this.f1560b);
                    this.f1560b = d.f1525a[this.f1560b];
                } else if (index == i.A4) {
                    this.f1561c = typedArrayObtainStyledAttributes.getInt(index, this.f1561c);
                } else if (index == i.z4) {
                    this.f1563e = typedArrayObtainStyledAttributes.getFloat(index, this.f1563e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static SparseIntArray f1564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1565b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1566c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1567d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1568e = 0.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1569f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1570g = 1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1571h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f1572i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f1573j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1574k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1575l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1576m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f1577n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1564a = sparseIntArray;
            sparseIntArray.append(i.U4, 1);
            f1564a.append(i.V4, 2);
            f1564a.append(i.W4, 3);
            f1564a.append(i.S4, 4);
            f1564a.append(i.T4, 5);
            f1564a.append(i.O4, 6);
            f1564a.append(i.P4, 7);
            f1564a.append(i.Q4, 8);
            f1564a.append(i.R4, 9);
            f1564a.append(i.X4, 10);
            f1564a.append(i.Y4, 11);
        }

        public void a(e eVar) {
            this.f1565b = eVar.f1565b;
            this.f1566c = eVar.f1566c;
            this.f1567d = eVar.f1567d;
            this.f1568e = eVar.f1568e;
            this.f1569f = eVar.f1569f;
            this.f1570g = eVar.f1570g;
            this.f1571h = eVar.f1571h;
            this.f1572i = eVar.f1572i;
            this.f1573j = eVar.f1573j;
            this.f1574k = eVar.f1574k;
            this.f1575l = eVar.f1575l;
            this.f1576m = eVar.f1576m;
            this.f1577n = eVar.f1577n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.N4);
            this.f1565b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f1564a.get(index)) {
                    case 1:
                        this.f1566c = typedArrayObtainStyledAttributes.getFloat(index, this.f1566c);
                        break;
                    case 2:
                        this.f1567d = typedArrayObtainStyledAttributes.getFloat(index, this.f1567d);
                        break;
                    case 3:
                        this.f1568e = typedArrayObtainStyledAttributes.getFloat(index, this.f1568e);
                        break;
                    case 4:
                        this.f1569f = typedArrayObtainStyledAttributes.getFloat(index, this.f1569f);
                        break;
                    case 5:
                        this.f1570g = typedArrayObtainStyledAttributes.getFloat(index, this.f1570g);
                        break;
                    case 6:
                        this.f1571h = typedArrayObtainStyledAttributes.getDimension(index, this.f1571h);
                        break;
                    case 7:
                        this.f1572i = typedArrayObtainStyledAttributes.getDimension(index, this.f1572i);
                        break;
                    case 8:
                        this.f1573j = typedArrayObtainStyledAttributes.getDimension(index, this.f1573j);
                        break;
                    case 9:
                        this.f1574k = typedArrayObtainStyledAttributes.getDimension(index, this.f1574k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1575l = typedArrayObtainStyledAttributes.getDimension(index, this.f1575l);
                        }
                        break;
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1576m = true;
                            this.f1577n = typedArrayObtainStyledAttributes.getDimension(index, this.f1577n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1526b = sparseIntArray;
        sparseIntArray.append(i.u0, 25);
        f1526b.append(i.v0, 26);
        f1526b.append(i.x0, 29);
        f1526b.append(i.y0, 30);
        f1526b.append(i.E0, 36);
        f1526b.append(i.D0, 35);
        f1526b.append(i.c0, 4);
        f1526b.append(i.b0, 3);
        f1526b.append(i.Z, 1);
        f1526b.append(i.M0, 6);
        f1526b.append(i.N0, 7);
        f1526b.append(i.j0, 17);
        f1526b.append(i.k0, 18);
        f1526b.append(i.l0, 19);
        f1526b.append(i.s, 27);
        f1526b.append(i.z0, 32);
        f1526b.append(i.A0, 33);
        f1526b.append(i.i0, 10);
        f1526b.append(i.h0, 9);
        f1526b.append(i.Q0, 13);
        f1526b.append(i.T0, 16);
        f1526b.append(i.R0, 14);
        f1526b.append(i.O0, 11);
        f1526b.append(i.S0, 15);
        f1526b.append(i.P0, 12);
        f1526b.append(i.H0, 40);
        f1526b.append(i.s0, 39);
        f1526b.append(i.r0, 41);
        f1526b.append(i.G0, 42);
        f1526b.append(i.q0, 20);
        f1526b.append(i.F0, 37);
        f1526b.append(i.g0, 5);
        f1526b.append(i.t0, 82);
        f1526b.append(i.C0, 82);
        f1526b.append(i.w0, 82);
        f1526b.append(i.a0, 82);
        f1526b.append(i.Y, 82);
        f1526b.append(i.x, 24);
        f1526b.append(i.z, 28);
        f1526b.append(i.L, 31);
        f1526b.append(i.M, 8);
        f1526b.append(i.y, 34);
        f1526b.append(i.A, 2);
        f1526b.append(i.v, 23);
        f1526b.append(i.w, 21);
        f1526b.append(i.u, 22);
        f1526b.append(i.B, 43);
        f1526b.append(i.O, 44);
        f1526b.append(i.J, 45);
        f1526b.append(i.K, 46);
        f1526b.append(i.I, 60);
        f1526b.append(i.G, 47);
        f1526b.append(i.H, 48);
        f1526b.append(i.C, 49);
        f1526b.append(i.D, 50);
        f1526b.append(i.E, 51);
        f1526b.append(i.F, 52);
        f1526b.append(i.N, 53);
        f1526b.append(i.I0, 54);
        f1526b.append(i.m0, 55);
        f1526b.append(i.J0, 56);
        f1526b.append(i.n0, 57);
        f1526b.append(i.K0, 58);
        f1526b.append(i.o0, 59);
        f1526b.append(i.d0, 61);
        f1526b.append(i.f0, 62);
        f1526b.append(i.e0, 63);
        f1526b.append(i.P, 64);
        f1526b.append(i.X0, 65);
        f1526b.append(i.V, 66);
        f1526b.append(i.Y0, 67);
        f1526b.append(i.V0, 79);
        f1526b.append(i.t, 38);
        f1526b.append(i.U0, 68);
        f1526b.append(i.L0, 69);
        f1526b.append(i.p0, 70);
        f1526b.append(i.T, 71);
        f1526b.append(i.R, 72);
        f1526b.append(i.S, 73);
        f1526b.append(i.U, 74);
        f1526b.append(i.Q, 75);
        f1526b.append(i.W0, 76);
        f1526b.append(i.B0, 77);
        f1526b.append(i.Z0, 78);
        f1526b.append(i.X, 80);
        f1526b.append(i.W, 81);
    }

    public static int o(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f1529e.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f1529e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + a.g.a.b.a.a(childAt));
            } else {
                if (this.f1528d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1529e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f1529e.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f1533d.e0 = 1;
                        }
                        int i3 = aVar.f1533d.e0;
                        if (i3 != -1 && i3 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f1533d.c0);
                            barrier.setMargin(aVar.f1533d.d0);
                            barrier.setAllowsGoneWidget(aVar.f1533d.k0);
                            b bVar = aVar.f1533d;
                            int[] iArr = bVar.f0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.g0;
                                if (str != null) {
                                    bVar.f0 = j(barrier, str);
                                    barrier.setReferencedIds(aVar.f1533d.f0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z) {
                            a.g.c.a.c(childAt, aVar.f1535f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0025d c0025d = aVar.f1531b;
                        if (c0025d.f1561c == 0) {
                            childAt.setVisibility(c0025d.f1560b);
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 17) {
                            childAt.setAlpha(aVar.f1531b.f1562d);
                            childAt.setRotation(aVar.f1534e.f1566c);
                            childAt.setRotationX(aVar.f1534e.f1567d);
                            childAt.setRotationY(aVar.f1534e.f1568e);
                            childAt.setScaleX(aVar.f1534e.f1569f);
                            childAt.setScaleY(aVar.f1534e.f1570g);
                            if (!Float.isNaN(aVar.f1534e.f1571h)) {
                                childAt.setPivotX(aVar.f1534e.f1571h);
                            }
                            if (!Float.isNaN(aVar.f1534e.f1572i)) {
                                childAt.setPivotY(aVar.f1534e.f1572i);
                            }
                            childAt.setTranslationX(aVar.f1534e.f1573j);
                            childAt.setTranslationY(aVar.f1534e.f1574k);
                            if (i4 >= 21) {
                                childAt.setTranslationZ(aVar.f1534e.f1575l);
                                e eVar = aVar.f1534e;
                                if (eVar.f1576m) {
                                    childAt.setElevation(eVar.f1577n);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f1529e.get(num);
            int i5 = aVar2.f1533d.e0;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f1533d;
                int[] iArr2 = bVar3.f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.g0;
                    if (str2 != null) {
                        bVar3.f0 = j(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f1533d.f0);
                    }
                }
                barrier2.setType(aVar2.f1533d.c0);
                barrier2.setMargin(aVar2.f1533d.d0);
                ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                barrier2.m();
                aVar2.d(bVarD);
                constraintLayout.addView(barrier2, bVarD);
            }
            if (aVar2.f1533d.f1537b) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(bVarD2);
                constraintLayout.addView(guideline, bVarD2);
            }
        }
    }

    public void e(int i2, int i3) {
        if (this.f1529e.containsKey(Integer.valueOf(i2))) {
            a aVar = this.f1529e.get(Integer.valueOf(i2));
            switch (i3) {
                case 1:
                    b bVar = aVar.f1533d;
                    bVar.f1545j = -1;
                    bVar.f1544i = -1;
                    bVar.E = -1;
                    bVar.K = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f1533d;
                    bVar2.f1547l = -1;
                    bVar2.f1546k = -1;
                    bVar2.F = -1;
                    bVar2.M = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f1533d;
                    bVar3.f1549n = -1;
                    bVar3.f1548m = -1;
                    bVar3.G = -1;
                    bVar3.L = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f1533d;
                    bVar4.f1550o = -1;
                    bVar4.p = -1;
                    bVar4.H = -1;
                    bVar4.N = -1;
                    return;
                case 5:
                    aVar.f1533d.q = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f1533d;
                    bVar5.r = -1;
                    bVar5.s = -1;
                    bVar5.J = -1;
                    bVar5.P = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f1533d;
                    bVar6.t = -1;
                    bVar6.u = -1;
                    bVar6.I = -1;
                    bVar6.O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i2) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1529e.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1528d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1529e.containsKey(Integer.valueOf(id))) {
                this.f1529e.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f1529e.get(Integer.valueOf(id));
            aVar.f1535f = a.g.c.a.a(this.f1527c, childAt);
            aVar.f(id, bVar);
            aVar.f1531b.f1560b = childAt.getVisibility();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 17) {
                aVar.f1531b.f1562d = childAt.getAlpha();
                aVar.f1534e.f1566c = childAt.getRotation();
                aVar.f1534e.f1567d = childAt.getRotationX();
                aVar.f1534e.f1568e = childAt.getRotationY();
                aVar.f1534e.f1569f = childAt.getScaleX();
                aVar.f1534e.f1570g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f1534e;
                    eVar.f1571h = pivotX;
                    eVar.f1572i = pivotY;
                }
                aVar.f1534e.f1573j = childAt.getTranslationX();
                aVar.f1534e.f1574k = childAt.getTranslationY();
                if (i3 >= 21) {
                    aVar.f1534e.f1575l = childAt.getTranslationZ();
                    e eVar2 = aVar.f1534e;
                    if (eVar2.f1576m) {
                        eVar2.f1577n = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f1533d.k0 = barrier.n();
                aVar.f1533d.f0 = barrier.getReferencedIds();
                aVar.f1533d.c0 = barrier.getType();
                aVar.f1533d.d0 = barrier.getMargin();
            }
        }
    }

    public void h(a.g.c.e eVar) {
        int childCount = eVar.getChildCount();
        this.f1529e.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = eVar.getChildAt(i2);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1528d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1529e.containsKey(Integer.valueOf(id))) {
                this.f1529e.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f1529e.get(Integer.valueOf(id));
            if (childAt instanceof a.g.c.b) {
                aVar2.h((a.g.c.b) childAt, id, aVar);
            }
            aVar2.g(id, aVar);
        }
    }

    public void i(int i2, int i3, int i4, float f2) {
        b bVar = l(i2).f1533d;
        bVar.y = i3;
        bVar.z = i4;
        bVar.A = f2;
    }

    public final int[] j(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, Name.MARK, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public final a k(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.r);
        p(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final a l(int i2) {
        if (!this.f1529e.containsKey(Integer.valueOf(i2))) {
            this.f1529e.put(Integer.valueOf(i2), new a());
        }
        return this.f1529e.get(Integer.valueOf(i2));
    }

    public void m(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarK = k(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarK.f1533d.f1537b = true;
                    }
                    this.f1529e.put(Integer.valueOf(aVarK.f1530a), aVarK);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.c.d.n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void p(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String string;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != i.t && i.L != index && i.M != index) {
                aVar.f1532c.f1552b = true;
                aVar.f1533d.f1538c = true;
                aVar.f1531b.f1559a = true;
                aVar.f1534e.f1565b = true;
            }
            switch (f1526b.get(index)) {
                case 1:
                    b bVar = aVar.f1533d;
                    bVar.q = o(typedArray, index, bVar.q);
                    continue;
                    break;
                case 2:
                    b bVar2 = aVar.f1533d;
                    bVar2.H = typedArray.getDimensionPixelSize(index, bVar2.H);
                    continue;
                    break;
                case 3:
                    b bVar3 = aVar.f1533d;
                    bVar3.p = o(typedArray, index, bVar3.p);
                    continue;
                    break;
                case 4:
                    b bVar4 = aVar.f1533d;
                    bVar4.f1550o = o(typedArray, index, bVar4.f1550o);
                    continue;
                    break;
                case 5:
                    aVar.f1533d.x = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    b bVar5 = aVar.f1533d;
                    bVar5.B = typedArray.getDimensionPixelOffset(index, bVar5.B);
                    continue;
                    break;
                case 7:
                    b bVar6 = aVar.f1533d;
                    bVar6.C = typedArray.getDimensionPixelOffset(index, bVar6.C);
                    continue;
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f1533d;
                        bVar7.I = typedArray.getDimensionPixelSize(index, bVar7.I);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    b bVar8 = aVar.f1533d;
                    bVar8.u = o(typedArray, index, bVar8.u);
                    continue;
                    break;
                case 10:
                    b bVar9 = aVar.f1533d;
                    bVar9.t = o(typedArray, index, bVar9.t);
                    continue;
                    break;
                case 11:
                    b bVar10 = aVar.f1533d;
                    bVar10.N = typedArray.getDimensionPixelSize(index, bVar10.N);
                    continue;
                    break;
                case 12:
                    b bVar11 = aVar.f1533d;
                    bVar11.O = typedArray.getDimensionPixelSize(index, bVar11.O);
                    continue;
                    break;
                case 13:
                    b bVar12 = aVar.f1533d;
                    bVar12.K = typedArray.getDimensionPixelSize(index, bVar12.K);
                    continue;
                    break;
                case 14:
                    b bVar13 = aVar.f1533d;
                    bVar13.M = typedArray.getDimensionPixelSize(index, bVar13.M);
                    continue;
                    break;
                case 15:
                    b bVar14 = aVar.f1533d;
                    bVar14.P = typedArray.getDimensionPixelSize(index, bVar14.P);
                    continue;
                    break;
                case 16:
                    b bVar15 = aVar.f1533d;
                    bVar15.L = typedArray.getDimensionPixelSize(index, bVar15.L);
                    continue;
                    break;
                case 17:
                    b bVar16 = aVar.f1533d;
                    bVar16.f1541f = typedArray.getDimensionPixelOffset(index, bVar16.f1541f);
                    continue;
                    break;
                case 18:
                    b bVar17 = aVar.f1533d;
                    bVar17.f1542g = typedArray.getDimensionPixelOffset(index, bVar17.f1542g);
                    continue;
                    break;
                case 19:
                    b bVar18 = aVar.f1533d;
                    bVar18.f1543h = typedArray.getFloat(index, bVar18.f1543h);
                    continue;
                    break;
                case 20:
                    b bVar19 = aVar.f1533d;
                    bVar19.v = typedArray.getFloat(index, bVar19.v);
                    continue;
                    break;
                case 21:
                    b bVar20 = aVar.f1533d;
                    bVar20.f1540e = typedArray.getLayoutDimension(index, bVar20.f1540e);
                    continue;
                    break;
                case 22:
                    C0025d c0025d = aVar.f1531b;
                    c0025d.f1560b = typedArray.getInt(index, c0025d.f1560b);
                    C0025d c0025d2 = aVar.f1531b;
                    c0025d2.f1560b = f1525a[c0025d2.f1560b];
                    continue;
                    break;
                case 23:
                    b bVar21 = aVar.f1533d;
                    bVar21.f1539d = typedArray.getLayoutDimension(index, bVar21.f1539d);
                    continue;
                    break;
                case 24:
                    b bVar22 = aVar.f1533d;
                    bVar22.E = typedArray.getDimensionPixelSize(index, bVar22.E);
                    continue;
                    break;
                case 25:
                    b bVar23 = aVar.f1533d;
                    bVar23.f1544i = o(typedArray, index, bVar23.f1544i);
                    continue;
                    break;
                case 26:
                    b bVar24 = aVar.f1533d;
                    bVar24.f1545j = o(typedArray, index, bVar24.f1545j);
                    continue;
                    break;
                case 27:
                    b bVar25 = aVar.f1533d;
                    bVar25.D = typedArray.getInt(index, bVar25.D);
                    continue;
                    break;
                case 28:
                    b bVar26 = aVar.f1533d;
                    bVar26.F = typedArray.getDimensionPixelSize(index, bVar26.F);
                    continue;
                    break;
                case 29:
                    b bVar27 = aVar.f1533d;
                    bVar27.f1546k = o(typedArray, index, bVar27.f1546k);
                    continue;
                    break;
                case 30:
                    b bVar28 = aVar.f1533d;
                    bVar28.f1547l = o(typedArray, index, bVar28.f1547l);
                    continue;
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f1533d;
                        bVar29.J = typedArray.getDimensionPixelSize(index, bVar29.J);
                    } else {
                        continue;
                    }
                    break;
                case 32:
                    b bVar30 = aVar.f1533d;
                    bVar30.r = o(typedArray, index, bVar30.r);
                    continue;
                    break;
                case 33:
                    b bVar31 = aVar.f1533d;
                    bVar31.s = o(typedArray, index, bVar31.s);
                    continue;
                    break;
                case 34:
                    b bVar32 = aVar.f1533d;
                    bVar32.G = typedArray.getDimensionPixelSize(index, bVar32.G);
                    continue;
                    break;
                case 35:
                    b bVar33 = aVar.f1533d;
                    bVar33.f1549n = o(typedArray, index, bVar33.f1549n);
                    continue;
                    break;
                case 36:
                    b bVar34 = aVar.f1533d;
                    bVar34.f1548m = o(typedArray, index, bVar34.f1548m);
                    continue;
                    break;
                case 37:
                    b bVar35 = aVar.f1533d;
                    bVar35.w = typedArray.getFloat(index, bVar35.w);
                    continue;
                    break;
                case 38:
                    aVar.f1530a = typedArray.getResourceId(index, aVar.f1530a);
                    continue;
                    break;
                case 39:
                    b bVar36 = aVar.f1533d;
                    bVar36.R = typedArray.getFloat(index, bVar36.R);
                    continue;
                    break;
                case 40:
                    b bVar37 = aVar.f1533d;
                    bVar37.Q = typedArray.getFloat(index, bVar37.Q);
                    continue;
                    break;
                case 41:
                    b bVar38 = aVar.f1533d;
                    bVar38.S = typedArray.getInt(index, bVar38.S);
                    continue;
                    break;
                case 42:
                    b bVar39 = aVar.f1533d;
                    bVar39.T = typedArray.getInt(index, bVar39.T);
                    continue;
                    break;
                case 43:
                    C0025d c0025d3 = aVar.f1531b;
                    c0025d3.f1562d = typedArray.getFloat(index, c0025d3.f1562d);
                    continue;
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f1534e;
                        eVar.f1576m = true;
                        eVar.f1577n = typedArray.getDimension(index, eVar.f1577n);
                    } else {
                        continue;
                    }
                    break;
                case 45:
                    e eVar2 = aVar.f1534e;
                    eVar2.f1567d = typedArray.getFloat(index, eVar2.f1567d);
                    continue;
                    break;
                case 46:
                    e eVar3 = aVar.f1534e;
                    eVar3.f1568e = typedArray.getFloat(index, eVar3.f1568e);
                    continue;
                    break;
                case 47:
                    e eVar4 = aVar.f1534e;
                    eVar4.f1569f = typedArray.getFloat(index, eVar4.f1569f);
                    continue;
                    break;
                case 48:
                    e eVar5 = aVar.f1534e;
                    eVar5.f1570g = typedArray.getFloat(index, eVar5.f1570g);
                    continue;
                    break;
                case 49:
                    e eVar6 = aVar.f1534e;
                    eVar6.f1571h = typedArray.getDimension(index, eVar6.f1571h);
                    continue;
                    break;
                case 50:
                    e eVar7 = aVar.f1534e;
                    eVar7.f1572i = typedArray.getDimension(index, eVar7.f1572i);
                    continue;
                    break;
                case 51:
                    e eVar8 = aVar.f1534e;
                    eVar8.f1573j = typedArray.getDimension(index, eVar8.f1573j);
                    continue;
                    break;
                case 52:
                    e eVar9 = aVar.f1534e;
                    eVar9.f1574k = typedArray.getDimension(index, eVar9.f1574k);
                    continue;
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f1534e;
                        eVar10.f1575l = typedArray.getDimension(index, eVar10.f1575l);
                    } else {
                        continue;
                    }
                    break;
                case 54:
                    b bVar40 = aVar.f1533d;
                    bVar40.U = typedArray.getInt(index, bVar40.U);
                    continue;
                    break;
                case 55:
                    b bVar41 = aVar.f1533d;
                    bVar41.V = typedArray.getInt(index, bVar41.V);
                    continue;
                    break;
                case 56:
                    b bVar42 = aVar.f1533d;
                    bVar42.W = typedArray.getDimensionPixelSize(index, bVar42.W);
                    continue;
                    break;
                case 57:
                    b bVar43 = aVar.f1533d;
                    bVar43.X = typedArray.getDimensionPixelSize(index, bVar43.X);
                    continue;
                    break;
                case 58:
                    b bVar44 = aVar.f1533d;
                    bVar44.Y = typedArray.getDimensionPixelSize(index, bVar44.Y);
                    continue;
                    break;
                case 59:
                    b bVar45 = aVar.f1533d;
                    bVar45.Z = typedArray.getDimensionPixelSize(index, bVar45.Z);
                    continue;
                    break;
                case 60:
                    e eVar11 = aVar.f1534e;
                    eVar11.f1566c = typedArray.getFloat(index, eVar11.f1566c);
                    continue;
                    break;
                case 61:
                    b bVar46 = aVar.f1533d;
                    bVar46.y = o(typedArray, index, bVar46.y);
                    continue;
                    break;
                case 62:
                    b bVar47 = aVar.f1533d;
                    bVar47.z = typedArray.getDimensionPixelSize(index, bVar47.z);
                    continue;
                    break;
                case 63:
                    b bVar48 = aVar.f1533d;
                    bVar48.A = typedArray.getFloat(index, bVar48.A);
                    continue;
                    break;
                case 64:
                    c cVar2 = aVar.f1532c;
                    cVar2.f1553c = o(typedArray, index, cVar2.f1553c);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1532c;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1532c;
                        string = a.g.a.a.a.f1310b[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1554d = string;
                    continue;
                    break;
                case 66:
                    aVar.f1532c.f1556f = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    c cVar3 = aVar.f1532c;
                    cVar3.f1558h = typedArray.getFloat(index, cVar3.f1558h);
                    continue;
                    break;
                case 68:
                    C0025d c0025d4 = aVar.f1531b;
                    c0025d4.f1563e = typedArray.getFloat(index, c0025d4.f1563e);
                    continue;
                    break;
                case 69:
                    aVar.f1533d.a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.f1533d.b0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case 72:
                    b bVar49 = aVar.f1533d;
                    bVar49.c0 = typedArray.getInt(index, bVar49.c0);
                    continue;
                    break;
                case 73:
                    b bVar50 = aVar.f1533d;
                    bVar50.d0 = typedArray.getDimensionPixelSize(index, bVar50.d0);
                    continue;
                    break;
                case 74:
                    aVar.f1533d.g0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    b bVar51 = aVar.f1533d;
                    bVar51.k0 = typedArray.getBoolean(index, bVar51.k0);
                    continue;
                    break;
                case 76:
                    c cVar4 = aVar.f1532c;
                    cVar4.f1555e = typedArray.getInt(index, cVar4.f1555e);
                    continue;
                    break;
                case 77:
                    aVar.f1533d.h0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    C0025d c0025d5 = aVar.f1531b;
                    c0025d5.f1561c = typedArray.getInt(index, c0025d5.f1561c);
                    continue;
                    break;
                case 79:
                    c cVar5 = aVar.f1532c;
                    cVar5.f1557g = typedArray.getFloat(index, cVar5.f1557g);
                    continue;
                    break;
                case 80:
                    b bVar52 = aVar.f1533d;
                    bVar52.i0 = typedArray.getBoolean(index, bVar52.i0);
                    continue;
                    break;
                case 81:
                    b bVar53 = aVar.f1533d;
                    bVar53.j0 = typedArray.getBoolean(index, bVar53.j0);
                    continue;
                    break;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1526b.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }
}
