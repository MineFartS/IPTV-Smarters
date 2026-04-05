package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yy implements yr {
    public static final Parcelable.Creator<yy> CREATOR = new yz(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f23824h;

    public yy(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f23817a = i2;
        this.f23818b = str;
        this.f23819c = str2;
        this.f23820d = i3;
        this.f23821e = i4;
        this.f23822f = i5;
        this.f23823g = i6;
        this.f23824h = bArr;
    }

    public yy(Parcel parcel) {
        this.f23817a = parcel.readInt();
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23818b = string;
        this.f23819c = parcel.readString();
        this.f23820d = parcel.readInt();
        this.f23821e = parcel.readInt();
        this.f23822f = parcel.readInt();
        this.f23823g = parcel.readInt();
        this.f23824h = (byte[]) amn.A(parcel.createByteArray());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yr
    public final /* synthetic */ void a(ko koVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yy.class == obj.getClass()) {
            yy yyVar = (yy) obj;
            if (this.f23817a == yyVar.f23817a && this.f23818b.equals(yyVar.f23818b) && this.f23819c.equals(yyVar.f23819c) && this.f23820d == yyVar.f23820d && this.f23821e == yyVar.f23821e && this.f23822f == yyVar.f23822f && this.f23823g == yyVar.f23823g && Arrays.equals(this.f23824h, yyVar.f23824h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f23817a + 527) * 31) + this.f23818b.hashCode()) * 31) + this.f23819c.hashCode()) * 31) + this.f23820d) * 31) + this.f23821e) * 31) + this.f23822f) * 31) + this.f23823g) * 31) + Arrays.hashCode(this.f23824h);
    }

    public final String toString() {
        String str = this.f23818b;
        String str2 = this.f23819c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f23817a);
        parcel.writeString(this.f23818b);
        parcel.writeString(this.f23819c);
        parcel.writeInt(this.f23820d);
        parcel.writeInt(this.f23821e);
        parcel.writeInt(this.f23822f);
        parcel.writeInt(this.f23823g);
        parcel.writeByteArray(this.f23824h);
    }
}
