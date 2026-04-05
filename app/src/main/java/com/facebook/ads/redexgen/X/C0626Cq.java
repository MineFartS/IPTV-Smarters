package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(16)
public final class C0626Cq implements InterfaceC1163Xy, AR, AP {
    public static byte[] A0O;
    public static String[] A0P;
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public Format A06;
    public Format A07;
    public C0585Aq A08;
    public BZ A09;
    public BZ A0A;
    public FD A0B;
    public List<C0707Ga> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final InterfaceC1163Xy A0F;
    public final Y1 A0G;
    public final Y4 A0H;
    public final CopyOnWriteArraySet<B6> A0I;
    public final CopyOnWriteArraySet<InterfaceC0655Dw> A0J;
    public final CopyOnWriteArraySet<InterfaceC0711Ge> A0K;
    public final CopyOnWriteArraySet<JP> A0L;
    public final CopyOnWriteArraySet<JG> A0M;
    public final Y0[] A0N;

    static {
        A0G();
        A0F();
    }

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{45, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 27, 59, 6, DateTimeFieldType.HOUR_OF_DAY, 46, DateTimeFieldType.MINUTE_OF_DAY, 31, 7, 27, 12, 9, 47, 40, 60, 59, 57, 63, DateTimeFieldType.HOUR_OF_HALFDAY, 63, 34, 46, 47, 40, 63, DateTimeFieldType.MILLIS_OF_DAY, 51, 41, 46, 63, 52, 63, 40, 122, 59, 54, 40, 63, 59, 62, 35, 122, 47, 52, 41, 63, 46, 122, 53, 40, 122, 40, 63, 42, 54, 59, 57, 63, 62, 116};
    }

    public static void A0G() {
        A0P = new String[]{"p1p2g9mbI7jG28uS1AIjZaN2DuNLisT4", "5M6TC2sONh3rGys5YKd78dMRKX2wOUqH", "h92WNkWPJTM", "jYXxaa6xf7axcTjhEWPmUH7zZsfwsjgI", "vYDSW5DyAu5jQwnIRgw24Ezub5gSEfu7", "VyMVayVAQGyPc0QthTR0tkMwCD52dsyF", "LU4FXKZXpKPxotYf", "puFnwNxTYtdaaLd9gUGAlTVzIEShK4ZY"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0626Cq(AZ az, HW hw, AE ae, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz) {
        this(az, hw, ae, interfaceC0612Bz, new C0574Af());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0626Cq(AZ az, HW hw, AE ae, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz, C0574Af c0574Af) {
        this(az, hw, ae, interfaceC0612Bz, c0574Af, IP.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C0626Cq(AZ az, HW hw, AE ae, @Nullable InterfaceC0612Bz<YS> interfaceC0612Bz, C0574Af c0574Af, IP ip) {
        this.A0G = new Y1(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        Handler handler = this.A0E;
        Y1 y1 = this.A0G;
        this.A0N = az.A4R(handler, y1, y1, y1, y1, interfaceC0612Bz);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = C0585Aq.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, hw, ae, ip);
        this.A0H = c0574Af.A00(this.A0F, ip);
        A3H(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0J(this.A0H);
        if (interfaceC0612Bz instanceof YN) {
            ((YN) interfaceC0612Bz).A05(this.A0E, this.A0H);
        }
    }

    private final InterfaceC1163Xy A02(Y0[] y0Arr, HW hw, AE ae, IP ip) {
        return new C0631Cw(y0Arr, hw, ae, ip);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 68), A07(15, 49, 96));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Y0 y0 : this.A0N) {
            int iA7F = y0.A7F();
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "VrJ3McZcw7cn2zeT";
            strArr2[0] = "MNepmlV8OvsHi61EfIBswCx5NcPOIPrl";
            if (iA7F == 2) {
                arrayList.add(this.A0F.A4L(y0).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AV) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        if (A0P[7].charAt(22) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr3 = A0P;
        strArr3[5] = "BcNzrhvciYYCifYD3J0kGNpt4Q56t2ws";
        strArr3[4] = "LBzJc3KMaCoazXjGhEegCXyOf3paMmXp";
        this.A0D = z;
    }

    private final void A0J(InterfaceC0655Dw interfaceC0655Dw) {
        this.A0J.add(interfaceC0655Dw);
    }

    public final int A0K() {
        return this.A01;
    }

    public final Format A0L() {
        return this.A06;
    }

    @Nullable
    public final Format A0M() {
        return this.A07;
    }

    public final void A0N() {
        ADS(false);
    }

    public final void A0O(float f2) {
        this.A00 = f2;
        for (Y0 y0 : this.A0N) {
            String[] strArr = A0P;
            if (strArr[5].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[6] = "TZ1OBcEbhXggSiRE";
            strArr2[0] = "o47SCfAcsD46THYYRPii4HELThPbmwG8";
            if (y0.A7F() == 1) {
                this.A0F.A4L(y0).A06(2).A07(Float.valueOf(f2)).A05();
            }
        }
    }

    public final void A0P(Surface surface) {
        A0E();
        A0H(surface, false);
    }

    public final void A0Q(FD fd) {
        ABm(fd, true, true);
    }

    public final void A0R(JG jg) {
        this.A0M.add(jg);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void A3H(AN an) {
        this.A0F.A3H(an);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1163Xy
    public final AV A4L(AU au) {
        return this.A0F.A4L(au);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final int A5X() {
        return this.A0F.A5X();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final long A5Y() {
        return this.A0F.A5Y();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final long A5q() {
        return this.A0F.A5q();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final int A5s() {
        return this.A0F.A5s();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final int A5t() {
        return this.A0F.A5t();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final long A5v() {
        return this.A0F.A5v();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final AbstractC0573Ae A5x() {
        return this.A0F.A5x();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final int A5y() {
        return this.A0F.A5y();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final long A66() {
        return this.A0F.A66();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final boolean A6n() {
        return this.A0F.A6n();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1163Xy
    public final void ABm(FD fd, boolean z, boolean z2) {
        FD fd2 = this.A0B;
        if (fd2 != fd) {
            if (fd2 != null) {
                fd2.ACP(this.A0H);
                this.A0H.A08();
            }
            fd.A3F(this.A0E, this.A0H);
            this.A0B = fd;
        }
        this.A0F.ABm(fd, z, z2);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void ACG() {
        this.A0F.ACG();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        FD fd = this.A0B;
        if (fd != null) {
            fd.ACP(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void ACo(long j2) {
        this.A0H.A07();
        this.A0F.ACo(j2);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void ACp() {
        this.A0H.A07();
        this.A0F.ACp();
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AD5(boolean z) {
        this.A0F.AD5(z);
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void ADS(boolean z) {
        this.A0F.ADS(z);
        FD fd = this.A0B;
        if (fd != null) {
            fd.ACP(this.A0H);
            this.A0B = null;
            this.A0H.A08();
        }
        this.A0C = Collections.emptyList();
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[5] = "8NqoZsSfBCZ1v43okD4Pix8d8oY1Moxp";
        strArr2[4] = "VfYOa1CKuZhM9jsFhHY6jw4UB0OoLmrV";
    }
}
