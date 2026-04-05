package c.f.a.c.k.b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5 f14163a;

    public na(c5 c5Var) {
        this.f14163a = c5Var;
    }

    public final void a() {
        this.f14163a.d().g();
        if (e()) {
            if (d()) {
                this.f14163a.A().A.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f14163a.F().X("auto", "_cmpx", bundle);
            } else {
                String strA = this.f14163a.A().A.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f14163a.c().p().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f14163a.A().B.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", jA);
                    this.f14163a.F().X((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.f14163a.A().A.b(null);
            }
            this.f14163a.A().B.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String string;
        this.f14163a.d().g();
        if (this.f14163a.k()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f14163a.A().A.b(string);
        this.f14163a.A().B.b(this.f14163a.a().a());
    }

    public final void c() {
        if (e() && d()) {
            this.f14163a.A().A.b(null);
        }
    }

    public final boolean d() {
        return e() && this.f14163a.a().a() - this.f14163a.A().B.a() > this.f14163a.z().s(null, m3.E0);
    }

    public final boolean e() {
        return this.f14163a.A().B.a() > 0;
    }
}
