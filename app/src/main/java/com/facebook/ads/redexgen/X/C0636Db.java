package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0636Db {
    public final int A00;
    public final long A01;

    public C0636Db(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public static C0636Db A00(CG cg, C0768Il c0768Il) throws InterruptedException, IOException {
        cg.ABc(c0768Il.A00, 0, 8);
        c0768Il.A0Z(0);
        int id = c0768Il.A09();
        return new C0636Db(id, c0768Il.A0L());
    }
}
