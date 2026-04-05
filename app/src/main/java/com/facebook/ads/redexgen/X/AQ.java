package com.facebook.ads.redexgen.X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AQ implements InterfaceC1265aq {
    public static String[] A06;
    public long A00;
    public long A01;
    public C03922p A02;
    public final ArrayDeque<C03922p> A03 = new ArrayDeque<>();
    public final ArrayDeque<AW> A04;
    public final PriorityQueue<C03922p> A05;

    static {
        A0L();
    }

    public static void A0L() {
        A06 = new String[]{"xrToQ1M30eypgaiDt2KcbeXQSJmH4zEy", "FOMm0GJvPogulFgRKU73d9QQGInBRxBZ", "DAifx7fz7Oznb", "tEspMkbIuGZVzgapMfnbK02RMeMH6P5b", "hnmT", "jbKY175w2AZdEkpyONR9SNFucMTvW6Vd", "vt70xpgsPpIXmuxmiV", "wsDuhCL"};
    }

    public abstract InterfaceC0708Gb A0N();

    public abstract void A0R(C0580Al c0580Al);

    public abstract boolean A0T();

    public AQ() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.A03.add(new C03922p());
        }
        this.A04 = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.A04.add(new C03912o(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0M(C03922p c03922p) {
        c03922p.A07();
        this.A03.add(c03922p);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public C0580Al A4i() throws C0709Gc {
        IM.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    /* JADX INFO: renamed from: A0P, reason: merged with bridge method [inline-methods] */
    public AW A4j() throws C0709Gc {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((YH) this.A05.peek()).A00 <= this.A00) {
            C03922p c03922pPoll = this.A05.poll();
            if (c03922pPoll.A04()) {
                AW awPollFirst = this.A04.pollFirst();
                awPollFirst.A00(4);
                if (A06[6].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[4] = "hAEA";
                strArr[4] = "hAEA";
                A0M(c03922pPoll);
                return awPollFirst;
            }
            A0R(c03922pPoll);
            if (A0T()) {
                InterfaceC0708Gb interfaceC0708GbA0N = A0N();
                if (!c03922pPoll.A03()) {
                    AW awPollFirst2 = this.A04.pollFirst();
                    awPollFirst2.A09(((YH) c03922pPoll).A00, interfaceC0708GbA0N, Long.MAX_VALUE);
                    A0M(c03922pPoll);
                    return awPollFirst2;
                }
            }
            A0M(c03922pPoll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    /* JADX INFO: renamed from: A0Q, reason: merged with bridge method [inline-methods] */
    public void ABz(C0580Al c0580Al) throws C0709Gc {
        IM.A03(c0580Al == this.A02);
        if (c0580Al.A03()) {
            C03922p c03922p = this.A02;
            String[] strArr = A06;
            if (strArr[5].charAt(10) != strArr[3].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "0mhI93daunZi59PwiuGO0KbLyKVCPwQH";
            strArr2[3] = "r2E3xZENv7Zr1SQt92aJBQoSxSc5nrbU";
            A0M(c03922p);
        } else {
            C03922p c03922p2 = this.A02;
            long j2 = this.A01;
            this.A01 = 1 + j2;
            c03922p2.A00 = j2;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0S(AW aw) {
        aw.A07();
        this.A04.add(aw);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public void ACG() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1265aq
    public void AD7(long j2) {
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0M(this.A05.poll());
        }
        C03922p c03922p = this.A02;
        if (c03922p != null) {
            A0M(c03922p);
            this.A02 = null;
        }
    }
}
