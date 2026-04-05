package c.f.a.c.f.q;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.a;

/* JADX INFO: loaded from: classes2.dex */
public class v implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    public static final v f12669a = c().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12670b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f12671a;

        public /* synthetic */ a(z zVar) {
        }

        @RecentlyNonNull
        public v a() {
            return new v(this.f12671a, null);
        }
    }

    public /* synthetic */ v(String str, z zVar) {
        this.f12670b = str;
    }

    @RecentlyNonNull
    public static a c() {
        return new a(null);
    }

    @RecentlyNonNull
    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f12670b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return n.a(this.f12670b, ((v) obj).f12670b);
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f12670b);
    }
}
