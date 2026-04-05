package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.32, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass32 extends D0 implements Handler.Callback {
    public static String[] A0D;
    public int A00;
    public int A01;
    public Format A02;
    public InterfaceC1265aq A03;
    public C0580Al A04;
    public AW A05;
    public AW A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final AC A0A;
    public final InterfaceC0710Gd A0B;
    public final InterfaceC0711Ge A0C;

    static {
        A05();
    }

    public static void A05() {
        A0D = new String[]{"fagSsoac43UJSJG", "PL0Df5XObPsMjoFT3sU6Lp83XbviyP8R", "k75ap2fxOZvkqr2FjEQ9d3Y", "qEZm9kPptvCV49j1bDgJYwonF92a", "8QH8MqTnW7KMzd9bL", "CjrIcpNXno9M2QOeMZvTD2WdktHrPs5P", "AfT76Pf2kDJi2th", "sZbuEqgSWLt9Albo4x4yfDH"};
    }

    public AnonymousClass32(InterfaceC0711Ge interfaceC0711Ge, Looper looper) {
        this(interfaceC0711Ge, looper, InterfaceC0710Gd.A00);
    }

    public AnonymousClass32(InterfaceC0711Ge interfaceC0711Ge, Looper looper, InterfaceC0710Gd interfaceC0710Gd) {
        super(3);
        this.A0C = (InterfaceC0711Ge) IM.A01(interfaceC0711Ge);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC0710Gd;
        this.A0A = new AC();
    }

    private long A00() {
        int i2 = this.A01;
        if (i2 == -1 || i2 >= this.A06.A6H()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6G(this.A01);
    }

    private void A01() {
        A07(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AW aw = this.A06;
        if (aw != null) {
            aw.A08();
            this.A06 = null;
        }
        AW aw2 = this.A05;
        if (aw2 != null) {
            aw2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.ACG();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4G(this.A02);
    }

    private void A06(List<C0707Ga> list) {
        this.A0C.A9M(list);
    }

    private void A07(List<C0707Ga> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A06(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public final void A14() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public final void A17(long j2, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        InterfaceC1265aq interfaceC1265aq = this.A03;
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        strArr2[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        interfaceC1265aq.flush();
    }

    @Override // com.facebook.ads.redexgen.X.D0
    public final void A19(Format[] formatArr, long j2) throws C05699z {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4G(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final boolean A7e() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final boolean A7m() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    @Override // com.facebook.ads.redexgen.X.Y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ACT(long r10, long r12) throws com.facebook.ads.redexgen.X.C05699z {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass32.ACT(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.AX
    public final int ADV(Format format) {
        if (this.A0B.ADW(format)) {
            return D0.A0z(null, format.A0H) ? 4 : 2;
        }
        if (C0761Ie.A0D(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A06((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
