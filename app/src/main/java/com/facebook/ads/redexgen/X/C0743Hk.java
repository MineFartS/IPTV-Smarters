package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0743Hk extends ImageView implements PE {
    public static byte[] A05;
    public static String[] A06;
    public static final int A07;

    @Nullable
    public C0854Lx A00;
    public final Paint A01;
    public final X2 A02;
    public final C0789Jg A03;
    public final IL A04;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    public static void A07() {
        A06 = new String[]{"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    }

    static {
        A07();
        A06();
        A07 = (int) (C0856Lz.A01 * 4.0f);
    }

    public C0743Hk(X2 x2, C0789Jg c0789Jg) {
        super(x2);
        this.A04 = new IL() { // from class: com.facebook.ads.redexgen.X.7W
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9F
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A04(IV iv) {
                this.A00.A0A();
            }
        };
        this.A03 = c0789Jg;
        this.A02 = x2;
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        int i2 = A07;
        setPadding(i2, i2, i2, i2);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new PR(this));
    }

    private void A04() {
        setImageBitmap(M8.A00(M7.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(M8.A00(M7.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A08() {
        C0854Lx c0854Lx = this.A00;
        if (c0854Lx != null) {
            float volume = c0854Lx.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void A0A() {
        if (this.A00 == null) {
            return;
        }
        if (A08()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A7w(C0854Lx c0854Lx) {
        this.A00 = c0854Lx;
        C0854Lx c0854Lx2 = this.A00;
        if (c0854Lx2 != null) {
            c0854Lx2.getEventBus().A06(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void ADd(C0854Lx c0854Lx) {
        C0854Lx c0854Lx2 = this.A00;
        if (c0854Lx2 != null) {
            c0854Lx2.getEventBus().A07(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, Math.min(r1, r0), this.A01);
        super.onDraw(canvas);
    }
}
