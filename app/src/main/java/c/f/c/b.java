package c.f.c;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements c.f.c.r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16017b;

    public b(c cVar, Context context) {
        this.f16016a = cVar;
        this.f16017b = context;
    }

    public static c.f.c.r.b a(c cVar, Context context) {
        return new b(cVar, context);
    }

    @Override // c.f.c.r.b
    public Object get() {
        return c.r(this.f16016a, this.f16017b);
    }
}
