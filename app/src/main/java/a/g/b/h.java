package a.g.b;

import a.g.b.b;
import java.util.Arrays;
import java.util.Comparator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class h extends a.g.b.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i[] f1353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i[] f1354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f1356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f1357l;

    public class a implements Comparator<i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f1365d - iVar2.f1365d;
        }
    }

    public class b implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f1359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f1360c;

        public b(h hVar) {
            this.f1360c = hVar;
        }

        public boolean a(i iVar, float f2) {
            boolean z = true;
            if (!this.f1359b.f1363b) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float f3 = iVar.f1371j[i2];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f1359b.f1371j[i2] = f4;
                    } else {
                        this.f1359b.f1371j[i2] = 0.0f;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.f1359b.f1371j;
                fArr[i3] = fArr[i3] + (iVar.f1371j[i3] * f2);
                if (Math.abs(fArr[i3]) < 1.0E-4f) {
                    this.f1359b.f1371j[i3] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                h.this.G(this.f1359b);
            }
            return false;
        }

        public void b(i iVar) {
            this.f1359b = iVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f1359b.f1365d - ((i) obj).f1365d;
        }

        public final boolean d() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.f1359b.f1371j[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean g(i iVar) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f2 = iVar.f1371j[i2];
                float f3 = this.f1359b.f1371j[i2];
                if (f3 == f2) {
                    i2--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        public void i() {
            Arrays.fill(this.f1359b.f1371j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f1359b != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f1359b.f1371j[i2] + " ";
                }
            }
            return str + "] " + this.f1359b;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f1352g = 128;
        this.f1353h = new i[128];
        this.f1354i = new i[128];
        this.f1355j = 0;
        this.f1356k = new b(this);
        this.f1357l = cVar;
    }

    @Override // a.g.b.b
    public void C(a.g.b.b bVar, boolean z) {
        i iVar = bVar.f1324a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f1328e;
        int iA = aVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            i iVarB = aVar.b(i2);
            float fD = aVar.d(i2);
            this.f1356k.b(iVarB);
            if (this.f1356k.a(iVar, fD)) {
                F(iVarB);
            }
            this.f1325b += bVar.f1325b * fD;
        }
        G(iVar);
    }

    public final void F(i iVar) {
        int i2;
        int i3 = this.f1355j + 1;
        i[] iVarArr = this.f1353h;
        if (i3 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f1353h = iVarArr2;
            this.f1354i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f1353h;
        int i4 = this.f1355j;
        iVarArr3[i4] = iVar;
        int i5 = i4 + 1;
        this.f1355j = i5;
        if (i5 > 1 && iVarArr3[i5 - 1].f1365d > iVar.f1365d) {
            int i6 = 0;
            while (true) {
                i2 = this.f1355j;
                if (i6 >= i2) {
                    break;
                }
                this.f1354i[i6] = this.f1353h[i6];
                i6++;
            }
            Arrays.sort(this.f1354i, 0, i2, new a());
            for (int i7 = 0; i7 < this.f1355j; i7++) {
                this.f1353h[i7] = this.f1354i[i7];
            }
        }
        iVar.f1363b = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i2 = 0;
        while (i2 < this.f1355j) {
            if (this.f1353h[i2] == iVar) {
                while (true) {
                    int i3 = this.f1355j;
                    if (i2 >= i3 - 1) {
                        this.f1355j = i3 - 1;
                        iVar.f1363b = false;
                        return;
                    } else {
                        i[] iVarArr = this.f1353h;
                        int i4 = i2 + 1;
                        iVarArr[i2] = iVarArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // a.g.b.b, a.g.b.d.a
    public void a(i iVar) {
        this.f1356k.b(iVar);
        this.f1356k.i();
        iVar.f1371j[iVar.f1367f] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // a.g.b.b, a.g.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a.g.b.i b(a.g.b.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.f1355j
            if (r0 >= r2) goto L30
            a.g.b.i[] r2 = r4.f1353h
            r2 = r2[r0]
            int r3 = r2.f1365d
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2d
        L12:
            a.g.b.h$b r3 = r4.f1356k
            r3.b(r2)
            a.g.b.h$b r2 = r4.f1356k
            if (r1 != r5) goto L22
            boolean r2 = r2.d()
            if (r2 == 0) goto L2d
            goto L2c
        L22:
            a.g.b.i[] r3 = r4.f1353h
            r3 = r3[r1]
            boolean r2 = r2.g(r3)
            if (r2 == 0) goto L2d
        L2c:
            r1 = r0
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            if (r1 != r5) goto L34
            r5 = 0
            return r5
        L34:
            a.g.b.i[] r5 = r4.f1353h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.h.b(a.g.b.d, boolean[]):a.g.b.i");
    }

    @Override // a.g.b.b, a.g.b.d.a
    public void clear() {
        this.f1355j = 0;
        this.f1325b = 0.0f;
    }

    @Override // a.g.b.b
    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.f1325b + ") : ";
        for (int i2 = 0; i2 < this.f1355j; i2++) {
            this.f1356k.b(this.f1353h[i2]);
            str = str + this.f1356k + " ";
        }
        return str;
    }
}
