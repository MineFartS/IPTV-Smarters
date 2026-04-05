package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y1 implements JP, B6, InterfaceC0711Ge, InterfaceC0655Dw, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01;
    public final /* synthetic */ C0626Cq A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"tENgV7sVRmCggStQb7ahqyncu3McMlqx", "EBCLDe86SI67l2WgLGk", "Xc2z6PWfFp", "ZjGJvfPpi7mMWyj8ThC73X2hXIQsvVeY", "O", "wm4K2NOZzdg8zteNHm", "uxR1U8t68FFaIgGW", "ZP1sAESULwb937k6ya35I8qp57tsUFN9"};
    }

    public Y1(C0626Cq c0626Cq) {
        this.A00 = c0626Cq;
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A8y(String str, long j2, long j3) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((B6) it.next()).A8y(str, j2, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A8z(BZ bz) {
        Iterator it = this.A00.A0I.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "r";
            strArr2[1] = "Pw7sEp82k0vieihjeRw";
            if (!zHasNext) {
                C0626Cq c0626Cq = this.A00;
                String[] strArr3 = A01;
                if (strArr3[0].charAt(30) == strArr3[7].charAt(30)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A01;
                strArr4[5] = "AJXnTxM8Cjr";
                strArr4[5] = "AJXnTxM8Cjr";
                c0626Cq.A06 = null;
                this.A00.A09 = null;
                this.A00.A01 = 0;
                return;
            }
            B6 b6 = (B6) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            String[] strArr5 = A01;
            strArr5[5] = "rZ";
            strArr5[5] = "rZ";
            b6.A8z(bz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A90(BZ bz) {
        this.A00.A09 = bz;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((B6) it.next()).A90(bz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A91(Format format) {
        this.A00.A06 = format;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((B6) it.next()).A91(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A92(int i2) {
        this.A00.A01 = i2;
        for (B6 b6 : this.A00.A0I) {
            if (A01[2].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "0C";
            strArr[2] = "0C";
            b6.A92(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A93(int i2, long j2, long j3) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((B6) it.next()).A93(i2, j2, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0711Ge
    public final void A9M(List<C0707Ga> list) {
        this.A00.A0C = list;
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0711Ge) it.next()).A9M(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void A9X(int i2, long j2) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((JP) it.next()).A9X(i2, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0655Dw
    public final void AAG(Metadata metadata) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((InterfaceC0655Dw) it.next()).AAG(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void AAm(Surface surface) {
        if (this.A00.A03 == surface) {
            Iterator it = this.A00.A0M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0L.iterator();
        while (it2.hasNext()) {
            ((JP) it2.next()).AAm(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABH(String str, long j2, long j3) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((JP) it.next()).ABH(str, j2, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABI(BZ bz) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((JP) it.next()).ABI(bz);
        }
        this.A00.A07 = null;
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABJ(BZ bz) {
        this.A00.A0A = bz;
        for (JP jp : this.A00.A0L) {
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "6iGRC7";
            strArr[5] = "6iGRC7";
            jp.ABJ(bz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABL(Format format) {
        this.A00.A07 = format;
        for (JP jp : this.A00.A0L) {
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            strArr2[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            jp.ABL(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABO(int i2, int i3, int i4, float f2) {
        Iterator it = this.A00.A0M.iterator();
        while (it.hasNext()) {
            ((JG) it.next()).ABO(i2, i3, i4, f2);
        }
        Iterator it2 = this.A00.A0L.iterator();
        while (it2.hasNext()) {
            ((JP) it2.next()).ABO(i2, i3, i4, f2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.A00.A0H(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0H(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0H(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0H(null, false);
    }
}
