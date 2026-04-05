package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GI {
    public final int A00;
    public final int A01;
    public final List<GK> A02;
    public final List<GP> A03;
    public final List<GK> A04;

    public GI(int i2, int i3, List<GP> list, List<GK> list2, List<GK> list3) {
        List<GK> listUnmodifiableList;
        List<GK> listUnmodifiableList2;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = Collections.unmodifiableList(list);
        if (list2 == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list2);
        }
        this.A02 = listUnmodifiableList;
        if (list3 == null) {
            listUnmodifiableList2 = Collections.emptyList();
        } else {
            listUnmodifiableList2 = Collections.unmodifiableList(list3);
        }
        this.A04 = listUnmodifiableList2;
    }
}
