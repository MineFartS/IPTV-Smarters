package a.g.b;

import a.g.b.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f1377a = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1378b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1379c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1380d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f1381e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1382f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f1383g = new int[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f1384h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f1385i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1386j = new int[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1387k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1388l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f1389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f1390n;

    public j(b bVar, c cVar) {
        this.f1389m = bVar;
        this.f1390n = cVar;
        clear();
    }

    @Override // a.g.b.b.a
    public int a() {
        return this.f1387k;
    }

    @Override // a.g.b.b.a
    public i b(int i2) {
        int i3 = this.f1387k;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f1388l;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f1390n.f1333d[this.f1383g[i4]];
            }
            i4 = this.f1386j[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // a.g.b.b.a
    public void c() {
        int i2 = this.f1387k;
        int i3 = this.f1388l;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f1384h;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f1386j[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // a.g.b.b.a
    public void clear() {
        int i2 = this.f1387k;
        for (int i3 = 0; i3 < i2; i3++) {
            i iVarB = b(i3);
            if (iVarB != null) {
                iVarB.c(this.f1389m);
            }
        }
        for (int i4 = 0; i4 < this.f1379c; i4++) {
            this.f1383g[i4] = -1;
            this.f1382f[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f1380d; i5++) {
            this.f1381e[i5] = -1;
        }
        this.f1387k = 0;
        this.f1388l = -1;
    }

    @Override // a.g.b.b.a
    public float d(int i2) {
        int i3 = this.f1387k;
        int i4 = this.f1388l;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f1384h[i4];
            }
            i4 = this.f1386j[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // a.g.b.b.a
    public void e(i iVar, float f2, boolean z) {
        float f3 = f1377a;
        if (f2 <= (-f3) || f2 >= f3) {
            int iP = p(iVar);
            if (iP == -1) {
                i(iVar, f2);
                return;
            }
            float[] fArr = this.f1384h;
            fArr[iP] = fArr[iP] + f2;
            float f4 = fArr[iP];
            float f5 = f1377a;
            if (f4 <= (-f5) || fArr[iP] >= f5) {
                return;
            }
            fArr[iP] = 0.0f;
            j(iVar, z);
        }
    }

    @Override // a.g.b.b.a
    public float f(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f1384h[iP];
        }
        return 0.0f;
    }

    @Override // a.g.b.b.a
    public boolean g(i iVar) {
        return p(iVar) != -1;
    }

    @Override // a.g.b.b.a
    public float h(b bVar, boolean z) {
        float f2 = f(bVar.f1324a);
        j(bVar.f1324a, z);
        j jVar = (j) bVar.f1328e;
        int iA = jVar.a();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iA) {
            int[] iArr = jVar.f1383g;
            if (iArr[i3] != -1) {
                e(this.f1390n.f1333d[iArr[i3]], jVar.f1384h[i3] * f2, z);
                i2++;
            }
            i3++;
        }
        return f2;
    }

    @Override // a.g.b.b.a
    public void i(i iVar, float f2) {
        float f3 = f1377a;
        if (f2 > (-f3) && f2 < f3) {
            j(iVar, true);
            return;
        }
        if (this.f1387k == 0) {
            m(0, iVar, f2);
            l(iVar, 0);
            this.f1388l = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f1384h[iP] = f2;
            return;
        }
        if (this.f1387k + 1 >= this.f1379c) {
            o();
        }
        int i2 = this.f1387k;
        int i3 = this.f1388l;
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            int[] iArr = this.f1383g;
            int i6 = iArr[i3];
            int i7 = iVar.f1365d;
            if (i6 == i7) {
                this.f1384h[i3] = f2;
                return;
            }
            if (iArr[i3] < i7) {
                i4 = i3;
            }
            i3 = this.f1386j[i3];
            if (i3 == -1) {
                break;
            }
        }
        q(i4, iVar, f2);
    }

    @Override // a.g.b.b.a
    public float j(i iVar, boolean z) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f2 = this.f1384h[iP];
        if (this.f1388l == iP) {
            this.f1388l = this.f1386j[iP];
        }
        this.f1383g[iP] = -1;
        int[] iArr = this.f1385i;
        if (iArr[iP] != -1) {
            int[] iArr2 = this.f1386j;
            iArr2[iArr[iP]] = iArr2[iP];
        }
        int[] iArr3 = this.f1386j;
        if (iArr3[iP] != -1) {
            iArr[iArr3[iP]] = iArr[iP];
        }
        this.f1387k--;
        iVar.f1375n--;
        if (z) {
            iVar.c(this.f1389m);
        }
        return f2;
    }

    @Override // a.g.b.b.a
    public void k(float f2) {
        int i2 = this.f1387k;
        int i3 = this.f1388l;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f1384h;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f1386j[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    public final void l(i iVar, int i2) {
        int[] iArr;
        int i3 = iVar.f1365d % this.f1380d;
        int[] iArr2 = this.f1381e;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f1382f;
                if (iArr[i4] == -1) {
                    break;
                } else {
                    i4 = iArr[i4];
                }
            }
            iArr[i4] = i2;
        }
        this.f1382f[i2] = -1;
    }

    public final void m(int i2, i iVar, float f2) {
        this.f1383g[i2] = iVar.f1365d;
        this.f1384h[i2] = f2;
        this.f1385i[i2] = -1;
        this.f1386j[i2] = -1;
        iVar.a(this.f1389m);
        iVar.f1375n++;
        this.f1387k++;
    }

    public final int n() {
        for (int i2 = 0; i2 < this.f1379c; i2++) {
            if (this.f1383g[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    public final void o() {
        int i2 = this.f1379c * 2;
        this.f1383g = Arrays.copyOf(this.f1383g, i2);
        this.f1384h = Arrays.copyOf(this.f1384h, i2);
        this.f1385i = Arrays.copyOf(this.f1385i, i2);
        this.f1386j = Arrays.copyOf(this.f1386j, i2);
        this.f1382f = Arrays.copyOf(this.f1382f, i2);
        for (int i3 = this.f1379c; i3 < i2; i3++) {
            this.f1383g[i3] = -1;
            this.f1382f[i3] = -1;
        }
        this.f1379c = i2;
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.f1387k == 0) {
            return -1;
        }
        int i2 = iVar.f1365d;
        int i3 = this.f1381e[i2 % this.f1380d];
        if (i3 == -1) {
            return -1;
        }
        if (this.f1383g[i3] == i2) {
            return i3;
        }
        while (true) {
            iArr = this.f1382f;
            if (iArr[i3] == -1 || this.f1383g[iArr[i3]] == i2) {
                break;
            }
            i3 = iArr[i3];
        }
        if (iArr[i3] != -1 && this.f1383g[iArr[i3]] == i2) {
            return iArr[i3];
        }
        return -1;
    }

    public final void q(int i2, i iVar, float f2) {
        int iN = n();
        m(iN, iVar, f2);
        if (i2 != -1) {
            this.f1385i[iN] = i2;
            int[] iArr = this.f1386j;
            iArr[iN] = iArr[i2];
            iArr[i2] = iN;
        } else {
            this.f1385i[iN] = -1;
            if (this.f1387k > 0) {
                this.f1386j[iN] = this.f1388l;
                this.f1388l = iN;
            } else {
                this.f1386j[iN] = -1;
            }
        }
        int[] iArr2 = this.f1386j;
        if (iArr2[iN] != -1) {
            this.f1385i[iArr2[iN]] = iN;
        }
        l(iVar, iN);
    }

    public final void r(i iVar) {
        int[] iArr;
        int i2 = iVar.f1365d;
        int i3 = i2 % this.f1380d;
        int[] iArr2 = this.f1381e;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f1383g[i4] == i2) {
            int[] iArr3 = this.f1382f;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f1382f;
            if (iArr[i4] == -1 || this.f1383g[iArr[i4]] == i2) {
                break;
            } else {
                i4 = iArr[i4];
            }
        }
        int i5 = iArr[i4];
        if (i5 == -1 || this.f1383g[i5] != i2) {
            return;
        }
        iArr[i4] = iArr[i5];
        iArr[i5] = -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i2 = this.f1387k;
        for (int i3 = 0; i3 < i2; i3++) {
            i iVarB = b(i3);
            if (iVarB != null) {
                String str2 = str + iVarB + " = " + d(i3) + " ";
                int iP = p(iVarB);
                String str3 = str2 + "[p: ";
                if (this.f1385i[iP] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f1390n.f1333d[this.f1383g[this.f1385i[iP]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f1386j[iP] != -1 ? str4 + this.f1390n.f1333d[this.f1383g[this.f1386j[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
