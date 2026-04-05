package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1126Wn extends AbstractC04956s<C04926p> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "j0mxEJ7PXI6EdILEdAOyominFOl70E0d";
            strArr2[1] = "j0mxEJ7PXI6EdILEdAOyominFOl70E0d";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 111);
            i5++;
        }
    }

    public static void A01() {
        A00 = new byte[]{103};
    }

    public static void A02() {
        A01 = new String[]{"eVrT2", "NU6zFG4u0rUdQg4rmHCYhyhimIYEqcVW", "w8lzJt7", "2MtxRlAdf", "ofvbevjNzGuCdnDr", "yiSP4Q9AL7pZMBsKWJvcqboDvH4W4ekH", "Y5GBNp4gGulMUvRVJRIen52bKNtw4QSM", "rwvebAAeAhhSfHBQ"};
    }

    public C1126Wn(long j2, @Nullable C04936q c04936q, C04926p c04926p) {
        super(j2, c04936q, c04926p, EnumC04946r.A04);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final int A07() {
        return A08().A04();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 126), A08().A09());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalErrorValueTypeDef> */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0B(com.facebook.ads.redexgen.X.AbstractC04956s<com.facebook.ads.redexgen.X.C04926p> r9) {
        /*
            r8 = this;
            java.lang.Object r5 = r8.A08()
            com.facebook.ads.redexgen.X.6p r5 = (com.facebook.ads.redexgen.X.C04926p) r5
            java.lang.Object r4 = r9.A08()
            com.facebook.ads.redexgen.X.6p r4 = (com.facebook.ads.redexgen.X.C04926p) r4
            com.facebook.ads.redexgen.X.6o r1 = r5.A05()
            java.lang.Object r0 = r9.A08()
            com.facebook.ads.redexgen.X.6p r0 = (com.facebook.ads.redexgen.X.C04926p) r0
            com.facebook.ads.redexgen.X.6o r0 = r0.A05()
            boolean r0 = r1.equals(r0)
            r7 = 1
            if (r0 == 0) goto L7e
            int r1 = r5.A03()
            int r0 = r4.A03()
            if (r1 != r0) goto L7e
            r6 = 1
        L2c:
            if (r6 == 0) goto L9d
            com.facebook.ads.redexgen.X.6o r1 = r5.A05()
            com.facebook.ads.redexgen.X.6o r0 = com.facebook.ads.redexgen.X.EnumC04916o.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9d
            java.lang.String r0 = r5.A07()
            if (r0 == 0) goto L9e
            java.lang.String r1 = r5.A07()
            java.lang.String r0 = r4.A07()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
            java.lang.String r0 = r5.A06()
            if (r0 == 0) goto L9e
            java.lang.String r1 = r5.A06()
            java.lang.String r0 = r4.A06()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
            java.lang.String r3 = r5.A08()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1126Wn.A01
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L80
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L7e:
            r6 = 0
            goto L2c
        L80:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1126Wn.A01
            java.lang.String r1 = "qacHDjQO5"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "DaFJoXz"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L9e
            java.lang.String r1 = r5.A08()
            java.lang.String r0 = r4.A08()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9e
        L9c:
            r6 = r6 & r7
        L9d:
            return r6
        L9e:
            r7 = 0
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1126Wn.A0B(com.facebook.ads.redexgen.X.6s):boolean");
    }
}
