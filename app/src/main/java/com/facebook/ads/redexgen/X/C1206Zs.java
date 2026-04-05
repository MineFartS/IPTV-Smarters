package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1206Zs extends DownloadAction {
    public static byte[] A01;
    public static String[] A02;
    public static final DownloadAction.Deserializer A03;

    @Nullable
    public final String A00;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{3, 1, 28, DateTimeFieldType.SECOND_OF_DAY, 1, DateTimeFieldType.MILLIS_OF_DAY, 0, 0, 26, 5, DateTimeFieldType.MILLIS_OF_DAY};
    }

    public static void A06() {
        A02 = new String[]{"zIk8lFjKPo5VqXBeAWetc3TePOqewtK4", "Krv9CUV84BxP4tXlBDsVq5ZfguHkkPOw", "qZweMgdQpTvQjM16IN332AToX", "5wIly2IGyFbenCO8uByiE", "WVTy90LHtMArJ1Mx15Navn95RKOGxxfC", "YMittl3f14YbQo67yPLY6h3Kxcx5v1", "fVvKsKq8KPyH9", "YcDFZjjwvX0vuueDfq7B81mncQMZao1W"};
    }

    static {
        A06();
        A03();
        A03 = new C1205Zr(A02(0, 11, 68), 0);
    }

    public C1206Zs(Uri uri, boolean z, @Nullable byte[] bArr, @Nullable String str) {
        super(A02(0, 11, 68), 0, uri, z, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1208Zu A08(C0667Ei c0667Ei) {
        return new C1208Zu(this.A01, this.A00, c0667Ei);
    }

    private String A01() {
        String str = this.A00;
        return str != null ? str : IC.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean z = this.A00 != null;
        dataOutputStream.writeBoolean(z);
        if (z) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean A0A(DownloadAction downloadAction) {
        return (downloadAction instanceof C1206Zs) && A01().equals(((C1206Zs) downloadAction).A01());
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        boolean zEquals = super.equals(obj);
        String[] strArr = A02;
        if (strArr[0].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "S1dYnav0YyHlHBWJfncCN";
        strArr2[3] = "S1dYnav0YyHlHBWJfncCN";
        if (!zEquals) {
            return false;
        }
        return J1.A0k(this.A00, ((C1206Zs) obj).A00);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.A00;
        int result = str != null ? str.hashCode() : 0;
        int i2 = iHashCode + result;
        String[] strArr = A02;
        if (strArr[6].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "5idVnwwxM2TXqOP7ezpSPuxFrlenP4PE";
        strArr2[4] = "5idVnwwxM2TXqOP7ezpSPuxFrlenP4PE";
        return i2;
    }
}
