package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U8 implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ US A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"273FKnw5fEMMMPHYpDWr2uCxLH", "MURfYE", "2MrWxfjycJYz8CRz8nVEoUtgAppiNGkb", "dgs6GO1Bgwq7bEpFzLz1V7Vq3FkVRsxg", "uUhMN1Ac0a0MVvdzsNpT9rjxKSsemVru", "HLxj17LMU0ZLExoNf0E99eYx3QTlHuEl", "3ccBwYNuPT2bbHKd70up9vlieZX79PEX", "FpcSlILO2LyEt0C9jtDQqRZtHAa4Q2N9"};
    }

    public U8(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A01 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        US us = this.A00;
        ApplicationInfo applicationInfo = us.A01;
        if (A01[1].length() == 3) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "Yec9tINwCXE8zEgRYPM9thJfbPEs0Pqz";
        strArr[3] = "Yec9tINwCXE8zEgRYPM9thJfbPEs0Pqz";
        return us.A09(applicationInfo.taskAffinity);
    }
}
