package androidx.lifecycle;

import a.p.b;
import a.p.f;
import a.p.i;
import a.p.k;

/* JADX INFO: loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.a f4642c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4641b = obj;
        this.f4642c = b.f2987a.c(obj.getClass());
    }

    @Override // a.p.i
    public void d(k kVar, f.b bVar) {
        this.f4642c.a(kVar, bVar, this.f4641b);
    }
}
