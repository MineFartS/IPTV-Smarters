package com.facebook.ads.internal.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.facebook.ads.redexgen.X.AA;
import com.facebook.ads.redexgen.X.J1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Format implements Parcelable {
    public static byte[] A0R;
    public static String[] A0S;
    public static final Parcelable.Creator<Format> CREATOR;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;

    @Nullable
    public final DrmInitData A0H;

    @Nullable
    public final Metadata A0I;

    @Nullable
    public final ColorInfo A0J;

    @Nullable
    public final String A0K;

    @Nullable
    public final String A0L;

    @Nullable
    public final String A0M;

    @Nullable
    public final String A0N;

    @Nullable
    public final String A0O;
    public final List<byte[]> A0P;

    @Nullable
    public final byte[] A0Q;

    public static String A0G(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0H() {
        A0R = new byte[]{60, 48, 35, 47, 84, 4, 45, 48, 47, 35, 54, 106, 8, 64, 52};
    }

    public static void A0I() {
        A0S = new String[]{"vGX1GGEkwYRY6RU49bxQYa9cKSE0JnL1", "jouimqjzRvJJn6CQLj0bvIgvYOaQJ8n7", "okaeuhFd1McrDnHL3LojszCI5VhJZfc6", "B0", "VmcpJpCYh4AjNq0ywjVO25ycqwipB041", "iCSfxmGD7XOmopp", "9Pj1GuzMtk7lxtvUuCnLA1hQ1ukhmjuF", "ElSuOUcfqRTRm52JPbd0IEktycUaIpsD"};
    }

    static {
        A0I();
        A0H();
        CREATOR = new AA();
    }

    public Format(Parcel parcel) {
        this.A0M = parcel.readString();
        this.A0L = parcel.readString();
        this.A0O = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        this.A0Q = J1.A0j(parcel) ? parcel.createByteArray() : null;
        this.A0E = parcel.readInt();
        this.A0J = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0N = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int i2 = parcel.readInt();
        this.A0P = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.A0P.add(parcel.createByteArray());
        }
        this.A0H = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.A0I = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public Format(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, @Nullable byte[] bArr, int i7, @Nullable ColorInfo colorInfo, int i8, int i9, int i10, int i11, int i12, int i13, @Nullable String str5, int i14, long j2, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        int i15 = i6;
        float f4 = f3;
        int i16 = i12;
        int i17 = i11;
        List<byte[]> list2 = list;
        this.A0M = str;
        this.A0L = str2;
        this.A0O = str3;
        this.A0K = str4;
        this.A04 = i2;
        this.A09 = i3;
        this.A0F = i4;
        this.A08 = i5;
        this.A01 = f2;
        this.A0B = i15 == -1 ? 0 : i15;
        this.A02 = f4 == -1.0f ? 1.0f : f4;
        this.A0Q = bArr;
        this.A0E = i7;
        this.A0J = colorInfo;
        this.A05 = i8;
        this.A0C = i9;
        this.A0A = i10;
        this.A06 = i17 == -1 ? 0 : i17;
        this.A07 = i16 == -1 ? 0 : i16;
        this.A0D = i13;
        this.A0N = str5;
        this.A03 = i14;
        this.A0G = j2;
        this.A0P = list2 == null ? Collections.emptyList() : list2;
        this.A0H = drmInitData;
        this.A0I = metadata;
    }

    public static Format A00(@Nullable String str, String str2, int i2, @Nullable String str3) {
        return A01(str, str2, i2, str3, null);
    }

    public static Format A01(@Nullable String str, String str2, int i2, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, null, -1, i2, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A02(@Nullable String str, @Nullable String str2, long j2) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j2, null, null, null);
    }

    public static Format A03(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> initializationData, int i6, float f3, @Nullable DrmInitData drmInitData) {
        return A04(str, str2, str3, i2, i3, i4, i5, f2, initializationData, i6, f3, null, -1, null, drmInitData);
    }

    public static Format A04(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i2, i3, i4, i5, f2, i6, f3, bArr, i7, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A05(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, @Nullable DrmInitData drmInitData, int i9, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, str2, str3, i2, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, i7, i8, i9, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format A06(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int i7, @Nullable String str4) {
        return A05(str, str2, str3, i2, i3, i4, i5, i6, -1, -1, initializationData, drmInitData, i7, str4, null);
    }

    public static Format A07(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, int i4, int i5, List<byte[]> initializationData, @Nullable DrmInitData drmInitData, int i6, @Nullable String str4) {
        return A06(str, str2, str3, i2, i3, i4, i5, -1, initializationData, drmInitData, i6, str4);
    }

    public static Format A08(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, @Nullable String str4, int i4, @Nullable DrmInitData drmInitData) {
        return A09(str, str2, str3, i2, i3, str4, i4, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A09(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, @Nullable String str4, int i4, @Nullable DrmInitData drmInitData, long j2, List<byte[]> list) {
        return new Format(str, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, i4, j2, list, drmInitData, null);
    }

    public static Format A0A(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, int i3, List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format A0B(@Nullable String str, @Nullable String str2, @Nullable String str3, int i2, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public static Format A0C(@Nullable String str, @Nullable String str2, String str3, String str4, int i2, int i3, int i4, float f2, List<byte[]> list, int i5) {
        return new Format(str, str2, str3, str4, i2, -1, i3, i4, f2, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i5, null, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format A0D(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, int i3, int i4, List<byte[]> list, int i5, @Nullable String str5) {
        return new Format(str, str2, str3, str4, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, -1, -1, -1, i5, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format A0E(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, int i3, @Nullable String str5) {
        return new Format(str, str2, str3, str4, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static Format A0F(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, int i3, @Nullable String str5, int i4) {
        return new Format(str, str2, str3, str4, i2, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str5, i4, Long.MAX_VALUE, null, null, null);
    }

    public final int A0J() {
        int i2;
        int i3 = this.A0F;
        if (i3 == -1 || (i2 = this.A08) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final Format A0K(int i2) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, i2, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0L(int i2, int i3) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, i2, i3, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0M(long j2) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, j2, this.A0P, this.A0H, this.A0I);
    }

    public final Format A0N(Format format) {
        if (this == format) {
            return this;
        }
        String str = format.A0M;
        String codecs = this.A0K;
        if (codecs == null) {
            codecs = format.A0K;
        }
        int bitrate = this.A04;
        if (bitrate == -1) {
            bitrate = format.A04;
        }
        float f2 = this.A01;
        if (f2 == -1.0f) {
            f2 = format.A01;
        }
        int i2 = this.A0D | format.A0D;
        String str2 = this.A0N;
        if (str2 == null) {
            str2 = format.A0N;
        }
        DrmInitData drmInitDataA01 = DrmInitData.A01(format.A0H, this.A0H);
        String str3 = this.A0L;
        String str4 = this.A0O;
        int i3 = this.A09;
        int i4 = this.A0F;
        int i5 = this.A08;
        int i6 = this.A0B;
        float frameRate = this.A02;
        return new Format(str, str3, str4, codecs, bitrate, i3, i4, i5, f2, i6, frameRate, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, i2, str2, this.A03, this.A0G, this.A0P, drmInitDataA01, this.A0I);
    }

    public final Format A0O(@Nullable DrmInitData drmInitData) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, drmInitData, this.A0I);
    }

    public final Format A0P(@Nullable Metadata metadata) {
        return new Format(this.A0M, this.A0L, this.A0O, this.A0K, this.A04, this.A09, this.A0F, this.A08, this.A01, this.A0B, this.A02, this.A0Q, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0N, this.A03, this.A0G, this.A0P, this.A0H, metadata);
    }

    public final boolean A0Q(Format format) {
        if (this.A0P.size() != format.A0P.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.A0P.size(); i2++) {
            if (!Arrays.equals(this.A0P.get(i2), format.A0P.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.Format.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i2 = 17 * 31;
            String str = this.A0M;
            int iHashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.A0L;
            int result = str2 == null ? 0 : str2.hashCode();
            int i3 = (iHashCode + result) * 31;
            String str3 = this.A0O;
            int iHashCode2 = (i3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.A0K;
            int result2 = str4 == null ? 0 : str4.hashCode();
            int i4 = (((iHashCode2 + result2) * 31) + this.A04) * 31;
            int result3 = this.A0F;
            int i5 = (((i4 + result3) * 31) + this.A08) * 31;
            int result4 = this.A05;
            int i6 = (((i5 + result4) * 31) + this.A0C) * 31;
            String str5 = this.A0N;
            int result5 = str5 == null ? 0 : str5.hashCode();
            int i7 = (i6 + result5) * 31;
            if (A0S[6].charAt(6) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0S;
            strArr[0] = "Pa31ThsuQdloj8lWLbuVRj0Nef3PQXlW";
            strArr[7] = "gnG3aj7z3XBCxLsDLbWk4AuKXzueFLox";
            int i8 = (i7 + this.A03) * 31;
            DrmInitData drmInitData = this.A0H;
            int result6 = drmInitData == null ? 0 : drmInitData.hashCode();
            int i9 = (i8 + result6) * 31;
            Metadata metadata = this.A0I;
            this.A00 = i9 + (metadata != null ? metadata.hashCode() : 0);
        }
        int result7 = this.A00;
        return result7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0G(5, 7, 4));
        sb.append(this.A0M);
        String strA0G = A0G(0, 2, 86);
        sb.append(strA0G);
        sb.append(this.A0L);
        sb.append(strA0G);
        sb.append(this.A0O);
        sb.append(strA0G);
        sb.append(this.A04);
        sb.append(strA0G);
        sb.append(this.A0N);
        String strA0G2 = A0G(2, 3, 73);
        sb.append(strA0G2);
        sb.append(this.A0F);
        sb.append(strA0G);
        sb.append(this.A08);
        sb.append(strA0G);
        sb.append(this.A01);
        sb.append(A0G(12, 1, 19));
        sb.append(strA0G2);
        sb.append(this.A05);
        sb.append(strA0G);
        sb.append(this.A0C);
        sb.append(A0G(13, 2, 91));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeFloat(this.A02);
        J1.A0Z(parcel, this.A0Q != null);
        byte[] bArr = this.A0Q;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0E);
        parcel.writeParcelable(this.A0J, i2);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A0G);
        int size = this.A0P.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.A0P.get(i3));
            if (A0S[2].charAt(16) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0S;
            strArr[4] = "uEseBvDXMUnwGsdyFGyQsGvPhE4Avh4c";
            strArr[4] = "uEseBvDXMUnwGsdyFGyQsGvPhE4Avh4c";
        }
        parcel.writeParcelable(this.A0H, 0);
        parcel.writeParcelable(this.A0I, 0);
    }
}
