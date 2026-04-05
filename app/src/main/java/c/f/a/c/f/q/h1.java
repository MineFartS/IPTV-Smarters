package c.f.a.c.f.q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f12604a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentName f12607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12609f;

    public h1(String str, String str2, int i2, boolean z) {
        o.e(str);
        this.f12605b = str;
        o.e(str2);
        this.f12606c = str2;
        this.f12607d = null;
        this.f12608e = i2;
        this.f12609f = z;
    }

    public final String a() {
        return this.f12606c;
    }

    public final ComponentName b() {
        return this.f12607d;
    }

    public final int c() {
        return this.f12608e;
    }

    public final Intent d(Context context) {
        Bundle bundleCall;
        if (this.f12605b == null) {
            return new Intent().setComponent(this.f12607d);
        }
        if (this.f12609f) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f12605b);
            try {
                bundleCall = context.getContentResolver().call(f12604a, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Dynamic intent resolution failed: ");
                sb.append(strValueOf);
                Log.w("ConnectionStatusConfig", sb.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                String strValueOf2 = String.valueOf(this.f12605b);
                Log.w("ConnectionStatusConfig", strValueOf2.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(strValueOf2) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.f12605b).setPackage(this.f12606c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return n.a(this.f12605b, h1Var.f12605b) && n.a(this.f12606c, h1Var.f12606c) && n.a(this.f12607d, h1Var.f12607d) && this.f12608e == h1Var.f12608e && this.f12609f == h1Var.f12609f;
    }

    public final int hashCode() {
        return n.b(this.f12605b, this.f12606c, this.f12607d, Integer.valueOf(this.f12608e), Boolean.valueOf(this.f12609f));
    }

    public final String toString() {
        String str = this.f12605b;
        if (str != null) {
            return str;
        }
        o.i(this.f12607d);
        return this.f12607d.flattenToString();
    }
}
