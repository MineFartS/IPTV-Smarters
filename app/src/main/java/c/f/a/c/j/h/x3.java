package c.f.a.c.j.h;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x3<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile w3 f13619b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13623f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v3 f13624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T f13626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f13627j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile T f13628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f13629l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f13618a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<Collection<x3<?>>> f13620c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z3 f13621d = new z3(p3.f13481a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f13622e = new AtomicInteger();

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x3(v3 v3Var, String str, Object obj, boolean z, r3 r3Var) {
        if (v3Var.f13577b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f13624g = v3Var;
        this.f13625h = str;
        this.f13626i = obj;
        this.f13629l = true;
    }

    @Deprecated
    public static void b(final Context context) {
        synchronized (f13618a) {
            w3 w3Var = f13619b;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (w3Var == null || w3Var.a() != context) {
                d3.e();
                y3.c();
                k3.d();
                f13619b = new a3(context, j4.a(new f4(context) { // from class: c.f.a.c.j.h.o3

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Context f13471b;

                    {
                        this.f13471b = context;
                    }

                    @Override // c.f.a.c.j.h.f4
                    public final Object zza() {
                        BufferedReader bufferedReader;
                        File file;
                        Context contextCreateDeviceProtectedStorageContext = this.f13471b;
                        int i2 = x3.f13623f;
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                            if (z2.a() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                            }
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                StrictMode.allowThreadDiskWrites();
                                try {
                                    file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                } catch (RuntimeException e2) {
                                    Log.e("HermeticFileOverrides", "no data dir", e2);
                                }
                                d4 d4VarD = file.exists() ? d4.d(file) : d4.c();
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                if (d4VarD.a()) {
                                    File file2 = (File) d4VarD.b();
                                    try {
                                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    } catch (IOException e3) {
                                        throw new RuntimeException(e3);
                                    }
                                    try {
                                        HashMap map = new HashMap();
                                        HashMap map2 = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                String strValueOf = String.valueOf(file2);
                                                StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
                                                sb.append("Parsed ");
                                                sb.append(strValueOf);
                                                Log.i("HermeticFileOverrides", sb.toString());
                                                l3 l3Var = new l3(map);
                                                bufferedReader.close();
                                                return d4.d(l3Var);
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map2.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map2.put(str4, strDecode2);
                                                    }
                                                }
                                                if (!map.containsKey(str3)) {
                                                    map.put(str3, new HashMap());
                                                }
                                                ((Map) map.get(str3)).put(strDecode, strDecode2);
                                            }
                                            throw new RuntimeException(e3);
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th;
                            }
                        }
                        return d4.c();
                    }
                }));
                f13622e.incrementAndGet();
            }
        }
    }

    public static void c() {
        f13622e.incrementAndGet();
    }

    public abstract T a(Object obj);

    public final String d() {
        String str = this.f13624g.f13579d;
        return this.f13625h;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0062, B:26:0x006d, B:25:0x0067, B:47:0x00de, B:49:0x00ee, B:51:0x0102, B:52:0x0105, B:53:0x0109, B:41:0x00bc, B:43:0x00d4, B:46:0x00dc, B:28:0x0072, B:30:0x0078, B:32:0x0086, B:36:0x00ab, B:38:0x00b5, B:34:0x009d, B:54:0x010e, B:55:0x0113, B:56:0x0114), top: B:63:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x003b, B:20:0x0047, B:22:0x0050, B:24:0x0062, B:26:0x006d, B:25:0x0067, B:47:0x00de, B:49:0x00ee, B:51:0x0102, B:52:0x0105, B:53:0x0109, B:41:0x00bc, B:43:0x00d4, B:46:0x00dc, B:28:0x0072, B:30:0x0078, B:32:0x0086, B:36:0x00ab, B:38:0x00b5, B:34:0x009d, B:54:0x010e, B:55:0x0113, B:56:0x0114), top: B:63:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T e() {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.h.x3.e():java.lang.Object");
    }
}
