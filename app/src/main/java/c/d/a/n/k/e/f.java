package c.d.a.n.k.e;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import c.d.a.n.k.e.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements c.d.a.n.k.e.a<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<l.a> f5715a = EnumSet.of(l.a.JPEG, l.a.PNG_A, l.a.PNG);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f5716b = c.d.a.t.h.c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f5717c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f5718d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f5719e = new c();

    public static class a extends f {
        @Override // c.d.a.n.k.e.a
        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // c.d.a.n.k.e.f
        public int h(int i2, int i3, int i4, int i5) {
            return Math.min(i3 / i5, i2 / i4);
        }
    }

    public static class b extends f {
        @Override // c.d.a.n.k.e.a
        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // c.d.a.n.k.e.f
        public int h(int i2, int i3, int i4, int i5) {
            int iCeil = (int) Math.ceil(Math.max(i3 / i5, i2 / i4));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return iMax << (iMax >= iCeil ? 0 : 1);
        }
    }

    public static class c extends f {
        @Override // c.d.a.n.k.e.a
        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

        @Override // c.d.a.n.k.e.f
        public int h(int i2, int i3, int i4, int i5) {
            return 0;
        }
    }

    public static Bitmap b(c.d.a.t.f fVar, o oVar, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            fVar.mark(5242880);
        } else {
            oVar.i();
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fVar, null, options);
        try {
            if (options.inJustDecodeBounds) {
                fVar.reset();
            }
        } catch (IOException e2) {
            if (Log.isLoggable("Downsampler", 6)) {
                Log.e("Downsampler", "Exception loading inDecodeBounds=" + options.inJustDecodeBounds + " sample=" + options.inSampleSize, e2);
            }
        }
        return bitmapDecodeStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[PHI: r2 r7
  0x002e: PHI (r2v6 boolean) = (r2v3 boolean), (r2v8 boolean) binds: [B:27:0x0058, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x002e: PHI (r7v4 'e' java.io.IOException) = (r7v2 'e' java.io.IOException), (r7v7 'e' java.io.IOException) binds: [B:27:0x0058, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap.Config d(java.io.InputStream r7, c.d.a.n.a r8) {
        /*
            java.lang.String r0 = "Cannot reset the input stream"
            java.lang.String r1 = "Downsampler"
            c.d.a.n.a r2 = c.d.a.n.a.ALWAYS_ARGB_8888
            if (r8 == r2) goto L72
            c.d.a.n.a r2 = c.d.a.n.a.PREFER_ARGB_8888
            if (r8 == r2) goto L72
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r2 != r3) goto L13
            goto L72
        L13:
            r2 = 0
            r3 = 1024(0x400, float:1.435E-42)
            r7.mark(r3)
            r3 = 5
            c.d.a.n.k.e.l r4 = new c.d.a.n.k.e.l     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r2 = r4.f()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r7.reset()     // Catch: java.io.IOException -> L27
            goto L5b
        L27:
            r7 = move-exception
            boolean r8 = android.util.Log.isLoggable(r1, r3)
            if (r8 == 0) goto L5b
        L2e:
            android.util.Log.w(r1, r0, r7)
            goto L5b
        L32:
            r8 = move-exception
            goto L63
        L34:
            r4 = move-exception
            boolean r5 = android.util.Log.isLoggable(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "Cannot determine whether the image has alpha or not from header for format "
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            r5.append(r8)     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L32
            android.util.Log.w(r1, r8, r4)     // Catch: java.lang.Throwable -> L32
        L4f:
            r7.reset()     // Catch: java.io.IOException -> L53
            goto L5b
        L53:
            r7 = move-exception
            boolean r8 = android.util.Log.isLoggable(r1, r3)
            if (r8 == 0) goto L5b
            goto L2e
        L5b:
            if (r2 == 0) goto L60
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            goto L62
        L60:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
        L62:
            return r7
        L63:
            r7.reset()     // Catch: java.io.IOException -> L67
            goto L71
        L67:
            r7 = move-exception
            boolean r2 = android.util.Log.isLoggable(r1, r3)
            if (r2 == 0) goto L71
            android.util.Log.w(r1, r0, r7)
        L71:
            throw r8
        L72:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.a.n.k.e.f.d(java.io.InputStream, c.d.a.n.a):android.graphics.Bitmap$Config");
    }

    @TargetApi(11)
    public static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f5716b;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            j(optionsPoll);
        }
        return optionsPoll;
    }

    public static void i(BitmapFactory.Options options) {
        j(options);
        Queue<BitmapFactory.Options> queue = f5716b;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    @TargetApi(11)
    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    @TargetApi(11)
    public static void k(BitmapFactory.Options options, Bitmap bitmap) {
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = bitmap;
        }
    }

    public static boolean l(InputStream inputStream) {
        if (19 <= Build.VERSION.SDK_INT) {
            return true;
        }
        inputStream.mark(1024);
        try {
            try {
                return f5715a.contains(new l(inputStream).d());
            } catch (IOException e2) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot determine the image type from header", e2);
                }
                try {
                    inputStream.reset();
                    return false;
                } catch (IOException e3) {
                    if (!Log.isLoggable("Downsampler", 5)) {
                        return false;
                    }
                    Log.w("Downsampler", "Cannot reset the input stream", e3);
                    return false;
                }
            }
        } finally {
            try {
                inputStream.reset();
            } catch (IOException e4) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot reset the input stream", e4);
                }
            }
        }
    }

    public Bitmap a(InputStream inputStream, c.d.a.n.i.n.c cVar, int i2, int i3, c.d.a.n.a aVar) {
        int i4;
        c.d.a.t.a aVarA = c.d.a.t.a.a();
        byte[] bArrB = aVarA.b();
        byte[] bArrB2 = aVarA.b();
        BitmapFactory.Options optionsE = e();
        o oVar = new o(inputStream, bArrB2);
        c.d.a.t.c cVarI = c.d.a.t.c.i(oVar);
        c.d.a.t.f fVar = new c.d.a.t.f(cVarI);
        try {
            cVarI.mark(5242880);
            try {
                try {
                    int iC = new l(cVarI).c();
                    try {
                        cVarI.reset();
                    } catch (IOException e2) {
                        if (Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Cannot reset the input stream", e2);
                        }
                    }
                    i4 = iC;
                } catch (IOException e3) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot determine the image orientation from header", e3);
                    }
                    try {
                        cVarI.reset();
                    } catch (IOException e4) {
                        if (Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Cannot reset the input stream", e4);
                        }
                    }
                    i4 = 0;
                }
                optionsE.inTempStorage = bArrB;
                int[] iArrF = f(fVar, oVar, optionsE);
                int i5 = iArrF[0];
                int i6 = iArrF[1];
                Bitmap bitmapC = c(fVar, oVar, optionsE, cVar, i5, i6, g(r.c(i4), i5, i6, i2, i3), aVar);
                IOException iOExceptionD = cVarI.d();
                if (iOExceptionD != null) {
                    throw new RuntimeException(iOExceptionD);
                }
                Bitmap bitmapF = null;
                if (bitmapC != null) {
                    bitmapF = r.f(bitmapC, cVar, i4);
                    if (!bitmapC.equals(bitmapF) && !cVar.a(bitmapC)) {
                        bitmapC.recycle();
                    }
                }
                return bitmapF;
            } finally {
            }
        } finally {
            aVarA.c(bArrB);
            aVarA.c(bArrB2);
            cVarI.l();
            i(optionsE);
        }
    }

    public final Bitmap c(c.d.a.t.f fVar, o oVar, BitmapFactory.Options options, c.d.a.n.i.n.c cVar, int i2, int i3, int i4, c.d.a.n.a aVar) {
        Bitmap.Config configD = d(fVar, aVar);
        options.inSampleSize = i4;
        options.inPreferredConfig = configD;
        if ((i4 == 1 || 19 <= Build.VERSION.SDK_INT) && l(fVar)) {
            double d2 = i2;
            double d3 = i4;
            Double.isNaN(d2);
            Double.isNaN(d3);
            int iCeil = (int) Math.ceil(d2 / d3);
            double d4 = i3;
            Double.isNaN(d4);
            Double.isNaN(d3);
            k(options, cVar.e(iCeil, (int) Math.ceil(d4 / d3), configD));
        }
        return b(fVar, oVar, options);
    }

    public int[] f(c.d.a.t.f fVar, o oVar, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        b(fVar, oVar, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public final int g(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == Integer.MIN_VALUE) {
            i6 = i4;
        }
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        int iH = (i2 == 90 || i2 == 270) ? h(i4, i3, i5, i6) : h(i3, i4, i5, i6);
        return Math.max(1, iH == 0 ? 0 : Integer.highestOneBit(iH));
    }

    public abstract int h(int i2, int i3, int i4, int i5);
}
