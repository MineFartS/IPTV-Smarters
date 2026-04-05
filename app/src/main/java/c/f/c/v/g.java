package c.f.c.v;

import android.content.Context;
import c.f.c.v.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements c.f.c.k.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.a f16438b;

    public g(String str, h.a aVar) {
        this.f16437a = str;
        this.f16438b = aVar;
    }

    public static c.f.c.k.h b(String str, h.a aVar) {
        return new g(str, aVar);
    }

    @Override // c.f.c.k.h
    public Object a(c.f.c.k.e eVar) {
        return f.a(this.f16437a, this.f16438b.a((Context) eVar.a(Context.class)));
    }
}
