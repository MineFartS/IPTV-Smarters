package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.C0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(18)
public final class YK<T extends C0> implements InterfaceC0611By<T> {
    public static byte[] A0K;
    public static String[] A0L;
    public int A00;
    public int A01;
    public HandlerThread A02;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/YK<TT;>.PostRequestHandler; */
    public HandlerC0596Be A03;
    public C0610Bw A04;
    public T A05;
    public Object A06;
    public Object A07;
    public byte[] A08;
    public byte[] A09;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/YK<TT;>.PostResponseHandler; */
    public final HandlerC0597Bf A0A;
    public final CA A0B;
    public final UUID A0C;
    public final int A0D;
    public final int A0E;
    public final InterfaceC0598Bg<T> A0F;
    public final C0604Bm A0G;
    public final DrmInitData.SchemeData A0H;
    public final C6<T> A0I;
    public final HashMap<String, String> A0J;

    static {
        A05();
        A04();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private long A01() {
        if (!C05639t.A05.equals(this.A0C)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> pairA01 = CE.A01(this);
        return Math.min(((Long) pairA01.first).longValue(), ((Long) pairA01.second).longValue());
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{38, 71, 72, 67, 87, 78, 86, 38, 84, 79, 53, 71, 85, 85, 75, 81, 80, -51, -5, -10, -37, -18, -6, -2, -18, -4, -3, -47, -22, -9, -19, -11, -18, -5, -55, -10, -10, -13, -10, -92, -8, -10, -3, -19, -14, -21, -92, -8, -13, -92, -10, -23, -9, -8, -13, -10, -23, -92, -37, -19, -24, -23, -6, -19, -14, -23, -92, -17, -23, -3, -9, -78, -23, 0, 0, 6, 3, 8, -1, -70, 6, 3, -3, -1, 8, DateTimeFieldType.HALFDAY_OF_DAY, -1, -70, 2, -5, DateTimeFieldType.HALFDAY_OF_DAY, -70, -1, DateTimeFieldType.MINUTE_OF_DAY, 10, 3, 12, -1, -2, -70, 9, 12, -70, DateTimeFieldType.HOUR_OF_DAY, 3, 6, 6, -70, -1, DateTimeFieldType.MINUTE_OF_DAY, 10, 3, 12, -1, -70, DateTimeFieldType.HALFDAY_OF_DAY, 9, 9, 8, -56, -70, -20, -1, 7, -5, 3, 8, 3, 8, 1, -70, DateTimeFieldType.HALFDAY_OF_DAY, -1, -3, 9, 8, -2, DateTimeFieldType.HALFDAY_OF_DAY, -44, -70};
    }

    public static void A05() {
        A0L = new String[]{"ygnbftuzQ623Ar", "0dBxCv", "0mS6EqtDw1IrcjMleAT8IB1AlC6o9dAz", "RvmLzAjUPGIONaTchxcxVzTcBBQZgw7Y", "nJTfBRZW6rn0", "sj1G7dKmGRmO2HqivExl", "qBp8iQwY5MoBhJy8uyiyd2Hnkft4tubm", "GRqzAUhZ8aAEJGz"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bg != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession$ProvisioningManager<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C6 != com.facebook.ads.internal.exoplayer2.drm.ExoMediaDrm<T extends com.facebook.ads.redexgen.X.C0> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public YK(UUID uuid, C6<T> c6, InterfaceC0598Bg<T> interfaceC0598Bg, @Nullable DrmInitData.SchemeData schemeData, int i2, @Nullable byte[] bArr, HashMap<String, String> map, CA ca, Looper looper, C0604Bm c0604Bm, int i3) {
        this.A0C = uuid;
        this.A0F = interfaceC0598Bg;
        this.A0I = c6;
        this.A0E = i2;
        this.A08 = bArr;
        this.A0H = bArr != null ? null : schemeData;
        this.A0J = map;
        this.A0B = ca;
        this.A0D = i3;
        this.A0G = c0604Bm;
        this.A01 = 2;
        this.A0A = new HandlerC0597Bf(this, looper);
        this.A02 = new HandlerThread(A02(17, 17, 29));
        this.A02.start();
        this.A03 = new HandlerC0596Be(this, this.A02.getLooper());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    private void A03() {
        if (this.A01 == 4) {
            this.A01 = 3;
            A09(new C9());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    private void A06(int i2, boolean z) {
        byte[] bArr = i2 == 3 ? this.A08 : this.A09;
        byte[] bArr2 = null;
        String mimeType = null;
        String licenseServerUrl = null;
        DrmInitData.SchemeData schemeData = this.A0H;
        if (schemeData != null) {
            bArr2 = schemeData.A04;
            mimeType = this.A0H.A02;
            licenseServerUrl = this.A0H.A01;
        }
        try {
            this.A06 = Pair.create(this.A0I.getKeyRequest(bArr, bArr2, mimeType, i2, this.A0J), licenseServerUrl);
            this.A03.A02(1, this.A06, z);
        } catch (Exception e2) {
            A0A(e2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    private void A09(Exception exc) {
        this.A04 = new C0610Bw(exc);
        this.A0G.A04(exc);
        if (this.A01 != 4) {
            this.A01 = 1;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    private void A0A(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.A0F.ABv(this);
        } else {
            A09(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public void A0B(Object obj, Object obj2) {
        if (obj == this.A06) {
            boolean zA0E = A0E();
            if (A0L[7].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[4] = "Dj52Xz5E9G6B";
            strArr[0] = "yQtL6VAJC1YqjW";
            if (!zA0E) {
                return;
            }
            this.A06 = null;
            if (obj2 instanceof Exception) {
                A0A((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.A0E == 3) {
                    this.A0I.provideKeyResponse(this.A08, bArr);
                    this.A0G.A01();
                    return;
                }
                byte[] bArrProvideKeyResponse = this.A0I.provideKeyResponse(this.A09, bArr);
                if ((this.A0E == 2 || (this.A0E == 0 && this.A08 != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.A08 = bArrProvideKeyResponse;
                }
                this.A01 = 4;
                this.A0G.A00();
            } catch (Exception e2) {
                A0A(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public void A0C(Object obj, Object obj2) {
        if (obj == this.A07) {
            if (this.A01 != 2 && !A0E()) {
                return;
            }
            this.A07 = null;
            if (obj2 instanceof Exception) {
                this.A0F.AAh((Exception) obj2);
                return;
            }
            try {
                this.A0I.provideProvisionResponse((byte[]) obj2);
                InterfaceC0598Bg<T> interfaceC0598Bg = this.A0F;
                String[] strArr = A0L;
                if (strArr[4].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0L;
                strArr2[2] = "a4sDA20kWFGOKzGfRWeaug5eKqIpzvIQ";
                strArr2[2] = "a4sDA20kWFGOKzGfRWeaug5eKqIpzvIQ";
                interfaceC0598Bg.AAg();
            } catch (Exception e2) {
                this.A0F.AAh(e2);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    private void A0D(boolean z) {
        int i2 = this.A0E;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 || !A0F()) {
                    return;
                }
                A06(3, z);
                return;
            }
            byte[] bArr = this.A08;
            if (A0L[5].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[3] = "nvqtgBbI1rUZtdpDbdJLT2qwzjn5A3EQ";
            strArr[3] = "nvqtgBbI1rUZtdpDbdJLT2qwzjn5A3EQ";
            if (bArr == null) {
                A06(2, z);
                return;
            } else {
                if (!A0F()) {
                    return;
                }
                A06(2, z);
                return;
            }
        }
        if (this.A08 == null) {
            A06(1, z);
            return;
        }
        if (this.A01 != 4 && !A0F()) {
            return;
        }
        long jA01 = A01();
        if (this.A0E != 0 || jA01 > 60) {
            if (jA01 <= 0) {
                A09(new C9());
                return;
            } else {
                this.A01 = 4;
                this.A0G.A02();
                return;
            }
        }
        String str = A02(72, 68, 46) + jA01;
        A06(2, z);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    private boolean A0E() {
        int i2 = this.A01;
        return i2 == 3 || i2 == 4;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    private boolean A0F() {
        try {
            this.A0I.restoreKeys(this.A09, this.A08);
            return true;
        } catch (Exception e2) {
            Log.e(A02(0, 17, 118), A02(34, 38, 24), e2);
            A09(e2);
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    private boolean A0G(boolean z) {
        if (A0E()) {
            return true;
        }
        try {
            this.A09 = this.A0I.openSession();
            this.A05 = (T) this.A0I.createMediaCrypto(this.A09);
            this.A01 = 3;
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                this.A0F.ABv(this);
                return false;
            }
            A09(e2);
            return false;
        } catch (Exception e3) {
            A09(e3);
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public final void A0H() {
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == 1 && this.A01 != 1 && A0G(true)) {
            A0D(true);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public final void A0I() {
        if (A0G(false)) {
            A0D(true);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public final void A0J() {
        this.A07 = this.A0I.getProvisionRequest();
        this.A03.A02(0, this.A07, true);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public final void A0K(int i2) {
        if (A0E()) {
            String[] strArr = A0L;
            if (strArr[4].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "lZu3kopIqXcrfR3er40TopUaCPNEg1WS";
            strArr2[3] = "lZu3kopIqXcrfR3er40TopUaCPNEg1WS";
            if (i2 == 1) {
                this.A01 = 3;
                this.A0F.ABv(this);
            } else if (i2 == 2) {
                A0D(false);
            } else {
                if (i2 != 3) {
                    return;
                }
                A03();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public final void A0L(Exception exc) {
        A09(exc);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public final boolean A0M() {
        int i2 = this.A00 - 1;
        this.A00 = i2;
        if (i2 != 0) {
            return false;
        }
        this.A01 = 0;
        this.A0A.removeCallbacksAndMessages(null);
        this.A03.removeCallbacksAndMessages(null);
        this.A03 = null;
        this.A02.quit();
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A07 = null;
        byte[] bArr = this.A09;
        if (bArr != null) {
            this.A0I.closeSession(bArr);
            this.A09 = null;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public final boolean A0N(byte[] bArr) {
        DrmInitData.SchemeData schemeData = this.A0H;
        return Arrays.equals(schemeData != null ? schemeData.A04 : null, bArr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    public final boolean A0O(byte[] bArr) {
        return Arrays.equals(this.A09, bArr);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0611By
    public final C0610Bw A6D() {
        if (this.A01 == 1) {
            return this.A04;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0611By
    public final T A6Z() {
        return this.A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0611By
    public final int A75() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YK != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.C0> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0611By
    public final Map<String, String> ABw() {
        byte[] bArr = this.A09;
        if (bArr == null) {
            return null;
        }
        C6<T> c6 = this.A0I;
        if (A0L[5].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[7] = "lzhfD5NgGZX1H2DfqRAO4AgkK";
        strArr[7] = "lzhfD5NgGZX1H2DfqRAO4AgkK";
        return c6.queryKeyStatus(bArr);
    }
}
