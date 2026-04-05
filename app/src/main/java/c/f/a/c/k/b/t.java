package c.f.a.c.k.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f14311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14313e;

    public t(t tVar, long j2) {
        c.f.a.c.f.q.o.i(tVar);
        this.f14310b = tVar.f14310b;
        this.f14311c = tVar.f14311c;
        this.f14312d = tVar.f14312d;
        this.f14313e = j2;
    }

    public t(String str, r rVar, String str2, long j2) {
        this.f14310b = str;
        this.f14311c = rVar;
        this.f14312d = str2;
        this.f14313e = j2;
    }

    public final String toString() {
        String str = this.f14312d;
        String str2 = this.f14310b;
        String strValueOf = String.valueOf(this.f14311c);
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        u.a(this, parcel, i2);
    }
}
