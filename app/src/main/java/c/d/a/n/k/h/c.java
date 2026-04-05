package c.d.a.n.k.h;

import android.content.Context;
import c.d.a.n.j.o;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class c implements c.d.a.q.b<InputStream, b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f5795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f5796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.k.g.c<b> f5797e;

    public c(Context context, c.d.a.n.i.n.c cVar) {
        i iVar = new i(context, cVar);
        this.f5794b = iVar;
        this.f5797e = new c.d.a.n.k.g.c<>(iVar);
        this.f5795c = new j(cVar);
        this.f5796d = new o();
    }

    @Override // c.d.a.q.b
    public c.d.a.n.b<InputStream> a() {
        return this.f5796d;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.f<b> c() {
        return this.f5795c;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<InputStream, b> e() {
        return this.f5794b;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<File, b> f() {
        return this.f5797e;
    }
}
