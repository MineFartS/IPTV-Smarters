package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.settings.AdSharedPreferences;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1252ad extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ Context A00;

    static {
        A03();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{86, -123, -123, 98, 126, -125, 104, 121, -128, 107, 122, -121, -120, 126, -124, -125};
    }

    public static void A03() {
        A02 = new String[]{"562InPUOhACtlwCEtN", "R5lwX4z8RDFVh5E8umVQyGbxSoVGO", "CYUCoKvLVtAS439EMb", "ChKnavF9Nqo0oetaNymcfBGaHAWTYXo2", "g5ZzVDftJQYE4wszTnHA7JY3RdMW3", "1hyLjyvULyVtl4OO", "Eld6CqAd7cnvJnvbiWS", "Re88eRXq7VTIVsZrXxwUq3yVYBRsOkYZ"};
    }

    public C1252ad(Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        int iA02;
        if (LM.A02 == LL.A02) {
            return;
        }
        SharedPreferences sharedPreferences = AdSharedPreferences.getSharedPreferences(this.A00);
        String strA00 = A00(0, 16, 10);
        int returnMinSdkVersion = sharedPreferences.getInt(strA00, -1);
        if (returnMinSdkVersion != -1) {
            int unused = LM.A00 = returnMinSdkVersion;
            LM.A02 = LL.A02;
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            iA02 = LM.A03(this.A00);
        } else {
            iA02 = LM.A02(this.A00);
        }
        int unused2 = LM.A00 = iA02;
        if (A02[7].charAt(31) == 71) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "Y4NBnL2AiN9ppE2ANDhRNdYoO8WQhPKC";
        strArr[3] = "Y4NBnL2AiN9ppE2ANDhRNdYoO8WQhPKC";
        sharedPreferences.edit().putInt(strA00, iA02).commit();
        LM.A02 = LL.A02;
    }
}
