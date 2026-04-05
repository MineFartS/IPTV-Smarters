package c.f.a.a.j.y.j;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c.f.a.a.j.u.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.u.e f6292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.j.y.k.c f6293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f6294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f6295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.a.j.z.b f6296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6297g;

    public m(Context context, c.f.a.a.j.u.e eVar, c.f.a.a.j.y.k.c cVar, s sVar, Executor executor, c.f.a.a.j.z.b bVar, c.f.a.a.j.a0.a aVar) {
        this.f6291a = context;
        this.f6292b = eVar;
        this.f6293c = cVar;
        this.f6294d = sVar;
        this.f6295e = executor;
        this.f6296f = bVar;
        this.f6297g = aVar;
    }

    public static /* synthetic */ Object c(m mVar, c.f.a.a.j.u.g gVar, Iterable iterable, c.f.a.a.j.m mVar2, int i2) {
        if (gVar.c() == g.a.TRANSIENT_ERROR) {
            mVar.f6293c.r0(iterable);
            mVar.f6294d.a(mVar2, i2 + 1);
            return null;
        }
        mVar.f6293c.B(iterable);
        if (gVar.c() == g.a.OK) {
            mVar.f6293c.G(mVar2, mVar.f6297g.a() + gVar.b());
        }
        if (!mVar.f6293c.q0(mVar2)) {
            return null;
        }
        mVar.f6294d.a(mVar2, 1);
        return null;
    }

    public static /* synthetic */ Object d(m mVar, c.f.a.a.j.m mVar2, int i2) {
        mVar.f6294d.a(mVar2, i2 + 1);
        return null;
    }

    public static /* synthetic */ void e(m mVar, c.f.a.a.j.m mVar2, int i2, Runnable runnable) {
        try {
            try {
                c.f.a.a.j.z.b bVar = mVar.f6296f;
                c.f.a.a.j.y.k.c cVar = mVar.f6293c;
                cVar.getClass();
                bVar.d(k.a(cVar));
                if (mVar.a()) {
                    mVar.f(mVar2, i2);
                } else {
                    mVar.f6296f.d(l.a(mVar, mVar2, i2));
                }
            } catch (c.f.a.a.j.z.a unused) {
                mVar.f6294d.a(mVar2, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f6291a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void f(c.f.a.a.j.m mVar, int i2) {
        c.f.a.a.j.u.g gVarA;
        c.f.a.a.j.u.m mVar2 = this.f6292b.get(mVar.b());
        Iterable iterable = (Iterable) this.f6296f.d(i.a(this, mVar));
        if (iterable.iterator().hasNext()) {
            if (mVar2 == null) {
                c.f.a.a.j.w.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
                gVarA = c.f.a.a.j.u.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c.f.a.a.j.y.k.i) it.next()).b());
                }
                gVarA = mVar2.a(c.f.a.a.j.u.f.a().b(arrayList).c(mVar.c()).a());
            }
            this.f6296f.d(j.a(this, gVarA, iterable, mVar, i2));
        }
    }

    public void g(c.f.a.a.j.m mVar, int i2, Runnable runnable) {
        this.f6295e.execute(h.a(this, mVar, i2, runnable));
    }
}
