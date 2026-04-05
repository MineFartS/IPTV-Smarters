package c.f.a.c.d;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class d extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<d> CREATOR = new t1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f11583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f11585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f11586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11587h;

    public d() {
        this.f11583d = new ArrayList();
    }

    public d(String str, String str2, @Nullable List<c.f.a.c.f.p.a> list, List<String> list2, String str3, Uri uri, @Nullable String str4, @Nullable String str5) {
        this.f11581b = str;
        this.f11582c = str2;
        this.f11583d = list2;
        this.f11584e = str3;
        this.f11585f = uri;
        this.f11586g = str4;
        this.f11587h = str5;
    }

    public String I() {
        return this.f11581b;
    }

    public List<c.f.a.c.f.p.a> J() {
        return null;
    }

    public String K() {
        return this.f11584e;
    }

    public List<String> L() {
        return Collections.unmodifiableList(this.f11583d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.f.a.c.d.v.a.f(this.f11581b, dVar.f11581b) && c.f.a.c.d.v.a.f(this.f11582c, dVar.f11582c) && c.f.a.c.d.v.a.f(this.f11583d, dVar.f11583d) && c.f.a.c.d.v.a.f(this.f11584e, dVar.f11584e) && c.f.a.c.d.v.a.f(this.f11585f, dVar.f11585f) && c.f.a.c.d.v.a.f(this.f11586g, dVar.f11586g) && c.f.a.c.d.v.a.f(this.f11587h, dVar.f11587h);
    }

    public String getName() {
        return this.f11582c;
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f11581b, this.f11582c, this.f11583d, this.f11584e, this.f11585f, this.f11586g);
    }

    public String toString() {
        String str = this.f11581b;
        String str2 = this.f11582c;
        List<String> list = this.f11583d;
        int size = list == null ? 0 : list.size();
        String str3 = this.f11584e;
        String strValueOf = String.valueOf(this.f11585f);
        String str4 = this.f11586g;
        String str5 = this.f11587h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118 + String.valueOf(str2).length() + String.valueOf(str3).length() + strValueOf.length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(strValueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        sb.append(", type: ");
        sb.append(str5);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, I(), false);
        c.f.a.c.f.q.w.c.s(parcel, 3, getName(), false);
        c.f.a.c.f.q.w.c.w(parcel, 4, J(), false);
        c.f.a.c.f.q.w.c.u(parcel, 5, L(), false);
        c.f.a.c.f.q.w.c.s(parcel, 6, K(), false);
        c.f.a.c.f.q.w.c.r(parcel, 7, this.f11585f, i2, false);
        c.f.a.c.f.q.w.c.s(parcel, 8, this.f11586g, false);
        c.f.a.c.f.q.w.c.s(parcel, 9, this.f11587h, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
