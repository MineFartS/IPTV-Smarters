package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0777Iu implements Comparator<C0778Iv> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0778Iv c0778Iv, C0778Iv c0778Iv2) {
        if (c0778Iv.A00 < c0778Iv2.A00) {
            return -1;
        }
        return c0778Iv2.A00 < c0778Iv.A00 ? 1 : 0;
    }
}
