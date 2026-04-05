package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0996Rl extends AnonymousClass16 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{66, 64, 83, 78, 84, 82, 68, 77, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88, 90, 75, 88, 89, 67, 68, 77};
    }

    public C0996Rl(List<AnonymousClass19> list) {
        super(list);
    }

    public static C0996Rl A01(JSONObject jSONObject, X2 x2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A02(0, 8, 67));
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                try {
                    JSONObject adJSON = jSONArrayOptJSONArray.getJSONObject(i2);
                    AnonymousClass19 adInfo = AnonymousClass19.A00(adJSON);
                    adInfo.A0I(adJSON);
                    arrayList.add(adInfo);
                } catch (JSONException e2) {
                    x2.A04().A86(A02(20, 7, 72), C05228d.A1p, new C05238e(e2));
                    e2.printStackTrace();
                }
            }
        } else {
            AnonymousClass19 adInfo2 = AnonymousClass19.A00(jSONObject);
            adInfo2.A0I(jSONObject);
            arrayList.add(adInfo2);
        }
        C0996Rl c0996Rl = new C0996Rl(arrayList);
        c0996Rl.A0e(jSONObject);
        c0996Rl.A0c(A02(8, 12, 86));
        return c0996Rl;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass16
    public final int A0I() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass16
    public final int A0J() {
        return 0;
    }
}
