package c.h.a.e.d;

import android.content.Context;
import minefarts.iptvsmarters.R;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.h.a.e.a.b f16705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f16706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16707c;

    public class a implements o.d<c.h.a.e.e.c> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<c.h.a.e.e.c> bVar, Throwable th) {
            d.this.f16705a.v(d.this.f16706b.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<c.h.a.e.e.c> bVar, l<c.h.a.e.e.c> lVar) {
            if (lVar.a() == null || !lVar.d()) {
                d.this.f16705a.v(d.this.f16706b.getResources().getString(R.string.something_wrong));
            } else {
                lVar.a().a();
                throw null;
            }
        }
    }

    public d(c.h.a.e.a.b bVar, Context context, String str) {
        this.f16706b = context;
        this.f16707c = str;
        this.f16705a = bVar;
    }

    public void a() {
        ((c.h.a.e.d.a) b.a().d(c.h.a.e.d.a.class)).h("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetInvoices", "no", c.h.a.e.b.a.a(this.f16706b), this.f16707c).x(new a());
    }
}
