package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RY implements InterfaceC03380n {
    public static byte[] A0B;
    public static String[] A0C;
    public static final String A0D;
    public InterfaceC03460v A00;
    public C0990Rf A01;
    public DV A02;

    @Nullable
    public JZ A03;

    @Nullable
    @DoNotStrip
    public InterfaceC0890Ni A04;

    @Nullable
    public XL A05;
    public String A06;
    public Map<String, Object> A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 19);
            if (A0C[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0B = new byte[]{-27, -30, -11, -30, -40, -39, -38, -35, -30, -35, -24, -35, -29, -30, -69, -84, -65, -69, 118, -81, -69, -76, -77, 5, 4, -10, -67, -56};
    }

    public static void A08() {
        A0C = new String[]{"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    }

    static {
        A08();
        A07();
        A0D = RY.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A00 != null && this.A08 && (this.A09 || !this.A0A)) {
            this.A00.A96(this, this.A05);
        }
        this.A02.A0A().A3Y(this.A00 != null);
        if (A0C[2].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[2] = "DQYu3GBVfiN4Ml";
        strArr[2] = "DQYu3GBVfiN4Ml";
    }

    private void A0A(C05418w c05418w) {
        C0988Rd c0988RdA00 = C0988Rd.A00((JSONObject) this.A07.get(A05(0, 4, 110)));
        this.A06 = c0988RdA00.A5l();
        if (C03340j.A04(this.A02, c0988RdA00, this.A03)) {
            this.A02.A0A().A41();
            this.A00.A97(this, AdError.internalError(AdError.INTERNAL_ERROR_2006));
            return;
        }
        this.A04 = new F3(this, c0988RdA00);
        this.A05 = new XL(this.A02, new WeakReference(this.A04), c05418w.A04());
        this.A05.A0C(c05418w.A07(), c05418w.A08());
        RX rx = new RX(this);
        DV dv = this.A02;
        JZ jz = this.A03;
        XL xl = this.A05;
        this.A01 = new C0990Rf(dv, jz, xl, xl.getViewabilityChecker(), rx);
        this.A01.A09(c0988RdA00);
        this.A05.loadDataWithBaseURL(C0893Nl.A00(), c0988RdA00.A05(), A05(14, 9, 52), A05(23, 5, 125), null);
        this.A08 = true;
        A06();
    }

    public final void A0D(DV dv, JZ jz, KC kc, InterfaceC03460v interfaceC03460v, Map<String, Object> map) {
        dv.A0A().A3X();
        this.A02 = dv;
        this.A03 = jz;
        this.A00 = interfaceC03460v;
        this.A07 = map;
        this.A0A = JT.A0z(this.A02.getApplicationContext());
        A0A((C05418w) this.A07.get(A05(4, 10, 97)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final String A5l() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final AdPlacementType A6l() {
        return AdPlacementType.BANNER;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03380n
    public final void onDestroy() {
        this.A02.A0A().A3V(this.A05 != null);
        XL xl = this.A05;
        if (xl != null) {
            xl.destroy();
            this.A05 = null;
            this.A04 = null;
        }
    }
}
