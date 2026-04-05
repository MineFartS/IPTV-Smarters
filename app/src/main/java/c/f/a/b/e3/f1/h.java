package c.f.a.b.e3.f1;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.u0;
import c.f.a.b.k1;
import c.f.a.b.z2.m0.h0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f7265b = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7267d;

    public h() {
        this(0, true);
    }

    public h(int i2, boolean z) {
        this.f7266c = i2;
        this.f7267d = z;
    }

    public static void b(int i2, List<Integer> list) {
        if (c.f.b.f.c.f(f7265b, i2) == -1 || list.contains(Integer.valueOf(i2))) {
            return;
        }
        list.add(Integer.valueOf(i2));
    }

    public static c.f.a.b.z2.j0.i e(u0 u0Var, k1 k1Var, List<k1> list) {
        int i2 = g(k1Var) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new c.f.a.b.z2.j0.i(i2, u0Var, null, list);
    }

    public static h0 f(int i2, boolean z, k1 k1Var, List<k1> list, u0 u0Var) {
        int i3 = i2 | 16;
        if (list != null) {
            i3 |= 32;
        } else {
            list = z ? Collections.singletonList(new k1.b().e0("application/cea-608").E()) : Collections.emptyList();
        }
        String str = k1Var.f9335j;
        if (!TextUtils.isEmpty(str)) {
            if (!d0.b(str, "audio/mp4a-latm")) {
                i3 |= 2;
            }
            if (!d0.b(str, "video/avc")) {
                i3 |= 4;
            }
        }
        return new h0(2, u0Var, new c.f.a.b.z2.m0.l(i3, list));
    }

    public static boolean g(k1 k1Var) {
        c.f.a.b.b3.a aVar = k1Var.f9336k;
        if (aVar == null) {
            return false;
        }
        for (int i2 = 0; i2 < aVar.e(); i2++) {
            if (aVar.d(i2) instanceof s) {
                return !((s) r2).f7347d.isEmpty();
            }
        }
        return false;
    }

    public static boolean h(c.f.a.b.z2.j jVar, c.f.a.b.z2.k kVar) {
        try {
            boolean zE = jVar.e(kVar);
            kVar.r();
            return zE;
        } catch (EOFException unused) {
            kVar.r();
            return false;
        } catch (Throwable th) {
            kVar.r();
            throw th;
        }
    }

    @Override // c.f.a.b.e3.f1.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public f a(Uri uri, k1 k1Var, List<k1> list, u0 u0Var, Map<String, List<String>> map, c.f.a.b.z2.k kVar) {
        int iA = c.f.a.b.j3.s.a(k1Var.f9338m);
        int iB = c.f.a.b.j3.s.b(map);
        int iC = c.f.a.b.j3.s.c(uri);
        int[] iArr = f7265b;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(iA, arrayList);
        b(iB, arrayList);
        b(iC, arrayList);
        for (int i2 : iArr) {
            b(i2, arrayList);
        }
        c.f.a.b.z2.j jVar = null;
        kVar.r();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int iIntValue = ((Integer) arrayList.get(i3)).intValue();
            c.f.a.b.z2.j jVar2 = (c.f.a.b.z2.j) c.f.a.b.j3.g.e(d(iIntValue, k1Var, list, u0Var));
            if (h(jVar2, kVar)) {
                return new f(jVar2, k1Var, u0Var);
            }
            if (jVar == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                jVar = jVar2;
            }
        }
        return new f((c.f.a.b.z2.j) c.f.a.b.j3.g.e(jVar), k1Var, u0Var);
    }

    @SuppressLint({"SwitchIntDef"})
    public final c.f.a.b.z2.j d(int i2, k1 k1Var, List<k1> list, u0 u0Var) {
        if (i2 == 0) {
            return new c.f.a.b.z2.m0.f();
        }
        if (i2 == 1) {
            return new c.f.a.b.z2.m0.h();
        }
        if (i2 == 2) {
            return new c.f.a.b.z2.m0.j();
        }
        if (i2 == 7) {
            return new c.f.a.b.z2.i0.f(0, 0L);
        }
        if (i2 == 8) {
            return e(u0Var, k1Var, list);
        }
        if (i2 == 11) {
            return f(this.f7266c, this.f7267d, k1Var, list, u0Var);
        }
        if (i2 != 13) {
            return null;
        }
        return new v(k1Var.f9329d, u0Var);
    }
}
