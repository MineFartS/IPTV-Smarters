package c.f.c;

import android.content.Context;
import android.text.TextUtils;
import c.f.a.c.f.q.o;
import c.f.a.c.f.q.r;
import c.f.a.c.f.t.n;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16044g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.m(!n.a(str), "ApplicationId must be set.");
        this.f16039b = str;
        this.f16038a = str2;
        this.f16040c = str3;
        this.f16041d = str4;
        this.f16042e = str5;
        this.f16043f = str6;
        this.f16044g = str7;
    }

    public static i a(Context context) {
        r rVar = new r(context);
        String strA = rVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new i(strA, rVar.a("google_api_key"), rVar.a("firebase_database_url"), rVar.a("ga_trackingId"), rVar.a("gcm_defaultSenderId"), rVar.a("google_storage_bucket"), rVar.a("project_id"));
    }

    public String b() {
        return this.f16038a;
    }

    public String c() {
        return this.f16039b;
    }

    public String d() {
        return this.f16042e;
    }

    public String e() {
        return this.f16044g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return c.f.a.c.f.q.n.a(this.f16039b, iVar.f16039b) && c.f.a.c.f.q.n.a(this.f16038a, iVar.f16038a) && c.f.a.c.f.q.n.a(this.f16040c, iVar.f16040c) && c.f.a.c.f.q.n.a(this.f16041d, iVar.f16041d) && c.f.a.c.f.q.n.a(this.f16042e, iVar.f16042e) && c.f.a.c.f.q.n.a(this.f16043f, iVar.f16043f) && c.f.a.c.f.q.n.a(this.f16044g, iVar.f16044g);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f16039b, this.f16038a, this.f16040c, this.f16041d, this.f16042e, this.f16043f, this.f16044g);
    }

    public String toString() {
        return c.f.a.c.f.q.n.c(this).a("applicationId", this.f16039b).a("apiKey", this.f16038a).a("databaseUrl", this.f16040c).a("gcmSenderId", this.f16042e).a("storageBucket", this.f16043f).a("projectId", this.f16044g).toString();
    }
}
