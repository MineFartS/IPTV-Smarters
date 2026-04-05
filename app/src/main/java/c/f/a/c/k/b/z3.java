package c.f.a.c.k.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f14496d;

    public z3(String str, String str2, Bundle bundle, long j2) {
        this.f14493a = str;
        this.f14494b = str2;
        this.f14496d = bundle;
        this.f14495c = j2;
    }

    public static z3 a(t tVar) {
        return new z3(tVar.f14310b, tVar.f14312d, tVar.f14311c.K(), tVar.f14313e);
    }

    public final t b() {
        return new t(this.f14493a, new r(new Bundle(this.f14496d)), this.f14494b, this.f14495c);
    }

    public final String toString() {
        String str = this.f14494b;
        String str2 = this.f14493a;
        String strValueOf = String.valueOf(this.f14496d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
