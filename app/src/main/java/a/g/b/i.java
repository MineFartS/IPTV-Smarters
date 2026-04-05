package a.g.b;

import java.util.Arrays;
import java.util.HashSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1362a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1364c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1368g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f1372k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1365d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1366e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1367f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1369h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f1370i = new float[9];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f1371j = new float[9];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b[] f1373l = new b[16];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1374m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1375n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashSet<b> f1376o = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f1372k = aVar;
    }

    public static void b() {
        f1362a++;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f1374m;
            if (i2 >= i3) {
                b[] bVarArr = this.f1373l;
                if (i3 >= bVarArr.length) {
                    this.f1373l = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f1373l;
                int i4 = this.f1374m;
                bVarArr2[i4] = bVar;
                this.f1374m = i4 + 1;
                return;
            }
            if (this.f1373l[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.f1374m;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f1373l[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f1373l;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f1374m--;
                return;
            }
            i3++;
        }
    }

    public void d() {
        this.f1364c = null;
        this.f1372k = a.UNKNOWN;
        this.f1367f = 0;
        this.f1365d = -1;
        this.f1366e = -1;
        this.f1368g = 0.0f;
        this.f1369h = false;
        int i2 = this.f1374m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1373l[i3] = null;
        }
        this.f1374m = 0;
        this.f1375n = 0;
        this.f1363b = false;
        Arrays.fill(this.f1371j, 0.0f);
    }

    public void e(d dVar, float f2) {
        this.f1368g = f2;
        this.f1369h = true;
        int i2 = this.f1374m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1373l[i3].B(dVar, this, false);
        }
        this.f1374m = 0;
    }

    public void f(a aVar, String str) {
        this.f1372k = aVar;
    }

    public final void g(b bVar) {
        int i2 = this.f1374m;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1373l[i3].C(bVar, false);
        }
        this.f1374m = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f1364c != null) {
            sb = new StringBuilder();
            sb.append(BuildConfig.FLAVOR);
            sb.append(this.f1364c);
        } else {
            sb = new StringBuilder();
            sb.append(BuildConfig.FLAVOR);
            sb.append(this.f1365d);
        }
        return sb.toString();
    }
}
