package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0997Rm extends AnonymousClass16 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 2751287062553772011L;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{123, 108, 126, 104, 123, 109, 108, 109, 86, 127, 96, 109, 108, 102};
    }

    public C0997Rm(List<AnonymousClass19> list) {
        super(list);
    }

    public static C0997Rm A01(JSONObject jSONObject) {
        AnonymousClass19 anonymousClass19A00 = AnonymousClass19.A00(jSONObject);
        anonymousClass19A00.A0K(true);
        anonymousClass19A00.A0J(jSONObject);
        ArrayList arrayList = new ArrayList();
        arrayList.add(anonymousClass19A00);
        C0997Rm c0997Rm = new C0997Rm(arrayList);
        c0997Rm.A0e(jSONObject);
        c0997Rm.A0c(A02(0, 14, 8));
        return c0997Rm;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass16
    public final int A0I() {
        return A0M().A0E().A06() != null ? 1 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass16
    public final int A0J() {
        return A0M().A0E().A04();
    }
}
