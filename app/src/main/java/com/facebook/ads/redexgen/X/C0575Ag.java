package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0575Ag {
    public static String[] A06;
    public C0576Ah A01;
    public C0576Ah A02;
    public boolean A03;
    public final ArrayList<C0576Ah> A05 = new ArrayList<>();
    public final C0571Ac A04 = new C0571Ac();
    public AbstractC0573Ae A00 = AbstractC0573Ae.A01;

    static {
        A03();
    }

    public static void A03() {
        A06 = new String[]{"KiEP2P9b6TLdkEYwaN5ndNVtk9NQ5Y9p", "yrQkoPMIPCp0FUw5bDslSTdDJuyK", "OV0qCkDU4pR0s48LAW0LoXOWDo4ZunO9", "CNzCLbPvty9jTQMUswZxpqZWQtb7JEv9", "Vf", "ol3MR5ayifXszMqJK7WjfrE4Lr8bJhi8", "Hh8EscwfVF04VFT3j4sJSJqD2SmetI3K", "DN3PdRai96zSFxDytd4qNigxYecPuw8S"};
    }

    private C0576Ah A00(C0576Ah c0576Ah, AbstractC0573Ae abstractC0573Ae) {
        int iA05;
        if (abstractC0573Ae.A0F() || this.A00.A0F() || (iA05 = abstractC0573Ae.A05(this.A00.A0B(c0576Ah.A01.A02, this.A04, true).A03)) == -1) {
            return c0576Ah;
        }
        return new C0576Ah(abstractC0573Ae.A0A(iA05, this.A04).A00, c0576Ah.A01.A01(iA05));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    @Nullable
    public final C0576Ah A04() {
        return this.A01;
    }

    @Nullable
    public final C0576Ah A05() {
        if (this.A05.isEmpty()) {
            return null;
        }
        return this.A05.get(r1.size() - 1);
    }

    @Nullable
    public final C0576Ah A06() {
        if (this.A05.isEmpty() || this.A00.A0F() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    @Nullable
    public final C0576Ah A07() {
        return this.A02;
    }

    @Nullable
    public final FB A08(int timelinePeriodCount) {
        FB fb = null;
        AbstractC0573Ae abstractC0573Ae = this.A00;
        if (abstractC0573Ae != null) {
            int periodIndex = abstractC0573Ae.A01();
            for (int i2 = 0; i2 < this.A05.size(); i2++) {
                C0576Ah c0576Ah = this.A05.get(i2);
                int i3 = c0576Ah.A01.A02;
                if (i3 < periodIndex && this.A00.A0A(i3, this.A04).A00 == timelinePeriodCount) {
                    if (fb != null) {
                        return null;
                    }
                    fb = c0576Ah.A01;
                }
            }
        }
        return fb;
    }

    public final void A09() {
        this.A03 = false;
        A02();
    }

    public final void A0A() {
        this.A03 = true;
    }

    public final void A0B(int i2) {
        A02();
    }

    public final void A0C(int i2, FB fb) {
        this.A05.add(new C0576Ah(i2, fb));
        if (this.A05.size() == 1) {
            boolean zA0F = this.A00.A0F();
            if (A06[0].charAt(21) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "SFS5Xb2c2LrmqtbhPrHYALinOi1MehvJ";
            strArr[0] = "SFS5Xb2c2LrmqtbhPrHYALinOi1MehvJ";
            if (!zA0F) {
                A02();
            }
        }
    }

    public final void A0D(int i2, FB fb) {
        C0576Ah c0576Ah = new C0576Ah(i2, fb);
        this.A05.remove(c0576Ah);
        if (!c0576Ah.equals(this.A02)) {
            return;
        }
        this.A02 = this.A05.isEmpty() ? null : this.A05.get(0);
    }

    public final void A0E(int i2, FB fb) {
        this.A02 = new C0576Ah(i2, fb);
    }

    public final void A0F(AbstractC0573Ae abstractC0573Ae) {
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            ArrayList<C0576Ah> arrayList = this.A05;
            arrayList.set(i2, A00(arrayList.get(i2), abstractC0573Ae));
        }
        C0576Ah c0576Ah = this.A02;
        if (A06[0].charAt(21) == 'U') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "OE27bQwCbSc4SHZoCTNTYydrCDTv";
        strArr[1] = "OE27bQwCbSc4SHZoCTNTYydrCDTv";
        if (c0576Ah != null) {
            this.A02 = A00(c0576Ah, abstractC0573Ae);
        }
        this.A00 = abstractC0573Ae;
        A02();
    }

    public final boolean A0G() {
        return this.A03;
    }
}
