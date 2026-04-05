package c.f.a.b.z2.g0;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f10775b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10779d;

        public a(String str, String str2, long j2, long j3) {
            this.f10776a = str;
            this.f10777b = str2;
            this.f10778c = j2;
            this.f10779d = j3;
        }
    }

    public b(long j2, List<a> list) {
        this.f10774a = j2;
        this.f10775b = list;
    }

    public c.f.a.b.b3.n.c a(long j2) {
        long j3;
        if (this.f10775b.size() < 2) {
            return null;
        }
        long j4 = j2;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        long j8 = -1;
        boolean z = false;
        for (int size = this.f10775b.size() - 1; size >= 0; size--) {
            a aVar = this.f10775b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f10776a) | z;
            if (size == 0) {
                j3 = j4 - aVar.f10779d;
                j4 = 0;
            } else {
                long j9 = j4;
                j4 -= aVar.f10778c;
                j3 = j9;
            }
            if (!zEquals || j4 == j3) {
                z = zEquals;
            } else {
                j8 = j3 - j4;
                j7 = j4;
                z = false;
            }
            if (size == 0) {
                j5 = j4;
                j6 = j3;
            }
        }
        if (j7 == -1 || j8 == -1 || j5 == -1 || j6 == -1) {
            return null;
        }
        return new c.f.a.b.b3.n.c(j5, j6, this.f10774a, j7, j8);
    }
}
