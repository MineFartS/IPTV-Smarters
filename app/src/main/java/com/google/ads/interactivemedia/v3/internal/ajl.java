package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f19897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f19899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f19900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19903g;

    private ajl(Uri uri, int i2, byte[] bArr, Map<String, String> map, long j2, long j3, int i3) {
        boolean z = j2 >= 0;
        ajr.d(z);
        ajr.d(z);
        ajr.d(j3 > 0 || j3 == -1);
        this.f19897a = uri;
        this.f19898b = i2;
        this.f19899c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f19900d = Collections.unmodifiableMap(new HashMap(map));
        this.f19901e = j2;
        this.f19902f = j3;
        this.f19903g = i3;
    }

    public /* synthetic */ ajl(Uri uri, int i2, byte[] bArr, Map map, long j2, long j3, int i3, byte[] bArr2) {
        this(uri, i2, bArr, map, j2, j3, i3);
    }

    public ajl(Uri uri, long j2, long j3) {
        this(uri, 1, null, Collections.emptyMap(), j2, j3, 0);
    }

    public static String b(int i2) {
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return ClientConstants.HTTP_REQUEST_TYPE_POST;
        }
        throw new IllegalStateException();
    }

    public final ajl a(long j2) {
        long j3 = this.f19902f;
        long j4 = j3 != -1 ? j3 - j2 : -1L;
        return (j2 == 0 && j3 == j4) ? this : new ajl(this.f19897a, this.f19898b, this.f19899c, this.f19900d, this.f19901e + j2, j4, this.f19903g);
    }

    public final boolean c(int i2) {
        return (this.f19903g & i2) == i2;
    }

    public final String toString() {
        String strB = b(this.f19898b);
        String strValueOf = String.valueOf(this.f19897a);
        long j2 = this.f19901e;
        long j3 = this.f19902f;
        int i2 = this.f19903g;
        int length = strB.length();
        StringBuilder sb = new StringBuilder(length + 70 + strValueOf.length() + Constants.NULL_VERSION_ID.length());
        sb.append("DataSpec[");
        sb.append(strB);
        sb.append(" ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append((String) null);
        sb.append(", ");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }
}
