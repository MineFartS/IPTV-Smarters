package c.f.a.b.e3.c1;

import android.net.Uri;
import c.f.a.b.j3.x0;
import c.f.a.b.v0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f6948a = new h(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6949b = new a(0).g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v0<h> f6950c = new v0() { // from class: c.f.a.b.e3.c1.b
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a[] f6956i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<a> f6957a = new v0() { // from class: c.f.a.b.e3.c1.a
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri[] f6960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f6961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long[] f6962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f6963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f6964h;

        public a(long j2) {
            this(j2, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public a(long j2, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
            c.f.a.b.j3.g.a(iArr.length == uriArr.length);
            this.f6958b = j2;
            this.f6959c = i2;
            this.f6961e = iArr;
            this.f6960d = uriArr;
            this.f6962f = jArr;
            this.f6963g = j3;
            this.f6964h = z;
        }

        public static long[] a(long[] jArr, int i2) {
            int length = jArr.length;
            int iMax = Math.max(i2, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        public static int[] b(int[] iArr, int i2) {
            int length = iArr.length;
            int iMax = Math.max(i2, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i2) {
            int i3 = i2 + 1;
            while (true) {
                int[] iArr = this.f6961e;
                if (i3 >= iArr.length || this.f6964h || iArr[i3] == 0 || iArr[i3] == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean e() {
            if (this.f6959c == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.f6959c; i2++) {
                int[] iArr = this.f6961e;
                if (iArr[i2] == 0 || iArr[i2] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6958b == aVar.f6958b && this.f6959c == aVar.f6959c && Arrays.equals(this.f6960d, aVar.f6960d) && Arrays.equals(this.f6961e, aVar.f6961e) && Arrays.equals(this.f6962f, aVar.f6962f) && this.f6963g == aVar.f6963g && this.f6964h == aVar.f6964h;
        }

        public boolean f() {
            return this.f6959c == -1 || c() < this.f6959c;
        }

        public a g(int i2) {
            int[] iArrB = b(this.f6961e, i2);
            long[] jArrA = a(this.f6962f, i2);
            return new a(this.f6958b, i2, iArrB, (Uri[]) Arrays.copyOf(this.f6960d, i2), jArrA, this.f6963g, this.f6964h);
        }

        public a h(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.f6960d;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            } else if (this.f6959c != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new a(this.f6958b, this.f6959c, this.f6961e, this.f6960d, jArr, this.f6963g, this.f6964h);
        }

        public int hashCode() {
            int i2 = this.f6959c * 31;
            long j2 = this.f6958b;
            int iHashCode = (((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f6960d)) * 31) + Arrays.hashCode(this.f6961e)) * 31) + Arrays.hashCode(this.f6962f)) * 31;
            long j3 = this.f6963g;
            return ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f6964h ? 1 : 0);
        }

        public a i(int i2, int i3) {
            int i4 = this.f6959c;
            c.f.a.b.j3.g.a(i4 == -1 || i3 < i4);
            int[] iArrB = b(this.f6961e, i3 + 1);
            c.f.a.b.j3.g.a(iArrB[i3] == 0 || iArrB[i3] == 1 || iArrB[i3] == i2);
            long[] jArrA = this.f6962f;
            if (jArrA.length != iArrB.length) {
                jArrA = a(jArrA, iArrB.length);
            }
            long[] jArr = jArrA;
            Uri[] uriArr = this.f6960d;
            if (uriArr.length != iArrB.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrB.length);
            }
            iArrB[i3] = i2;
            return new a(this.f6958b, this.f6959c, iArrB, uriArr, jArr, this.f6963g, this.f6964h);
        }

        public a j(Uri uri, int i2) {
            int[] iArrB = b(this.f6961e, i2 + 1);
            long[] jArrA = this.f6962f;
            if (jArrA.length != iArrB.length) {
                jArrA = a(jArrA, iArrB.length);
            }
            long[] jArr = jArrA;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f6960d, iArrB.length);
            uriArr[i2] = uri;
            iArrB[i2] = 1;
            return new a(this.f6958b, this.f6959c, iArrB, uriArr, jArr, this.f6963g, this.f6964h);
        }

        public a k() {
            if (this.f6959c == -1) {
                return new a(this.f6958b, 0, new int[0], new Uri[0], new long[0], this.f6963g, this.f6964h);
            }
            int[] iArr = this.f6961e;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                if (iArrCopyOf[i2] == 1 || iArrCopyOf[i2] == 0) {
                    iArrCopyOf[i2] = 2;
                }
            }
            return new a(this.f6958b, length, iArrCopyOf, this.f6960d, this.f6962f, this.f6963g, this.f6964h);
        }
    }

    public h(Object obj, long... jArr) {
        this(obj, a(jArr), 0L, -9223372036854775807L, 0);
    }

    public h(Object obj, a[] aVarArr, long j2, long j3, int i2) {
        this.f6951d = obj;
        this.f6953f = j2;
        this.f6954g = j3;
        this.f6952e = aVarArr.length + i2;
        this.f6956i = aVarArr;
        this.f6955h = i2;
    }

    public static a[] a(long[] jArr) {
        int length = jArr.length;
        a[] aVarArr = new a[length];
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2] = new a(jArr[i2]);
        }
        return aVarArr;
    }

    public a b(int i2) {
        int i3 = this.f6955h;
        return i2 < i3 ? f6949b : this.f6956i[i2 - i3];
    }

    public int c(long j2, long j3) {
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return -1;
        }
        int i2 = this.f6955h;
        while (i2 < this.f6952e && ((b(i2).f6958b != Long.MIN_VALUE && b(i2).f6958b <= j2) || !b(i2).f())) {
            i2++;
        }
        if (i2 < this.f6952e) {
            return i2;
        }
        return -1;
    }

    public int d(long j2, long j3) {
        int i2 = this.f6952e - 1;
        while (i2 >= 0 && f(j2, j3, i2)) {
            i2--;
        }
        if (i2 < 0 || !b(i2).e()) {
            return -1;
        }
        return i2;
    }

    public boolean e(int i2, int i3) {
        a aVarB;
        int i4;
        return i2 < this.f6952e && (i4 = (aVarB = b(i2)).f6959c) != -1 && i3 < i4 && aVarB.f6961e[i3] == 4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return x0.b(this.f6951d, hVar.f6951d) && this.f6952e == hVar.f6952e && this.f6953f == hVar.f6953f && this.f6954g == hVar.f6954g && this.f6955h == hVar.f6955h && Arrays.equals(this.f6956i, hVar.f6956i);
    }

    public final boolean f(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        long j4 = b(i2).f6958b;
        return j4 == Long.MIN_VALUE ? j3 == -9223372036854775807L || j2 < j3 : j2 < j4;
    }

    public h g(int i2, int i3) {
        c.f.a.b.j3.g.a(i3 > 0);
        int i4 = i2 - this.f6955h;
        a[] aVarArr = this.f6956i;
        if (aVarArr[i4].f6959c == i3) {
            return this;
        }
        a[] aVarArr2 = (a[]) x0.G0(aVarArr, aVarArr.length);
        aVarArr2[i4] = this.f6956i[i4].g(i3);
        return new h(this.f6951d, aVarArr2, this.f6953f, this.f6954g, this.f6955h);
    }

    public h h(long[][] jArr) {
        c.f.a.b.j3.g.g(this.f6955h == 0);
        a[] aVarArr = this.f6956i;
        a[] aVarArr2 = (a[]) x0.G0(aVarArr, aVarArr.length);
        for (int i2 = 0; i2 < this.f6952e; i2++) {
            aVarArr2[i2] = aVarArr2[i2].h(jArr[i2]);
        }
        return new h(this.f6951d, aVarArr2, this.f6953f, this.f6954g, this.f6955h);
    }

    public int hashCode() {
        int i2 = this.f6952e * 31;
        Object obj = this.f6951d;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f6953f)) * 31) + ((int) this.f6954g)) * 31) + this.f6955h) * 31) + Arrays.hashCode(this.f6956i);
    }

    public h i(int i2, int i3) {
        int i4 = i2 - this.f6955h;
        a[] aVarArr = this.f6956i;
        a[] aVarArr2 = (a[]) x0.G0(aVarArr, aVarArr.length);
        aVarArr2[i4] = aVarArr2[i4].i(4, i3);
        return new h(this.f6951d, aVarArr2, this.f6953f, this.f6954g, this.f6955h);
    }

    public h j(long j2) {
        return this.f6953f == j2 ? this : new h(this.f6951d, this.f6956i, j2, this.f6954g, this.f6955h);
    }

    public h k(int i2, int i3, Uri uri) {
        int i4 = i2 - this.f6955h;
        a[] aVarArr = this.f6956i;
        a[] aVarArr2 = (a[]) x0.G0(aVarArr, aVarArr.length);
        aVarArr2[i4] = aVarArr2[i4].j(uri, i3);
        return new h(this.f6951d, aVarArr2, this.f6953f, this.f6954g, this.f6955h);
    }

    public h l(long j2) {
        return this.f6954g == j2 ? this : new h(this.f6951d, this.f6956i, this.f6953f, j2, this.f6955h);
    }

    public h m(int i2, int i3) {
        int i4 = i2 - this.f6955h;
        a[] aVarArr = this.f6956i;
        a[] aVarArr2 = (a[]) x0.G0(aVarArr, aVarArr.length);
        aVarArr2[i4] = aVarArr2[i4].i(3, i3);
        return new h(this.f6951d, aVarArr2, this.f6953f, this.f6954g, this.f6955h);
    }

    public h n(int i2, int i3) {
        int i4 = i2 - this.f6955h;
        a[] aVarArr = this.f6956i;
        a[] aVarArr2 = (a[]) x0.G0(aVarArr, aVarArr.length);
        aVarArr2[i4] = aVarArr2[i4].i(2, i3);
        return new h(this.f6951d, aVarArr2, this.f6953f, this.f6954g, this.f6955h);
    }

    public h o(int i2) {
        int i3 = i2 - this.f6955h;
        a[] aVarArr = this.f6956i;
        a[] aVarArr2 = (a[]) x0.G0(aVarArr, aVarArr.length);
        aVarArr2[i3] = aVarArr2[i3].k();
        return new h(this.f6951d, aVarArr2, this.f6953f, this.f6954g, this.f6955h);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f6951d);
        sb.append(", adResumePositionUs=");
        sb.append(this.f6953f);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f6956i.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f6956i[i2].f6958b);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.f6956i[i2].f6961e.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.f6956i[i2].f6961e[i3];
                sb.append(i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.f6956i[i2].f6962f[i3]);
                sb.append(')');
                if (i3 < this.f6956i[i2].f6961e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.f6956i.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
