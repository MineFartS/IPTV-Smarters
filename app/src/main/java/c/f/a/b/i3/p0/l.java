package c.f.a.b.i3.p0;

import c.f.a.b.j3.z;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet<t> f9009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<a> f9010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f9011e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9013b;

        public a(long j2, long j3) {
            this.f9012a = j2;
            this.f9013b = j3;
        }

        public boolean a(long j2, long j3) {
            long j4 = this.f9013b;
            if (j4 == -1) {
                return j2 >= this.f9012a;
            }
            if (j3 == -1) {
                return false;
            }
            long j5 = this.f9012a;
            return j5 <= j2 && j2 + j3 <= j5 + j4;
        }

        public boolean b(long j2, long j3) {
            long j4 = this.f9012a;
            if (j4 > j2) {
                return j3 == -1 || j2 + j3 > j4;
            }
            long j5 = this.f9013b;
            return j5 == -1 || j4 + j5 > j2;
        }
    }

    public l(int i2, String str) {
        this(i2, str, q.f9034a);
    }

    public l(int i2, String str, q qVar) {
        this.f9007a = i2;
        this.f9008b = str;
        this.f9011e = qVar;
        this.f9009c = new TreeSet<>();
        this.f9010d = new ArrayList<>();
    }

    public void a(t tVar) {
        this.f9009c.add(tVar);
    }

    public boolean b(p pVar) {
        this.f9011e = this.f9011e.e(pVar);
        return !r2.equals(r0);
    }

    public long c(long j2, long j3) {
        c.f.a.b.j3.g.a(j2 >= 0);
        c.f.a.b.j3.g.a(j3 >= 0);
        t tVarE = e(j2, j3);
        if (tVarE.d()) {
            return -Math.min(tVarE.g() ? Long.MAX_VALUE : tVarE.f8993d, j3);
        }
        long j4 = j2 + j3;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = tVarE.f8992c + tVarE.f8993d;
        if (jMax < j5) {
            for (t tVar : this.f9009c.tailSet(tVarE, false)) {
                long j6 = tVar.f8992c;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + tVar.f8993d);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j2, j3);
    }

    public q d() {
        return this.f9011e;
    }

    public t e(long j2, long j3) {
        t tVarR = t.r(this.f9008b, j2);
        t tVarFloor = this.f9009c.floor(tVarR);
        if (tVarFloor != null && tVarFloor.f8992c + tVarFloor.f8993d > j2) {
            return tVarFloor;
        }
        t tVarCeiling = this.f9009c.ceiling(tVarR);
        if (tVarCeiling != null) {
            long j4 = tVarCeiling.f8992c - j2;
            j3 = j3 == -1 ? j4 : Math.min(j4, j3);
        }
        return t.q(this.f9008b, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f9007a == lVar.f9007a && this.f9008b.equals(lVar.f9008b) && this.f9009c.equals(lVar.f9009c) && this.f9011e.equals(lVar.f9011e);
    }

    public TreeSet<t> f() {
        return this.f9009c;
    }

    public boolean g() {
        return this.f9009c.isEmpty();
    }

    public boolean h(long j2, long j3) {
        for (int i2 = 0; i2 < this.f9010d.size(); i2++) {
            if (this.f9010d.get(i2).a(j2, j3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f9007a * 31) + this.f9008b.hashCode()) * 31) + this.f9011e.hashCode();
    }

    public boolean i() {
        return this.f9010d.isEmpty();
    }

    public boolean j(long j2, long j3) {
        for (int i2 = 0; i2 < this.f9010d.size(); i2++) {
            if (this.f9010d.get(i2).b(j2, j3)) {
                return false;
            }
        }
        this.f9010d.add(new a(j2, j3));
        return true;
    }

    public boolean k(j jVar) {
        if (!this.f9009c.remove(jVar)) {
            return false;
        }
        File file = jVar.f8995f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public t l(t tVar, long j2, boolean z) {
        c.f.a.b.j3.g.g(this.f9009c.remove(tVar));
        File file = (File) c.f.a.b.j3.g.e(tVar.f8995f);
        if (z) {
            File fileS = t.s((File) c.f.a.b.j3.g.e(file.getParentFile()), this.f9007a, tVar.f8992c, j2);
            if (file.renameTo(fileS)) {
                file = fileS;
            } else {
                z.i("CachedContent", "Failed to rename " + file + " to " + fileS);
            }
        }
        t tVarI = tVar.i(file, j2);
        this.f9009c.add(tVarI);
        return tVarI;
    }

    public void m(long j2) {
        for (int i2 = 0; i2 < this.f9010d.size(); i2++) {
            if (this.f9010d.get(i2).f9012a == j2) {
                this.f9010d.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
