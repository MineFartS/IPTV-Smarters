package a.g.b;

import a.g.b.b;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f1312a = 0.001f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1315d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1313b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1316e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f1317f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f1318g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f1319h = new int[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f1320i = new float[8];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1321j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1322k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1323l = false;

    public a(b bVar, c cVar) {
        this.f1314c = bVar;
        this.f1315d = cVar;
    }

    @Override // a.g.b.b.a
    public int a() {
        return this.f1313b;
    }

    @Override // a.g.b.b.a
    public i b(int i2) {
        int i3 = this.f1321j;
        for (int i4 = 0; i3 != -1 && i4 < this.f1313b; i4++) {
            if (i4 == i2) {
                return this.f1315d.f1333d[this.f1318g[i3]];
            }
            i3 = this.f1319h[i3];
        }
        return null;
    }

    @Override // a.g.b.b.a
    public void c() {
        int i2 = this.f1321j;
        for (int i3 = 0; i2 != -1 && i3 < this.f1313b; i3++) {
            float[] fArr = this.f1320i;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f1319h[i2];
        }
    }

    @Override // a.g.b.b.a
    public final void clear() {
        int i2 = this.f1321j;
        for (int i3 = 0; i2 != -1 && i3 < this.f1313b; i3++) {
            i iVar = this.f1315d.f1333d[this.f1318g[i2]];
            if (iVar != null) {
                iVar.c(this.f1314c);
            }
            i2 = this.f1319h[i2];
        }
        this.f1321j = -1;
        this.f1322k = -1;
        this.f1323l = false;
        this.f1313b = 0;
    }

    @Override // a.g.b.b.a
    public float d(int i2) {
        int i3 = this.f1321j;
        for (int i4 = 0; i3 != -1 && i4 < this.f1313b; i4++) {
            if (i4 == i2) {
                return this.f1320i[i3];
            }
            i3 = this.f1319h[i3];
        }
        return 0.0f;
    }

    @Override // a.g.b.b.a
    public void e(i iVar, float f2, boolean z) {
        float f3 = f1312a;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f1321j;
            if (i2 == -1) {
                this.f1321j = 0;
                this.f1320i[0] = f2;
                this.f1318g[0] = iVar.f1365d;
                this.f1319h[0] = -1;
                iVar.f1375n++;
                iVar.a(this.f1314c);
                this.f1313b++;
                if (this.f1323l) {
                    return;
                }
                int i3 = this.f1322k + 1;
                this.f1322k = i3;
                int[] iArr = this.f1318g;
                if (i3 >= iArr.length) {
                    this.f1323l = true;
                    this.f1322k = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f1313b; i5++) {
                int[] iArr2 = this.f1318g;
                int i6 = iArr2[i2];
                int i7 = iVar.f1365d;
                if (i6 == i7) {
                    float[] fArr = this.f1320i;
                    float f4 = fArr[i2] + f2;
                    float f5 = f1312a;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f1321j) {
                            this.f1321j = this.f1319h[i2];
                        } else {
                            int[] iArr3 = this.f1319h;
                            iArr3[i4] = iArr3[i2];
                        }
                        if (z) {
                            iVar.c(this.f1314c);
                        }
                        if (this.f1323l) {
                            this.f1322k = i2;
                        }
                        iVar.f1375n--;
                        this.f1313b--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i4 = i2;
                }
                i2 = this.f1319h[i2];
            }
            int length = this.f1322k;
            int i8 = length + 1;
            if (this.f1323l) {
                int[] iArr4 = this.f1318g;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i8;
            }
            int[] iArr5 = this.f1318g;
            if (length >= iArr5.length && this.f1313b < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f1318g;
                    if (i9 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr7 = this.f1318g;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i10 = this.f1316e * 2;
                this.f1316e = i10;
                this.f1323l = false;
                this.f1322k = length - 1;
                this.f1320i = Arrays.copyOf(this.f1320i, i10);
                this.f1318g = Arrays.copyOf(this.f1318g, this.f1316e);
                this.f1319h = Arrays.copyOf(this.f1319h, this.f1316e);
            }
            this.f1318g[length] = iVar.f1365d;
            this.f1320i[length] = f2;
            int[] iArr8 = this.f1319h;
            if (i4 != -1) {
                iArr8[length] = iArr8[i4];
                iArr8[i4] = length;
            } else {
                iArr8[length] = this.f1321j;
                this.f1321j = length;
            }
            iVar.f1375n++;
            iVar.a(this.f1314c);
            this.f1313b++;
            if (!this.f1323l) {
                this.f1322k++;
            }
            int i11 = this.f1322k;
            int[] iArr9 = this.f1318g;
            if (i11 >= iArr9.length) {
                this.f1323l = true;
                this.f1322k = iArr9.length - 1;
            }
        }
    }

    @Override // a.g.b.b.a
    public final float f(i iVar) {
        int i2 = this.f1321j;
        for (int i3 = 0; i2 != -1 && i3 < this.f1313b; i3++) {
            if (this.f1318g[i2] == iVar.f1365d) {
                return this.f1320i[i2];
            }
            i2 = this.f1319h[i2];
        }
        return 0.0f;
    }

    @Override // a.g.b.b.a
    public boolean g(i iVar) {
        int i2 = this.f1321j;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f1313b; i3++) {
            if (this.f1318g[i2] == iVar.f1365d) {
                return true;
            }
            i2 = this.f1319h[i2];
        }
        return false;
    }

    @Override // a.g.b.b.a
    public float h(b bVar, boolean z) {
        float f2 = f(bVar.f1324a);
        j(bVar.f1324a, z);
        b.a aVar = bVar.f1328e;
        int iA = aVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            i iVarB = aVar.b(i2);
            e(iVarB, aVar.f(iVarB) * f2, z);
        }
        return f2;
    }

    @Override // a.g.b.b.a
    public final void i(i iVar, float f2) {
        if (f2 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i2 = this.f1321j;
        if (i2 == -1) {
            this.f1321j = 0;
            this.f1320i[0] = f2;
            this.f1318g[0] = iVar.f1365d;
            this.f1319h[0] = -1;
            iVar.f1375n++;
            iVar.a(this.f1314c);
            this.f1313b++;
            if (this.f1323l) {
                return;
            }
            int i3 = this.f1322k + 1;
            this.f1322k = i3;
            int[] iArr = this.f1318g;
            if (i3 >= iArr.length) {
                this.f1323l = true;
                this.f1322k = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f1313b; i5++) {
            int[] iArr2 = this.f1318g;
            int i6 = iArr2[i2];
            int i7 = iVar.f1365d;
            if (i6 == i7) {
                this.f1320i[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f1319h[i2];
        }
        int length = this.f1322k;
        int i8 = length + 1;
        if (this.f1323l) {
            int[] iArr3 = this.f1318g;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i8;
        }
        int[] iArr4 = this.f1318g;
        if (length >= iArr4.length && this.f1313b < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f1318g;
                if (i9 >= iArr5.length) {
                    break;
                }
                if (iArr5[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr6 = this.f1318g;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i10 = this.f1316e * 2;
            this.f1316e = i10;
            this.f1323l = false;
            this.f1322k = length - 1;
            this.f1320i = Arrays.copyOf(this.f1320i, i10);
            this.f1318g = Arrays.copyOf(this.f1318g, this.f1316e);
            this.f1319h = Arrays.copyOf(this.f1319h, this.f1316e);
        }
        this.f1318g[length] = iVar.f1365d;
        this.f1320i[length] = f2;
        int[] iArr7 = this.f1319h;
        if (i4 != -1) {
            iArr7[length] = iArr7[i4];
            iArr7[i4] = length;
        } else {
            iArr7[length] = this.f1321j;
            this.f1321j = length;
        }
        iVar.f1375n++;
        iVar.a(this.f1314c);
        int i11 = this.f1313b + 1;
        this.f1313b = i11;
        if (!this.f1323l) {
            this.f1322k++;
        }
        int[] iArr8 = this.f1318g;
        if (i11 >= iArr8.length) {
            this.f1323l = true;
        }
        if (this.f1322k >= iArr8.length) {
            this.f1323l = true;
            this.f1322k = iArr8.length - 1;
        }
    }

    @Override // a.g.b.b.a
    public final float j(i iVar, boolean z) {
        if (this.f1317f == iVar) {
            this.f1317f = null;
        }
        int i2 = this.f1321j;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f1313b) {
            if (this.f1318g[i2] == iVar.f1365d) {
                if (i2 == this.f1321j) {
                    this.f1321j = this.f1319h[i2];
                } else {
                    int[] iArr = this.f1319h;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    iVar.c(this.f1314c);
                }
                iVar.f1375n--;
                this.f1313b--;
                this.f1318g[i2] = -1;
                if (this.f1323l) {
                    this.f1322k = i2;
                }
                return this.f1320i[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f1319h[i2];
        }
        return 0.0f;
    }

    @Override // a.g.b.b.a
    public void k(float f2) {
        int i2 = this.f1321j;
        for (int i3 = 0; i2 != -1 && i3 < this.f1313b; i3++) {
            float[] fArr = this.f1320i;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f1319h[i2];
        }
    }

    public String toString() {
        int i2 = this.f1321j;
        String str = BuildConfig.FLAVOR;
        for (int i3 = 0; i2 != -1 && i3 < this.f1313b; i3++) {
            str = ((str + " -> ") + this.f1320i[i2] + " : ") + this.f1315d.f1333d[this.f1318g[i2]];
            i2 = this.f1319h[i2];
        }
        return str;
    }
}
