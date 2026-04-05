package a.i.j;

import a.i.i.e.c;
import a.i.o.f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?> f1808b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor<?> f1809c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f1810d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f1811e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1812f = false;

    public static boolean k(Object obj, String str, int i2, boolean z) throws NoSuchMethodException {
        n();
        try {
            return ((Boolean) f1810d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Typeface l(Object obj) throws NoSuchMethodException {
        n();
        try {
            Object objNewInstance = Array.newInstance(f1808b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f1811e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void n() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1812f) {
            return;
        }
        f1812f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f1809c = constructor;
        f1808b = cls;
        f1810d = method2;
        f1811e = method;
    }

    public static Object o() throws NoSuchMethodException {
        n();
        try {
            return f1809c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.i.j.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) throws NoSuchMethodException {
        Object objO = o();
        for (c.C0031c c0031c : bVar.a()) {
            File fileE = k.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!k.c(fileE, resources, c0031c.b())) {
                    return null;
                }
                if (!k(objO, fileE.getPath(), c0031c.e(), c0031c.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return l(objO);
    }

    @Override // a.i.j.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        if (bVarArr.length < 1) {
            return null;
        }
        f.b bVarH = h(bVarArr, i2);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarH.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
                return null;
            }
            try {
                File fileM = m(parcelFileDescriptorOpenFileDescriptor);
                if (fileM != null && fileM.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceD = super.d(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceD;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } finally {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable unused2) {
                }
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public final File m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
