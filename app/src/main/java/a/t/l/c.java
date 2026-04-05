package a.t.l;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0073c f3344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f3345c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f3346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.t.l.b f3347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a.t.l.d f3349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3350h;

    public static abstract class a {
        public abstract void a(c cVar, a.t.l.d dVar);
    }

    public final class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                c.this.l();
            } else {
                if (i2 != 2) {
                    return;
                }
                c.this.m();
            }
        }
    }

    /* JADX INFO: renamed from: a.t.l.c$c, reason: collision with other inner class name */
    public static final class C0073c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f3352a;

        public C0073c(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.f3352a = componentName;
        }

        public ComponentName a() {
            return this.f3352a;
        }

        public String b() {
            return this.f3352a.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.f3352a.flattenToShortString() + " }";
        }
    }

    public static abstract class d {
        public void a() {
        }

        public void b() {
        }

        public void c(int i2) {
        }

        public void d() {
        }

        public void e(int i2) {
            d();
        }

        public void f(int i2) {
        }
    }

    public c(Context context, C0073c c0073c) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f3343a = context;
        this.f3344b = c0073c == null ? new C0073c(new ComponentName(context, getClass())) : c0073c;
    }

    public void l() {
        this.f3350h = false;
        a aVar = this.f3346d;
        if (aVar != null) {
            aVar.a(this, this.f3349g);
        }
    }

    public void m() {
        this.f3348f = false;
        u(this.f3347e);
    }

    public final Context n() {
        return this.f3343a;
    }

    public final a.t.l.d o() {
        return this.f3349g;
    }

    public final a.t.l.b p() {
        return this.f3347e;
    }

    public final Handler q() {
        return this.f3345c;
    }

    public final C0073c r() {
        return this.f3344b;
    }

    public d s(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public d t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return s(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public void u(a.t.l.b bVar) {
    }

    public final void v(a aVar) {
        g.c();
        this.f3346d = aVar;
    }

    public final void w(a.t.l.d dVar) {
        g.c();
        if (this.f3349g != dVar) {
            this.f3349g = dVar;
            if (this.f3350h) {
                return;
            }
            this.f3350h = true;
            this.f3345c.sendEmptyMessage(1);
        }
    }

    public final void x(a.t.l.b bVar) {
        g.c();
        if (a.i.q.d.a(this.f3347e, bVar)) {
            return;
        }
        this.f3347e = bVar;
        if (this.f3348f) {
            return;
        }
        this.f3348f = true;
        this.f3345c.sendEmptyMessage(2);
    }
}
