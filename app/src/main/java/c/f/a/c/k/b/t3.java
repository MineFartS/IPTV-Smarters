package c.f.a.c.k.b;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class t3 extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<String[]> f14317c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference<String[]> f14318d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<String[]> f14319e = new AtomicReference<>();

    public t3(c5 c5Var) {
        super(c5Var);
    }

    public static final String u(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        c.f.a.c.f.q.o.i(strArr);
        c.f.a.c.f.q.o.i(strArr2);
        c.f.a.c.f.q.o.i(atomicReference);
        c.f.a.c.f.q.o.a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (ea.G(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i2];
                    if (str2 == null) {
                        str2 = strArr2[i2] + "(" + strArr[i2] + ")";
                        strArr3[i2] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    @Override // c.f.a.c.k.b.x5
    public final boolean h() {
        return false;
    }

    public final boolean o() {
        this.f14413a.e();
        return this.f14413a.K() && Log.isLoggable(this.f14413a.c().z(), 3);
    }

    public final String p(String str) {
        if (str == null) {
            return null;
        }
        return !o() ? str : u(str, a6.f13719c, a6.f13717a, f14317c);
    }

    public final String q(String str) {
        if (str == null) {
            return null;
        }
        return !o() ? str : u(str, b6.f13757b, b6.f13756a, f14318d);
    }

    public final String r(String str) {
        if (str == null) {
            return null;
        }
        if (!o()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return u(str, c6.f13796b, c6.f13795a, f14319e);
        }
        return "experiment_id(" + str + ")";
    }

    public final String s(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!o()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(q(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? t(new Object[]{obj}) : obj instanceof Object[] ? t((Object[]) obj) : obj instanceof ArrayList ? t(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String t(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strS = obj instanceof Bundle ? s((Bundle) obj) : String.valueOf(obj);
            if (strS != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strS);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
