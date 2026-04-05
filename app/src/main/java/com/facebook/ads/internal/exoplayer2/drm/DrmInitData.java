package com.facebook.ads.internal.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.Bs;
import com.facebook.ads.redexgen.X.C05639t;
import com.facebook.ads.redexgen.X.C0609Bt;
import com.facebook.ads.redexgen.X.IM;
import com.facebook.ads.redexgen.X.J1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static String[] A04;
    public static final Parcelable.Creator<DrmInitData> CREATOR;
    public int A00;
    public final int A01;

    @Nullable
    public final String A02;
    public final SchemeData[] A03;

    public static void A02() {
        A04 = new String[]{"8bdUvaky5WHdDfVtqwXLakhjtGg6hs0c", "CSUdOCO5ftZIoIqJhT3Nbwo3RnwWTbkq", "vzkDrAJxp6TV0asAVFNpHo5ff03W8L4C", "3CPPKLCdNdSlf2uW7xM1UEZDCok6HZIU", "mnhq363EVnPm6bnzgoRKNwVQQZg6aqu6", "KD2Si0NJCJWXzNPR5NKnBolICvozfmpB", "Z", "WysYYCxVTVW1uXFpDxeWkwgjJbtDWfH7"};
    }

    public static final class SchemeData implements Parcelable {
        public static String[] A06;
        public static final Parcelable.Creator<SchemeData> CREATOR;
        public int A00;

        @Nullable
        public final String A01;
        public final String A02;
        public final boolean A03;
        public final byte[] A04;
        public final UUID A05;

        public static void A01() {
            A06 = new String[]{"FfOodbYcKtbLKDRgim9u7cuo", "NIbXOynBiooMG0S9J28EQxAtJZpLZjNW", "C", "V6JUT1Nk4hAUvorEbipITNdn0olHm5RE", "eq3iucunEPOJjPN", "pnR6rnWbcJIrtQWCkJwENO", "PAZI29otaA64eWNvlBcxsuWWkBf029P2", "o6I7wssHkhPR10FgybVRhye00pbKkIDj"};
        }

        static {
            A01();
            CREATOR = new C0609Bt();
        }

        public SchemeData(Parcel parcel) {
            this.A05 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
            this.A03 = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, byte[] bArr, boolean z) {
            this.A05 = (UUID) IM.A01(uuid);
            this.A01 = str;
            this.A02 = (String) IM.A01(str2);
            this.A04 = bArr;
            this.A03 = z;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, z);
        }

        public final boolean A02() {
            return this.A04 != null;
        }

        public final boolean A03(SchemeData schemeData) {
            if (A02()) {
                boolean zA02 = schemeData.A02();
                String[] strArr = A06;
                if (strArr[1].charAt(18) == strArr[3].charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[6] = "ytv8VxSVsCzF6lWxaONUv2jLXz5aktl6";
                strArr2[6] = "ytv8VxSVsCzF6lWxaONUv2jLXz5aktl6";
                if (!zA02 && A04(schemeData.A05)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean A04(UUID uuid) {
            return C05639t.A04.equals(this.A05) || uuid.equals(this.A05);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return J1.A0k(this.A01, schemeData.A01) && J1.A0k(this.A02, schemeData.A02) && J1.A0k(this.A05, schemeData.A05) && Arrays.equals(this.A04, schemeData.A04);
        }

        public final int hashCode() {
            if (this.A00 == 0) {
                int iHashCode = this.A05.hashCode() * 31;
                String str = this.A01;
                if (A06[5].length() == 21) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[2] = "3";
                strArr[2] = "3";
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                int result = this.A02.hashCode();
                this.A00 = ((iHashCode2 + result) * 31) + Arrays.hashCode(this.A04);
            }
            int result2 = this.A00;
            return result2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.A05.getMostSignificantBits());
            parcel.writeLong(this.A05.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
            parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        }
    }

    static {
        A02();
        CREATOR = new Bs();
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A01 = this.A03.length;
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        Arrays.sort(schemeDataArr, this);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        if (!C05639t.A04.equals(schemeData.A05)) {
            return schemeData.A05.compareTo(schemeData2.A05);
        }
        UUID uuid = C05639t.A04;
        String[] strArr = A04;
        if (strArr[2].charAt(27) != strArr[1].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "UJNVxnyD05Ff97smdNbQ52dPpWZWnGWu";
        strArr2[1] = "8h5dygAHbIm1cQj3dlT8FNkqjk3WwzL5";
        return uuid.equals(schemeData2.A05) ? 0 : 1;
    }

    @Nullable
    public static DrmInitData A01(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        if (drmInitData != null) {
            str = drmInitData.A02;
            for (SchemeData schemeData : drmInitData.A03) {
                if (schemeData.A02()) {
                    arrayList.add(schemeData);
                }
            }
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.A02;
            }
            int size = arrayList.size();
            for (SchemeData data : drmInitData2.A03) {
                String[] strArr = A04;
                if (strArr[4].charAt(27) == strArr[0].charAt(27)) {
                    String[] strArr2 = A04;
                    strArr2[4] = "G6nQ3x1CDAryZeDNWH7T2bNpdDV6NMZ4";
                    strArr2[0] = "yNYki7SUkVdoU5W95tONMOUkter6cpvQ";
                    if (data.A02()) {
                        UUID uuid = data.A05;
                        String[] strArr3 = A04;
                        if (strArr3[6].length() != strArr3[7].length()) {
                            String[] strArr4 = A04;
                            strArr4[3] = "2IV57qZtYiHn5vBDR78ST1LbCkGZYE2t";
                            strArr4[5] = "qUyDGrLSFsPlLiQUrRnSnWTNCFNGiVfh";
                            if (!A03(arrayList, size, uuid)) {
                                arrayList.add(data);
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    public static boolean A03(ArrayList<SchemeData> arrayList, int i2, UUID uuid) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (arrayList.get(i3).A05.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public final SchemeData A04(int i2) {
        return this.A03[i2];
    }

    public final DrmInitData A05(@Nullable String str) {
        if (J1.A0k(this.A02, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.A03);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return J1.A0k(this.A02, drmInitData.A02) && Arrays.equals(this.A03, drmInitData.A03);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            String str = this.A02;
            this.A00 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.A03);
        }
        int result = this.A00;
        return result;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
