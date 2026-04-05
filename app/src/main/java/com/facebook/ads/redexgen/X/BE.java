package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BE {
    public static String[] A06;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;

    @Nullable
    public final BC A05;

    static {
        A00();
    }

    public static void A00() {
        A06 = new String[]{"W1h", "J3B5KCEbjjwmRuC3OBjGZe6Vqq", "m9qFzMc74R8svEUC9gqMjQn", "jgNIoR8qAkaEc7us150M5yTFbz", "3ys", "w1u", "bbeJnzocKvEAyVfPIveapdYFC3HTaXea", "5a1"};
    }

    public BE(AudioTrack audioTrack) {
        if (J1.A02 >= 19) {
            this.A05 = new BC(audioTrack);
            A06();
        } else {
            this.A05 = null;
            A01(3);
        }
    }

    private void A01(int i2) {
        this.A00 = i2;
        if (i2 == 0) {
            this.A03 = 0L;
            this.A01 = -1L;
            this.A02 = System.nanoTime() / 1000;
            this.A04 = 5000L;
            return;
        }
        if (i2 == 1) {
            this.A04 = 5000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.A04 = 10000000L;
        } else {
            if (i2 == 4) {
                this.A04 = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final long A02() {
        BC bc = this.A05;
        if (bc != null) {
            return bc.A01();
        }
        return -1L;
    }

    public final long A03() {
        BC bc = this.A05;
        if (bc != null) {
            return bc.A02();
        }
        return -9223372036854775807L;
    }

    public final void A04() {
        if (this.A00 == 4) {
            A06();
        }
    }

    public final void A05() {
        A01(4);
    }

    public final void A06() {
        if (this.A05 != null) {
            A01(0);
        }
    }

    public final boolean A07() {
        int i2 = this.A00;
        return i2 == 1 || i2 == 2;
    }

    public final boolean A08() {
        return this.A00 == 2;
    }

    public final boolean A09(long timestampPositionFrames) {
        BC bc = this.A05;
        if (bc == null || timestampPositionFrames - this.A03 < this.A04) {
            return false;
        }
        this.A03 = timestampPositionFrames;
        boolean zA03 = bc.A03();
        int i2 = this.A00;
        if (i2 == 0) {
            if (!zA03) {
                if (timestampPositionFrames - this.A02 > 500000) {
                    A01(3);
                    return zA03;
                }
                return zA03;
            }
            if (this.A05.A02() >= this.A02) {
                this.A01 = this.A05.A01();
                String[] strArr = A06;
                if (strArr[1].length() != strArr[3].length()) {
                    A01(1);
                    return zA03;
                }
                String[] strArr2 = A06;
                strArr2[5] = "X7O";
                strArr2[4] = "dhv";
                A01(1);
                return zA03;
            }
            return false;
        }
        if (i2 == 1) {
            if (!zA03) {
                A06();
                return zA03;
            }
            if (this.A05.A01() > this.A01) {
                A01(2);
                return zA03;
            }
            return zA03;
        }
        if (i2 == 2) {
            if (!zA03) {
                A06();
                return zA03;
            }
            return zA03;
        }
        if (i2 == 3) {
            if (zA03) {
                A06();
                return zA03;
            }
            return zA03;
        }
        String[] strArr3 = A06;
        if (strArr3[0].length() != strArr3[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A06;
        strArr4[5] = "KBr";
        strArr4[4] = "FWj";
        if (i2 != 4) {
            throw new IllegalStateException();
        }
        return zA03;
    }
}
