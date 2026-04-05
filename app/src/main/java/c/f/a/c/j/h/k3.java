package c.f.a.c.j.h;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class k3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k3 f13395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Context f13396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ContentObserver f13397c;

    public k3() {
        this.f13396b = null;
        this.f13397c = null;
    }

    public k3(Context context) {
        this.f13396b = context;
        j3 j3Var = new j3(this, null);
        this.f13397c = j3Var;
        context.getContentResolver().registerContentObserver(y2.f13640a, true, j3Var);
    }

    public static k3 b(Context context) {
        k3 k3Var;
        synchronized (k3.class) {
            if (f13395a == null) {
                f13395a = a.i.i.d.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new k3(context) : new k3();
            }
            k3Var = f13395a;
        }
        return k3Var;
    }

    public static synchronized void d() {
        Context context;
        k3 k3Var = f13395a;
        if (k3Var != null && (context = k3Var.f13396b) != null && k3Var.f13397c != null) {
            context.getContentResolver().unregisterContentObserver(f13395a.f13397c);
        }
        f13395a = null;
    }

    @Override // c.f.a.c.j.h.h3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        if (this.f13396b == null) {
            return null;
        }
        try {
            return (String) f3.a(new g3(this, str) { // from class: c.f.a.c.j.h.i3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k3 f13363a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f13364b;

                {
                    this.f13363a = this;
                    this.f13364b = str;
                }

                @Override // c.f.a.c.j.h.g3
                public final Object zza() {
                    return this.f13363a.e(this.f13364b);
                }
            });
        } catch (IllegalStateException | SecurityException e2) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    public final /* synthetic */ String e(String str) {
        return y2.a(this.f13396b.getContentResolver(), str, null);
    }
}
