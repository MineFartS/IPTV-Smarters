package c.h.a.e.d;

import android.content.Context;
import minefarts.iptvsmarters.R;
import java.util.ArrayList;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.h.a.e.a.a f16701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f16702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16703c;

    public class a implements o.d<ArrayList<c.h.a.e.e.a>> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<ArrayList<c.h.a.e.e.a>> bVar, Throwable th) {
            c.this.f16701a.w(c.this.f16702b.getResources().getString(R.string.something_wrong));
        }

        @Override // o.d
        public void b(o.b<ArrayList<c.h.a.e.e.a>> bVar, l<ArrayList<c.h.a.e.e.a>> lVar) {
            if (!lVar.d() || lVar.a() == null) {
                c.this.f16701a.w("Network Error");
            } else {
                c.this.f16701a.k(lVar.a());
            }
        }
    }

    public c(c.h.a.e.a.a aVar, Context context, String str) {
        this.f16701a = aVar;
        this.f16702b = context;
        this.f16703c = str;
    }

    public void a() {
        ((c.h.a.e.d.a) b.a().d(c.h.a.e.d.a.class)).d("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetClientproductwithStatus", "yes", c.h.a.e.b.a.a(this.f16702b), this.f16703c).x(new a());
    }
}
