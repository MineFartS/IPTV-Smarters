package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QV {
    public static boolean A00(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            QU quA00 = QU.A00(jSONArray, i2);
            QU t2 = QU.A00(jSONArray2, i2);
            if (quA00 != t2 || !quA00.A06(jSONArray, jSONArray2, i2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            QU quA01 = QU.A01(jSONObject, next);
            QU type1 = QU.A01(jSONObject2, next);
            if (quA01 != type1 || !quA01.A08(jSONObject, jSONObject2, next)) {
                return false;
            }
        }
        return true;
    }
}
