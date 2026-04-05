package c.f.a.b.z2.j0;

import c.f.a.b.b3.a;
import c.f.a.b.b3.n.d;
import c.f.a.b.j3.i0;
import c.f.a.b.w1;
import c.f.a.b.z2.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.b.a.m f10986a = c.f.b.a.m.d(':');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.b.a.m f10987b = c.f.b.a.m.d('*');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f10988c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10989d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10990e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10993c;

        public a(int i2, long j2, int i3) {
            this.f10991a = i2;
            this.f10992b = j2;
            this.f10993c = i3;
        }
    }

    public static int b(String str) throws w1 {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw w1.a("Invalid SEF name", null);
        }
    }

    public static c.f.a.b.b3.n.d f(i0 i0Var, int i2) throws w1 {
        ArrayList arrayList = new ArrayList();
        List<String> listF = f10987b.f(i0Var.A(i2));
        for (int i3 = 0; i3 < listF.size(); i3++) {
            List<String> listF2 = f10986a.f(listF.get(i3));
            if (listF2.size() != 3) {
                throw w1.a(null, null);
            }
            try {
                arrayList.add(new d.b(Long.parseLong(listF2.get(0)), Long.parseLong(listF2.get(1)), 1 << (Integer.parseInt(listF2.get(2)) - 1)));
            } catch (NumberFormatException e2) {
                throw w1.a(null, e2);
            }
        }
        return new c.f.a.b.b3.n.d(arrayList);
    }

    public final void a(c.f.a.b.z2.k kVar, w wVar) {
        i0 i0Var = new i0(8);
        kVar.l(i0Var.d(), 0, 8);
        this.f10990e = i0Var.q() + 8;
        if (i0Var.n() != 1397048916) {
            wVar.f11506a = 0L;
        } else {
            wVar.f11506a = kVar.getPosition() - ((long) (this.f10990e - 12));
            this.f10989d = 2;
        }
    }

    public int c(c.f.a.b.z2.k kVar, w wVar, List<a.b> list) throws w1 {
        int i2 = this.f10989d;
        long j2 = 0;
        if (i2 == 0) {
            long length = kVar.getLength();
            if (length != -1 && length >= 8) {
                j2 = length - 8;
            }
            wVar.f11506a = j2;
            this.f10989d = 1;
        } else if (i2 == 1) {
            a(kVar, wVar);
        } else if (i2 == 2) {
            d(kVar, wVar);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException();
            }
            e(kVar, list);
            wVar.f11506a = 0L;
        }
        return 1;
    }

    public final void d(c.f.a.b.z2.k kVar, w wVar) {
        long j2;
        long length = kVar.getLength();
        int i2 = (this.f10990e - 12) - 8;
        i0 i0Var = new i0(i2);
        kVar.l(i0Var.d(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            i0Var.Q(2);
            short s = i0Var.s();
            if (s == 2192 || s == 2816 || s == 2817 || s == 2819 || s == 2820) {
                this.f10988c.add(new a(s, (length - ((long) this.f10990e)) - ((long) i0Var.q()), i0Var.q()));
            } else {
                i0Var.Q(8);
            }
        }
        if (this.f10988c.isEmpty()) {
            j2 = 0;
        } else {
            this.f10989d = 3;
            j2 = this.f10988c.get(0).f10992b;
        }
        wVar.f11506a = j2;
    }

    public final void e(c.f.a.b.z2.k kVar, List<a.b> list) throws w1 {
        long position = kVar.getPosition();
        int length = (int) ((kVar.getLength() - kVar.getPosition()) - ((long) this.f10990e));
        i0 i0Var = new i0(length);
        kVar.l(i0Var.d(), 0, length);
        for (int i2 = 0; i2 < this.f10988c.size(); i2++) {
            a aVar = this.f10988c.get(i2);
            i0Var.P((int) (aVar.f10992b - position));
            i0Var.Q(4);
            int iQ = i0Var.q();
            int iB = b(i0Var.A(iQ));
            int i3 = aVar.f10993c - (iQ + 8);
            if (iB == 2192) {
                list.add(f(i0Var, i3));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f10988c.clear();
        this.f10989d = 0;
    }
}
