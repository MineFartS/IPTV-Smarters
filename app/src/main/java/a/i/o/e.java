package a.i.o;

import a.f.i;
import a.i.o.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.f.g<String, Typeface> f1878a = new a.f.g<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f1879b = g.a("fonts-androidx", 10, Constants.MAXIMUM_UPLOAD_PARTS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1880c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i<String, ArrayList<a.i.q.a<C0035e>>> f1881d = new i<>();

    public class a implements Callable<C0035e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f1883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.i.o.d f1884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1885d;

        public a(String str, Context context, a.i.o.d dVar, int i2) {
            this.f1882a = str;
            this.f1883b = context;
            this.f1884c = dVar;
            this.f1885d = i2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0035e call() {
            return e.c(this.f1882a, this.f1883b, this.f1884c, this.f1885d);
        }
    }

    public class b implements a.i.q.a<C0035e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.i.o.a f1886a;

        public b(a.i.o.a aVar) {
            this.f1886a = aVar;
        }

        @Override // a.i.q.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C0035e c0035e) {
            this.f1886a.b(c0035e);
        }
    }

    public class c implements Callable<C0035e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f1888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.i.o.d f1889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1890d;

        public c(String str, Context context, a.i.o.d dVar, int i2) {
            this.f1887a = str;
            this.f1888b = context;
            this.f1889c = dVar;
            this.f1890d = i2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0035e call() {
            return e.c(this.f1887a, this.f1888b, this.f1889c, this.f1890d);
        }
    }

    public class d implements a.i.q.a<C0035e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1891a;

        public d(String str) {
            this.f1891a = str;
        }

        @Override // a.i.q.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(C0035e c0035e) {
            synchronized (e.f1880c) {
                i<String, ArrayList<a.i.q.a<C0035e>>> iVar = e.f1881d;
                ArrayList<a.i.q.a<C0035e>> arrayList = iVar.get(this.f1891a);
                if (arrayList == null) {
                    return;
                }
                iVar.remove(this.f1891a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).accept(c0035e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.i.o.e$e, reason: collision with other inner class name */
    public static final class C0035e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f1892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1893b;

        public C0035e(int i2) {
            this.f1892a = null;
            this.f1893b = i2;
        }

        @SuppressLint({"WrongConstant"})
        public C0035e(Typeface typeface) {
            this.f1892a = typeface;
            this.f1893b = 0;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f1893b == 0;
        }
    }

    public static String a(a.i.o.d dVar, int i2) {
        return dVar.d() + "-" + i2;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(f.a aVar) {
        int i2 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i2 = 0;
            for (f.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i2;
    }

    public static C0035e c(String str, Context context, a.i.o.d dVar, int i2) {
        a.f.g<String, Typeface> gVar = f1878a;
        Typeface typefaceD = gVar.d(str);
        if (typefaceD != null) {
            return new C0035e(typefaceD);
        }
        try {
            f.a aVarD = a.i.o.c.d(context, dVar, null);
            int iB = b(aVarD);
            if (iB != 0) {
                return new C0035e(iB);
            }
            Typeface typefaceB = a.i.j.d.b(context, null, aVarD.b(), i2);
            if (typefaceB == null) {
                return new C0035e(-3);
            }
            gVar.f(str, typefaceB);
            return new C0035e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0035e(-1);
        }
    }

    public static Typeface d(Context context, a.i.o.d dVar, int i2, Executor executor, a.i.o.a aVar) {
        String strA = a(dVar, i2);
        Typeface typefaceD = f1878a.d(strA);
        if (typefaceD != null) {
            aVar.b(new C0035e(typefaceD));
            return typefaceD;
        }
        b bVar = new b(aVar);
        synchronized (f1880c) {
            i<String, ArrayList<a.i.q.a<C0035e>>> iVar = f1881d;
            ArrayList<a.i.q.a<C0035e>> arrayList = iVar.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<a.i.q.a<C0035e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            iVar.put(strA, arrayList2);
            c cVar = new c(strA, context, dVar, i2);
            if (executor == null) {
                executor = f1879b;
            }
            g.b(executor, cVar, new d(strA));
            return null;
        }
    }

    public static Typeface e(Context context, a.i.o.d dVar, a.i.o.a aVar, int i2, int i3) {
        String strA = a(dVar, i2);
        Typeface typefaceD = f1878a.d(strA);
        if (typefaceD != null) {
            aVar.b(new C0035e(typefaceD));
            return typefaceD;
        }
        if (i3 == -1) {
            C0035e c0035eC = c(strA, context, dVar, i2);
            aVar.b(c0035eC);
            return c0035eC.f1892a;
        }
        try {
            C0035e c0035e = (C0035e) g.c(f1879b, new a(strA, context, dVar, i2), i3);
            aVar.b(c0035e);
            return c0035e.f1892a;
        } catch (InterruptedException unused) {
            aVar.b(new C0035e(-3));
            return null;
        }
    }
}
