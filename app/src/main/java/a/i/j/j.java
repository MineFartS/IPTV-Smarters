package a.i.j;

import a.i.i.e.c;
import a.i.o.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, c.b> f1824a = new ConcurrentHashMap<>();

    public class a implements c<f.b> {
        public a() {
        }

        @Override // a.i.j.j.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(f.b bVar) {
            return bVar.e();
        }

        @Override // a.i.j.j.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(f.b bVar) {
            return bVar.f();
        }
    }

    public class b implements c<c.C0031c> {
        public b() {
        }

        @Override // a.i.j.j.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(c.C0031c c0031c) {
            return c0031c.e();
        }

        @Override // a.i.j.j.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(c.C0031c c0031c) {
            return c0031c.f();
        }
    }

    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T g(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(cVar.a(t2) - i3) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > iAbs) {
                t = t2;
                i4 = iAbs;
            }
        }
        return t;
    }

    public static long j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    public final void a(Typeface typeface, c.b bVar) {
        long j2 = j(typeface);
        if (j2 != 0) {
            this.f1824a.put(Long.valueOf(j2), bVar);
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        c.C0031c c0031cF = f(bVar, i2);
        if (c0031cF == null) {
            return null;
        }
        Typeface typefaceD = d.d(context, resources, c0031cF.b(), c0031cF.a(), i2);
        a(typefaceD, bVar);
        return typefaceD;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(h(bVarArr, i2).d());
            try {
                Typeface typefaceD = d(context, inputStreamOpenInputStream);
                k.a(inputStreamOpenInputStream);
                return typefaceD;
            } catch (IOException unused) {
                k.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                k.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.c(fileE, resources, i2)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public final c.C0031c f(c.b bVar, int i2) {
        return (c.C0031c) g(bVar.a(), i2, new b());
    }

    public f.b h(f.b[] bVarArr, int i2) {
        return (f.b) g(bVarArr, i2, new a());
    }

    public c.b i(Typeface typeface) {
        long j2 = j(typeface);
        if (j2 == 0) {
            return null;
        }
        return this.f1824a.get(Long.valueOf(j2));
    }
}
