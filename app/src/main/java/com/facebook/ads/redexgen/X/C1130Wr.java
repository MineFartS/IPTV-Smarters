package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1130Wr<T> extends AbstractC04956s<List<T>> {
    public static byte[] A02;
    public static String[] A03;
    public final EnumC04946r A00;
    public final List<T> A01;

    static {
        A04();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{113};
    }

    public static void A04() {
        A03 = new String[]{"9itrjnnCMeXzcKw4LDwr3", "0ZUpi3OgdlmKuABHcG8PMsqc4Oj", "fTRPCIaWt84rUUsVk3HDIivZKs", "V5Apl", "JVZfUK34SIuqNwHf2oV3ojB3sFjQruRb", "fsV6jHlkXkNImPX103xxf", "wiQZRNNXqXk8QOUIHtx5EDu7Qpw", "6g7apQMvF8ZkxnUyBbRCBajSKJlIo"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wr != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    public C1130Wr(long j2, @Nullable C04936q c04936q, List<T> list, EnumC04946r enumC04946r) {
        super(j2, c04936q, list, EnumC04946r.A08);
        this.A01 = list;
        this.A00 = enumC04946r;
        if (A05()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wr != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    private int A00(T t) {
        int i2 = C04886l.A00[this.A00.ordinal()];
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return ((String) t).length();
        }
        if (i2 == 3) {
            return ((InterfaceC04866j) t).ADF();
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wr != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    private boolean A05() {
        int i2 = C04886l.A00[this.A00.ordinal()];
        if (i2 != 1 && i2 != 2) {
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "pkJoykusnl5HLvmmS2nCUwVdsFz02CDm";
            strArr2[4] = "pkJoykusnl5HLvmmS2nCUwVdsFz02CDm";
            if (i2 != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wr != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final int A07() {
        int iA00 = 0;
        if (A08() == null || ((List) A08()).isEmpty()) {
            return 0;
        }
        Iterator it = ((List) A08()).iterator();
        while (it.hasNext()) {
            iA00 += A00(it.next());
        }
        return iA00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wr != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (T t : this.A01) {
            int i2 = C04886l.A00[this.A00.ordinal()];
            if (i2 == 1 || i2 == 2) {
                jSONArray.put(t);
            } else {
                String[] strArr = A03;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[3] = "TE27R";
                strArr2[0] = "fy5SSQFd7I5OAEL1WcIst";
                if (i2 == 3) {
                    jSONArray.put(((InterfaceC04866j) t).ADY());
                }
            }
        }
        jSONObject.put(A01(0, 1, 30), jSONArray);
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.util.List<T>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wr != com.facebook.ads.internal.botdetection.signals.model.signal_value.ListSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final boolean A0B(AbstractC04956s<List<T>> abstractC04956s) {
        List<T> listA08 = abstractC04956s.A08();
        List list = (List) A08();
        if (list == null || listA08 == null) {
            return list == null && listA08 == null;
        }
        if (abstractC04956s.A08().size() != ((List) A08()).size()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            int size = listA08.size();
            if (A03[4].charAt(25) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "t4r48";
            strArr[0] = "skb916f7am8mTaTTklPg2";
            if (i2 >= size) {
                return true;
            }
            T t = listA08.get(i2);
            Object obj = list.get(i2);
            int i3 = C04886l.A00[this.A00.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 && !((InterfaceC04866j) t).A7f(obj)) {
                    return false;
                }
            } else if (!listA08.get(i2).equals(list.get(i2))) {
                return false;
            }
            i2++;
        }
    }
}
