package c.f.a.b.z2;

import android.net.Uri;
import c.f.a.b.z2.m0.h0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10788b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor<? extends j> f10789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10797k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10799m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10798l = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10800n = 112800;

    static {
        Constructor<? extends j> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("c.f.a.b.y2.d.h").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("c.f.a.b.y2.d.g").asSubclass(j.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f10789c = constructor;
    }

    @Override // c.f.a.b.z2.o
    public synchronized j[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // c.f.a.b.z2.o
    public synchronized j[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int iB = c.f.a.b.j3.s.b(map);
        if (iB != -1) {
            c(iB, arrayList);
        }
        int iC = c.f.a.b.j3.s.c(uri);
        if (iC != -1 && iC != iB) {
            c(iC, arrayList);
        }
        for (int i2 : f10788b) {
            if (i2 != iB && i2 != iC) {
                c(i2, arrayList);
            }
        }
        return (j[]) arrayList.toArray(new j[arrayList.size()]);
    }

    public final void c(int i2, List<j> list) {
        j fVar;
        switch (i2) {
            case 0:
                fVar = new c.f.a.b.z2.m0.f();
                break;
            case 1:
                fVar = new c.f.a.b.z2.m0.h();
                break;
            case 2:
                fVar = new c.f.a.b.z2.m0.j(this.f10791e | (this.f10790d ? 1 : 0));
                break;
            case 3:
                fVar = new c.f.a.b.z2.d0.b(this.f10792f | (this.f10790d ? 1 : 0));
                break;
            case 4:
                Constructor<? extends j> constructor = f10789c;
                if (constructor == null) {
                    fVar = new c.f.a.b.z2.e0.d(this.f10793g);
                    break;
                } else {
                    try {
                        list.add(constructor.newInstance(Integer.valueOf(this.f10793g)));
                        return;
                    } catch (Exception e2) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
                    }
                }
                break;
            case 5:
                fVar = new c.f.a.b.z2.f0.c();
                break;
            case 6:
                fVar = new c.f.a.b.z2.h0.e(this.f10794h);
                break;
            case 7:
                fVar = new c.f.a.b.z2.i0.f(this.f10797k | (this.f10790d ? 1 : 0));
                break;
            case 8:
                list.add(new c.f.a.b.z2.j0.i(this.f10796j));
                fVar = new c.f.a.b.z2.j0.k(this.f10795i);
                break;
            case 9:
                fVar = new c.f.a.b.z2.k0.d();
                break;
            case 10:
                fVar = new c.f.a.b.z2.m0.b0();
                break;
            case 11:
                fVar = new h0(this.f10798l, this.f10799m, this.f10800n);
                break;
            case 12:
                fVar = new c.f.a.b.z2.n0.b();
                break;
            case 13:
            default:
                return;
            case 14:
                fVar = new c.f.a.b.z2.g0.a();
                break;
        }
        list.add(fVar);
    }
}
