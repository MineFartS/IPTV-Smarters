package a.i.j;

import a.i.i.e.c;
import a.i.i.e.f;
import a.i.o.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f1805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.f.g<String, Typeface> f1806b;

    public static class a extends f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f.a f1807a;

        public a(f.a aVar) {
            this.f1807a = aVar;
        }

        @Override // a.i.o.f.c
        public void a(int i2) {
            f.a aVar = this.f1807a;
            if (aVar != null) {
                aVar.d(i2);
            }
        }

        @Override // a.i.o.f.c
        public void b(Typeface typeface) {
            f.a aVar = this.f1807a;
            if (aVar != null) {
                aVar.e(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1805a = i2 >= 29 ? new i() : i2 >= 28 ? new h() : i2 >= 26 ? new g() : (i2 < 24 || !f.m()) ? i2 >= 21 ? new e() : new j() : new f();
        f1806b = new a.f.g<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        Typeface typefaceG;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (typefaceG = g(context, typeface, i2)) == null) ? Typeface.create(typeface, i2) : typefaceG;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        return f1805a.c(context, cancellationSignal, bVarArr, i2);
    }

    public static Typeface c(Context context, c.a aVar, Resources resources, int i2, int i3, f.a aVar2, Handler handler, boolean z) {
        Typeface typefaceB;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            Typeface typefaceH = h(dVar.c());
            if (typefaceH != null) {
                if (aVar2 != null) {
                    aVar2.b(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceB = a.i.o.f.a(context, dVar.b(), i3, !z ? aVar2 != null : dVar.a() != 0, z ? dVar.d() : -1, f.a.c(handler), new a(aVar2));
        } else {
            typefaceB = f1805a.b(context, (c.b) aVar, resources, i3);
            if (aVar2 != null) {
                if (typefaceB != null) {
                    aVar2.b(typefaceB, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f1806b.f(e(resources, i2, i3), typefaceB);
        }
        return typefaceB;
    }

    public static Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        Typeface typefaceE = f1805a.e(context, resources, i2, str, i3);
        if (typefaceE != null) {
            f1806b.f(e(resources, i2, i3), typefaceE);
        }
        return typefaceE;
    }

    public static String e(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface f(Resources resources, int i2, int i3) {
        return f1806b.d(e(resources, i2, i3));
    }

    public static Typeface g(Context context, Typeface typeface, int i2) {
        j jVar = f1805a;
        c.b bVarI = jVar.i(typeface);
        if (bVarI == null) {
            return null;
        }
        return jVar.b(context, bVarI, context.getResources(), i2);
    }

    public static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
