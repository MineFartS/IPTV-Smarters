package a.t.l;

import a.t.l.a;
import a.t.l.c;
import a.t.l.d;
import a.t.l.g;
import a.t.l.i;
import a.t.l.j;
import a.t.l.k;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends a.t.l.c {

    public static class a extends d {
        public a(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // a.t.l.o.d, a.t.l.o.c, a.t.l.o.b
        public void N(b.C0079b c0079b, a.C0072a c0072a) {
            super.N(c0079b, c0072a);
            c0072a.f(h.a(c0079b.f3488a));
        }
    }

    public static class b extends o implements i.a, i.g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final ArrayList<IntentFilter> f3480i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final ArrayList<IntentFilter> f3481j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final f f3482k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f3483l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f3484m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f3485n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Object f3486o;
        public int p;
        public boolean q;
        public boolean r;
        public final ArrayList<C0079b> s;
        public final ArrayList<c> t;
        public i.e u;
        public i.c v;

        public static final class a extends c.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f3487a;

            public a(Object obj) {
                this.f3487a = obj;
            }

            @Override // a.t.l.c.d
            public void c(int i2) {
                i.d.i(this.f3487a, i2);
            }

            @Override // a.t.l.c.d
            public void f(int i2) {
                i.d.j(this.f3487a, i2);
            }
        }

        /* JADX INFO: renamed from: a.t.l.o$b$b, reason: collision with other inner class name */
        public static final class C0079b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f3488a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f3489b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a.t.l.a f3490c;

            public C0079b(Object obj, String str) {
                this.f3488a = obj;
                this.f3489b = str;
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g.C0076g f3491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f3492b;

            public c(g.C0076g c0076g, Object obj) {
                this.f3491a = c0076g;
                this.f3492b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            f3480i = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            f3481j = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, f fVar) {
            super(context);
            this.s = new ArrayList<>();
            this.t = new ArrayList<>();
            this.f3482k = fVar;
            Object objG = i.g(context);
            this.f3483l = objG;
            this.f3484m = F();
            this.f3485n = G();
            this.f3486o = i.d(objG, context.getResources().getString(a.t.h.s), false);
            S();
        }

        @Override // a.t.l.o
        public void A(g.C0076g c0076g) {
            int iJ;
            if (c0076g.n() == this || (iJ = J(c0076g)) < 0) {
                return;
            }
            T(this.t.get(iJ));
        }

        @Override // a.t.l.o
        public void B(g.C0076g c0076g) {
            int iJ;
            if (c0076g.n() == this || (iJ = J(c0076g)) < 0) {
                return;
            }
            c cVarRemove = this.t.remove(iJ);
            i.d.k(cVarRemove.f3492b, null);
            i.f.f(cVarRemove.f3492b, null);
            i.k(this.f3483l, cVarRemove.f3492b);
        }

        @Override // a.t.l.o
        public void C(g.C0076g c0076g) {
            Object obj;
            if (c0076g.w()) {
                if (c0076g.n() != this) {
                    int iJ = J(c0076g);
                    if (iJ < 0) {
                        return;
                    } else {
                        obj = this.t.get(iJ).f3492b;
                    }
                } else {
                    int I = I(c0076g.d());
                    if (I < 0) {
                        return;
                    } else {
                        obj = this.s.get(I).f3488a;
                    }
                }
                P(obj);
            }
        }

        public final boolean D(Object obj) {
            if (M(obj) != null || H(obj) >= 0) {
                return false;
            }
            C0079b c0079b = new C0079b(obj, E(obj));
            R(c0079b);
            this.s.add(c0079b);
            return true;
        }

        public final String E(Object obj) {
            String str = K() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(L(obj).hashCode()));
            if (I(str) < 0) {
                return str;
            }
            int i2 = 2;
            while (true) {
                String str2 = String.format(Locale.US, "%s_%d", str, Integer.valueOf(i2));
                if (I(str2) < 0) {
                    return str2;
                }
                i2++;
            }
        }

        public Object F() {
            return i.c(this);
        }

        public Object G() {
            return i.f(this);
        }

        public int H(Object obj) {
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.s.get(i2).f3488a == obj) {
                    return i2;
                }
            }
            return -1;
        }

        public int I(String str) {
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.s.get(i2).f3489b.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        public int J(g.C0076g c0076g) {
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.t.get(i2).f3491a == c0076g) {
                    return i2;
                }
            }
            return -1;
        }

        public Object K() {
            if (this.v == null) {
                this.v = new i.c();
            }
            return this.v.a(this.f3483l);
        }

        public String L(Object obj) {
            CharSequence charSequenceA = i.d.a(obj, n());
            return charSequenceA != null ? charSequenceA.toString() : BuildConfig.FLAVOR;
        }

        public c M(Object obj) {
            Object objE = i.d.e(obj);
            if (objE instanceof c) {
                return (c) objE;
            }
            return null;
        }

        public void N(C0079b c0079b, a.C0072a c0072a) {
            int iD = i.d.d(c0079b.f3488a);
            if ((iD & 1) != 0) {
                c0072a.b(f3480i);
            }
            if ((iD & 2) != 0) {
                c0072a.b(f3481j);
            }
            c0072a.k(i.d.c(c0079b.f3488a));
            c0072a.j(i.d.b(c0079b.f3488a));
            c0072a.m(i.d.f(c0079b.f3488a));
            c0072a.o(i.d.h(c0079b.f3488a));
            c0072a.n(i.d.g(c0079b.f3488a));
        }

        public void O() {
            d.a aVar = new d.a();
            int size = this.s.size();
            for (int i2 = 0; i2 < size; i2++) {
                aVar.a(this.s.get(i2).f3490c);
            }
            w(aVar.b());
        }

        public void P(Object obj) {
            if (this.u == null) {
                this.u = new i.e();
            }
            this.u.a(this.f3483l, 8388611, obj);
        }

        public void Q() {
            if (this.r) {
                this.r = false;
                i.j(this.f3483l, this.f3484m);
            }
            int i2 = this.p;
            if (i2 != 0) {
                this.r = true;
                i.a(this.f3483l, i2, this.f3484m);
            }
        }

        public void R(C0079b c0079b) {
            a.C0072a c0072a = new a.C0072a(c0079b.f3489b, L(c0079b.f3488a));
            N(c0079b, c0072a);
            c0079b.f3490c = c0072a.c();
        }

        public final void S() {
            Q();
            Iterator it = i.h(this.f3483l).iterator();
            boolean zD = false;
            while (it.hasNext()) {
                zD |= D(it.next());
            }
            if (zD) {
                O();
            }
        }

        public void T(c cVar) {
            i.f.a(cVar.f3492b, cVar.f3491a.i());
            i.f.c(cVar.f3492b, cVar.f3491a.k());
            i.f.b(cVar.f3492b, cVar.f3491a.j());
            i.f.e(cVar.f3492b, cVar.f3491a.o());
            i.f.h(cVar.f3492b, cVar.f3491a.q());
            i.f.g(cVar.f3492b, cVar.f3491a.p());
        }

        @Override // a.t.l.i.a
        public void a(Object obj) {
            int iH;
            if (M(obj) != null || (iH = H(obj)) < 0) {
                return;
            }
            R(this.s.get(iH));
            O();
        }

        @Override // a.t.l.i.a
        public void b(int i2, Object obj) {
        }

        @Override // a.t.l.i.g
        public void c(Object obj, int i2) {
            c cVarM = M(obj);
            if (cVarM != null) {
                cVarM.f3491a.B(i2);
            }
        }

        @Override // a.t.l.i.a
        public void d(Object obj) {
            int iH;
            if (M(obj) != null || (iH = H(obj)) < 0) {
                return;
            }
            this.s.remove(iH);
            O();
        }

        @Override // a.t.l.i.a
        public void e(int i2, Object obj) {
            if (obj != i.i(this.f3483l, 8388611)) {
                return;
            }
            c cVarM = M(obj);
            if (cVarM != null) {
                cVarM.f3491a.C();
                return;
            }
            int iH = H(obj);
            if (iH >= 0) {
                this.f3482k.a(this.s.get(iH).f3489b);
            }
        }

        @Override // a.t.l.i.a
        public void g(Object obj, Object obj2) {
        }

        @Override // a.t.l.i.a
        public void h(Object obj, Object obj2, int i2) {
        }

        @Override // a.t.l.i.a
        public void i(Object obj) {
            if (D(obj)) {
                O();
            }
        }

        @Override // a.t.l.i.g
        public void j(Object obj, int i2) {
            c cVarM = M(obj);
            if (cVarM != null) {
                cVarM.f3491a.A(i2);
            }
        }

        @Override // a.t.l.i.a
        public void k(Object obj) {
            int iH;
            if (M(obj) != null || (iH = H(obj)) < 0) {
                return;
            }
            C0079b c0079b = this.s.get(iH);
            int iF = i.d.f(obj);
            if (iF != c0079b.f3490c.t()) {
                c0079b.f3490c = new a.C0072a(c0079b.f3490c).m(iF).c();
                O();
            }
        }

        @Override // a.t.l.c
        public c.d s(String str) {
            int I = I(str);
            if (I >= 0) {
                return new a(this.s.get(I).f3488a);
            }
            return null;
        }

        @Override // a.t.l.c
        public void u(a.t.l.b bVar) {
            boolean zD;
            int i2 = 0;
            if (bVar != null) {
                List<String> listE = bVar.c().e();
                int size = listE.size();
                int i3 = 0;
                while (i2 < size) {
                    String str = listE.get(i2);
                    i3 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i3 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i3 | 2 : i3 | 8388608;
                    i2++;
                }
                zD = bVar.d();
                i2 = i3;
            } else {
                zD = false;
            }
            if (this.p == i2 && this.q == zD) {
                return;
            }
            this.p = i2;
            this.q = zD;
            S();
        }

        @Override // a.t.l.o
        public void z(g.C0076g c0076g) {
            if (c0076g.n() == this) {
                int iH = H(i.i(this.f3483l, 8388611));
                if (iH < 0 || !this.s.get(iH).f3489b.equals(c0076g.d())) {
                    return;
                }
                c0076g.C();
                return;
            }
            Object objE = i.e(this.f3483l, this.f3486o);
            c cVar = new c(c0076g, objE);
            i.d.k(objE, cVar);
            i.f.f(objE, this.f3485n);
            T(cVar);
            this.t.add(cVar);
            i.b(this.f3483l, objE);
        }
    }

    public static class c extends b implements j.b {
        public j.a w;
        public j.d x;

        public c(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // a.t.l.o.b
        public Object F() {
            return j.a(this);
        }

        @Override // a.t.l.o.b
        public void N(b.C0079b c0079b, a.C0072a c0072a) {
            super.N(c0079b, c0072a);
            if (!j.e.b(c0079b.f3488a)) {
                c0072a.g(false);
            }
            if (U(c0079b)) {
                c0072a.d(true);
            }
            Display displayA = j.e.a(c0079b.f3488a);
            if (displayA != null) {
                c0072a.l(displayA.getDisplayId());
            }
        }

        @Override // a.t.l.o.b
        public void Q() {
            super.Q();
            if (this.w == null) {
                this.w = new j.a(n(), q());
            }
            this.w.a(this.q ? this.p : 0);
        }

        public boolean U(b.C0079b c0079b) {
            if (this.x == null) {
                this.x = new j.d();
            }
            return this.x.a(c0079b.f3488a);
        }

        @Override // a.t.l.j.b
        public void f(Object obj) {
            int iH = H(obj);
            if (iH >= 0) {
                b.C0079b c0079b = this.s.get(iH);
                Display displayA = j.e.a(obj);
                int displayId = displayA != null ? displayA.getDisplayId() : -1;
                if (displayId != c0079b.f3490c.r()) {
                    c0079b.f3490c = new a.C0072a(c0079b.f3490c).l(displayId).c();
                    O();
                }
            }
        }
    }

    public static class d extends c {
        public d(Context context, f fVar) {
            super(context, fVar);
        }

        @Override // a.t.l.o.b
        public Object K() {
            return k.b(this.f3483l);
        }

        @Override // a.t.l.o.c, a.t.l.o.b
        public void N(b.C0079b c0079b, a.C0072a c0072a) {
            super.N(c0079b, c0072a);
            CharSequence charSequenceA = k.a.a(c0079b.f3488a);
            if (charSequenceA != null) {
                c0072a.e(charSequenceA.toString());
            }
        }

        @Override // a.t.l.o.b
        public void P(Object obj) {
            i.l(this.f3483l, 8388611, obj);
        }

        @Override // a.t.l.o.c, a.t.l.o.b
        public void Q() {
            if (this.r) {
                i.j(this.f3483l, this.f3484m);
            }
            this.r = true;
            k.a(this.f3483l, this.p, this.f3484m, (this.q ? 1 : 0) | 2);
        }

        @Override // a.t.l.o.b
        public void T(b.c cVar) {
            super.T(cVar);
            k.b.a(cVar.f3492b, cVar.f3491a.c());
        }

        @Override // a.t.l.o.c
        public boolean U(b.C0079b c0079b) {
            return k.a.b(c0079b.f3488a);
        }
    }

    public static class e extends o {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final ArrayList<IntentFilter> f3493i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AudioManager f3494j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final b f3495k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f3496l;

        public final class a extends c.d {
            public a() {
            }

            @Override // a.t.l.c.d
            public void c(int i2) {
                e.this.f3494j.setStreamVolume(3, i2, 0);
                e.this.D();
            }

            @Override // a.t.l.c.d
            public void f(int i2) {
                int streamVolume = e.this.f3494j.getStreamVolume(3);
                if (Math.min(e.this.f3494j.getStreamMaxVolume(3), Math.max(0, i2 + streamVolume)) != streamVolume) {
                    e.this.f3494j.setStreamVolume(3, streamVolume, 0);
                }
                e.this.D();
            }
        }

        public final class b extends BroadcastReceiver {
            public b() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra;
                if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1)) >= 0) {
                    e eVar = e.this;
                    if (intExtra != eVar.f3496l) {
                        eVar.D();
                    }
                }
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            f3493i = arrayList;
            arrayList.add(intentFilter);
        }

        public e(Context context) {
            super(context);
            this.f3496l = -1;
            this.f3494j = (AudioManager) context.getSystemService("audio");
            b bVar = new b();
            this.f3495k = bVar;
            context.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            D();
        }

        public void D() {
            Resources resources = n().getResources();
            int streamMaxVolume = this.f3494j.getStreamMaxVolume(3);
            this.f3496l = this.f3494j.getStreamVolume(3);
            w(new d.a().a(new a.C0072a("DEFAULT_ROUTE", resources.getString(a.t.h.r)).b(f3493i).j(3).k(0).n(1).o(streamMaxVolume).m(this.f3496l).c()).b());
        }

        @Override // a.t.l.c
        public c.d s(String str) {
            if (str.equals("DEFAULT_ROUTE")) {
                return new a();
            }
            return null;
        }
    }

    public interface f {
        void a(String str);
    }

    public o(Context context) {
        super(context, new c.C0073c(new ComponentName("android", o.class.getName())));
    }

    public static o y(Context context, f fVar) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 24 ? new a(context, fVar) : i2 >= 18 ? new d(context, fVar) : i2 >= 17 ? new c(context, fVar) : i2 >= 16 ? new b(context, fVar) : new e(context);
    }

    public void A(g.C0076g c0076g) {
    }

    public void B(g.C0076g c0076g) {
    }

    public void C(g.C0076g c0076g) {
    }

    public void z(g.C0076g c0076g) {
    }
}
