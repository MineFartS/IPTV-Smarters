package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yv implements yr {
    public static final Parcelable.Creator<yv> CREATOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ke f23807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ke f23808g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f23813e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23814h;

    static {
        kd kdVar = new kd();
        kdVar.ae("application/id3");
        f23807f = kdVar.s();
        kd kdVar2 = new kd();
        kdVar2.ae("application/x-scte35");
        f23808g = kdVar2.s();
        CREATOR = new yu();
    }

    public yv(Parcel parcel) {
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23809a = string;
        this.f23810b = parcel.readString();
        this.f23811c = parcel.readLong();
        this.f23812d = parcel.readLong();
        this.f23813e = (byte[]) amn.A(parcel.createByteArray());
    }

    public yv(String str, String str2, long j2, long j3, byte[] bArr) {
        this.f23809a = str;
        this.f23810b = str2;
        this.f23811c = j2;
        this.f23812d = j3;
        this.f23813e = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yr
    public final /* synthetic */ void a(ko koVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.ke b() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f23809a
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L2c
            r2 = -795945609(0xffffffffd08ed577, float:-1.9170834E10)
            if (r1 == r2) goto L22
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L18
            goto L36
        L18:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L22:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 0
            goto L37
        L2c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = 2
            goto L37
        L36:
            r0 = -1
        L37:
            if (r0 == 0) goto L42
            if (r0 == r4) goto L42
            if (r0 == r3) goto L3f
            r0 = 0
            return r0
        L3f:
            com.google.ads.interactivemedia.v3.internal.ke r0 = com.google.ads.interactivemedia.v3.internal.yv.f23808g
            return r0
        L42:
            com.google.ads.interactivemedia.v3.internal.ke r0 = com.google.ads.interactivemedia.v3.internal.yv.f23807f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.yv.b():com.google.ads.interactivemedia.v3.internal.ke");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yv.class == obj.getClass()) {
            yv yvVar = (yv) obj;
            if (this.f23811c == yvVar.f23811c && this.f23812d == yvVar.f23812d && amn.O(this.f23809a, yvVar.f23809a) && amn.O(this.f23810b, yvVar.f23810b) && Arrays.equals(this.f23813e, yvVar.f23813e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f23814h;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f23809a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23810b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j2 = this.f23811c;
        long j3 = this.f23812d;
        int iHashCode3 = ((((((iHashCode + iHashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + Arrays.hashCode(this.f23813e);
        this.f23814h = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        String str = this.f23809a;
        long j2 = this.f23812d;
        long j3 = this.f23811c;
        String str2 = this.f23810b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j2);
        sb.append(", durationMs=");
        sb.append(j3);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23809a);
        parcel.writeString(this.f23810b);
        parcel.writeLong(this.f23811c);
        parcel.writeLong(this.f23812d);
        parcel.writeByteArray(this.f23813e);
    }
}
