package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DX {
    public final int A00;
    public final String A01;
    public final List<DW> A02;
    public final byte[] A03;

    public DX(int i2, String str, List<DW> list, byte[] bArr) {
        List<DW> listUnmodifiableList;
        this.A00 = i2;
        this.A01 = str;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = listUnmodifiableList;
        this.A03 = bArr;
    }
}
