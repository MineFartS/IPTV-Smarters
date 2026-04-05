package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FO {
    public static String[] A04;
    public final int A00;

    @Nullable
    public final FB A01;
    public final long A02;
    public final CopyOnWriteArrayList<FN> A03;

    static {
        A01();
    }

    public static void A01() {
        A04 = new String[]{"HGHzNcawqnVFgJx8ceQNwcxcn1SDkpDb", "AD2ta0a", "biSUTEi4nYJndXTTLsT", "38FOXeSW4cnwnxdXp60to", "WtyRCcfaPM", "iLolo35", "fvJAwdggv90DLF", "FbA7S8K"};
    }

    public FO() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public FO(CopyOnWriteArrayList<FN> copyOnWriteArrayList, int i2, @Nullable FB fb, long j2) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i2;
        this.A01 = fb;
        this.A02 = j2;
    }

    private long A00(long j2) {
        long jA01 = C05639t.A01(j2);
        if (jA01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.A02;
        if (A04[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[7] = "vQJR5ZN";
        strArr[7] = "vQJR5ZN";
        return j3 + jA01;
    }

    private void A02(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final FO A03(int i2, @Nullable FB fb, long j2) {
        return new FO(this.A03, i2, fb, j2);
    }

    public final void A04() {
        IM.A04(this.A01 != null);
        for (FN listenerAndHandler : this.A03) {
            A02(listenerAndHandler.A00, new FE(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        IM.A04(this.A01 != null);
        for (FN listenerAndHandler : this.A03) {
            A02(listenerAndHandler.A00, new FF(this, listenerAndHandler.A01));
        }
    }

    public final void A06() {
        IM.A04(this.A01 != null);
        Iterator<FN> it = this.A03.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A04[7].length() != 7) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[2] = "JAadAeVCHcunsRCfoQL";
            strArr[2] = "JAadAeVCHcunsRCfoQL";
            if (zHasNext) {
                FN listenerAndHandler = it.next();
                A02(listenerAndHandler.A00, new FK(this, listenerAndHandler.A01));
            } else {
                return;
            }
        }
    }

    public final void A07(int i2, @Nullable Format format, int i3, @Nullable Object obj, long j2) {
        A0D(new FQ(1, i2, format, i3, obj, A00(j2), -9223372036854775807L));
    }

    public final void A08(Handler handler, FR fr) {
        IM.A03((handler == null || fr == null) ? false : true);
        this.A03.add(new FN(handler, fr));
    }

    public final void A09(FP fp, FQ fq) {
        for (FN fn : this.A03) {
            A02(fn.A00, new FI(this, fn.A01, fp, fq));
        }
    }

    public final void A0A(FP fp, FQ fq) {
        for (FN fn : this.A03) {
            A02(fn.A00, new FH(this, fn.A01, fp, fq));
        }
    }

    public final void A0B(FP fp, FQ fq) {
        for (FN fn : this.A03) {
            A02(fn.A00, new FG(this, fn.A01, fp, fq));
        }
    }

    public final void A0C(FP fp, FQ fq, IOException iOException, boolean z) {
        for (FN listenerAndHandler : this.A03) {
            A02(listenerAndHandler.A00, new FJ(this, listenerAndHandler.A01, fp, fq, iOException, z));
        }
    }

    public final void A0D(FQ fq) {
        for (FN fn : this.A03) {
            A02(fn.A00, new FM(this, fn.A01, fq));
        }
    }

    public final void A0E(FR fr) {
        for (FN fn : this.A03) {
            if (fn.A01 == fr) {
                this.A03.remove(fn);
            }
        }
    }

    public final void A0F(C0744Hl c0744Hl, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, long j4) {
        A0B(new FP(c0744Hl, j4, 0L, 0L), new FQ(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0G(C0744Hl c0744Hl, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, long j4, long j5, long j6) {
        A09(new FP(c0744Hl, j4, j5, j6), new FQ(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0H(C0744Hl c0744Hl, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, long j4, long j5, long j6) {
        A0A(new FP(c0744Hl, j4, j5, j6), new FQ(i2, i3, format, i4, obj, A00(j2), A00(j3)));
    }

    public final void A0I(C0744Hl c0744Hl, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, long j4, long j5, long j6, IOException iOException, boolean z) {
        A0C(new FP(c0744Hl, j4, j5, j6), new FQ(i2, i3, format, i4, obj, A00(j2), A00(j3)), iOException, z);
    }
}
