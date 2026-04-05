package c.f.a.c.d.u;

import android.content.Context;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f11925c = new a();

    public class a extends x {
        public a() {
        }

        @Override // c.f.a.c.d.u.x0
        public final boolean M1() {
            return t.this.d();
        }

        @Override // c.f.a.c.d.u.x0
        public final int c() {
            return 12451009;
        }

        @Override // c.f.a.c.d.u.x0
        public final c.f.a.c.g.a n(String str) {
            q qVarA = t.this.a(str);
            if (qVarA == null) {
                return null;
            }
            return qVarA.m();
        }

        @Override // c.f.a.c.d.u.x0
        public final String t2() {
            return t.this.b();
        }
    }

    public t(Context context, String str) {
        this.f11923a = ((Context) c.f.a.c.f.q.o.i(context)).getApplicationContext();
        this.f11924b = c.f.a.c.f.q.o.e(str);
    }

    public abstract q a(String str);

    public final String b() {
        return this.f11924b;
    }

    public final Context c() {
        return this.f11923a;
    }

    public abstract boolean d();

    public final IBinder e() {
        return this.f11925c;
    }
}
