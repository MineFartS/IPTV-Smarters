package c.h.a.h.m.f;

import a.f.g;
import android.content.Context;
import android.graphics.Bitmap;
import c.c.b.o;
import c.c.b.w.d;
import c.c.b.w.h;
import c.c.b.w.i;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f17031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f17032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f17033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f17034d;

    /* JADX INFO: renamed from: c.h.a.h.m.f.a$a, reason: collision with other inner class name */
    public class C0226a implements i.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<String, Bitmap> f17035a = new g<>(20);

        public C0226a() {
        }

        @Override // c.c.b.w.i.f
        public Bitmap a(String str) {
            return this.f17035a.d(str);
        }

        @Override // c.c.b.w.i.f
        public void b(String str, Bitmap bitmap) {
            this.f17035a.f(str, bitmap);
        }
    }

    public a(Context context) {
        f17032b = context;
        o oVarC = c();
        this.f17033c = oVarC;
        this.f17034d = new i(oVarC, new C0226a());
    }

    public static synchronized a b(Context context) {
        if (f17031a == null) {
            f17031a = new a(context);
        }
        return f17031a;
    }

    public i a() {
        return this.f17034d;
    }

    public final o c() {
        if (this.f17033c == null) {
            o oVar = new o(new d(f17032b.getCacheDir(), 10485760), new c.c.b.w.b(new h()));
            this.f17033c = oVar;
            oVar.d();
        }
        return this.f17033c;
    }
}
