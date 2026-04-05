package c.f.a.e.a.b;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15390a = new c.f.a.e.a.e.a("ExtractorTaskFinder");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f15391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f15393d;

    public d1(a1 a1Var, v vVar, c0 c0Var) {
        this.f15391b = a1Var;
        this.f15392c = vVar;
        this.f15393d = c0Var;
    }

    public static boolean c(y0 y0Var) {
        int i2 = y0Var.f15681f;
        return i2 == 1 || i2 == 2;
    }

    public final c1 a() {
        c1 b2Var;
        i0 i0Var;
        v1 v1Var;
        int iK;
        try {
            this.f15391b.a();
            ArrayList arrayList = new ArrayList();
            for (x0 x0Var : this.f15391b.c().values()) {
                if (j1.f(x0Var.f15667c.f15656c)) {
                    arrayList.add(x0Var);
                }
            }
            if (arrayList.isEmpty()) {
                this.f15391b.b();
                return null;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    b2Var = null;
                    break;
                }
                x0 x0Var2 = (x0) it.next();
                try {
                    v vVar = this.f15392c;
                    w0 w0Var = x0Var2.f15667c;
                    if (vVar.y(w0Var.f15654a, x0Var2.f15666b, w0Var.f15655b) == x0Var2.f15667c.f15658e.size()) {
                        f15390a.a("Found final move task for session %s with pack %s.", Integer.valueOf(x0Var2.f15665a), x0Var2.f15667c.f15654a);
                        int i2 = x0Var2.f15665a;
                        w0 w0Var2 = x0Var2.f15667c;
                        b2Var = new p1(i2, w0Var2.f15654a, x0Var2.f15666b, w0Var2.f15655b);
                        break;
                    }
                } catch (IOException e2) {
                    throw new k0(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(x0Var2.f15665a), x0Var2.f15667c.f15654a), e2, x0Var2.f15665a);
                }
            }
            if (b2Var == null) {
                Iterator it2 = arrayList.iterator();
                loop2: while (true) {
                    if (!it2.hasNext()) {
                        b2Var = null;
                        break;
                    }
                    x0 x0Var3 = (x0) it2.next();
                    if (j1.f(x0Var3.f15667c.f15656c)) {
                        for (y0 y0Var : x0Var3.f15667c.f15658e) {
                            v vVar2 = this.f15392c;
                            w0 w0Var3 = x0Var3.f15667c;
                            if (vVar2.w(w0Var3.f15654a, x0Var3.f15666b, w0Var3.f15655b, y0Var.f15676a).exists()) {
                                f15390a.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(x0Var3.f15665a), x0Var3.f15667c.f15654a, y0Var.f15676a);
                                int i3 = x0Var3.f15665a;
                                w0 w0Var4 = x0Var3.f15667c;
                                b2Var = new m1(i3, w0Var4.f15654a, x0Var3.f15666b, w0Var4.f15655b, y0Var.f15676a);
                                break loop2;
                            }
                        }
                    }
                }
                if (b2Var == null) {
                    Iterator it3 = arrayList.iterator();
                    loop4: while (true) {
                        if (!it3.hasNext()) {
                            b2Var = null;
                            break;
                        }
                        x0 x0Var4 = (x0) it3.next();
                        if (j1.f(x0Var4.f15667c.f15656c)) {
                            for (y0 y0Var2 : x0Var4.f15667c.f15658e) {
                                if (b(x0Var4, y0Var2)) {
                                    v vVar3 = this.f15392c;
                                    w0 w0Var5 = x0Var4.f15667c;
                                    if (vVar3.v(w0Var5.f15654a, x0Var4.f15666b, w0Var5.f15655b, y0Var2.f15676a).exists()) {
                                        f15390a.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(x0Var4.f15665a), x0Var4.f15667c.f15654a, y0Var2.f15676a);
                                        int i4 = x0Var4.f15665a;
                                        w0 w0Var6 = x0Var4.f15667c;
                                        b2Var = new b2(i4, w0Var6.f15654a, x0Var4.f15666b, w0Var6.f15655b, y0Var2.f15676a, y0Var2.f15677b);
                                        break loop4;
                                    }
                                }
                            }
                        }
                    }
                    if (b2Var == null) {
                        Iterator it4 = arrayList.iterator();
                        loop6: while (true) {
                            if (!it4.hasNext()) {
                                i0Var = null;
                                break;
                            }
                            x0 x0Var5 = (x0) it4.next();
                            if (j1.f(x0Var5.f15667c.f15656c)) {
                                for (y0 y0Var3 : x0Var5.f15667c.f15658e) {
                                    if (!c(y0Var3)) {
                                        v vVar4 = this.f15392c;
                                        w0 w0Var7 = x0Var5.f15667c;
                                        Iterator it5 = it4;
                                        try {
                                            iK = new y1(vVar4, w0Var7.f15654a, x0Var5.f15666b, w0Var7.f15655b, y0Var3.f15676a).k();
                                        } catch (IOException e3) {
                                            f15390a.b("Slice checkpoint corrupt, restarting extraction. %s", e3);
                                            iK = 0;
                                        }
                                        if (iK != -1 && y0Var3.f15679d.get(iK).f15640a) {
                                            f15390a.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(y0Var3.f15680e), Integer.valueOf(x0Var5.f15665a), x0Var5.f15667c.f15654a, y0Var3.f15676a, Integer.valueOf(iK));
                                            InputStream inputStreamA = this.f15393d.a(x0Var5.f15665a, x0Var5.f15667c.f15654a, y0Var3.f15676a, iK);
                                            int i5 = x0Var5.f15665a;
                                            w0 w0Var8 = x0Var5.f15667c;
                                            String str = w0Var8.f15654a;
                                            int i6 = x0Var5.f15666b;
                                            long j2 = w0Var8.f15655b;
                                            String str2 = y0Var3.f15676a;
                                            int i7 = y0Var3.f15680e;
                                            int size = y0Var3.f15679d.size();
                                            w0 w0Var9 = x0Var5.f15667c;
                                            i0Var = new i0(i5, str, i6, j2, str2, i7, iK, size, w0Var9.f15657d, w0Var9.f15656c, inputStreamA);
                                            break loop6;
                                        }
                                        it4 = it5;
                                    }
                                }
                            }
                        }
                        if (i0Var != null) {
                            return i0Var;
                        }
                        Iterator it6 = arrayList.iterator();
                        loop8: while (true) {
                            if (!it6.hasNext()) {
                                v1Var = null;
                                break;
                            }
                            x0 x0Var6 = (x0) it6.next();
                            if (j1.f(x0Var6.f15667c.f15656c)) {
                                for (y0 y0Var4 : x0Var6.f15667c.f15658e) {
                                    if (c(y0Var4) && y0Var4.f15679d.get(0).f15640a && !b(x0Var6, y0Var4)) {
                                        f15390a.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(y0Var4.f15681f), Integer.valueOf(x0Var6.f15665a), x0Var6.f15667c.f15654a, y0Var4.f15676a);
                                        InputStream inputStreamA2 = this.f15393d.a(x0Var6.f15665a, x0Var6.f15667c.f15654a, y0Var4.f15676a, 0);
                                        int i8 = x0Var6.f15665a;
                                        String str3 = x0Var6.f15667c.f15654a;
                                        v1Var = new v1(i8, str3, this.f15392c.G(str3), this.f15392c.H(x0Var6.f15667c.f15654a), x0Var6.f15666b, x0Var6.f15667c.f15655b, y0Var4.f15681f, y0Var4.f15676a, y0Var4.f15678c, inputStreamA2);
                                        break loop8;
                                    }
                                }
                            }
                        }
                        if (v1Var != null) {
                            return v1Var;
                        }
                        return null;
                    }
                }
            }
            return b2Var;
        } finally {
            this.f15391b.b();
        }
    }

    public final boolean b(x0 x0Var, y0 y0Var) {
        v vVar = this.f15392c;
        w0 w0Var = x0Var.f15667c;
        return new y1(vVar, w0Var.f15654a, x0Var.f15666b, w0Var.f15655b, y0Var.f15676a).l();
    }
}
