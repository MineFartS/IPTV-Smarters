package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.C0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(18)
public final class YN<T extends C0> implements InterfaceC0612Bz<T>, InterfaceC0598Bg<T> {
    public static byte[] A0D;
    public static String[] A0E;
    public int A00;
    public Looper A01;
    public byte[] A02;
    public final int A03;
    public final C0604Bm A04;
    public final C6<T> A05;
    public final CA A06;
    public final HashMap<String, String> A07;
    public final List<YK<T>> A08;
    public final List<YK<T>> A09;
    public final UUID A0A;
    public final boolean A0B;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/YN<TT;>.MediaDrmHandler; */
    public volatile HandlerC0607Bp A0C;

    static {
        A04();
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{74, 107, 104, 111, 123, 98, 122, 74, 124, 99, 93, 107, 125, 125, 103, 97, 96, 67, 105, 124, 9, 63, 32, 4, 35, 36, 57, 9, 44, 57, 44, 109, 34, 35, 33, 52, 109, 46, 34, 35, 57, 44, 36, 35, 62, 109, 46, 34, 32, 32, 34, 35, 109, 29, 30, 30, 5, 109, 30, 46, 37, 40, 32, 40, 9, 44, 57, 44, 99, 109, 12, 62, 62, 56, 32, 36, 35, 42, 109, 62, 56, 61, 61, 34, 63, 57, 109, 43, 34, 63, 119, 109, 109, 108, 109, 63, 120, 121, 120, 104, 10, 12, 7, 10, 49, 55, 60, 33};
    }

    public static void A04() {
        A0E = new String[]{"0jHq0iWGhsIySlQoDiDGup3biHh1u6", "i2l5O7Dt7qLUzCpPXTMvAA2Zo4KmgWR2", "WWWB5", "5af5rLtbMnzIwH5Nva3tIodv6", "N1ag4SyeR1bkHrLLU69ntDAZG70pDTMe", "aZncB9cokv9961OmHq", "gIBDsbvLQEgXIogWiAeZHaFgFZc1jweS", "Prja9buVBy0glhaqAx1SHba3MELDXzlR"};
    }

    public static DrmInitData.SchemeData A00(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.A01);
        int i2 = 0;
        while (true) {
            boolean z2 = false;
            if (i2 < drmInitData.A01) {
                DrmInitData.SchemeData schemeDataA04 = drmInitData.A04(i2);
                boolean zA04 = schemeDataA04.A04(uuid);
                if (A0E[0].length() != 30) {
                    break;
                }
                String[] strArr = A0E;
                strArr[2] = "V0Q9eaLMfBF3CEdW";
                strArr[2] = "V0Q9eaLMfBF3CEdW";
                if (zA04 || (C05639t.A01.equals(uuid) && schemeDataA04.A04(C05639t.A02))) {
                    z2 = true;
                }
                if (z2 && (schemeDataA04.A04 != null || z)) {
                    arrayList.add(schemeDataA04);
                }
                i2++;
            } else {
                if (arrayList.isEmpty()) {
                    return null;
                }
                if (C05639t.A05.equals(uuid)) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i3);
                        int version = schemeData.A02() ? C0633Cy.A00(schemeData.A04) : -1;
                        if (J1.A02 < 23 && version == 0) {
                            return schemeData;
                        }
                        if (J1.A02 >= 23 && version == 1) {
                            return schemeData;
                        }
                    }
                }
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(0);
                if (A0E[6].charAt(29) == 'w') {
                    String[] strArr2 = A0E;
                    strArr2[7] = "QMUEyZuv57oImxraVf5zIpun0ErJkPMX";
                    strArr2[7] = "QMUEyZuv57oImxraVf5zIpun0ErJkPMX";
                    return schemeData2;
                }
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YN != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C0> */
    public final void A05(Handler handler, InterfaceC0605Bn interfaceC0605Bn) {
        this.A04.A03(handler, interfaceC0605Bn);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YN != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Bz
    public final InterfaceC0611By<T> A2Q(Looper looper, DrmInitData drmInitData) {
        Looper looper2 = this.A01;
        IM.A04(looper2 == null || looper2 == looper);
        if (this.A09.isEmpty()) {
            this.A01 = looper;
            if (this.A0C == null) {
                this.A0C = new HandlerC0607Bp(this, looper);
            }
        }
        DrmInitData.SchemeData schemeDataA00 = null;
        YK<T> yk = null;
        if (this.A02 == null && (schemeDataA00 = A00(drmInitData, this.A0A, false)) == null) {
            C0608Bq c0608Bq = new C0608Bq(this.A0A);
            this.A04.A04(c0608Bq);
            return new YO(new C0610Bw(c0608Bq));
        }
        if (this.A0B) {
            if (A0E[6].charAt(29) == 'w') {
                String[] strArr = A0E;
                strArr[7] = "2tfSkouS8gaRHNrU7OMeTyiBrWH6VnUA";
                strArr[7] = "2tfSkouS8gaRHNrU7OMeTyiBrWH6VnUA";
                byte[] bArr = schemeDataA00 != null ? schemeDataA00.A04 : null;
                Iterator<YK<T>> it = this.A09.iterator();
                while (true) {
                    if (it.hasNext()) {
                        YK<T> next = it.next();
                        if (next.A0N(bArr)) {
                            yk = next;
                            break;
                        }
                    } else {
                        yk = null;
                        break;
                    }
                }
            } else {
                throw new RuntimeException();
            }
        } else if (!this.A09.isEmpty()) {
            YK<T> yk2 = this.A09.get(0);
            if (A0E[0].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "NYlDF58TVUPxDFfWvHrOlngI";
            strArr2[5] = "NYlDF58TVUPxDFfWvHrOlngI";
            yk = yk2;
        }
        if (yk == null) {
            yk = new YK<>(this.A0A, this.A05, this, schemeDataA00, this.A00, this.A02, this.A07, this.A06, looper, this.A04, this.A03);
            this.A09.add(yk);
        }
        yk.A0H();
        return yk;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YN != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Bz
    public final boolean A3x(@NonNull DrmInitData drmInitData) {
        if (this.A02 != null) {
            return true;
        }
        DrmInitData.SchemeData schemeDataA00 = A00(drmInitData, this.A0A, true);
        if (A0E[2].length() == 25) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[2] = "f9Fo7yPZ7tYjgWekbXY";
        strArr[2] = "f9Fo7yPZ7tYjgWekbXY";
        if (schemeDataA00 == null) {
            if (drmInitData.A01 != 1 || !drmInitData.A04(0).A04(C05639t.A02)) {
                return false;
            }
            Log.w(A01(0, 20, 43), A01(20, 72, 104) + this.A0A);
        }
        String str = drmInitData.A02;
        if (str == null || A01(100, 4, 76).equals(str)) {
            return true;
        }
        return !(A01(92, 4, 43).equals(str) || A01(96, 4, 62).equals(str) || A01(104, 4, 119).equals(str)) || J1.A02 >= 25;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YN != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0598Bg
    public final void AAg() {
        Iterator<YK<T>> it = this.A08.iterator();
        while (it.hasNext()) {
            it.next().A0I();
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YN != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0598Bg
    public final void AAh(Exception exc) {
        Iterator<YK<T>> it = this.A08.iterator();
        while (it.hasNext()) {
            it.next().A0L(exc);
        }
        List<YK<T>> list = this.A08;
        String[] strArr = A0E;
        if (strArr[4].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[3] = "LfmgySfdwng";
        strArr2[3] = "LfmgySfdwng";
        list.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YN != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0598Bg
    public final void ABv(YK<T> yk) {
        this.A08.add(yk);
        if (this.A08.size() == 1) {
            yk.A0J();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.By != com.facebook.ads.internal.exoplayer2.drm.DrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YN != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0612Bz
    public final void ACM(InterfaceC0611By<T> interfaceC0611By) {
        if (interfaceC0611By instanceof YO) {
            return;
        }
        YK<T> yk = (YK) interfaceC0611By;
        if (yk.A0M()) {
            this.A09.remove(yk);
            if (this.A08.size() > 1 && this.A08.get(0) == yk) {
                this.A08.get(1).A0J();
            }
            this.A08.remove(yk);
        }
    }
}
