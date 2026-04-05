package a.g.b.k.m;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1472a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f1475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f1476e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1479h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1473b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1474c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<m> f1477f = new ArrayList<>();

    public k(m mVar, int i2) {
        this.f1475d = null;
        this.f1476e = null;
        this.f1478g = 0;
        int i3 = f1472a;
        this.f1478g = i3;
        f1472a = i3 + 1;
        this.f1475d = mVar;
        this.f1476e = mVar;
        this.f1479h = i2;
    }

    public void a(m mVar) {
        this.f1477f.add(mVar);
        this.f1476e = mVar;
    }

    public long b(a.g.b.k.f fVar, int i2) {
        long j2;
        m mVar;
        long j3;
        long jD;
        m mVar2 = this.f1475d;
        if (mVar2 instanceof c) {
            if (((c) mVar2).f1488f != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(mVar2 instanceof j)) {
                return 0L;
            }
        } else if (!(mVar2 instanceof l)) {
            return 0L;
        }
        f fVar2 = (i2 == 0 ? fVar.f1419f : fVar.f1420g).f1490h;
        f fVar3 = (i2 == 0 ? fVar.f1419f : fVar.f1420g).f1491i;
        boolean zContains = mVar2.f1490h.f1468l.contains(fVar2);
        boolean zContains2 = this.f1475d.f1491i.f1468l.contains(fVar3);
        long j4 = this.f1475d.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                jD = d(this.f1475d.f1490h, r13.f1462f);
                j3 = ((long) this.f1475d.f1490h.f1462f) + j4;
            } else if (zContains2) {
                long jC = c(this.f1475d.f1491i, r13.f1462f);
                j3 = ((long) (-this.f1475d.f1491i.f1462f)) + j4;
                jD = -jC;
            } else {
                m mVar3 = this.f1475d;
                j2 = ((long) mVar3.f1490h.f1462f) + mVar3.j();
                mVar = this.f1475d;
            }
            return Math.max(jD, j3);
        }
        long jD2 = d(this.f1475d.f1490h, 0L);
        long jC2 = c(this.f1475d.f1491i, 0L);
        long j5 = jD2 - j4;
        m mVar4 = this.f1475d;
        int i3 = mVar4.f1491i.f1462f;
        if (j5 >= (-i3)) {
            j5 += (long) i3;
        }
        int i4 = mVar4.f1490h.f1462f;
        long j6 = ((-jC2) - j4) - ((long) i4);
        if (j6 >= i4) {
            j6 -= (long) i4;
        }
        float fM = mVar4.f1484b.m(i2);
        float f2 = fM > 0.0f ? (long) ((j6 / fM) + (j5 / (1.0f - fM))) : 0L;
        long j7 = ((long) ((f2 * fM) + 0.5f)) + j4 + ((long) ((f2 * (1.0f - fM)) + 0.5f));
        mVar = this.f1475d;
        j2 = ((long) mVar.f1490h.f1462f) + j7;
        return j2 - ((long) mVar.f1491i.f1462f);
    }

    public final long c(f fVar, long j2) {
        m mVar = fVar.f1460d;
        if (mVar instanceof i) {
            return j2;
        }
        int size = fVar.f1467k.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f1467k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1460d != mVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f1462f) + j2));
                }
            }
        }
        if (fVar != mVar.f1491i) {
            return jMin;
        }
        long j3 = j2 - mVar.j();
        return Math.min(Math.min(jMin, c(mVar.f1490h, j3)), j3 - ((long) mVar.f1490h.f1462f));
    }

    public final long d(f fVar, long j2) {
        m mVar = fVar.f1460d;
        if (mVar instanceof i) {
            return j2;
        }
        int size = fVar.f1467k.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f1467k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1460d != mVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f1462f) + j2));
                }
            }
        }
        if (fVar != mVar.f1490h) {
            return jMax;
        }
        long j3 = j2 + mVar.j();
        return Math.max(Math.max(jMax, d(mVar.f1491i, j3)), j3 - ((long) mVar.f1491i.f1462f));
    }
}
