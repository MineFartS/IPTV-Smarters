package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1128Wp extends AbstractC04956s<HashMap<String, Integer>> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-44};
        if (A01[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "SxUYlD3A0WMAhXB5PTE";
        strArr[5] = "SxUYlD3A0WMAhXB5PTE";
        A00 = bArr;
    }

    public static void A02() {
        A01 = new String[]{"Nq1Kb9TOHvzWwANjwVGizSKF", "JWM4IVLufHQSkDOJGyecwcJ9XG51cvJk", "QEyZFLJTZNzdsjJkYvljVioyRUG2XSKd", "n7SG", "D5E01LJ4kvbqK2OQmpgiuXTPXhrvg0RI", "iCSdHB", "iogVWxzO6MdlKqT6F77t9UC3cqMLTkpE", "gUxLojtchnnArKauALgqkHsSrkkPr"};
    }

    public C1128Wp(long j2, @Nullable C04936q c04936q, HashMap<String, Integer> signalValues) {
        super(j2, c04936q, signalValues, EnumC04946r.A07);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final int A07() {
        int length = 0;
        for (String key : A08().keySet()) {
            length += key.getBytes().length;
        }
        return (A08().size() * 4) + length;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        HashMap<String, Integer> mapA08 = A08();
        Set<String> setKeySet = mapA08.keySet();
        JSONObject jSONObject2 = new JSONObject();
        for (String str : setKeySet) {
            jSONObject2.put(str, mapA08.get(str));
        }
        jSONObject.put(A00(0, 1, 13), jSONObject2);
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<java.lang.String, java.lang.Integer>> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0B(AbstractC04956s<HashMap<String, Integer>> abstractC04956s) {
        if (A08() != null) {
            HashMap<String, Integer> mapA08 = abstractC04956s.A08();
            if (A01[6].charAt(14) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "ZRsxwV5SobJQ5cDwe7XAzXaVJFGFHkOZ";
            strArr[1] = "ZRsxwV5SobJQ5cDwe7XAzXaVJFGFHkOZ";
            if (mapA08 != null) {
                if (A08().size() != abstractC04956s.A08().size()) {
                    return false;
                }
                HashMap<String, Integer> mapA082 = abstractC04956s.A08();
                HashMap<String, Integer> mapA083 = A08();
                Iterator<String> it = mapA082.keySet().iterator();
                Iterator<String> prevSignalValueKeys = mapA083.keySet().iterator();
                while (it.hasNext() && prevSignalValueKeys.hasNext()) {
                    String newSignalValueKey = it.next();
                    String next = prevSignalValueKeys.next();
                    if (!newSignalValueKey.equals(next) || !mapA082.containsKey(newSignalValueKey) || !mapA083.containsKey(next) || !mapA082.get(newSignalValueKey).equals(mapA083.get(next))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return A08() == null && abstractC04956s.A08() == null;
    }
}
