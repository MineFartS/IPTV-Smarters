package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1019Sj implements C3Q {
    public final /* synthetic */ El A00;
    public final /* synthetic */ C3L A01;

    public C1019Sj(El el, C3L c3l) {
        this.A00 = el;
        this.A01 = c3l;
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final Object A4D(int i2) {
        C3J c3jA00 = this.A01.A00(i2);
        if (c3jA00 == null) {
            return null;
        }
        return c3jA00.A0N();
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final List<Object> A56(String str, int i2) {
        List<C3J> listA03 = this.A01.A03(str, i2);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listA03.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(listA03.get(i3).A0N());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final Object A57(int i2) {
        C3J c3jA01 = this.A01.A01(i2);
        if (c3jA01 == null) {
            return null;
        }
        return c3jA01.A0N();
    }

    @Override // com.facebook.ads.redexgen.X.C3Q
    public final boolean ABe(int i2, int i3, Bundle bundle) {
        return this.A01.A04(i2, i3, bundle);
    }
}
