package a.g.b.k.m;

import a.g.b.k.e;
import a.g.b.k.m.f;
import a.g.b.k.m.m;

/* JADX INFO: loaded from: classes.dex */
public class j extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f1470k = new int[2];

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1471a;

        static {
            int[] iArr = new int[m.b.values().length];
            f1471a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1471a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1471a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(a.g.b.k.e eVar) {
        super(eVar);
        this.f1490h.f1461e = f.a.LEFT;
        this.f1491i.f1461e = f.a.RIGHT;
        this.f1488f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0295, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // a.g.b.k.m.m, a.g.b.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(a.g.b.k.m.d r17) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.m.j.a(a.g.b.k.m.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c2  */
    @Override // a.g.b.k.m.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.m.j.d():void");
    }

    @Override // a.g.b.k.m.m
    public void e() {
        f fVar = this.f1490h;
        if (fVar.f1466j) {
            this.f1484b.C0(fVar.f1463g);
        }
    }

    @Override // a.g.b.k.m.m
    public void f() {
        this.f1485c = null;
        this.f1490h.c();
        this.f1491i.c();
        this.f1487e.c();
        this.f1489g = false;
    }

    @Override // a.g.b.k.m.m
    public boolean m() {
        return this.f1486d != e.b.MATCH_CONSTRAINT || this.f1484b.f1426m == 0;
    }

    public final void q(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7 && i8 <= i8) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else {
            if (i7 > i7 || i10 > i8) {
                return;
            }
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    public void r() {
        this.f1489g = false;
        this.f1490h.c();
        this.f1490h.f1466j = false;
        this.f1491i.c();
        this.f1491i.f1466j = false;
        this.f1487e.f1466j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f1484b.p();
    }
}
