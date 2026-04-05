package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0678Ev extends AbstractC1010Rz {
    public static byte[] A00;
    public static String[] A01;

    static {
        A04();
        A03();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, 12, 69, 95, 12, 66, 67, 88, 12, 94, 73, 77, 72, 85, 12, 67, 94, 12, 77, 64, 94, 73, 77, 72, 85, 12, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    public static void A04() {
        A01 = new String[]{"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};
    }

    public C0678Ev(X2 x2, C03611k c03611k) {
        super(x2, c03611k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j2) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j2));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(List<String> list, Map<String, String> map) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            strArr2[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (zHasNext) {
                new QR(this.A0C, map).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0N() {
        C0986Rb c0986Rb = (C0986Rb) this.A02;
        if (c0986Rb.A0g()) {
            this.A07.A0A(c0986Rb);
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0Q(InterfaceC03380n interfaceC03380n, C05408v c05408v, C05388t c05388t, Map<String, Object> map) {
        C0986Rb c0986Rb = (C0986Rb) interfaceC03380n;
        long jCurrentTimeMillis = System.currentTimeMillis();
        S2 s2 = new S2(this, map, c0986Rb, jCurrentTimeMillis, c05388t);
        A0G().postDelayed(s2, c05408v.A05().A05());
        c0986Rb.A0Y(this.A0C, new S3(this, s2, jCurrentTimeMillis, c05388t), this.A09, map, C1320bj.A0I());
    }
}
