package d.a.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static v f30194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d.a.a.a f30195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d.a.a.a f30196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap<String, d.a.a.a> f30197d = new HashMap<>();

    public static void b(Context context) throws Throwable {
        if (f30194a == null) {
            v vVar = new v();
            f30194a = vVar;
            vVar.m(context);
        }
    }

    public static d.a.a.a c(Context context, String str) {
        return d(context, str, 0, 10);
    }

    public static d.a.a.a d(Context context, String str, int i2, int i3) {
        b(context);
        d.a.a.a aVarE = e(str);
        int i4 = 0;
        while (true) {
            if (aVarE != null && aVarE.q0 >= i2) {
                break;
            }
            int i5 = i4 + 1;
            if (i4 >= i3) {
                i4 = i5;
                break;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            f30194a.m(context);
            aVarE = e(str);
            i4 = i5;
        }
        if (i4 > 5) {
            z.p(String.format(Locale.US, "Used x %d tries to get current version (%d/%d) of the profile", Integer.valueOf(i4), Integer.valueOf(aVarE == null ? -1 : aVarE.q0), Integer.valueOf(i2)));
        }
        return aVarE;
    }

    public static d.a.a.a e(String str) {
        d.a.a.a aVar = f30196c;
        if (aVar != null && aVar.F().equals(str)) {
            return f30196c;
        }
        v vVar = f30194a;
        if (vVar == null) {
            return null;
        }
        return vVar.f30197d.get(str);
    }

    public static d.a.a.a f(Context context) {
        b(context);
        return e(u.a(context).getString("alwaysOnVpn", null));
    }

    public static synchronized v g(Context context) {
        b(context);
        return f30194a;
    }

    public static d.a.a.a h(Context context) {
        String string = u.a(context).getString("lastConnectedProfile", null);
        if (string != null) {
            return c(context, string);
        }
        return null;
    }

    public static d.a.a.a i() {
        return f30195b;
    }

    public static boolean l() {
        d.a.a.a aVar = f30195b;
        return aVar != null && aVar == f30196c;
    }

    public static void p(Context context, d.a.a.a aVar, boolean z, boolean z2) {
        if (z) {
            aVar.q0++;
        }
        String str = aVar.E().toString() + ".vp";
        if (z2) {
            str = "temporary-vpn-profile.vp";
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(str, 0));
            objectOutputStream.writeObject(aVar);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e2) {
            z.s("saving VPN profile", e2);
            throw new RuntimeException(e2);
        }
    }

    public static void r(Context context, d.a.a.a aVar) {
        SharedPreferences.Editor editorEdit = u.a(context).edit();
        editorEdit.putString("lastConnectedProfile", aVar.F());
        editorEdit.apply();
        f30195b = aVar;
    }

    public static void s(Context context) {
        SharedPreferences.Editor editorEdit = u.a(context).edit();
        editorEdit.putString("lastConnectedProfile", null);
        editorEdit.apply();
    }

    public static void t(Context context, d.a.a.a aVar) {
        aVar.v0 = true;
        f30196c = aVar;
        p(context, aVar, true, true);
    }

    public static void u(Context context, d.a.a.a aVar) {
        aVar.r0 = System.currentTimeMillis();
        if (aVar != f30196c) {
            p(context, aVar, false, false);
        }
    }

    public void a(d.a.a.a aVar) {
        this.f30197d.put(aVar.E().toString(), aVar);
    }

    public d.a.a.a j(String str) {
        for (d.a.a.a aVar : this.f30197d.values()) {
            if (aVar.y().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public Collection<d.a.a.a> k() {
        return this.f30197d.values();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #6 {all -> 0x009e, blocks: (B:10:0x004a, B:12:0x0052, B:14:0x0056, B:17:0x005d, B:19:0x0066, B:20:0x0069, B:36:0x008d, B:38:0x0093), top: B:55:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.content.Context r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r8.f30197d = r0
            java.lang.String r0 = "VPNList"
            android.content.SharedPreferences r0 = d.a.a.d.u.b(r0, r9)
            java.lang.String r1 = "vpnlist"
            r2 = 0
            java.util.Set r0 = r0.getStringSet(r1, r2)
            if (r0 != 0) goto L1b
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L1b:
            java.lang.String r1 = "temporary-vpn-profile"
            r0.add(r1)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lab
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L87 java.lang.ClassNotFoundException -> L89 java.io.IOException -> L8b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87 java.lang.ClassNotFoundException -> L89 java.io.IOException -> L8b
            r5.<init>()     // Catch: java.lang.Throwable -> L87 java.lang.ClassNotFoundException -> L89 java.io.IOException -> L8b
            r5.append(r3)     // Catch: java.lang.Throwable -> L87 java.lang.ClassNotFoundException -> L89 java.io.IOException -> L8b
            java.lang.String r6 = ".vp"
            r5.append(r6)     // Catch: java.lang.Throwable -> L87 java.lang.ClassNotFoundException -> L89 java.io.IOException -> L8b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L87 java.lang.ClassNotFoundException -> L89 java.io.IOException -> L8b
            java.io.FileInputStream r5 = r9.openFileInput(r5)     // Catch: java.lang.Throwable -> L87 java.lang.ClassNotFoundException -> L89 java.io.IOException -> L8b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L87 java.lang.ClassNotFoundException -> L89 java.io.IOException -> L8b
            java.lang.Object r5 = r4.readObject()     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            d.a.a.a r5 = (d.a.a.a) r5     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            if (r5 == 0) goto L7a
            java.lang.String r6 = r5.f30070f     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            if (r6 == 0) goto L7a
            java.util.UUID r6 = r5.E()     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            if (r6 != 0) goto L5d
            goto L7a
        L5d:
            r5.R()     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            boolean r6 = r3.equals(r1)     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            if (r6 == 0) goto L69
            d.a.a.d.v.f30196c = r5     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            goto L76
        L69:
            java.util.HashMap<java.lang.String, d.a.a.a> r6 = r8.f30197d     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            java.util.UUID r7 = r5.E()     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
            r6.put(r7, r5)     // Catch: java.lang.ClassNotFoundException -> L83 java.io.IOException -> L85 java.lang.Throwable -> L9e
        L76:
            r4.close()     // Catch: java.io.IOException -> L7e
            goto L24
        L7a:
            r4.close()     // Catch: java.io.IOException -> L7e
            goto L24
        L7e:
            r3 = move-exception
            r3.printStackTrace()
            goto L24
        L83:
            r5 = move-exception
            goto L8d
        L85:
            r5 = move-exception
            goto L8d
        L87:
            r9 = move-exception
            goto La0
        L89:
            r5 = move-exception
            goto L8c
        L8b:
            r5 = move-exception
        L8c:
            r4 = r2
        L8d:
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L9e
            if (r3 != 0) goto L98
            java.lang.String r3 = "Loading VPN List"
            d.a.a.d.z.s(r3, r5)     // Catch: java.lang.Throwable -> L9e
        L98:
            if (r4 == 0) goto L24
            r4.close()     // Catch: java.io.IOException -> L7e
            goto L24
        L9e:
            r9 = move-exception
            r2 = r4
        La0:
            if (r2 == 0) goto Laa
            r2.close()     // Catch: java.io.IOException -> La6
            goto Laa
        La6:
            r0 = move-exception
            r0.printStackTrace()
        Laa:
            throw r9
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a.d.v.m(android.content.Context):void");
    }

    public void n(Context context, d.a.a.a aVar) {
        String string = aVar.E().toString();
        this.f30197d.remove(string);
        q(context);
        context.deleteFile(string + ".vp");
        if (f30195b == aVar) {
            f30195b = null;
        }
    }

    public void o(Context context, d.a.a.a aVar) {
        p(context, aVar, true, false);
    }

    public void q(Context context) {
        SharedPreferences sharedPreferencesB = u.b("VPNList", context);
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        editorEdit.putStringSet("vpnlist", this.f30197d.keySet());
        editorEdit.putInt("counter", sharedPreferencesB.getInt("counter", 0) + 1);
        editorEdit.apply();
    }
}
