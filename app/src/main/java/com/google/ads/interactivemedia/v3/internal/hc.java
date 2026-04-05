package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class hc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21892d = "hc";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21893a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ExecutorService f21896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DexClassLoader f21897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private gt f21898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f21899h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f21903l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private gk f21906o;
    private final Map<Pair<String, String>, Cif> p;
    private gx r;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile c.f.a.c.a.a.a f21900i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f21901j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Future f21902k = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile u f21904m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Future f21905n = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21894b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21895c = false;
    private boolean q = false;

    private hc(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f21903l = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.f21893a = context;
        this.p = new HashMap();
        if (this.r != null) {
            return;
        }
        this.r = new gx(context);
    }

    public static hc s(Context context, boolean z) throws Throwable {
        hc hcVar = new hc(context);
        try {
            hcVar.f21896e = Executors.newCachedThreadPool(new gz());
            hcVar.f21901j = z;
            if (z) {
                hcVar.f21902k = hcVar.f21896e.submit(new hb(hcVar, 1));
            }
            hcVar.f21896e.execute(new hb(hcVar));
            try {
                c.f.a.c.f.f fVarF = c.f.a.c.f.f.f();
                hcVar.f21894b = fVarF.a(hcVar.f21893a) > 0;
                hcVar.f21895c = fVarF.g(hcVar.f21893a) == 0;
            } catch (Throwable unused) {
            }
            hcVar.r(0);
            if (hf.e() && aoo.f20312o.f().booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            hcVar.f21898g = new gt();
            try {
            } catch (gs e2) {
                throw new gv(e2);
            }
        } catch (gv unused2) {
        }
        try {
            byte[] bArrC = hd.c("O5+EI9qd857uJNhBPBY+hYh5U8lug4S2akyjrXXZBPw=", false);
            if (bArrC.length != 32) {
                throw new gs();
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(bArrC, 4, 16).get(bArr);
            for (int i2 = 0; i2 < 16; i2++) {
                bArr[i2] = (byte) (bArr[i2] ^ 68);
            }
            hcVar.f21899h = bArr;
            try {
                try {
                    try {
                        try {
                            File cacheDir = hcVar.f21893a.getCacheDir();
                            if (cacheDir == null && (cacheDir = hcVar.f21893a.getDir("dex", 0)) == null) {
                                throw new gv();
                            }
                            File file = new File(String.format("%s/%s.jar", cacheDir, "1621276117097"));
                            if (!file.exists()) {
                                byte[] bArrB = hcVar.f21898g.b(hcVar.f21899h, "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");
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                fileOutputStream.write(bArrB, 0, bArrB.length);
                                fileOutputStream.close();
                            }
                            hcVar.x(cacheDir);
                            try {
                                hcVar.f21897f = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, hcVar.f21893a.getClassLoader());
                                w(file);
                                hcVar.y(cacheDir);
                                hcVar.u(String.format("%s/%s.dex", cacheDir, "1621276117097"));
                                hcVar.f21906o = new gk(hcVar);
                                hcVar.q = true;
                            } catch (Throwable th) {
                                w(file);
                                hcVar.y(cacheDir);
                                hcVar.u(String.format("%s/%s.dex", cacheDir, "1621276117097"));
                                throw th;
                            }
                        } catch (IOException e3) {
                            throw new gv(e3);
                        }
                    } catch (FileNotFoundException e4) {
                        throw new gv(e4);
                    }
                } catch (gs e5) {
                    throw new gv(e5);
                }
            } catch (NullPointerException e6) {
                throw new gv(e6);
            }
            return hcVar;
        } catch (IllegalArgumentException e7) {
            throw new gs(e7);
        }
    }

    private final void u(String str) {
        w(new File(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        try {
            if (this.f21900i == null && this.f21903l) {
                c.f.a.c.a.a.a aVar = new c.f.a.c.a.a.a(this.f21893a);
                aVar.d();
                this.f21900i = aVar;
            }
        } catch (c.f.a.c.f.g | c.f.a.c.f.h | IOException unused) {
            this.f21900i = null;
        }
    }

    private static final void w(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(f21892d, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    private final void x(File file) throws Throwable {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1621276117097"));
        if (!file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1621276117097"));
        if (file3.exists()) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                w(file2);
                return;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        Log.d(f21892d, "Cannot read the cache data.");
                        w(file2);
                        try {
                            fileInputStream2.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    try {
                        try {
                            z zVarD = z.d(bArr, bkm.a());
                            if ("1621276117097".equals(new String(zVarD.h().t())) && Arrays.equals(zVarD.f().t(), fu.d(zVarD.e().t())) && Arrays.equals(zVarD.g().t(), Build.VERSION.SDK.getBytes())) {
                                byte[] bArrB = this.f21898g.b(this.f21899h, new String(zVarD.e().t()));
                                file3.createNewFile();
                                fileOutputStream = new FileOutputStream(file3);
                                try {
                                    fileOutputStream.write(bArrB, 0, bArrB.length);
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        fileOutputStream.close();
                                        return;
                                    } catch (IOException unused3) {
                                        return;
                                    }
                                } catch (gs | IOException | NoSuchAlgorithmException unused4) {
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                            return;
                                        } catch (IOException unused6) {
                                            return;
                                        }
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused7) {
                                        }
                                    }
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (IOException unused8) {
                                        throw th;
                                    }
                                }
                            }
                            w(file2);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused9) {
                            }
                        } catch (IOException unused10) {
                        }
                    } catch (NullPointerException unused11) {
                        fileInputStream2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (gs | IOException | NoSuchAlgorithmException unused12) {
                fileOutputStream = null;
            }
        } catch (gs | IOException | NoSuchAlgorithmException unused13) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private final void y(File file) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1621276117097"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1621276117097"));
        if (file3.exists()) {
            long length = file3.length();
            if (length <= 0) {
                return;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file3);
                try {
                    try {
                        if (fileInputStream2.read(bArr) <= 0) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                            }
                            w(file3);
                            return;
                        }
                        System.out.print("test");
                        System.out.print("test");
                        System.out.print("test");
                        y yVarA = z.a();
                        yVarA.c(bkd.o(Build.VERSION.SDK.getBytes()));
                        yVarA.d(bkd.o("1621276117097".getBytes()));
                        byte[] bytes = this.f21898g.a(this.f21899h, bArr).getBytes();
                        yVarA.a(bkd.o(bytes));
                        yVarA.b(bkd.o(fu.d(bytes)));
                        file2.createNewFile();
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArrAi = yVarA.ac().ai();
                            fileOutputStream.write(bArrAi, 0, bArrAi.length);
                            fileOutputStream.close();
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                            w(file3);
                            return;
                        } catch (gs | IOException | NoSuchAlgorithmException unused4) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            w(file3);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (gs | IOException | NoSuchAlgorithmException unused7) {
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
                fileInputStream = fileInputStream2;
            } catch (gs | IOException | NoSuchAlgorithmException unused8) {
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused9) {
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused10) {
                }
            }
            w(file3);
            throw th;
        }
    }

    public final int a() {
        if (this.f21906o != null) {
            return gk.d();
        }
        return Integer.MIN_VALUE;
    }

    public final Context b() {
        return this.f21893a;
    }

    public final u c() {
        return this.f21904m;
    }

    public final gk d() {
        return this.f21906o;
    }

    public final gt e() {
        return this.f21898g;
    }

    public final c.f.a.c.a.a.a f() {
        if (!this.f21901j) {
            return null;
        }
        if (this.f21900i != null) {
            return this.f21900i;
        }
        Future future = this.f21902k;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.f21902k = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f21902k.cancel(true);
            }
        }
        return this.f21900i;
    }

    public final DexClassLoader g() {
        return this.f21897f;
    }

    public final Method h(String str, String str2) {
        Cif cif = this.p.get(new Pair(str, str2));
        if (cif == null) {
            return null;
        }
        return cif.a();
    }

    public final ExecutorService i() {
        return this.f21896e;
    }

    public final Future j() {
        return this.f21905n;
    }

    public final boolean l() {
        return this.f21895c;
    }

    public final boolean m() {
        return this.f21894b;
    }

    public final boolean n() {
        return this.q;
    }

    public final boolean o() {
        return this.r.a();
    }

    public final byte[] p() {
        return this.f21899h;
    }

    public final void r(int i2) {
        if (this.f21895c) {
            Future<?> futureSubmit = this.f21896e.submit(new ha(this, i2));
            if (i2 == 0) {
                this.f21905n = futureSubmit;
            }
        }
    }

    public final void t(String str, String str2, Class<?>... clsArr) {
        if (this.p.containsKey(new Pair(str, str2))) {
            return;
        }
        this.p.put(new Pair<>(str, str2), new Cif(this, str, str2, clsArr));
    }
}
