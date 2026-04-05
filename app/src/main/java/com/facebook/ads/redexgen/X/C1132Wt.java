package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1132Wt<K, V> extends AbstractC04956s<HashMap<K, InterfaceC04876k>> {
    public static byte[] A02;
    public static String[] A03;
    public final EnumC04946r A00;
    public final HashMap<K, InterfaceC04876k> A01;

    static {
        A04();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{104};
    }

    public static void A04() {
        A03 = new String[]{"cKuQ341bpQpj1np", "NRRRR4TEAm42mDR", "Q3CZak00lhavTOo6A", "zaO6DFhzYxSygkW1IzlMUY8ES4dk", "HbJVSBx3MNS6tqQ9XVLKo36QU0gI1Znv", "JrCrl10lt1AHnaihPuUoLOH", "SHM67NRdcA0GW9YM4", "2pIXYY"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wt != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    public C1132Wt(long j2, @Nullable C04936q c04936q, HashMap<K, InterfaceC04876k> map, EnumC04946r enumC04946r) {
        super(j2, c04936q, map, EnumC04946r.A0A);
        this.A01 = map;
        this.A00 = enumC04946r;
        if (A05()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wt != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(K k2) {
        int i2 = C04896m.A00[this.A00.ordinal()];
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return ((String) k2).length();
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wt != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    private boolean A05() {
        int i2 = C04896m.A00[this.A00.ordinal()];
        return i2 == 1 || i2 == 2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wt != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final int A07() {
        int iADF = 0;
        if (A08() == null || ((HashMap) A08()).isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : ((HashMap) A08()).entrySet()) {
            int iA00 = iADF + A00(entry.getKey());
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "UsP7Xgcu0nWDAT33HhVsw8aoixo7a0Y1";
            strArr[4] = "UsP7Xgcu0nWDAT33HhVsw8aoixo7a0Y1";
            iADF = iA00 + ((InterfaceC04876k) entry.getValue()).ADF();
        }
        return iADF;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wt != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final JSONObject A09(JSONObject mapJsonObject) throws JSONException {
        Set<K> setKeySet = this.A01.keySet();
        JSONObject jSONObject = new JSONObject();
        for (K k2 : setKeySet) {
            InterfaceC04876k interfaceC04876k = this.A01.get(k2);
            if (A03[5].length() == 26) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "RtRjz";
            strArr[5] = "RtRjz";
            if (interfaceC04876k != null) {
                interfaceC04876k.ADZ(k2, jSONObject);
            }
        }
        mapJsonObject.put(A01(0, 1, 112), jSONObject);
        return mapJsonObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.HashMap<K, com.facebook.ads.internal.botdetection.signals.model.signal_value.IMapSignalValueDef>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wt != com.facebook.ads.internal.botdetection.signals.model.signal_value.MapSignalValueType<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    @SuppressLint({"Nullable Dereference"})
    public final boolean A0B(AbstractC04956s<HashMap<K, InterfaceC04876k>> abstractC04956s) {
        boolean zA7f;
        if (A08() == null || abstractC04956s.A08() == null) {
            return A08() == null && abstractC04956s.A08() == null;
        }
        if (abstractC04956s.A08().size() != A08().size()) {
            return false;
        }
        HashMap<K, InterfaceC04876k> mapA08 = abstractC04956s.A08();
        HashMap<K, InterfaceC04876k> mapA082 = A08();
        Iterator<K> it = mapA08.keySet().iterator();
        Iterator<K> it2 = mapA082.keySet().iterator();
        do {
            boolean zHasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[1].length() == strArr[0].length()) {
                String[] strArr2 = A03;
                strArr2[1] = "rUsYWVrpG3VWCqr";
                strArr2[0] = "lLqYbR21ojeq3r6";
                if (!zHasNext || !it2.hasNext()) {
                    return true;
                }
                K next = it.next();
                K next2 = it2.next();
                if (!next.equals(next2) || !mapA08.containsKey(next) || !mapA082.containsKey(next2)) {
                    return false;
                }
                InterfaceC04876k interfaceC04876k = mapA08.get(next);
                InterfaceC04876k newSignal = mapA082.get(next2);
                InterfaceC04876k prevSignal = newSignal;
                if (interfaceC04876k == null || prevSignal == null) {
                    return interfaceC04876k == null && prevSignal == null;
                }
                zA7f = interfaceC04876k.A7f(prevSignal);
                String[] strArr3 = A03;
                if (strArr3[7].length() != strArr3[3].length()) {
                    String[] strArr4 = A03;
                    strArr4[6] = "3Jq7wk4KgDHXBRv7A";
                    strArr4[2] = "zXvlpWgAojYXCnWeF";
                }
            }
            throw new RuntimeException();
        } while (zA7f);
        return false;
    }
}
