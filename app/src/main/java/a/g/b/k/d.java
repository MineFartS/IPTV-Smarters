package a.g.b.k;

import a.g.b.i;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f1409d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.g.b.i f1412g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<d> f1406a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1410e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1411f = -1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1413a;

        static {
            int[] iArr = new int[b.values().length];
            f1413a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1413a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1413a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1413a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1413a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1413a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1413a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1413a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1413a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f1407b = eVar;
        this.f1408c = bVar;
    }

    public boolean a(d dVar, int i2, int i3, boolean z) {
        if (dVar == null) {
            k();
            return true;
        }
        if (!z && !j(dVar)) {
            return false;
        }
        this.f1409d = dVar;
        if (dVar.f1406a == null) {
            dVar.f1406a = new HashSet<>();
        }
        this.f1409d.f1406a.add(this);
        if (i2 > 0) {
            this.f1410e = i2;
        } else {
            this.f1410e = 0;
        }
        this.f1411f = i3;
        return true;
    }

    public int b() {
        d dVar;
        if (this.f1407b.M() == 8) {
            return 0;
        }
        return (this.f1411f <= -1 || (dVar = this.f1409d) == null || dVar.f1407b.M() != 8) ? this.f1410e : this.f1411f;
    }

    public final d c() {
        switch (a.f1413a[this.f1408c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f1407b.E;
            case 3:
                return this.f1407b.C;
            case 4:
                return this.f1407b.F;
            case 5:
                return this.f1407b.D;
            default:
                throw new AssertionError(this.f1408c.name());
        }
    }

    public e d() {
        return this.f1407b;
    }

    public a.g.b.i e() {
        return this.f1412g;
    }

    public d f() {
        return this.f1409d;
    }

    public b g() {
        return this.f1408c;
    }

    public boolean h() {
        HashSet<d> hashSet = this.f1406a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().c().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.f1409d != null;
    }

    public boolean j(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarG = dVar.g();
        b bVar = this.f1408c;
        if (bVarG == bVar) {
            return bVar != b.BASELINE || (dVar.d().Q() && d().Q());
        }
        switch (a.f1413a[bVar.ordinal()]) {
            case 1:
                return (bVarG == b.BASELINE || bVarG == b.CENTER_X || bVarG == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = bVarG == b.LEFT || bVarG == b.RIGHT;
                if (dVar.d() instanceof g) {
                    return z || bVarG == b.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = bVarG == b.TOP || bVarG == b.BOTTOM;
                if (dVar.d() instanceof g) {
                    return z2 || bVarG == b.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f1408c.name());
        }
    }

    public void k() {
        HashSet<d> hashSet;
        d dVar = this.f1409d;
        if (dVar != null && (hashSet = dVar.f1406a) != null) {
            hashSet.remove(this);
        }
        this.f1409d = null;
        this.f1410e = 0;
        this.f1411f = -1;
    }

    public void l(a.g.b.c cVar) {
        a.g.b.i iVar = this.f1412g;
        if (iVar == null) {
            this.f1412g = new a.g.b.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f1407b.p() + ":" + this.f1408c.toString();
    }
}
