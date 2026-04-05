package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S5 implements KZ {
    public static byte[] A0E;
    public static String[] A0F;
    public InterfaceC03631m A00;
    public C05408v A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;

    @Nullable
    public final AdSize A06;
    public final C03430s A07;
    public final X2 A08;
    public final JZ A09;
    public final KD A0A;
    public final C0809Ka A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[1] = "uoxYJqIRleds8fPMMv";
            strArr[1] = "uoxYJqIRleds8fPMMv";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 87);
            i5++;
        }
    }

    public static void A05() {
        byte[] bArr = {54, 51, 70, 51, -20, -19, -18, -15, -10, -15, -4, -15, -9, -10, 8, 9, -70, 10, 6, -5, -3, -1, 7, -1, 8, DateTimeFieldType.HOUR_OF_HALFDAY, -70, 3, 8, -70, 12, -1, DateTimeFieldType.HALFDAY_OF_DAY, 10, 9, 8, DateTimeFieldType.HALFDAY_OF_DAY, -1};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[1] = "dKV76OJFyRmVPWeRzZ";
        strArr[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    public static void A06() {
        A0F = new String[]{"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    }

    static {
        A06();
        A05();
        M1.A02();
    }

    public S5(X2 x2, String str, KD kd, @Nullable AdSize adSize, int i2) {
        this.A08 = x2;
        this.A0D = str;
        this.A0A = kd;
        this.A06 = adSize;
        this.A04 = i2;
        this.A0B = new C0809Ka(this.A08);
        this.A0B.A0R(this);
        this.A07 = new C03430s();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new C0677Eu(this);
        this.A09 = x2.A06();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C0986Rb> A04() {
        C05408v c05408v = this.A01;
        ArrayList arrayList = new ArrayList(c05408v.A02());
        for (C05388t c05388tA04 = c05408v.A04(); c05388tA04 != null; c05388tA04 = c05408v.A04()) {
            InterfaceC03380n interfaceC03380nA00 = this.A07.A00(AdPlacementType.NATIVE);
            if (interfaceC03380nA00 != null && interfaceC03380nA00.A6l() == AdPlacementType.NATIVE) {
                HashMap map = new HashMap();
                map.put(A03(0, 4, 123), c05388tA04.A06());
                map.put(A03(4, 10, 49), c05408v.A05());
                C0986Rb c0986Rb = (C0986Rb) interfaceC03380nA00;
                c0986Rb.A0Y(this.A08, new S4(this, arrayList, c0986Rb), this.A09, map, C1320bj.A0I());
            }
        }
        return arrayList;
    }

    public final void A07() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A08() {
        try {
            KI ki = new KI(this.A08, null, null, null);
            X2 x2 = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0Q(new KX(x2, str, adSize != null ? new C0834Lc(adSize.getHeight(), this.A06.getWidth()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isChildDirected() || AdSettings.isMixedAudience(), ki, C0839Li.A01(JT.A0G(this.A08)), this.A02, null));
        } catch (K8 e2) {
            A9b(K7.A03(e2));
        }
    }

    public final void A09(InterfaceC03631m interfaceC03631m) {
        this.A00 = interfaceC03631m;
    }

    public final void A0A(String str) {
        this.A02 = str;
    }

    public final boolean A0B() {
        C05408v c05408v = this.A01;
        return c05408v == null || c05408v.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.KZ
    public final void A9b(K7 k7) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        InterfaceC03631m interfaceC03631m = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "yGn7NPCZVX";
        strArr[2] = "yGn7NPCZVX";
        if (interfaceC03631m != null) {
            interfaceC03631m.A9b(k7);
        }
    }

    @Override // com.facebook.ads.redexgen.X.KZ
    public final void AB5(C1256ah c1256ah) {
        C05408v c05408vA00 = c1256ah.A00();
        if (c05408vA00 != null) {
            if (this.A03) {
                long jA0A = c05408vA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = c05408vA00;
            List<C0986Rb> listA04 = A04();
            if (this.A00 != null) {
                if (listA04.isEmpty()) {
                    this.A00.A9b(K7.A02(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.AAK(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(14, 24, 67));
    }
}
