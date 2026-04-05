package com.facebook.ads.redexgen.X;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.MonotonicNonNull;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y4 implements AN, InterfaceC0655Dw, B6, JP, FR, InterfaceC0734Hb, InterfaceC0605Bn {
    public static String[] A05;

    @MonotonicNonNull
    public AS A00;
    public final IP A03;
    public final CopyOnWriteArraySet<InterfaceC0578Aj> A04 = new CopyOnWriteArraySet<>();
    public final C0575Ag A02 = new C0575Ag();
    public final C0572Ad A01 = new C0572Ad();

    static {
        A06();
    }

    public static void A06() {
        A05 = new String[]{"oWxliEG", "84CCzfJSWHAMzlT", "dVPYU5AFfnLld9", "202VfNqPV04zLFr42xUQnFXcv", "6C2OHs0d6U2aNpx0mThNdUqCMJf7H", "j36hHuSQknS9Y2BeP2DWP06EygcBzL55", "WN9koNHhTr4SbLKtJDKTY2JTPC", "f2Eog"};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0734Hb
    public final void A94(int i2, long j2, long j3) {
        A01();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public Y4(@Nullable AS as, IP ip) {
        this.A00 = as;
        this.A03 = (IP) IM.A01(ip);
    }

    private C0577Ai A00() {
        return A05(this.A02.A04());
    }

    private C0577Ai A01() {
        return A05(this.A02.A05());
    }

    private C0577Ai A02() {
        return A05(this.A02.A06());
    }

    private C0577Ai A03() {
        return A05(this.A02.A07());
    }

    private final C0577Ai A04(int i2, @Nullable FB fb) {
        long jA00;
        IM.A01(this.A00);
        long jA4s = this.A03.A4s();
        AbstractC0573Ae timeline = this.A00.A5x();
        if (i2 == this.A00.A5y()) {
            if (fb != null && fb.A02()) {
                if (this.A00.A5s() == fb.A00 && this.A00.A5t() == fb.A01) {
                    jA00 = this.A00.A5v();
                } else {
                    jA00 = 0;
                }
            } else {
                jA00 = this.A00.A5q();
            }
        } else if (i2 >= timeline.A02() || (fb != null && fb.A02())) {
            jA00 = 0;
        } else {
            jA00 = timeline.A0C(i2, this.A01).A00();
        }
        return new C0577Ai(jA4s, timeline, i2, fb, jA00, this.A00.A5v(), this.A00.A5Y() - this.A00.A5q());
    }

    private C0577Ai A05(@Nullable C0576Ah c0576Ah) {
        if (c0576Ah == null) {
            int iA5y = ((AS) IM.A01(this.A00)).A5y();
            return A04(iA5y, this.A02.A08(iA5y));
        }
        return A04(c0576Ah.A00, c0576Ah.A01);
    }

    public final void A07() {
        if (!this.A02.A0G()) {
            C0577Ai c0577AiA02 = A02();
            this.A02.A0A();
            for (InterfaceC0578Aj interfaceC0578Aj : this.A04) {
                String[] strArr = A05;
                if (strArr[1].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[1] = "PBkwxeOlbvYzAOz";
                strArr2[4] = "zMCnce58Qhbdr93RoMzV7EOLVlkYq";
                interfaceC0578Aj.onSeekStarted(c0577AiA02);
            }
        }
    }

    public final void A08() {
        Iterator it = new ArrayList(this.A02.A05).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "gG2PlvUwOW39eC8R";
            strArr2[0] = "gG2PlvUwOW39eC8R";
            if (zHasNext) {
                C0576Ah mediaPeriod = (C0576Ah) it.next();
                AAD(mediaPeriod.A00, mediaPeriod.A01);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A8y(String str, long j2, long j3) {
        C0577Ai eventTime = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 1, str, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A8z(BZ bz) {
        C0577Ai c0577AiA00 = A00();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(c0577AiA00, 1, bz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A90(BZ bz) {
        C0577Ai c0577AiA02 = A02();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(c0577AiA02, 1, bz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A91(Format format) {
        C0577Ai c0577AiA03 = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(c0577AiA03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A92(int i2) {
        C0577Ai c0577AiA03 = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(c0577AiA03, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.B6
    public final void A93(int i2, long j2, long j3) {
        C0577Ai c0577AiA03 = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "uqo4gq1KBxiMktN";
            strArr[4] = "Ndm2ibG2UK8Su1apjnSt0jhcojAUZ";
            if (zHasNext) {
                it.next().onAudioUnderrun(c0577AiA03, i2, j2, j3);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final void A9S(int i2, @Nullable FB fb, FQ fq) {
        C0577Ai c0577AiA04 = A04(i2, fb);
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(c0577AiA04, fq);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0605Bn
    public final void A9T() {
        C0577Ai c0577AiA03 = A03();
        for (InterfaceC0578Aj listener : this.A04) {
            listener.onDrmKeysLoaded(c0577AiA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0605Bn
    public final void A9U() {
        C0577Ai c0577AiA03 = A03();
        for (InterfaceC0578Aj listener : this.A04) {
            listener.onDrmKeysRemoved(c0577AiA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0605Bn
    public final void A9V() {
        C0577Ai c0577AiA03 = A03();
        for (InterfaceC0578Aj listener : this.A04) {
            listener.onDrmKeysRestored(c0577AiA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0605Bn
    public final void A9W(Exception exc) {
        C0577Ai c0577AiA03 = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(c0577AiA03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void A9X(int i2, long j2) {
        C0577Ai c0577AiA00 = A00();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(c0577AiA00, i2, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final void AA0(int i2, @Nullable FB fb, FP fp, FQ fq) {
        A04(i2, fb);
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final void AA2(int i2, @Nullable FB fb, FP fp, FQ fq) {
        A04(i2, fb);
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final void AA5(int i2, @Nullable FB fb, FP fp, FQ fq, IOException iOException, boolean z) {
        C0577Ai c0577AiA04 = A04(i2, fb);
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(c0577AiA04, fp, fq, iOException, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final void AA7(int i2, @Nullable FB fb, FP fp, FQ fq) {
        A04(i2, fb);
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AN
    public final void AA9(boolean z) {
        C0577Ai c0577AiA02 = A02();
        for (InterfaceC0578Aj interfaceC0578Aj : this.A04) {
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            strArr[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            interfaceC0578Aj.onLoadingChanged(c0577AiA02, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final void AAC(int i2, FB fb) {
        this.A02.A0C(i2, fb);
        C0577Ai c0577AiA04 = A04(i2, fb);
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(c0577AiA04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final void AAD(int i2, FB fb) {
        this.A02.A0D(i2, fb);
        C0577Ai c0577AiA04 = A04(i2, fb);
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "xQuAJnMHmsnkUtn";
            strArr2[4] = "I7nuhInD03G6TyFgZN1tEp7XA66Po";
            if (zHasNext) {
                it.next().onMediaPeriodReleased(c0577AiA04);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0655Dw
    public final void AAG(Metadata metadata) {
        C0577Ai c0577AiA02 = A02();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(c0577AiA02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AN
    public final void AAV(AK ak) {
        C0577Ai c0577AiA02 = A02();
        for (InterfaceC0578Aj interfaceC0578Aj : this.A04) {
            if (A05[5].charAt(25) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            strArr[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            interfaceC0578Aj.onPlaybackParametersChanged(c0577AiA02, ak);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AN
    public final void AAX(C05699z c05699z) {
        C0577Ai c0577AiA02 = A02();
        for (InterfaceC0578Aj interfaceC0578Aj : this.A04) {
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            strArr2[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            interfaceC0578Aj.onPlayerError(c0577AiA02, c05699z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AN
    public final void AAZ(boolean z, int i2) {
        C0577Ai c0577AiA02 = A02();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(c0577AiA02, z, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AN
    public final void AAb(int i2) {
        this.A02.A0B(i2);
        C0577Ai c0577AiA02 = A02();
        for (InterfaceC0578Aj listener : this.A04) {
            listener.onPositionDiscontinuity(c0577AiA02, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FR
    public final void AAj(int i2, FB fb) {
        this.A02.A0E(i2, fb);
        C0577Ai c0577AiA04 = A04(i2, fb);
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(c0577AiA04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void AAm(Surface surface) {
        C0577Ai c0577AiA03 = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            strArr2[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            if (zHasNext) {
                it.next().onRenderedFirstFrame(c0577AiA03, surface);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AN
    public final void AAw() {
        if (this.A02.A0G()) {
            this.A02.A09();
            C0577Ai c0577AiA02 = A02();
            for (InterfaceC0578Aj listener : this.A04) {
                listener.onSeekProcessed(c0577AiA02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AN
    public final void AB8(AbstractC0573Ae abstractC0573Ae, @Nullable Object obj, int i2) {
        this.A02.A0F(abstractC0573Ae);
        C0577Ai c0577AiA02 = A02();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(c0577AiA02, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AN
    public final void AB9(TrackGroupArray trackGroupArray, HU hu) {
        C0577Ai c0577AiA02 = A02();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(c0577AiA02, trackGroupArray, hu);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABH(String str, long j2, long j3) {
        C0577Ai eventTime = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 2, str, j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABI(BZ bz) {
        C0577Ai c0577AiA00 = A00();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(c0577AiA00, 2, bz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABJ(BZ bz) {
        C0577Ai c0577AiA02 = A02();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(c0577AiA02, 2, bz);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABL(Format format) {
        C0577Ai c0577AiA03 = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(c0577AiA03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JP
    public final void ABO(int i2, int i3, int i4, float f2) {
        C0577Ai c0577AiA03 = A03();
        Iterator<InterfaceC0578Aj> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(c0577AiA03, i2, i3, i4, f2);
        }
    }
}
