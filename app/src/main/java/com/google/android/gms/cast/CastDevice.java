package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c.f.a.c.d.b2;
import c.f.a.c.f.q.w.a;
import c.f.a.c.f.q.w.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new b2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InetAddress f24095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f24098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<c.f.a.c.f.p.a> f24100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f24104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f24106o;
    public byte[] p;
    public String q;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i2, List<c.f.a.c.f.p.a> list, int i3, int i4, String str6, String str7, int i5, String str8, byte[] bArr, String str9) {
        this.f24093b = Q(str);
        String strQ = Q(str2);
        this.f24094c = strQ;
        if (!TextUtils.isEmpty(strQ)) {
            try {
                this.f24095d = InetAddress.getByName(this.f24094c);
            } catch (UnknownHostException e2) {
                String str10 = this.f24094c;
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(str10).length() + 48 + String.valueOf(message).length());
                sb.append("Unable to convert host address (");
                sb.append(str10);
                sb.append(") to ipaddress: ");
                sb.append(message);
                Log.i("CastDevice", sb.toString());
            }
        }
        this.f24096e = Q(str3);
        this.f24097f = Q(str4);
        this.f24098g = Q(str5);
        this.f24099h = i2;
        this.f24100i = list != null ? list : new ArrayList<>();
        this.f24101j = i3;
        this.f24102k = i4;
        this.f24103l = Q(str6);
        this.f24104m = str7;
        this.f24105n = i5;
        this.f24106o = str8;
        this.p = bArr;
        this.q = str9;
    }

    public static CastDevice K(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public static String Q(String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public String I() {
        return this.f24098g;
    }

    public String J() {
        return this.f24096e;
    }

    public List<c.f.a.c.f.p.a> L() {
        return Collections.unmodifiableList(this.f24100i);
    }

    public String M() {
        return this.f24097f;
    }

    public int N() {
        return this.f24099h;
    }

    public boolean O(int i2) {
        return (this.f24101j & i2) == i2;
    }

    public void P(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    public final String R() {
        return this.f24104m;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.f24093b;
        return str == null ? castDevice.f24093b == null : c.f.a.c.d.v.a.f(str, castDevice.f24093b) && c.f.a.c.d.v.a.f(this.f24095d, castDevice.f24095d) && c.f.a.c.d.v.a.f(this.f24097f, castDevice.f24097f) && c.f.a.c.d.v.a.f(this.f24096e, castDevice.f24096e) && c.f.a.c.d.v.a.f(this.f24098g, castDevice.f24098g) && this.f24099h == castDevice.f24099h && c.f.a.c.d.v.a.f(this.f24100i, castDevice.f24100i) && this.f24101j == castDevice.f24101j && this.f24102k == castDevice.f24102k && c.f.a.c.d.v.a.f(this.f24103l, castDevice.f24103l) && c.f.a.c.d.v.a.f(Integer.valueOf(this.f24105n), Integer.valueOf(castDevice.f24105n)) && c.f.a.c.d.v.a.f(this.f24106o, castDevice.f24106o) && c.f.a.c.d.v.a.f(this.f24104m, castDevice.f24104m) && c.f.a.c.d.v.a.f(this.f24098g, castDevice.I()) && this.f24099h == castDevice.N() && (((bArr = this.p) == null && castDevice.p == null) || Arrays.equals(bArr, castDevice.p)) && c.f.a.c.d.v.a.f(this.q, castDevice.q);
    }

    public int hashCode() {
        String str = this.f24093b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return String.format("\"%s\" (%s)", this.f24096e, this.f24093b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.s(parcel, 2, this.f24093b, false);
        c.s(parcel, 3, this.f24094c, false);
        c.s(parcel, 4, J(), false);
        c.s(parcel, 5, M(), false);
        c.s(parcel, 6, I(), false);
        c.l(parcel, 7, N());
        c.w(parcel, 8, L(), false);
        c.l(parcel, 9, this.f24101j);
        c.l(parcel, 10, this.f24102k);
        c.s(parcel, 11, this.f24103l, false);
        c.s(parcel, 12, this.f24104m, false);
        c.l(parcel, 13, this.f24105n);
        c.s(parcel, 14, this.f24106o, false);
        c.f(parcel, 15, this.p, false);
        c.s(parcel, 16, this.q, false);
        c.b(parcel, iA);
    }
}
