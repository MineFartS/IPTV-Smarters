package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0662Ed {
    public static byte[] A0F;
    public static String[] A0G;
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final EJ A09;
    public final C0667Ei A0A;
    public final ArrayList<RunnableC0659Ea> A0B;
    public final ArrayList<RunnableC0659Ea> A0C;
    public final CopyOnWriteArraySet<EW> A0D;
    public final DownloadAction.Deserializer[] A0E;

    static {
        A0D();
        A0C();
    }

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0G[7].charAt(18) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "QeXCOK5E1pPej2TxlzyNK8QEELc16ejC";
            strArr[5] = "QeXCOK5E1pPej2TxlzyNK8QEELc16ejC";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 103);
            i5++;
        }
    }

    public static void A0C() {
        A0F = new byte[]{40, 107, 100, 105, 123, 96, 109, 123, 40, 127, 97, 124, 96, 40, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 101, 80, 4, 72, 65, 69, 87, 80, 4, 75, 74, 65, 4, 96, 65, 87, 65, 86, 77, 69, 72, 77, 94, 65, 86, 4, 77, 87, 4, 86, 65, 85, 81, 77, 86, 65, 64, 10, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, 127, 122, 115, 54, 127, 57, 121, 37, DateTimeFieldType.CLOCKHOUR_OF_DAY, 2, 26, 81, 24, 2, 81, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, 32, 50, 42, 97, 50, 53, 32, 53, 36, 97, 40, 50, 97, 34, 41, 32, 47, 38, 36, 37};
    }

    public static void A0D() {
        A0G = new String[]{"8avf0Jibg", "29lNoiTUBE2uYEjX9VQOmTXDz5OY", "iVCyimFGxTrkRtFibV9levDJM5ZeLgZu", "gsRFpTOWHqJbEx7", "Kz1bOIham", "JnXM2eLoSoNer4vADvBB94foIijHhZU8", "txozpLaaBXvdIU5pC59NuAEDTSpBHfjF", "fwU5WNlYuxW7JC9kmXc8msxXEM9ymJ0s"};
    }

    public C0662Ed(C0667Ei c0667Ei, int i2, int i3, File file, DownloadAction.Deserializer... deserializerArr) {
        IM.A05(deserializerArr.length > 0, A05(16, 38, 67));
        this.A0A = c0667Ei;
        this.A04 = i2;
        this.A05 = i3;
        this.A09 = new EJ(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper looperMyLooper = Looper.myLooper();
        this.A07 = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        this.A08 = new HandlerThread(A05(54, 24, 113));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0659Ea A02(DownloadAction downloadAction) {
        int i2 = this.A00;
        this.A00 = i2 + 1;
        RunnableC0659Ea runnableC0659Ea = new RunnableC0659Ea(i2, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC0659Ea);
        A0K(A05(78, 13, 22), runnableC0659Ea);
        return runnableC0659Ea;
    }

    private void A08() {
        this.A06.post(new EU(this));
    }

    private void A09() {
        if (!A0S()) {
            return;
        }
        for (EW listener : this.A0D) {
            listener.A9j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        DownloadAction downloadAction;
        boolean z;
        if (!this.A02 || this.A03) {
            return;
        }
        int i2 = (this.A01 || this.A0B.size() == this.A04) ? 1 : 0;
        for (int j2 = 0; j2 < this.A0C.size(); j2++) {
            RunnableC0659Ea runnableC0659Ea = this.A0C.get(j2);
            if (runnableC0659Ea.A0F() && ((z = (downloadAction = runnableC0659Ea.A04).A03) || i2 == 0)) {
                boolean z2 = true;
                int i3 = 0;
                while (true) {
                    if (i3 >= j2) {
                        break;
                    }
                    RunnableC0659Ea runnableC0659Ea2 = this.A0C.get(i3);
                    DownloadAction action = runnableC0659Ea2.A04;
                    if (action.A0A(downloadAction)) {
                        if (!z) {
                            if (runnableC0659Ea2.A04.A03) {
                                z2 = false;
                                i2 = 1;
                                break;
                            }
                        } else {
                            z2 = false;
                            String str = runnableC0659Ea + A05(0, 14, 111) + runnableC0659Ea2;
                            runnableC0659Ea2.A08();
                        }
                    }
                    i3++;
                }
                if (z2) {
                    runnableC0659Ea.A0A();
                    if (!z) {
                        this.A0B.add(runnableC0659Ea);
                        i2 = this.A0B.size() == this.A04 ? 1 : 0;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B() {
        /*
            r3 = this;
            boolean r0 = r3.A03
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ea> r0 = r3.A0C
            int r0 = r0.size()
            com.facebook.ads.internal.exoplayer2.offline.DownloadAction[] r2 = new com.facebook.ads.internal.exoplayer2.offline.DownloadAction[r0]
            r1 = 0
        Le:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ea> r0 = r3.A0C
            int r0 = r0.size()
            if (r1 >= r0) goto L27
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ea> r0 = r3.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Ea r0 = (com.facebook.ads.redexgen.X.RunnableC0659Ea) r0
            com.facebook.ads.internal.exoplayer2.offline.DownloadAction r0 = com.facebook.ads.redexgen.X.RunnableC0659Ea.A06(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto Le
        L27:
            android.os.Handler r1 = r3.A06
            com.facebook.ads.redexgen.X.EV r0 = new com.facebook.ads.redexgen.X.EV
            r0.<init>(r3, r2)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0662Ed.A0B():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC0659Ea runnableC0659Ea) {
        A0K(A05(91, 21, 38), runnableC0659Ea);
        C0661Ec c0661EcA0L = runnableC0659Ea.A0L();
        Iterator<EW> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().AB7(this, c0661EcA0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(RunnableC0659Ea runnableC0659Ea) {
        if (this.A03) {
            return;
        }
        boolean zA0M = runnableC0659Ea.A0M();
        String[] strArr = A0G;
        if (strArr[2].charAt(18) != strArr[6].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[5] = "MuXE9yewg4GnYpwcSobAkjsL3VeJsTJN";
        strArr2[5] = "MuXE9yewg4GnYpwcSobAkjsL3VeJsTJN";
        boolean z = !zA0M;
        if (z) {
            this.A0B.remove(runnableC0659Ea);
        }
        A0E(runnableC0659Ea);
        if (runnableC0659Ea.A0N()) {
            this.A0C.remove(runnableC0659Ea);
            A0B();
        }
        if (z) {
            A0A();
            A09();
        }
    }

    public static void A0K(String str, RunnableC0659Ea runnableC0659Ea) {
        String str2 = str + A05(14, 2, 80) + runnableC0659Ea;
    }

    public final int A0P(DownloadAction downloadAction) {
        IM.A04(!this.A03);
        RunnableC0659Ea runnableC0659EaA02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (runnableC0659EaA02.A06 == 0) {
                A0E(runnableC0659EaA02);
            }
        }
        return runnableC0659EaA02.A02;
    }

    public final void A0Q() {
        IM.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0R(EW ew) {
        this.A0D.add(ew);
    }

    public final boolean A0S() {
        IM.A04(!this.A03);
        if (!this.A02) {
            return false;
        }
        for (int i2 = 0; i2 < this.A0C.size(); i2++) {
            if (this.A0C.get(i2).A0M()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.C0661Ec[] A0T() {
        /*
            r3 = this;
            boolean r0 = r3.A03
            r0 = r0 ^ 1
            com.facebook.ads.redexgen.X.IM.A04(r0)
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ea> r0 = r3.A0C
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Ec[] r2 = new com.facebook.ads.redexgen.X.C0661Ec[r0]
            r1 = 0
        L10:
            int r0 = r2.length
            if (r1 >= r0) goto L24
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ea> r0 = r3.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Ea r0 = (com.facebook.ads.redexgen.X.RunnableC0659Ea) r0
            com.facebook.ads.redexgen.X.Ec r0 = r0.A0L()
            r2[r1] = r0
            int r1 = r1 + 1
            goto L10
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0662Ed.A0T():com.facebook.ads.redexgen.X.Ec[]");
    }
}
