package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IA implements Comparable<IA> {
    public final long A00;
    public final long A01;
    public final long A02;

    @Nullable
    public final File A03;
    public final String A04;
    public final boolean A05;

    public IA(String str, long j2, long j3, long j4, @Nullable File file) {
        this.A04 = str;
        this.A02 = j2;
        this.A01 = j3;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull IA ia) {
        if (!this.A04.equals(ia.A04)) {
            return this.A04.compareTo(ia.A04);
        }
        long j2 = this.A02 - ia.A02;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }

    public final boolean A01() {
        return !this.A05;
    }

    public final boolean A02() {
        return this.A01 == -1;
    }
}
