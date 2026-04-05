package com.facebook.ads.redexgen.X;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class K4 {
    public final K2 A0B;
    public final boolean A0F;
    public final String A0C = K4.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<K3> A0D = new LinkedList();

    public K4(C8C c8c, K2 k2) {
        int iA0D = JU.A0D(c8c);
        if (iA0D < 1) {
            this.A0F = false;
        } else {
            double sessionRandom = iA0D;
            this.A0F = c8c.A05().A00() < 1.0d / sessionRandom;
        }
        this.A0B = k2;
    }

    private int A00() {
        return this.A0B.A5u();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(K3 k3) {
        synchronized (this.A0D) {
            this.A0D.add(k3);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 107, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 108, A00(), null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new K3(0, 101, -1, null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 105, A00(), null));
    }

    public final void A0C() {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 102, A00(), null));
    }

    public final void A0D(C8C c8c, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new K3(A01(), 103, A00(), null));
        M4.A06.execute(new K1(this, str, c8c));
    }
}
