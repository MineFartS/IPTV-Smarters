package c.f.a.c.j.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d4<Boolean> f13425a = d4.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f13426b = new Object();

    public static boolean a(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only ");
            sb.append("com.google.android.gms.phenotype");
            sb.append(" authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!f13425a.a()) {
            synchronized (f13426b) {
                if (f13425a.a()) {
                    return f13425a.b().booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                f13425a = d4.d(Boolean.valueOf(z));
            }
        }
        return f13425a.b().booleanValue();
    }
}
