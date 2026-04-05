package a.i.j;

import a.i.i.e.c;
import a.i.o.f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f1813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor<?> f1814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f1815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f1816e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f1814c = constructor;
        f1813b = cls;
        f1815d = method2;
        f1816e = method;
    }

    public static boolean k(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f1815d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface l(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(f1813b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1816e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        Method method = f1815d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    public static Object n() {
        try {
            return f1814c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.i.j.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        for (c.C0031c c0031c : bVar.a()) {
            ByteBuffer byteBufferB = k.b(context, resources, c0031c.b());
            if (byteBufferB == null || !k(objN, byteBufferB, c0031c.c(), c0031c.e(), c0031c.f())) {
                return null;
            }
        }
        return l(objN);
    }

    @Override // a.i.j.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        a.f.i iVar = new a.f.i();
        for (f.b bVar : bVarArr) {
            Uri uriD = bVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) iVar.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = k.f(context, cancellationSignal, uriD);
                iVar.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !k(objN, byteBufferF, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface typefaceL = l(objN);
        if (typefaceL == null) {
            return null;
        }
        return Typeface.create(typefaceL, i2);
    }
}
