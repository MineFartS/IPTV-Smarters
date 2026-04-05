package a.q.a;

import a.f.j;
import a.p.k;
import a.p.p;
import a.p.q;
import a.p.v;
import a.p.w;
import a.p.x;
import a.q.a.a;
import a.q.b.c;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public class b extends a.q.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3034a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f3035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f3036c;

    public static class a<D> extends p<D> implements c.InterfaceC0065c<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f3037l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Bundle f3038m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final a.q.b.c<D> f3039n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public k f3040o;
        public C0063b<D> p;
        public a.q.b.c<D> q;

        public a(int i2, Bundle bundle, a.q.b.c<D> cVar, a.q.b.c<D> cVar2) {
            this.f3037l = i2;
            this.f3038m = bundle;
            this.f3039n = cVar;
            this.q = cVar2;
            cVar.t(i2, this);
        }

        @Override // a.q.b.c.InterfaceC0065c
        public void a(a.q.b.c<D> cVar, D d2) {
            if (b.f3034a) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(d2);
                return;
            }
            if (b.f3034a) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(d2);
        }

        @Override // androidx.lifecycle.LiveData
        public void j() {
            if (b.f3034a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f3039n.w();
        }

        @Override // androidx.lifecycle.LiveData
        public void k() {
            if (b.f3034a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f3039n.x();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void m(q<? super D> qVar) {
            super.m(qVar);
            this.f3040o = null;
            this.p = null;
        }

        @Override // a.p.p, androidx.lifecycle.LiveData
        public void n(D d2) {
            super.n(d2);
            a.q.b.c<D> cVar = this.q;
            if (cVar != null) {
                cVar.u();
                this.q = null;
            }
        }

        public a.q.b.c<D> o(boolean z) {
            if (b.f3034a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f3039n.b();
            this.f3039n.a();
            C0063b<D> c0063b = this.p;
            if (c0063b != null) {
                m(c0063b);
                if (z) {
                    c0063b.d();
                }
            }
            this.f3039n.z(this);
            if ((c0063b == null || c0063b.c()) && !z) {
                return this.f3039n;
            }
            this.f3039n.u();
            return this.q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3037l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3038m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3039n);
            this.f3039n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.p);
                this.p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        public a.q.b.c<D> q() {
            return this.f3039n;
        }

        public void r() {
            k kVar = this.f3040o;
            C0063b<D> c0063b = this.p;
            if (kVar == null || c0063b == null) {
                return;
            }
            super.m(c0063b);
            h(kVar, c0063b);
        }

        public a.q.b.c<D> s(k kVar, a.InterfaceC0062a<D> interfaceC0062a) {
            C0063b<D> c0063b = new C0063b<>(this.f3039n, interfaceC0062a);
            h(kVar, c0063b);
            C0063b<D> c0063b2 = this.p;
            if (c0063b2 != null) {
                m(c0063b2);
            }
            this.f3040o = kVar;
            this.p = c0063b;
            return this.f3039n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3037l);
            sb.append(" : ");
            a.i.q.b.a(this.f3039n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a.q.a.b$b, reason: collision with other inner class name */
    public static class C0063b<D> implements q<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.q.b.c<D> f3041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.InterfaceC0062a<D> f3042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3043c = false;

        public C0063b(a.q.b.c<D> cVar, a.InterfaceC0062a<D> interfaceC0062a) {
            this.f3041a = cVar;
            this.f3042b = interfaceC0062a;
        }

        @Override // a.p.q
        public void a(D d2) {
            if (b.f3034a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f3041a + ": " + this.f3041a.d(d2));
            }
            this.f3042b.a(this.f3041a, d2);
            this.f3043c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f3043c);
        }

        public boolean c() {
            return this.f3043c;
        }

        public void d() {
            if (this.f3043c) {
                if (b.f3034a) {
                    Log.v("LoaderManager", "  Resetting: " + this.f3041a);
                }
                this.f3042b.c(this.f3041a);
            }
        }

        public String toString() {
            return this.f3042b.toString();
        }
    }

    public static class c extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w.b f3044c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j<a> f3045d = new j<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3046e = false;

        public static class a implements w.b {
            @Override // a.p.w.b
            public <T extends v> T a(Class<T> cls) {
                return new c();
            }
        }

        public static c h(x xVar) {
            return (c) new w(xVar, f3044c).a(c.class);
        }

        @Override // a.p.v
        public void d() {
            super.d();
            int iM = this.f3045d.m();
            for (int i2 = 0; i2 < iM; i2++) {
                this.f3045d.n(i2).o(true);
            }
            this.f3045d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3045d.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f3045d.m(); i2++) {
                    a aVarN = this.f3045d.n(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3045d.j(i2));
                    printWriter.print(": ");
                    printWriter.println(aVarN.toString());
                    aVarN.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void g() {
            this.f3046e = false;
        }

        public <D> a<D> i(int i2) {
            return this.f3045d.f(i2);
        }

        public boolean j() {
            return this.f3046e;
        }

        public void k() {
            int iM = this.f3045d.m();
            for (int i2 = 0; i2 < iM; i2++) {
                this.f3045d.n(i2).r();
            }
        }

        public void l(int i2, a aVar) {
            this.f3045d.k(i2, aVar);
        }

        public void m() {
            this.f3046e = true;
        }
    }

    public b(k kVar, x xVar) {
        this.f3035b = kVar;
        this.f3036c = c.h(xVar);
    }

    @Override // a.q.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3036c.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // a.q.a.a
    public <D> a.q.b.c<D> c(int i2, Bundle bundle, a.InterfaceC0062a<D> interfaceC0062a) {
        if (this.f3036c.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarI = this.f3036c.i(i2);
        if (f3034a) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarI == null) {
            return e(i2, bundle, interfaceC0062a, null);
        }
        if (f3034a) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarI);
        }
        return aVarI.s(this.f3035b, interfaceC0062a);
    }

    @Override // a.q.a.a
    public void d() {
        this.f3036c.k();
    }

    public final <D> a.q.b.c<D> e(int i2, Bundle bundle, a.InterfaceC0062a<D> interfaceC0062a, a.q.b.c<D> cVar) {
        try {
            this.f3036c.m();
            a.q.b.c<D> cVarB = interfaceC0062a.b(i2, bundle);
            if (cVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarB.getClass().isMemberClass() && !Modifier.isStatic(cVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarB);
            }
            a aVar = new a(i2, bundle, cVarB, cVar);
            if (f3034a) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f3036c.l(i2, aVar);
            this.f3036c.g();
            return aVar.s(this.f3035b, interfaceC0062a);
        } catch (Throwable th) {
            this.f3036c.g();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.i.q.b.a(this.f3035b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
