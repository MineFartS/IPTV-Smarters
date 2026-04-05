package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05679x implements InterfaceC1315be, Comparator<IA> {
    public static String[] A03;
    public long A00;
    public final long A01;
    public final TreeSet<IA> A02 = new TreeSet<>(this);

    static {
        A01();
    }

    public static void A01() {
        A03 = new String[]{"qrCZDebBZXOMsu5PI8FdamZv", "usPTrKdLrE7MLvxS6mJMRwkls4hZpcPz", "BDrpv9J1bckqz2zbQbGMwvdv", "cHdTuf55w1r5Lcr9n47avjSAGBdp9rLc", "v1mI", "NFtkBlX9Mz", "lz", "jBDMosIM65rjrOuIbY8WA7ZUxyDm84U3"};
    }

    public C05679x(long j2) {
        this.A01 = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(IA ia, IA ia2) {
        if (ia.A00 - ia2.A00 == 0) {
            return ia.compareTo(ia2);
        }
        return ia.A00 < ia2.A00 ? -1 : 1;
    }

    private void A02(I6 i6, long j2) {
        while (this.A00 + j2 > this.A01) {
            boolean zIsEmpty = this.A02.isEmpty();
            if (A03[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "3qXh8T5e4LOlD1IWJEc6SNWF";
            strArr[2] = "YJzC3pPkQPrTmiUzc4g95RWz";
            if (!zIsEmpty) {
                try {
                    i6.ACR(this.A02.first());
                } catch (I4 unused) {
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.I5
    public final void AB0(I6 i6, IA ia) {
        this.A02.add(ia);
        this.A00 += ia.A01;
        A02(i6, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.I5
    public final void AB1(I6 i6, IA ia) {
        this.A02.remove(ia);
        this.A00 -= ia.A01;
    }

    @Override // com.facebook.ads.redexgen.X.I5
    public final void AB2(I6 i6, IA ia, IA ia2) {
        AB1(i6, ia);
        AB0(i6, ia2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1315be
    public final void AB3(I6 i6, String str, long j2, long j3) {
        A02(i6, j3);
    }
}
