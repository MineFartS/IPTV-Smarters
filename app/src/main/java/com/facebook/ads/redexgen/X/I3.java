package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class I3 implements PE {
    public static String[] A0C;

    @Nullable
    public C0854Lx A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final KK A07 = new KK() { // from class: com.facebook.ads.redexgen.X.7m
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9F
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A04(C05137o c05137o) {
            this.A00.A05.removeCallbacksAndMessages(null);
            if (this.A00.A0E(PY.A05)) {
                this.A00.A03();
                this.A00.A07(true, false);
            }
            this.A00.A03 = true;
        }
    };
    public final KQ A06 = new KQ() { // from class: com.facebook.ads.redexgen.X.7l
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9F
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A04(C7q c7q) {
            this.A00.A03();
            this.A00.A07(false, false);
            this.A00.A03 = true;
        }
    };
    public final KE A08 = new C05107k(this);
    public final AbstractC0785Jc A09 = new AbstractC0785Jc() { // from class: com.facebook.ads.redexgen.X.7j
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9F
        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A04(C05127n c05127n) {
            if (this.A00.A02 || !this.A00.A0E(PY.A05)) {
                return;
            }
            this.A00.A03();
            this.A00.A07(true, false);
        }
    };
    public final IX A0A = new C05087i(this);
    public final Handler A05 = new Handler();
    public final List<PZ> A0B = new ArrayList();
    public int A00 = AdError.SERVER_ERROR_CODE;

    static {
        A04();
    }

    public static void A04() {
        A0C = new String[]{"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    }

    public I3(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<PZ> it = this.A0B.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            strArr[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (zHasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z, boolean z2) {
        for (PZ pz : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            strArr[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            pz.A3O(z, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0E(PY py) {
        Iterator<PZ> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A76() != py) {
                return false;
            }
        }
        return true;
    }

    public final void A0F() {
        this.A0B.clear();
    }

    public final void A0G() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0H() {
        this.A04 = true;
        this.A03 = true;
        A07(false, false);
    }

    public final void A0I(int i2) {
        this.A00 = i2;
    }

    public final void A0J(PZ pz) {
        this.A0B.add(pz);
    }

    public final boolean A0K() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A7w(C0854Lx c0854Lx) {
        this.A01 = c0854Lx;
        c0854Lx.getEventBus().A04(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void ADd(C0854Lx c0854Lx) {
        A03();
        c0854Lx.getEventBus().A05(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
