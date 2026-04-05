package c.f.c.j.a;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;
import c.f.a.c.j.h.e0;
import c.f.c.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile a f16045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.k.a.a f16046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, ?> f16047c;

    public b(c.f.a.c.k.a.a aVar) {
        o.i(aVar);
        this.f16046b = aVar;
        this.f16047c = new ConcurrentHashMap();
    }

    @RecentlyNonNull
    public static a c(@RecentlyNonNull c cVar, @RecentlyNonNull Context context, @RecentlyNonNull c.f.c.o.d dVar) {
        o.i(cVar);
        o.i(context);
        o.i(dVar);
        o.i(context.getApplicationContext());
        if (f16045a == null) {
            synchronized (b.class) {
                if (f16045a == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.q()) {
                        dVar.b(c.f.c.a.class, d.f16055a, e.f16056a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.p());
                    }
                    f16045a = new b(e0.t(context, null, null, null, bundle).u());
                }
            }
        }
        return f16045a;
    }

    public static final /* synthetic */ void d(c.f.c.o.a aVar) {
        boolean z = ((c.f.c.a) aVar.a()).f16015a;
        synchronized (b.class) {
            ((b) f16045a).f16046b.c(z);
        }
    }

    @Override // c.f.c.j.a.a
    public void a(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (c.f.c.j.a.c.b.a(str) && c.f.c.j.a.c.b.b(str2, bundle) && c.f.c.j.a.c.b.d(str, str2, bundle)) {
            c.f.c.j.a.c.b.e(str, str2, bundle);
            this.f16046b.a(str, str2, bundle);
        }
    }

    @Override // c.f.c.j.a.a
    public void b(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Object obj) {
        if (c.f.c.j.a.c.b.a(str) && c.f.c.j.a.c.b.c(str, str2)) {
            this.f16046b.b(str, str2, obj);
        }
    }
}
