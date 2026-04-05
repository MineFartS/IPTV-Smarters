package c.f.a.c.d;

import android.content.Context;
import android.os.Bundle;
import c.f.a.c.f.o.a;
import com.google.android.gms.cast.CastDevice;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.AbstractC0156a<c.f.a.c.d.v.f0, c> f11603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.c.f.o.a<c> f11604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11605c;

    public interface a extends c.f.a.c.f.o.j {
        boolean d();

        String f();

        String getSessionId();

        c.f.a.c.d.d t();
    }

    @Deprecated
    public interface b {

        public static final class a implements b {
        }
    }

    public static final class c implements a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CastDevice f11606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f11607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f11608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f11610e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public CastDevice f11611a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public d f11612b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f11613c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Bundle f11614d;

            public a(CastDevice castDevice, d dVar) {
                c.f.a.c.f.q.o.j(castDevice, "CastDevice parameter cannot be null");
                c.f.a.c.f.q.o.j(dVar, "CastListener parameter cannot be null");
                this.f11611a = castDevice;
                this.f11612b = dVar;
                this.f11613c = 0;
            }

            public final c a() {
                return new c(this, null);
            }

            public final a c(Bundle bundle) {
                this.f11614d = bundle;
                return this;
            }
        }

        public c(a aVar) {
            this.f11606a = aVar.f11611a;
            this.f11607b = aVar.f11612b;
            this.f11609d = aVar.f11613c;
            this.f11608c = aVar.f11614d;
            this.f11610e = UUID.randomUUID().toString();
        }

        public /* synthetic */ c(a aVar, x1 x1Var) {
            this(aVar);
        }

        public final boolean equals(Object obj) {
            boolean z;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (c.f.a.c.f.q.n.a(this.f11606a, cVar.f11606a)) {
                Bundle bundle = this.f11608c;
                Bundle bundle2 = cVar.f11608c;
                if (bundle != null && bundle2 != null) {
                    if (bundle.size() == bundle2.size()) {
                        Set<String> setKeySet = bundle.keySet();
                        if (setKeySet.containsAll(bundle2.keySet())) {
                            for (String str : setKeySet) {
                                if (!c.f.a.c.f.q.n.a(bundle.get(str), bundle2.get(str))) {
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                    break;
                }
                if (bundle != bundle2) {
                    z = false;
                    break;
                }
                z = true;
                if (z && this.f11609d == cVar.f11609d && c.f.a.c.f.q.n.a(this.f11610e, cVar.f11610e)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return c.f.a.c.f.q.n.b(this.f11606a, this.f11608c, Integer.valueOf(this.f11609d), this.f11610e);
        }
    }

    public static class d {
        public void a(int i2) {
        }

        public void b(int i2) {
        }

        public void c(c.f.a.c.d.d dVar) {
        }

        public void d() {
        }

        public void e(int i2) {
        }

        public void f() {
        }
    }

    /* JADX INFO: renamed from: c.f.a.c.d.e$e, reason: collision with other inner class name */
    public interface InterfaceC0151e {
        void a(CastDevice castDevice, String str, String str2);
    }

    static {
        x1 x1Var = new x1();
        f11603a = x1Var;
        f11604b = new c.f.a.c.f.o.a<>("Cast.API", x1Var, c.f.a.c.d.v.m.f12167a);
        f11605c = new b.a();
    }

    public static y1 a(Context context, c cVar) {
        return new d0(context, cVar);
    }
}
