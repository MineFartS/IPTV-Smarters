package c.f.a.b.e3.h1.f;

import android.net.Uri;
import c.f.a.b.c3.e0;
import c.f.a.b.c3.i0;
import c.f.a.b.j3.g;
import c.f.a.b.j3.w0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.z2.j0.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class a implements e0<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0128a f7777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f7778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7780h;

    /* JADX INFO: renamed from: c.f.a.b.e3.h1.f.a$a, reason: collision with other inner class name */
    public static class C0128a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f7781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f7782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p[] f7783c;

        public C0128a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f7781a = uuid;
            this.f7782b = bArr;
            this.f7783c = pVarArr;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f7790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f7791h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f7792i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final k1[] f7793j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f7794k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f7795l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f7796m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<Long> f7797n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final long[] f7798o;
        public final long p;

        public b(String str, String str2, int i2, String str3, long j2, String str4, int i3, int i4, int i5, int i6, String str5, k1[] k1VarArr, List<Long> list, long j3) {
            this(str, str2, i2, str3, j2, str4, i3, i4, i5, i6, str5, k1VarArr, list, x0.Q0(list, 1000000L, j2), x0.P0(j3, 1000000L, j2));
        }

        public b(String str, String str2, int i2, String str3, long j2, String str4, int i3, int i4, int i5, int i6, String str5, k1[] k1VarArr, List<Long> list, long[] jArr, long j3) {
            this.f7795l = str;
            this.f7796m = str2;
            this.f7784a = i2;
            this.f7785b = str3;
            this.f7786c = j2;
            this.f7787d = str4;
            this.f7788e = i3;
            this.f7789f = i4;
            this.f7790g = i5;
            this.f7791h = i6;
            this.f7792i = str5;
            this.f7793j = k1VarArr;
            this.f7797n = list;
            this.f7798o = jArr;
            this.p = j3;
            this.f7794k = list.size();
        }

        public Uri a(int i2, int i3) {
            g.g(this.f7793j != null);
            g.g(this.f7797n != null);
            g.g(i3 < this.f7797n.size());
            String string = Integer.toString(this.f7793j[i2].f9334i);
            String string2 = this.f7797n.get(i3).toString();
            return w0.e(this.f7795l, this.f7796m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(k1[] k1VarArr) {
            return new b(this.f7795l, this.f7796m, this.f7784a, this.f7785b, this.f7786c, this.f7787d, this.f7788e, this.f7789f, this.f7790g, this.f7791h, this.f7792i, k1VarArr, this.f7797n, this.f7798o, this.p);
        }

        public long c(int i2) {
            if (i2 == this.f7794k - 1) {
                return this.p;
            }
            long[] jArr = this.f7798o;
            return jArr[i2 + 1] - jArr[i2];
        }

        public int d(long j2) {
            return x0.h(this.f7798o, j2, true, true);
        }

        public long e(int i2) {
            return this.f7798o[i2];
        }
    }

    public a(int i2, int i3, long j2, long j3, int i4, boolean z, C0128a c0128a, b[] bVarArr) {
        this.f7773a = i2;
        this.f7774b = i3;
        this.f7779g = j2;
        this.f7780h = j3;
        this.f7775c = i4;
        this.f7776d = z;
        this.f7777e = c0128a;
        this.f7778f = bVarArr;
    }

    public a(int i2, int i3, long j2, long j3, long j4, int i4, boolean z, C0128a c0128a, b[] bVarArr) {
        this(i2, i3, j3 == 0 ? -9223372036854775807L : x0.P0(j3, 1000000L, j2), j4 != 0 ? x0.P0(j4, 1000000L, j2) : -9223372036854775807L, i4, z, c0128a, bVarArr);
    }

    @Override // c.f.a.b.c3.e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List<i0> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            i0 i0Var = (i0) arrayList.get(i2);
            b bVar2 = this.f7778f[i0Var.f6747c];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((k1[]) arrayList3.toArray(new k1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f7793j[i0Var.f6748d]);
            i2++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((k1[]) arrayList3.toArray(new k1[0])));
        }
        return new a(this.f7773a, this.f7774b, this.f7779g, this.f7780h, this.f7775c, this.f7776d, this.f7777e, (b[]) arrayList2.toArray(new b[0]));
    }
}
