package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.YH;
import com.facebook.ads.redexgen.X.YI;
import java.lang.Exception;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class YJ<I extends YH, O extends YI, E extends Exception> implements BY<I, O, E> {
    public static String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    static {
        A0O();
    }

    public static void A0O() {
        A0D = new String[]{"Gkl", "qMMBfBKIWMYZs", "JMr5TMdVlQ7lAxQbe7gmsO3TMTXZHZrx", "k", "fplFQmQDWPfBEKatf3t9LdZAMaYE90Yr", "qk38PGrA", "BZh", "ypodQLxrY5Mqx0yNqiahJYpo"};
    }

    public abstract I A0V();

    public abstract O A0X();

    public abstract E A0Y(I i2, O o2, boolean z);

    public abstract E A0Z(Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    public YJ(I[] iArr, O[] oArr) {
        this.A0B = iArr;
        this.A00 = iArr.length;
        for (int i2 = 0; i2 < this.A00; i2++) {
            ((I[]) this.A0B)[i2] = A0V();
        }
        this.A0C = oArr;
        this.A01 = oArr.length;
        for (int i3 = 0; i3 < this.A01; i3++) {
            ((O[]) this.A0C)[i3] = A0X();
        }
        this.A08 = new C0595Bb(this);
        this.A08.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    private void A0L() {
        if (A0S()) {
            this.A07.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    private void A0M() throws Exception {
        E e2 = this.A04;
        if (e2 == null) {
        } else {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    public void A0N() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (A0T());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    private void A0P(I i2) {
        i2.A07();
        I[] iArr = this.A0B;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    private void A0Q(O o2) {
        o2.A07();
        O[] oArr = this.A0C;
        int i2 = this.A01;
        this.A01 = i2 + 1;
        oArr[i2] = o2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    private boolean A0S() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    private boolean A0T() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0S()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I iRemoveFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i2 = this.A01 - 1;
            this.A01 = i2;
            O o2 = oArr[i2];
            boolean z = this.A05;
            this.A05 = false;
            if (iRemoveFirst.A04()) {
                o2.A00(4);
            } else {
                if (iRemoveFirst.A03()) {
                    o2.A00(Integer.MIN_VALUE);
                }
                try {
                    this.A04 = (E) A0Y(iRemoveFirst, o2, z);
                } catch (OutOfMemoryError e2) {
                    this.A04 = (E) A0Z(e2);
                } catch (RuntimeException e3) {
                    String[] strArr = A0D;
                    if (strArr[1].length() != strArr[7].length()) {
                        String[] strArr2 = A0D;
                        strArr2[1] = "JmdauonVcnINF";
                        strArr2[7] = "vppaV7cv17cCxaH2hgZaXUeE";
                        this.A04 = (E) A0Z(e3);
                    }
                    throw new RuntimeException();
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            Object obj = this.A07;
            String[] strArr3 = A0D;
            if (strArr3[0].length() == strArr3[6].length()) {
                String[] strArr4 = A0D;
                strArr4[1] = "q0ZgAWd6JYMJo";
                strArr4[7] = "B3H8IuJfVBRbzuvGv4HpnNYI";
                synchronized (obj) {
                    if (this.A05) {
                        A0Q(o2);
                    } else if (o2.A03()) {
                        this.A02++;
                        A0Q(o2);
                    } else {
                        o2.A00 = this.A02;
                        this.A02 = 0;
                        this.A0A.addLast(o2);
                    }
                    A0P(iRemoveFirst);
                }
                return true;
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BY
    /* JADX INFO: renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public final I A4i() throws Exception {
        I i2;
        I i3;
        synchronized (this.A07) {
            A0M();
            IM.A04(this.A03 == null);
            if (this.A00 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.A0B;
                int i4 = this.A00 - 1;
                this.A00 = i4;
                i2 = iArr[i4];
            }
            this.A03 = i2;
            i3 = this.A03;
        }
        return i3;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BY
    /* JADX INFO: renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public final O A4j() throws Exception {
        synchronized (this.A07) {
            A0M();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    public final void A0a(int i2) {
        IM.A04(this.A00 == this.A0B.length);
        for (I inputBuffer : this.A0B) {
            inputBuffer.A09(i2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BY
    /* JADX INFO: renamed from: A0b, reason: merged with bridge method [inline-methods] */
    public final void ABz(I i2) throws Exception {
        synchronized (this.A07) {
            A0M();
            I inputBuffer = this.A03;
            IM.A03(i2 == inputBuffer);
            this.A09.addLast(i2);
            A0L();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    public void A0c(O o2) {
        synchronized (this.A07) {
            A0Q(o2);
            A0L();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BY
    public final void ACG() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YJ != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.YH, O extends com.facebook.ads.redexgen.X.YI, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.BY
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A03 != null) {
                A0P(this.A03);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0P(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0Q(this.A0A.removeFirst());
            }
        }
    }
}
