package c.f.a.b.i3;

import android.content.Context;
import c.f.a.b.i3.p;
import c.f.a.b.i3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f9122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.a f9123c;

    public w(Context context) {
        this(context, (String) null, (n0) null);
    }

    public w(Context context, n0 n0Var, p.a aVar) {
        this.f9121a = context.getApplicationContext();
        this.f9122b = n0Var;
        this.f9123c = aVar;
    }

    public w(Context context, p.a aVar) {
        this(context, (n0) null, aVar);
    }

    public w(Context context, String str, n0 n0Var) {
        this(context, n0Var, new x.b().c(str));
    }

    @Override // c.f.a.b.i3.p.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v a() {
        v vVar = new v(this.f9121a, this.f9123c.a());
        n0 n0Var = this.f9122b;
        if (n0Var != null) {
            vVar.h(n0Var);
        }
        return vVar;
    }
}
