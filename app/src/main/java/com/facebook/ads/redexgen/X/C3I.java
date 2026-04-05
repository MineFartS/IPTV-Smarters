package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3I extends D0 implements Handler.Callback {
    public static String[] A0B;
    public int A00;
    public int A01;
    public InterfaceC0652Dt A02;
    public boolean A03;
    public final Handler A04;
    public final AC A05;
    public final InterfaceC0654Dv A06;
    public final CV A07;
    public final InterfaceC0655Dw A08;
    public final long[] A09;
    public final Metadata[] A0A;

    static {
        A01();
    }

    public static void A01() {
        A0B = new String[]{"03Bqi0KbTszfVpZRuJU3ds8C", "k1GP5ixeRS7AgIgDUeTgx", "4NCpljRKbMpI7nrSCbEL8iNDtCMdRKX", "14neR4MzrfGB8mqjKcaUOPf9qenZk", "2yEqk33zpOnAOPOYE0N2JJzqUjZjGZ3w", "pyvhSQAAYlr5mafzJ0Hik2RvaYh4S", "eoJA2AjfdFBVMgfGYGogvo8ECKzj9gDa", "xUrUxSkwRZIOD3qEvYK8t45D"};
    }

    public C3I(InterfaceC0655Dw interfaceC0655Dw, Looper looper) {
        this(interfaceC0655Dw, looper, InterfaceC0654Dv.A00);
    }

    public C3I(InterfaceC0655Dw interfaceC0655Dw, Looper looper, InterfaceC0654Dv interfaceC0654Dv) {
        super(4);
        this.A08 = (InterfaceC0655Dw) IM.A01(interfaceC0655Dw);
        this.A04 = looper == null ? null : new Handler(looper, this);
        this.A06 = (InterfaceC0654Dv) IM.A01(interfaceC0654Dv);
        this.A05 = new AC();
        this.A07 = new CV();
        this.A0A = new Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        Arrays.fill(this.A0A, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A02(Metadata metadata) {
        Handler handler = this.A04;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            A03(metadata);
        }
    }

    private void A03(Metadata metadata) {
        this.A08.AAG(metadata);
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public final void A14() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public final void A17(long j2, boolean z) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public final void A19(Format[] formatArr, long j2) throws C05699z {
        this.A02 = this.A06.A4F(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final boolean A7e() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final boolean A7m() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void ACT(long j2, long j3) throws C05699z {
        if (!this.A03 && this.A00 < 5) {
            this.A07.A07();
            if (A12(this.A05, this.A07, false) == -4) {
                if (this.A07.A04()) {
                    this.A03 = true;
                } else if (!this.A07.A03()) {
                    CV cv = this.A07;
                    String[] strArr = A0B;
                    if (strArr[0].length() != strArr[7].length()) {
                        String[] strArr2 = A0B;
                        strArr2[6] = "oJNy7wvRq4TsnN4Ik7JOHneCelTjV3TM";
                        strArr2[4] = "4f5lGS7X1G5JYf6Usji5tJWLoKljCGYJ";
                        cv.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                    } else {
                        String[] strArr3 = A0B;
                        strArr3[0] = "JrbxqibW71vJtGIxmKNzu0gc";
                        strArr3[7] = "aBslXCcOqyoFcXReLJb0k0eg";
                        cv.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                    }
                    try {
                        int i2 = (this.A01 + this.A00) % 5;
                        this.A0A[i2] = this.A02.A4f(this.A07);
                        this.A09[i2] = ((YH) this.A07).A00;
                        this.A00++;
                    } catch (C0653Du e2) {
                        throw C05699z.A01(e2, A10());
                    }
                }
            }
        }
        int i3 = this.A00;
        String[] strArr4 = A0B;
        if (strArr4[0].length() != strArr4[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr5 = A0B;
        strArr5[2] = "FI5ou6JhGKfNQASG6lr2Dh53KdKmMJ1";
        strArr5[1] = "8nK6Ac79BLzTFAHCrRK9v";
        if (i3 > 0) {
            long[] jArr = this.A09;
            int i4 = this.A01;
            if (jArr[i4] <= j2) {
                A02(this.A0A[i4]);
                Metadata[] metadataArr = this.A0A;
                int i5 = this.A01;
                metadataArr[i5] = null;
                this.A01 = (i5 + 1) % 5;
                this.A00--;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AX
    public final int ADV(Format format) {
        if (this.A06.ADW(format)) {
            return D0.A0z(null, format.A0H) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A03((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
