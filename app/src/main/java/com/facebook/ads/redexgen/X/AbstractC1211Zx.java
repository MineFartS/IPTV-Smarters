package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.redexgen.X.InterfaceC0668Ej;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1211Zx<M extends InterfaceC0668Ej<M, K>, K> implements InterfaceC0666Eh {
    public static String[] A0A;
    public final Uri A00;
    public final I6 A01;
    public final C1313bc A02;
    public final C1313bc A03;
    public final C0772Ip A04;
    public final ArrayList<K> A05;
    public volatile int A07;
    public volatile long A09;
    public volatile int A08 = -1;
    public final AtomicBoolean A06 = new AtomicBoolean();

    static {
        A09();
    }

    public static void A09() {
        A0A = new String[]{"HcxqDkg8f3trDC2", "H3lhfcF4", "jgs2aK33vmnLQpj6RMwq4i4521gGR72L", "8QbU3rrgUBpfyrmhzGnmdz", "RdpAAxsf1ndqNyIXB5WWDbxj7gI3UW15", "ysNu2iSNdHb4xYvZfrlytLXNdw8tKlCg", "GZEwoN9rtJ465FcmqPyyqAeRDOWtpu", "ToV3tHKnxGOnat2sFN1ohh"};
    }

    public abstract M A0B(InterfaceC0740Hh interfaceC0740Hh, Uri uri) throws IOException;

    public abstract List<Ek> A0C(InterfaceC0740Hh interfaceC0740Hh, M m2, boolean z) throws InterruptedException, IOException;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zx != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Ej<M, K>, K> */
    public AbstractC1211Zx(Uri uri, List<K> list, C0667Ei c0667Ei) {
        this.A00 = uri;
        this.A05 = new ArrayList<>(list);
        this.A01 = c0667Ei.A00();
        this.A02 = c0667Ei.A01(false);
        this.A03 = c0667Ei.A01(true);
        this.A04 = c0667Ei.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zx != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Ej<M, K>, K> */
    private List<Ek> A08() throws InterruptedException, IOException {
        InterfaceC0668Ej interfaceC0668EjA0B = A0B(this.A02, this.A00);
        if (!this.A05.isEmpty()) {
            interfaceC0668EjA0B = (InterfaceC0668Ej) interfaceC0668EjA0B.A4C(this.A05);
        }
        List<Ek> listA0C = A0C(this.A02, interfaceC0668EjA0B, false);
        IB ib = new IB();
        this.A08 = listA0C.size();
        this.A07 = 0;
        this.A09 = 0L;
        for (int size = listA0C.size() - 1; size >= 0; size--) {
            Ek segment = listA0C.get(size);
            IC.A05(segment.A01, this.A01, ib);
            this.A09 += ib.A00;
            long j2 = ib.A00;
            long j3 = ib.A01;
            String[] strArr = A0A;
            if (strArr[0].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = BuildConfig.FLAVOR;
            strArr2[1] = BuildConfig.FLAVOR;
            if (j2 == j3) {
                this.A07++;
                listA0C.remove(size);
            }
        }
        return listA0C;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zx != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Ej<M, K>, K> */
    private void A0A(Uri uri) {
        IC.A06(this.A01, IC.A01(uri));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zx != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Ej<M, K>, K> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final void A4r() throws InterruptedException, IOException {
        this.A04.A00(-1000);
        try {
            List<Ek> listA08 = A08();
            Collections.sort(listA08);
            byte[] bArr = new byte[131072];
            IB ib = new IB();
            if (A0A[4].charAt(20) == 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "X3ak1rr2ATrkYjC2sWGM72uZZI8xaEO1";
            strArr[5] = "X3ak1rr2ATrkYjC2sWGM72uZZI8xaEO1";
            for (int i2 = 0; i2 < listA08.size(); i2++) {
                try {
                    IC.A04(listA08.get(i2).A01, this.A01, this.A02, bArr, this.A04, -1000, ib, this.A06, true);
                    this.A07++;
                    this.A09 += ib.A02;
                } finally {
                }
            }
        } finally {
            this.A04.A03(-1000);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zx != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Ej<M, K>, K> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final float A64() {
        int downloadedSegments = this.A08;
        int i2 = this.A07;
        if (downloadedSegments == -1 || i2 == -1) {
            return -1.0f;
        }
        if (downloadedSegments == 0) {
            return 100.0f;
        }
        return (i2 * 100.0f) / downloadedSegments;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zx != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Ej<M, K>, K> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final long A65() {
        return this.A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zx != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Ej<M, K>, K> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    public final void cancel() {
        this.A06.set(true);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zx != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloader<M extends com.facebook.ads.redexgen.X.Ej<M, K>, K> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0014 */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0666Eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void remove() throws java.lang.InterruptedException {
        /*
            r3 = this;
            com.facebook.ads.redexgen.X.bc r1 = r3.A03     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            android.net.Uri r0 = r3.A00     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            com.facebook.ads.redexgen.X.Ej r2 = r3.A0B(r1, r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            com.facebook.ads.redexgen.X.bc r1 = r3.A03     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            r0 = 1
            java.util.List r2 = r3.A0C(r1, r2, r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            r1 = 0
        L10:
            int r0 = r2.size()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            if (r1 >= r0) goto L26
            java.lang.Object r0 = r2.get(r1)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            com.facebook.ads.redexgen.X.Ek r0 = (com.facebook.ads.redexgen.X.Ek) r0     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            com.facebook.ads.redexgen.X.Hl r0 = r0.A01     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            android.net.Uri r0 = r0.A04     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            r3.A0A(r0)     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2c
            int r1 = r1 + 1
            goto L10
        L26:
            android.net.Uri r0 = r3.A00
            r3.A0A(r0)
            return
        L2c:
            r1 = move-exception
            android.net.Uri r0 = r3.A00
            r3.A0A(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1211Zx.remove():void");
    }
}
