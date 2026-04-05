package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.h.c;
import c.f.a.c.h.d;
import c.f.a.c.h.e;
import c.f.a.c.h.f;
import c.f.a.c.h.g;
import c.f.a.c.h.h;
import c.f.a.c.h.i;
import c.f.a.c.h.j;
import c.f.a.c.h.k;
import c.f.a.c.h.l;
import c.f.a.c.h.m;
import c.f.a.c.h.n;
import c.f.a.c.h.o;
import c.f.a.c.h.p;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static Boolean f24265g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static String f24266h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static int f24267i = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static o f24272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static p f24273o;
    public final Context p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadLocal<k> f24268j = new ThreadLocal<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ThreadLocal<Long> f24269k = new c.f.a.c.h.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m f24270l = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f24259a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f24260b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f24261c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f24262d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f24263e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f24264f = new i();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @RecentlyNonNull
    public static final b f24271m = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @RecentlyNullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        public /* synthetic */ a(String str, c.f.a.c.h.b bVar) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th, c.f.a.c.h.b bVar) {
            super(str, th);
        }
    }

    public interface b {
        n a(Context context, String str, m mVar);
    }

    public DynamiteModule(Context context) {
        c.f.a.c.f.q.o.i(context);
        this.p = context;
    }

    public static int a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(InstructionFileId.DOT);
            sb.append("ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (c.f.a.c.f.q.n.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int c(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return f(context, str, false);
    }

    @RecentlyNonNull
    public static DynamiteModule e(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull String str) {
        Boolean bool;
        c.f.a.c.g.a aVarI2;
        DynamiteModule dynamiteModule;
        p pVar;
        Boolean boolValueOf;
        c.f.a.c.g.a aVarI22;
        ThreadLocal<k> threadLocal = f24268j;
        k kVar = threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal<Long> threadLocal2 = f24269k;
        long jLongValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            n nVarA = bVar.a(context, str, f24270l);
            int i2 = nVarA.f12733a;
            int i3 = nVarA.f12734b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = nVarA.f12735c;
            if (i4 == 0 || ((i4 == -1 && nVarA.f12733a == 0) || (i4 == 1 && nVarA.f12734b == 0))) {
                int i5 = nVarA.f12733a;
                int i6 = nVarA.f12734b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i5);
                sb2.append(" and remote version is ");
                sb2.append(i6);
                sb2.append(InstructionFileId.DOT);
                throw new a(sb2.toString(), null);
            }
            if (i4 == -1) {
                DynamiteModule dynamiteModuleI = i(context, str);
                if (jLongValue == 0) {
                    threadLocal2.remove();
                } else {
                    threadLocal2.set(Long.valueOf(jLongValue));
                }
                Cursor cursor = kVar2.f12731a;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(kVar);
                return dynamiteModuleI;
            }
            if (i4 != 1) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(0);
                throw new a(sb3.toString(), null);
            }
            try {
                int i7 = nVarA.f12734b;
                try {
                    synchronized (DynamiteModule.class) {
                        bool = f24265g;
                    }
                    if (bool == null) {
                        throw new a("Failed to determine which loading route to use.", null);
                    }
                    if (bool.booleanValue()) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                        sb4.append("Selected remote version of ");
                        sb4.append(str);
                        sb4.append(", version >= ");
                        sb4.append(i7);
                        Log.i("DynamiteModule", sb4.toString());
                        synchronized (DynamiteModule.class) {
                            pVar = f24273o;
                        }
                        if (pVar == null) {
                            throw new a("DynamiteLoaderV2 was not cached.", null);
                        }
                        k kVar3 = threadLocal.get();
                        if (kVar3 == null || kVar3.f12731a == null) {
                            throw new a("No result cursor", null);
                        }
                        Context applicationContext = context.getApplicationContext();
                        Cursor cursor2 = kVar3.f12731a;
                        c.f.a.c.g.b.K2(null);
                        synchronized (DynamiteModule.class) {
                            boolValueOf = Boolean.valueOf(f24267i >= 2);
                        }
                        if (boolValueOf.booleanValue()) {
                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                            aVarI22 = pVar.K2(c.f.a.c.g.b.K2(applicationContext), str, i7, c.f.a.c.g.b.K2(cursor2));
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                            aVarI22 = pVar.I2(c.f.a.c.g.b.K2(applicationContext), str, i7, c.f.a.c.g.b.K2(cursor2));
                        }
                        Context context2 = (Context) c.f.a.c.g.b.I2(aVarI22);
                        if (context2 == null) {
                            throw new a("Failed to get module context", null);
                        }
                        dynamiteModule = new DynamiteModule(context2);
                    } else {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 51);
                        sb5.append("Selected remote version of ");
                        sb5.append(str);
                        sb5.append(", version >= ");
                        sb5.append(i7);
                        Log.i("DynamiteModule", sb5.toString());
                        o oVarK = k(context);
                        if (oVarK == null) {
                            throw new a("Failed to create IDynamiteLoader.", null);
                        }
                        int iN2 = oVarK.N2();
                        if (iN2 >= 3) {
                            k kVar4 = threadLocal.get();
                            if (kVar4 == null) {
                                throw new a("No cached result cursor holder", null);
                            }
                            aVarI2 = oVarK.P2(c.f.a.c.g.b.K2(context), str, i7, c.f.a.c.g.b.K2(kVar4.f12731a));
                        } else if (iN2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarI2 = oVarK.L2(c.f.a.c.g.b.K2(context), str, i7);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarI2 = oVarK.I2(c.f.a.c.g.b.K2(context), str, i7);
                        }
                        if (c.f.a.c.g.b.I2(aVarI2) == null) {
                            throw new a("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) c.f.a.c.g.b.I2(aVarI2));
                    }
                    if (jLongValue == 0) {
                        threadLocal2.remove();
                    } else {
                        threadLocal2.set(Long.valueOf(jLongValue));
                    }
                    Cursor cursor3 = kVar2.f12731a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    threadLocal.set(kVar);
                    return dynamiteModule;
                } catch (RemoteException e2) {
                    throw new a("Failed to load remote module.", e2, null);
                } catch (a e3) {
                    throw e3;
                } catch (Throwable th) {
                    c.f.a.c.f.t.f.a(context, th);
                    throw new a("Failed to load remote module.", th, null);
                }
            } catch (a e4) {
                String strValueOf = String.valueOf(e4.getMessage());
                Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to load remote module: ".concat(strValueOf) : new String("Failed to load remote module: "));
                int i8 = nVarA.f12733a;
                if (i8 == 0 || bVar.a(context, str, new l(i8, 0)).f12735c != -1) {
                    throw new a("Remote load failed. No local fallback found.", e4, null);
                }
                DynamiteModule dynamiteModuleI2 = i(context, str);
                ThreadLocal<Long> threadLocal3 = f24269k;
                if (jLongValue == 0) {
                    threadLocal3.remove();
                } else {
                    threadLocal3.set(Long.valueOf(jLongValue));
                }
                Cursor cursor4 = kVar2.f12731a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f24268j.set(kVar);
                return dynamiteModuleI2;
            }
        } catch (Throwable th2) {
            ThreadLocal<Long> threadLocal4 = f24269k;
            if (jLongValue == 0) {
                threadLocal4.remove();
            } else {
                threadLocal4.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = kVar2.f12731a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f24268j.set(kVar);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x014c A[Catch: all -> 0x01ac, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01ac, blocks: (B:3:0x0002, B:51:0x00cd, B:54:0x00d4, B:63:0x00fa, B:80:0x013e, B:84:0x014c, B:108:0x01a5, B:109:0x01a8, B:105:0x019f, B:57:0x00da, B:59:0x00ec, B:61:0x00f6, B:60:0x00f1, B:112:0x01ab, B:4:0x0003, B:7:0x0008, B:8:0x0024, B:49:0x00ca, B:32:0x0091, B:35:0x0094, B:42:0x00a2, B:50:0x00cc, B:48:0x00a8), top: B:123:0x0002, inners: #4, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(@androidx.annotation.RecentlyNonNull android.content.Context r9, @androidx.annotation.RecentlyNonNull java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v0, types: [c.f.a.c.h.b] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(android.content.Context r9, java.lang.String r10, boolean r11) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f24269k     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r9 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r11) goto L19
            r9 = r4
        L19:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = "content"
            android.net.Uri$Builder r11 = r11.scheme(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r11 = r11.authority(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r11.path(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r10 = "requestStartTime"
            java.lang.String r11 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            android.net.Uri r4 = r9.build()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r9 == 0) goto L81
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r10 == 0) goto L81
            r10 = 0
            int r10 = r9.getInt(r10)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r10 <= 0) goto L7a
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r11 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r11)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            r1 = 2
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.dynamite.DynamiteModule.f24266h = r1     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "loaderVersion"
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L77
            if (r1 < 0) goto L6f
            int r1 = r9.getInt(r1)     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.dynamite.DynamiteModule.f24267i = r1     // Catch: java.lang.Throwable -> L77
        L6f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            boolean r11 = h(r9)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            if (r11 == 0) goto L7a
            goto L7b
        L77:
            r10 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            throw r10     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
        L7a:
            r0 = r9
        L7b:
            if (r0 == 0) goto L80
            r0.close()
        L80:
            return r10
        L81:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "Failed to retrieve remote module version."
            android.util.Log.w(r10, r11)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r10.<init>(r11, r0)     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
            throw r10     // Catch: java.lang.Exception -> L90 java.lang.Throwable -> La5
        L90:
            r10 = move-exception
            goto L98
        L92:
            r9 = move-exception
            r10 = r9
            goto La7
        L95:
            r9 = move-exception
            r10 = r9
            r9 = r0
        L98:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> La5
            if (r11 == 0) goto L9d
            throw r10     // Catch: java.lang.Throwable -> La5
        L9d:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "V2 version check failed"
            r11.<init>(r1, r10, r0)     // Catch: java.lang.Throwable -> La5
            throw r11     // Catch: java.lang.Throwable -> La5
        La5:
            r10 = move-exception
            r0 = r9
        La7:
            if (r0 == 0) goto Lac
            r0.close()
        Lac:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean h(Cursor cursor) {
        k kVar = f24268j.get();
        if (kVar == null || kVar.f12731a != null) {
            return false;
        }
        kVar.f12731a = cursor;
        return true;
    }

    public static DynamiteModule i(Context context, String str) {
        String strValueOf = String.valueOf(str);
        Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    public static void j(ClassLoader classLoader) throws a {
        p pVar;
        c.f.a.c.h.b bVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                pVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                pVar = iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new p(iBinder);
            }
            f24273o = pVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, bVar);
        }
    }

    public static o k(Context context) {
        o oVar;
        synchronized (DynamiteModule.class) {
            o oVar2 = f24272n;
            if (oVar2 != null) {
                return oVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    oVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    oVar = iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new o(iBinder);
                }
                if (oVar != null) {
                    f24272n = oVar;
                    return oVar;
                }
            } catch (Exception e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    @RecentlyNonNull
    public Context b() {
        return this.p;
    }

    @RecentlyNonNull
    public IBinder d(@RecentlyNonNull String str) {
        try {
            return (IBinder) this.p.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String strValueOf = String.valueOf(str);
            throw new a(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}
