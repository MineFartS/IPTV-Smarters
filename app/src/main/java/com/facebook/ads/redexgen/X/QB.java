package com.facebook.ads.redexgen.X;

import java.util.Set;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QB {
    public QF A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final QB A00(QF qf) {
        this.A00 = qf;
        return this;
    }

    public final QB A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final QB A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final QB A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final QB A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final QC A05() {
        return new QC(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
