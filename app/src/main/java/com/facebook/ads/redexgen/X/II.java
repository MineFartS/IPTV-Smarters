package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class II {
    public static String[] A02;
    public final Map<String, Object> A01 = new HashMap();
    public final List<String> A00 = new ArrayList();

    static {
        A01();
    }

    public static void A01() {
        A02 = new String[]{"Wtk3PbCDBweHk5gehud8YCSUQvC6nwdT", "sCNfoUxWKDpS1RUAZ9HMqXb5hXmFNfsl", "G0Sd6xJJ5dzC67Fn3g26DayECdEiqz7K", "NSE2Gca4KsMRHPK68YKw53X7X1h8nHIG", "XGHGYVKNABmBEqteJ7Uc8xn1n3vNB0mC", "OOR0T5nG4ewoAkig5Bp6LvVgvITCNpR4", "EPz2kWxbcMMvM", "ydI7STvXrHNyhiZlA4K5PEkXlAxdK"};
    }

    private II A00(String str, Object obj) {
        this.A01.put((String) IM.A01(str), IM.A01(obj));
        this.A00.remove(str);
        return this;
    }

    public final II A02(String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    public final II A03(String str, long j2) {
        return A00(str, Long.valueOf(j2));
    }

    public final II A04(String str, String str2) {
        return A00(str, str2);
    }

    public final List<String> A05() {
        return Collections.unmodifiableList(new ArrayList(this.A00));
    }

    public final Map<String, Object> A06() {
        HashMap map = new HashMap(this.A01);
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[6].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "Wf4wPrtpL1AEFsgXvSrjN8BWozQaFEDb";
            strArr[4] = "Wf4wPrtpL1AEFsgXvSrjN8BWozQaFEDb";
            if (zHasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    entry.setValue(Arrays.copyOf(bArr, bArr.length));
                }
            } else {
                return Collections.unmodifiableMap(map);
            }
        }
    }
}
