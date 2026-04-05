package c.k.b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StringBuilder f18698a = new StringBuilder();

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    @TargetApi(11)
    public static class b {
        public static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    @TargetApi(12)
    public static class c {
        public static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    public static class d {
        public static j a(Context context) {
            return new s(context);
        }
    }

    public static class e extends Thread {
        public e(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class f implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }
    }

    public static long a(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), 5242880L);
    }

    public static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) p(context, "activity");
        boolean z = (context.getApplicationInfo().flags & Constants.MB) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z && Build.VERSION.SDK_INT >= 11) {
            memoryClass = b.a(activityManager);
        }
        return (memoryClass * Constants.MB) / 7;
    }

    public static void c() {
        if (!s()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static <T> T d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void e(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static j g(Context context) {
        try {
            Class.forName("c.k.a.q");
            return d.a(context);
        } catch (ClassNotFoundException unused) {
            return new f0(context);
        }
    }

    public static String h(w wVar) {
        StringBuilder sb = f18698a;
        String strI = i(wVar, sb);
        sb.setLength(0);
        return strI;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String i(c.k.b.w r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f18789g
            r1 = 50
            if (r0 == 0) goto L14
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f18789g
        L10:
            r5.append(r0)
            goto L2d
        L14:
            android.net.Uri r0 = r4.f18787e
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L10
        L25:
            r5.ensureCapacity(r1)
            int r0 = r4.f18788f
            r5.append(r0)
        L2d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.f18796n
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L5e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.f18796n
            r5.append(r1)
            boolean r1 = r4.q
            if (r1 == 0) goto L5b
            r1 = 64
            r5.append(r1)
            float r1 = r4.f18797o
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.p
            r5.append(r1)
        L5b:
            r5.append(r0)
        L5e:
            boolean r1 = r4.c()
            if (r1 == 0) goto L79
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.f18791i
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.f18792j
            r5.append(r1)
            r5.append(r0)
        L79:
            boolean r1 = r4.f18793k
            if (r1 == 0) goto L86
            java.lang.String r1 = "centerCrop"
        L7f:
            r5.append(r1)
            r5.append(r0)
            goto L8d
        L86:
            boolean r1 = r4.f18794l
            if (r1 == 0) goto L8d
            java.lang.String r1 = "centerInside"
            goto L7f
        L8d:
            java.util.List<c.k.b.e0> r1 = r4.f18790h
            if (r1 == 0) goto Lad
            r2 = 0
            int r1 = r1.size()
        L96:
            if (r2 >= r1) goto Lad
            java.util.List<c.k.b.e0> r3 = r4.f18790h
            java.lang.Object r3 = r3.get(r2)
            c.k.b.e0 r3 = (c.k.b.e0) r3
            java.lang.String r3 = r3.key()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L96
        Lad:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.k.b.g0.i(c.k.b.w, java.lang.StringBuilder):java.lang.String");
    }

    public static void j(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    public static int k(Bitmap bitmap) {
        int iA = Build.VERSION.SDK_INT >= 12 ? c.a(bitmap) : bitmap.getRowBytes() * bitmap.getHeight();
        if (iA >= 0) {
            return iA;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String l(c.k.b.c cVar) {
        return m(cVar, BuildConfig.FLAVOR);
    }

    public static String m(c.k.b.c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        c.k.b.a aVarH = cVar.h();
        if (aVarH != null) {
            sb.append(aVarH.f18626b.d());
        }
        List<c.k.b.a> listI = cVar.i();
        if (listI != null) {
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || aVarH != null) {
                    sb.append(", ");
                }
                sb.append(listI.get(i2).f18626b.d());
            }
        }
        return sb.toString();
    }

    public static int n(Resources resources, w wVar) throws FileNotFoundException {
        Uri uri;
        int i2 = wVar.f18788f;
        if (i2 != 0 || (uri = wVar.f18787e) == null) {
            return i2;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + wVar.f18787e);
        }
        List<String> pathSegments = wVar.f18787e.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + wVar.f18787e);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f18787e);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + wVar.f18787e);
    }

    public static Resources o(Context context, w wVar) throws FileNotFoundException {
        Uri uri;
        if (wVar.f18788f != 0 || (uri = wVar.f18787e) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + wVar.f18787e);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f18787e);
        }
    }

    public static <T> T p(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static boolean q(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean r(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static boolean s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean t(InputStream inputStream) {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    public static void u(String str, String str2, String str3) {
        v(str, str2, str3, BuildConfig.FLAVOR);
    }

    public static void v(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    public static boolean w(String str) {
        if (str == null) {
            return false;
        }
        String[] strArrSplit = str.split(" ", 2);
        if ("CACHE".equals(strArrSplit[0])) {
            return true;
        }
        if (strArrSplit.length == 1) {
            return false;
        }
        try {
            if ("CONDITIONAL_CACHE".equals(strArrSplit[0])) {
                return Integer.parseInt(strArrSplit[1]) == 304;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] x(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (-1 == i2) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }
}
