package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0949Pq {
    public static C0949Pq A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C0662Ed A00;

    @Nullable
    public I6 A01;
    public File A02;
    public boolean A03;
    public final Context A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final SparseArray<C0947Po> A06 = new SparseArray<>();
    public final Runnable A08 = new RunnableC0946Pn(this);
    public final EW A07 = new GW(this);

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 0, DateTimeFieldType.HOUR_OF_HALFDAY, -69, -24, DateTimeFieldType.MINUTE_OF_HOUR, 27, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, DateTimeFieldType.CLOCKHOUR_OF_DAY, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51};
    }

    static {
        A0B();
        A0B = new DownloadAction.Deserializer[]{C0589Au.A01, C1206Zs.A03};
    }

    @VisibleForTesting
    public C0949Pq(Context context, @Nullable C0662Ed c0662Ed) {
        this.A04 = context;
        if (c0662Ed != null) {
            this.A00 = c0662Ed;
            c0662Ed.A0R(this.A07);
        }
        A01().A0Q();
    }

    private C0662Ed A01() {
        if (this.A00 == null) {
            C0667Ei downloaderConstructorHelper = new C0667Ei(A03(), A02());
            this.A00 = new C0662Ed(downloaderConstructorHelper, 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00.A0R(this.A07);
        }
        return this.A00;
    }

    private InterfaceC1298bN A02() {
        return new C2Z(A07(78, 3, 89), null);
    }

    private final synchronized I6 A03() {
        if (this.A01 == null) {
            this.A01 = new C1318bh(new File(A06(), A07(64, 14, 16)), new C05679x(134217728L));
        }
        return this.A01;
    }

    public static C1314bd A04(C1292bH c1292bH, I6 i6) {
        return new C1314bd(i6, c1292bH, new C1296bL(), null, 2, null);
    }

    public static C0949Pq A05(Context context) {
        if (A09 == null) {
            A09 = new C0949Pq(context.getApplicationContext(), null);
        }
        return A09;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A04.getCacheDir();
        }
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        for (C0661Ec c0661Ec : A01().A0T()) {
            int state = c0661Ec.A02;
            C0947Po c0947Po = this.A06.get(state);
            if (c0947Po != null) {
                int i2 = c0661Ec.A01;
                if (i2 == 2 || c0661Ec.A03 > c0947Po.A00) {
                    String str = A07(15, 19, 61) + i2 + A07(0, 8, 18) + c0661Ec.A03;
                    c0947Po.A01.A9R();
                    this.A06.remove(state);
                } else if (i2 == 4 || i2 == 3) {
                    String str2 = A07(34, 14, 111) + i2;
                    c0947Po.A01.A9a();
                    this.A06.remove(state);
                }
            }
            String str3 = A07(48, 4, 25) + state + A07(8, 7, 52) + c0661Ec.A03;
        }
    }

    private void A09() {
        if (!this.A03) {
            this.A03 = true;
            this.A05.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A05.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final InterfaceC0739Hg A0E(Context context) {
        return A04(new C1292bH(context, (I2<? super InterfaceC0740Hh>) null, A02()), A03());
    }

    public final void A0F(Uri uri, InterfaceC0948Pp interfaceC0948Pp, long j2) {
        this.A06.put(A01().A0P(new C1206Zs(uri, false, null, null)), new C0947Po(interfaceC0948Pp, j2, null));
        A09();
    }
}
