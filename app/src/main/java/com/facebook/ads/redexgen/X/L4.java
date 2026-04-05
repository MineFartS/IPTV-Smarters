package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class L4 {
    public static String[] A00;
    public static final AtomicReference<L3> A01;

    public static void A01() {
        A00 = new String[]{"XnOcKNlJJ8CDQQR", "VGhv6FkZrITxQRu9gbMUemqcetkh7B5f", "vVz2BTpV32jHfI", "d8hV", "Sy49NQqrKXgvTEWwSBtXX6HecYQBIBGU", "Db46iG0BOxvexN4G9aNEWNZ9mU0XJx13", "mKukGrwwCcIhJco4KmzrvmgYUSCtT5hL", "T8hiTRn5Amgadg81lccjSSIUWb1StHzV"};
    }

    static {
        A01();
        A01 = new AtomicReference<>(null);
    }

    public static L3 A00() {
        L3 l3 = A01.get();
        if (A00[5].charAt(26) != '0') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[7] = "JAkiPTeS8Sgp4wJmZ2cE1Xuhf0WoAHfE";
        strArr[4] = "TWyum6rZOmg61QmMcVNeRxvFtffIUfDC";
        if (l3 == null) {
            L3 errorLogger = new C1254af();
            return errorLogger;
        }
        return l3;
    }

    public static void A02(L3 l3) {
        A01.set(l3);
    }
}
