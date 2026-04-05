package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1097Vk implements InterfaceC04876k<String> {
    public static byte[] A01;
    public static String[] A02;
    public final Map<String, String> A00;

    static {
        A04();
        A03();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{96, -74, 116, 35, -29};
    }

    public static void A04() {
        A02 = new String[]{"a0vPx9r", "g6urVoqpDzgarLiHPisYP6lg0a1Qsxi7", "0D95gUzv3ykjkUAaNmvS0PMqJMmLe", "FmsqkIGDIxf1pyhk8KrqJDmLtRXh", "VdLzyHL", "Y0U6bkGUHGFfKGq4XniOfCVYQx4Des4Z", "CuvTUYqsdTaVr4XM9Y5z36A2N9cPvqqS", "uyYe2wlLl6RVS9ukoAhHAdIguTPHvaGb"};
    }

    public C1097Vk(Enumeration<InetAddress> enumeration) {
        this.A00 = A01(enumeration);
    }

    public /* synthetic */ C1097Vk(Enumeration enumeration, C1096Vj c1096Vj) {
        this(enumeration);
    }

    public static Map<String, String> A01(Enumeration<InetAddress> enumeration) {
        String strA00;
        HashMap map = new HashMap();
        while (enumeration.hasMoreElements()) {
            InetAddress inetAddressNextElement = enumeration.nextElement();
            if (!(inetAddressNextElement instanceof Inet4Address)) {
                boolean z = inetAddressNextElement instanceof Inet6Address;
                if (A02[5].charAt(2) == 'I') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[0] = "Gz9fwzC";
                strArr[4] = "ybYvLhq";
                if (!z) {
                    continue;
                }
            }
            String hostAddress = inetAddressNextElement.getHostAddress();
            if (!(inetAddressNextElement instanceof Inet4Address)) {
                String address = A02[2];
                if (address.length() != 29) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[5] = "FRlIOdImLcKdb9WRfG0MH6oacSxD1nRF";
                strArr2[5] = "FRlIOdImLcKdb9WRfG0MH6oacSxD1nRF";
                strA00 = A00(3, 2, 120);
            } else if (A02[6].charAt(24) != 'i') {
                String[] strArr3 = A02;
                strArr3[1] = "2FnSkM3RXE8ViMwKPYtNPOmsjhf021fL";
                strArr3[7] = "CXfbTdSUzlrlHA9c2DxJWpFugzDpw8Hh";
                strA00 = A00(1, 2, 11);
            } else {
                strA00 = A00(1, 2, 11);
            }
            String address2 = A00(0, 1, 6);
            boolean zContains = hostAddress.contains(address2);
            String[] strArr4 = A02;
            if (strArr4[1].charAt(27) == strArr4[7].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr5 = A02;
            strArr5[5] = "trbotCFTtTb6ytC4d3Dugjdfr0hOKtvS";
            strArr5[5] = "trbotCFTtTb6ytC4d3Dugjdfr0hOKtvS";
            if (zContains) {
                hostAddress = hostAddress.substring(0, hostAddress.indexOf(37));
            }
            map.put(strA00, hostAddress);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADZ(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        boolean z = false;
        for (Map.Entry<String, String> entry : this.A00.entrySet()) {
            if (entry.getKey() != null && !entry.getKey().isEmpty() && entry.getValue() != null && !entry.getValue().isEmpty()) {
                z = true;
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        if (z) {
            return jSONObject.put(str, jSONObject2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    public final boolean A7f(Object obj) {
        C1097Vk c1097Vk = (C1097Vk) obj;
        Map<String, String> map = this.A00;
        if (map != null) {
            Map<String, String> map2 = c1097Vk.A00;
            if (A02[3].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "yfFtf6a";
            strArr[4] = "R3xveNN";
            if (map2 != null) {
                if (map.size() != c1097Vk.A00.size()) {
                    return false;
                }
                Iterator<Map.Entry<String, String>> it = this.A00.entrySet().iterator();
                Iterator<Map.Entry<String, String>> newInetAddressIterator = c1097Vk.A00.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    Map.Entry<String, String> next2 = newInetAddressIterator.next();
                    if (next == null || next2 == null) {
                        return next == null && next2 == null;
                    }
                    if (next.getKey() != null && !next.getKey().equals(next2.getKey())) {
                        return false;
                    }
                    if (next.getValue() != null && !next.getValue().equals(next2.getValue())) {
                        return false;
                    }
                }
                return true;
            }
        }
        return this.A00 == null && c1097Vk.A00 == null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final int ADF() {
        int length = 0;
        for (Map.Entry<String, String> entry : this.A00.entrySet()) {
            int length2 = entry.getKey().length();
            String value = entry.getValue();
            if (A02[6].charAt(24) == 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "05271w6tHpnBYDqabX5nc55hVF5X";
            strArr[3] = "05271w6tHpnBYDqabX5nc55hVF5X";
            length += length2 + value.length();
        }
        return length;
    }
}
