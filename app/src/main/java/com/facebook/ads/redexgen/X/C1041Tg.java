package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1041Tg implements C5S {
    public static byte[] A03;
    public static String[] A04;
    public final QW A01;
    public Set<C5V> A00 = new HashSet();
    public final List<C5U> A02 = new ArrayList();

    static {
        A03();
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, 11, -46, -72, -67, 11, 41, 59, 59, 45, 60, 59};
    }

    public static void A03() {
        A04 = new String[]{"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    }

    public C1041Tg(InterfaceC0967Qi interfaceC0967Qi) {
        this.A01 = interfaceC0967Qi.A4O(QX.A0B);
        this.A01.A3I(new C1040Tf(this));
        A04();
    }

    @Nullable
    public static Set<C5V> A01(JSONObject jSONObject) {
        C1042Th c1042ThA00;
        HashSet hashSet = new HashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            JSONObject assetJson = jSONArrayOptJSONArray.optJSONObject(i2);
            if (assetJson == null || (c1042ThA00 = C1042Th.A00(assetJson)) == null) {
                return null;
            }
            hashSet.add(c1042ThA00);
            int i3 = A04[1].length();
            if (i3 == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A04() {
        if (this.A01.A7m()) {
            Set<C5V> setA01 = A01(this.A01.A5z());
            if (!this.A00.equals(setA01) && setA01 != null) {
                this.A00 = setA01;
                for (C5U listener : this.A02) {
                    listener.A3T();
                }
            }
            for (C5V c5v : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), c5v.A7G(), c5v.getUrl());
            }
            String[] strArr = A04;
            if (strArr[7].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "QCTm4IXNPJ";
            strArr2[0] = "QCTm4IXNPJ";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5S
    public final void A3G(C5U c5u) {
        this.A02.add(c5u);
    }

    @Override // com.facebook.ads.redexgen.X.C5S
    public final synchronized Set<C5V> A5P() {
        return new HashSet(this.A00);
    }
}
