package c.f.c.u;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.f.c.u.b;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f16400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f16401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f16402d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f16405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f16406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f16407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f16408f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f16409g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f16410h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f16411i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f16412j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f16413k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f16414l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f16415m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Uri f16416n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f16417o;
        public final Integer p;
        public final Integer q;
        public final Integer r;
        public final int[] s;
        public final Long t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final long[] z;

        public b(t tVar) {
            this.f16403a = tVar.p("gcm.n.title");
            this.f16404b = tVar.h("gcm.n.title");
            this.f16405c = b(tVar, "gcm.n.title");
            this.f16406d = tVar.p("gcm.n.body");
            this.f16407e = tVar.h("gcm.n.body");
            this.f16408f = b(tVar, "gcm.n.body");
            this.f16409g = tVar.p("gcm.n.icon");
            this.f16411i = tVar.o();
            this.f16412j = tVar.p("gcm.n.tag");
            this.f16413k = tVar.p("gcm.n.color");
            this.f16414l = tVar.p("gcm.n.click_action");
            this.f16415m = tVar.p("gcm.n.android_channel_id");
            this.f16416n = tVar.f();
            this.f16410h = tVar.p("gcm.n.image");
            this.f16417o = tVar.p("gcm.n.ticker");
            this.p = tVar.b("gcm.n.notification_priority");
            this.q = tVar.b("gcm.n.visibility");
            this.r = tVar.b("gcm.n.notification_count");
            this.u = tVar.a("gcm.n.sticky");
            this.v = tVar.a("gcm.n.local_only");
            this.w = tVar.a("gcm.n.default_sound");
            this.x = tVar.a("gcm.n.default_vibrate_timings");
            this.y = tVar.a("gcm.n.default_light_settings");
            this.t = tVar.j("gcm.n.event_time");
            this.s = tVar.e();
            this.z = tVar.q();
        }

        public static String[] b(t tVar, String str) {
            Object[] objArrG = tVar.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i2 = 0; i2 < objArrG.length; i2++) {
                strArr[i2] = String.valueOf(objArrG[i2]);
            }
            return strArr;
        }

        public String a() {
            return this.f16406d;
        }
    }

    public u(Bundle bundle) {
        this.f16400b = bundle;
    }

    public Map<String, String> I() {
        if (this.f16401c == null) {
            this.f16401c = b.a.a(this.f16400b);
        }
        return this.f16401c;
    }

    public String J() {
        return this.f16400b.getString("from");
    }

    public b K() {
        if (this.f16402d == null && t.t(this.f16400b)) {
            this.f16402d = new b(new t(this.f16400b));
        }
        return this.f16402d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        v.c(this, parcel, i2);
    }
}
