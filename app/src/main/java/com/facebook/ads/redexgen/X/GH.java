package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(14)
public final class GH extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, InterfaceC0956Px {
    public static byte[] A0O;
    public static String[] A0P;
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    @Nullable
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;

    @Nullable
    public MediaController A0A;
    public PD A0B;
    public EnumC0958Pz A0C;
    public EnumC0958Pz A0D;
    public EnumC0958Pz A0E;
    public Q0 A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final long A0L;
    public final MediaController.MediaPlayerControl A0M;
    public final X2 A0N;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0O = new byte[]{89, 87, 91, 89, 30, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, 26, 89, 91, 65, 91, 89, 57, 102, 105, 75, 68, 68, 69, 94, 10, 90, 88, 79, 90, 75, 88, 79, 10, 71, 79, 78, 67, 75, 10, 90, 70, 75, 83, 79, 88, 10, 93, 67, 94, 66, 10, 121, 95, 88, 76, 75, 73, 79, 126, 79, 82, 94, 95, 88, 79, DateTimeFieldType.CLOCKHOUR_OF_DAY, 10, 45, 1, 27, 2, 10, 0, 73, 26, 78, 28, 11, 26, 28, 7, 11, 24, 11, 78, 24, 7, 10, 11, 1, 78, 7, 0, 8, 1, 28, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 26, 7, 1, 0, 93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 122, 104, 104, 126, 111, 104, 59, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 39, 39, 47, 36, 45, 104, 41, 36, 63, 41, 49, 59, 104, 60, 32, 58, 39, 63, 104, 41, 38, 104, 45, 48, 43, 45, 56, 60, 33, 39, 38, 104, 63, 33, 60, 32, 104, 59, 45, 60, 10, 41, 43, 35, 47, 58, 39, 61, 38, 44, 12, 58, 41, 63, 41, 42, 36, 45, 104, 39, 38, 104, 6, 39, 61, 47, 41, 60, 104, 41, 42, 39, 62, 45, 102, 104, 59, 39, 104, 63, 45, 104, 59, 33, 36, 45, 38, 60, 36, 49, 104, 33, 47, 38, 39, 58, 45, 104, 33, 60, 102, 50, 26, 26, DateTimeFieldType.MINUTE_OF_DAY, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, 85, DateTimeFieldType.SECOND_OF_DAY, 25, 2, DateTimeFieldType.SECOND_OF_DAY, 12, 6, 85, 1, 29, 7, 26, 2, 85, DateTimeFieldType.SECOND_OF_DAY, 27, 85, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, 1, 28, 26, 27, 85, 2, 28, 1, 29, 85, 6, DateTimeFieldType.CLOCKHOUR_OF_DAY, 1, 51, 26, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 7, 26, 0, 27, DateTimeFieldType.HOUR_OF_DAY, 85, 26, 27, 85, 59, 26, 0, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 1, 85, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 26, 3, DateTimeFieldType.CLOCKHOUR_OF_DAY, 91, 85, 6, 26, 85, 2, DateTimeFieldType.CLOCKHOUR_OF_DAY, 85, 6, 28, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, 1, 25, 12, 85, 28, DateTimeFieldType.MINUTE_OF_DAY, 27, 26, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 85, 28, 1, 91, 31, 54, 37, 51, 32, 54, 37, 50, 119, 54, 52, 52, 50, 59, 50, 37, 54, 35, 62, 56, 57, 119, 34, 57, 54, 33, 54, 62, 59, 54, 53, 59, 50, DateTimeFieldType.MILLIS_OF_DAY, 45, 34, 33, 47, 38, 99, 55, 44, 99, 32, 47, 44, 48, 38, 53, 10, 7, 6, 12, 67, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 2, DateTimeFieldType.MILLIS_OF_SECOND, 6, 67, 0, 11, 2, DateTimeFieldType.HALFDAY_OF_DAY, 4, 6, 7, 67, DateTimeFieldType.MILLIS_OF_SECOND, 12, 67, 97, 115, 115, 101, 116, 83, 79, 66, 90, 70, 81, 115, 108, 97, 96, 106, 94, 7, 82, 77, 68, 81, 7, 5, 31, 5, 7};
    }

    public static void A04() {
        A0P = new String[]{"w6W1Pn4pGSy1veXw7fNic4Q20vJelJ2", "acNB2lhq8cVPZLtYghlcj8euurSBcqdx", "I2BPPFoGG3lXsTKKPy2FKKasdsM", "uMMu8699SI696vicAGdUyhB1Kjcnsg5D", "S7aPtd9QGtmzyQ9VrNW20IwmaDF5p1Ml", "zS648UlhjTBJXulz7NmFsyAIwaw2iCpI", "ZyXsHo9oibpczWLkt42IpHWLTZevRgPI", "euMEykkwaXnS"};
    }

    static {
        A04();
        A03();
        A0Q = GH.class.getSimpleName();
    }

    public GH(X2 x2) {
        super(x2);
        this.A0C = EnumC0958Pz.A04;
        this.A0E = EnumC0958Pz.A04;
        this.A0D = EnumC0958Pz.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0I = false;
        this.A01 = 3;
        this.A0G = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0H = false;
        this.A0B = PD.A04;
        this.A0M = new C0953Pu(this);
        this.A0N = x2;
    }

    public GH(X2 x2, AttributeSet attributeSet) {
        super(x2, attributeSet);
        this.A0C = EnumC0958Pz.A04;
        this.A0E = EnumC0958Pz.A04;
        this.A0D = EnumC0958Pz.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0I = false;
        this.A01 = 3;
        this.A0G = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0H = false;
        this.A0B = PD.A04;
        this.A0M = new C0953Pu(this);
        this.A0N = x2;
    }

    public GH(X2 x2, AttributeSet attributeSet, int i2) {
        super(x2, attributeSet, i2);
        this.A0C = EnumC0958Pz.A04;
        this.A0E = EnumC0958Pz.A04;
        this.A0D = EnumC0958Pz.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0I = false;
        this.A01 = 3;
        this.A0G = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0H = false;
        this.A0B = PD.A04;
        this.A0M = new C0953Pu(this);
        this.A0N = x2;
    }

    private boolean A05() {
        return (this.A0C == EnumC0958Pz.A08 || this.A0C == EnumC0958Pz.A07) ? false : true;
    }

    private boolean A06() {
        return this.A0C == EnumC0958Pz.A07 || this.A0C == EnumC0958Pz.A0A || this.A0C == EnumC0958Pz.A05 || this.A0C == EnumC0958Pz.A06;
    }

    private boolean A07() {
        return (this.A0C == EnumC0958Pz.A08 || this.A0C == EnumC0958Pz.A07) ? false : true;
    }

    private boolean A08() {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.reset();
            return true;
        } catch (IllegalStateException e2) {
            this.A0N.A04().A86(A02(394, 6, 81), C05228d.A1s, new C05238e(e2));
            return false;
        }
    }

    private boolean A09(@Nullable Surface surface) {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.setSurface(surface);
            return true;
        } catch (IllegalStateException e2) {
            this.A0N.A04().A86(A02(394, 6, 81), C05228d.A1t, new C05238e(e2));
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public final void A7J() {
        if (!this.A0G) {
            ABa(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    @SuppressLint({"NewApi"})
    public final boolean A7Q() {
        if (this.A06 == null || Build.VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                int trackType = trackInfo.getTrackType();
                String[] strArr = A0P;
                if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0P;
                strArr2[5] = "iSqF26gJBktCMb0RObgKl91oEThpz7Z0";
                strArr2[5] = "iSqF26gJBktCMb0RObgKl91oEThpz7Z0";
                if (trackType == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e2) {
            Log.e(A0Q, A02(65, 35, 28), e2);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public final boolean A7R() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public final void ABa(boolean z, int i2) {
        this.A0N.A0A().A2v(i2);
        this.A0E = EnumC0958Pz.A05;
        if (this.A06 != null) {
            if (!A05()) {
                return;
            }
            if (z) {
                this.A0D = EnumC0958Pz.A05;
                this.A0J = true;
            }
            this.A06.pause();
            if (this.A0C != EnumC0958Pz.A06) {
                setVideoState(EnumC0958Pz.A05);
                return;
            }
            return;
        }
        setVideoState(EnumC0958Pz.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public final void ADH(int i2) {
        this.A0N.A0A().A8d(i2);
        setVideoState(EnumC0958Pz.A09);
        ADR(5);
        this.A03 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ADL(com.facebook.ads.redexgen.X.PD r5, int r6) throws java.lang.Throwable {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.X2 r0 = r4.A0N
            com.facebook.ads.redexgen.X.0S r0 = r0.A0A()
            r0.A36(r6)
            com.facebook.ads.redexgen.X.Pz r0 = com.facebook.ads.redexgen.X.EnumC0958Pz.A0A
            r4.A0E = r0
            r4.A0B = r5
            com.facebook.ads.redexgen.X.Pz r1 = r4.A0C
            com.facebook.ads.redexgen.X.Pz r0 = com.facebook.ads.redexgen.X.EnumC0958Pz.A0A
            if (r1 == r0) goto L45
            com.facebook.ads.redexgen.X.Pz r1 = r4.A0C
            com.facebook.ads.redexgen.X.Pz r0 = com.facebook.ads.redexgen.X.EnumC0958Pz.A07
            if (r1 == r0) goto L45
            com.facebook.ads.redexgen.X.Pz r3 = r4.A0C
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.GH.A0P
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto La4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GH.A0P
            java.lang.String r1 = "NTKGPTGyq7PSuZ6pDxSrkOD3BAS3oRMw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "NTKGPTGyq7PSuZ6pDxSrkOD3BAS3oRMw"
            r0 = 4
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Pz r0 = com.facebook.ads.redexgen.X.EnumC0958Pz.A04
            if (r3 == r0) goto L45
            com.facebook.ads.redexgen.X.Pz r1 = r4.A0C
            com.facebook.ads.redexgen.X.Pz r0 = com.facebook.ads.redexgen.X.EnumC0958Pz.A05
            if (r1 == r0) goto L45
            com.facebook.ads.redexgen.X.Pz r1 = r4.A0C
            com.facebook.ads.redexgen.X.Pz r0 = com.facebook.ads.redexgen.X.EnumC0958Pz.A06
            if (r1 != r0) goto L4e
        L45:
            android.media.MediaPlayer r1 = r4.A06
            if (r1 != 0) goto L88
            android.net.Uri r0 = r4.A07
            r4.setup(r0)
        L4e:
            boolean r0 = r4.isAvailable()
            if (r0 == 0) goto L76
            android.graphics.SurfaceTexture r3 = r4.getSurfaceTexture()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.GH.A0P
            r0 = 1
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GH.A0P
            java.lang.String r1 = "Wn6W9Nu3dNfA4pP49CdphRQGwehyl3Rd"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "Wn6W9Nu3dNfA4pP49CdphRQGwehyl3Rd"
            r0 = 4
            r2[r0] = r1
            r0 = 0
            r4.onSurfaceTextureAvailable(r3, r0, r0)
        L76:
            return
        L77:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.GH.A0P
            java.lang.String r1 = "pXleF17jKjib"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "pXleF17jKjib"
            r0 = 7
            r2[r0] = r1
            r0 = 0
            r4.onSurfaceTextureAvailable(r3, r0, r0)
            goto L76
        L88:
            int r0 = r4.A03
            if (r0 <= 0) goto L8f
            r1.seekTo(r0)
        L8f:
            android.media.MediaPlayer r0 = r4.A06
            r0.start()
            com.facebook.ads.redexgen.X.Pz r1 = r4.A0C
            com.facebook.ads.redexgen.X.Pz r0 = com.facebook.ads.redexgen.X.EnumC0958Pz.A07
            if (r1 != r0) goto L9e
            boolean r0 = r4.A0K
            if (r0 == 0) goto L4e
        L9e:
            com.facebook.ads.redexgen.X.Pz r0 = com.facebook.ads.redexgen.X.EnumC0958Pz.A0A
            r4.setVideoState(r0)
            goto L4e
        La4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GH.ADL(com.facebook.ads.redexgen.X.PD, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public final void ADR(int i2) {
        this.A0N.A0A().A38(i2);
        this.A0E = EnumC0958Pz.A04;
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer != null) {
            int currentPosition = mediaPlayer.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            if (A0P[4].charAt(14) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[5] = "KulxFUFqA4xnUTvaQLfyg7cstmOjzycv";
            strArr[5] = "KulxFUFqA4xnUTvaQLfyg7cstmOjzycv";
            A08();
            this.A06.release();
            this.A06 = null;
            MediaController mediaController = this.A0A;
            if (mediaController != null) {
                mediaController.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(EnumC0958Pz.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public final void destroy() {
        if (this.A06 != null) {
            A09(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            this.A06.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A08();
            this.A06 = null;
            setVideoState(EnumC0958Pz.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public int getCurrentPosition() {
        if (this.A06 == null || !A06()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public int getDuration() {
        if (this.A06 == null) {
            return 0;
        }
        boolean zA06 = A06();
        String[] strArr = A0P;
        if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[1] = "tqb6wmVqQGZxPylUtz2fkCIx7Bf2WilJ";
        strArr2[1] = "tqb6wmVqQGZxPylUtz2fkCIx7Bf2WilJ";
        if (!zA06) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public long getInitialBufferTime() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public PD getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public EnumC0958Pz getState() {
        return this.A0C;
    }

    public EnumC0958Pz getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(EnumC0958Pz.A03);
            this.A0N.A0A().A2z(5);
            ADR(8);
            this.A0N.A04().A86(A02(400, 5, 119), C05228d.A2A, new C05238e(A02(318, 33, 37)));
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.A06;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
        setVideoState(EnumC0958Pz.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) throws Throwable {
        this.A0N.A0A().A8c(A02(405, 11, 87) + i2 + A02(0, 14, 9) + i3 + A02(14, 2, 105));
        if (this.A01 > 0 && getState() == EnumC0958Pz.A0A) {
            this.A01--;
            ADR(6);
            ADL(this.A0B, 10);
        } else {
            setVideoState(EnumC0958Pz.A03);
            this.A0N.A0A().A2z(1);
            ADR(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        if (i2 == 3) {
            this.A0K = true;
            if (this.A0E == EnumC0958Pz.A0A) {
                setVideoState(EnumC0958Pz.A0A);
            }
            return true;
        }
        if (i2 != 701) {
            if (i2 == 702 && A07()) {
                setVideoState(EnumC0958Pz.A0A);
            }
        } else {
            EnumC0958Pz enumC0958Pz = EnumC0958Pz.A02;
            if (A0P[4].charAt(14) != '3') {
                String[] strArr = A0P;
                strArr[3] = "iL0L5EQxu2M5tvy2sZDjl5tOkB9wsg4Q";
                strArr[6] = "qEr4cYtmjtQdjlZthk5xBRgssZbq5gW6";
                setVideoState(enumC0958Pz);
            } else {
                setVideoState(enumC0958Pz);
            }
        }
        String[] strArr2 = A0P;
        if (strArr2[3].charAt(29) != strArr2[6].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0P;
        strArr3[3] = "BctcOQJYgBcKf8RdBMRoW9O8jkER1gO3";
        strArr3[6] = "NFF5b4NOHp1wMQpQtAU8ibXMpYWuxgZg";
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws Throwable {
        setVideoState(EnumC0958Pz.A07);
        if (this.A0I && !this.A0H) {
            Activity activityA09 = this.A0N.A09();
            if (activityA09 != null) {
                this.A0A = new MediaController(activityA09);
                MediaController mediaController = this.A0A;
                View view = this.A09;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                MediaController mediaController2 = this.A0A;
                MediaController.MediaPlayerControl mediaPlayerControl = this.A0M;
                if (A0P[1].charAt(7) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0P;
                strArr[3] = "fPjFRSSzuUrY85KdwEQXHAUI7gq3zgJX";
                strArr[6] = "QlnNj2Zi0n3XZkktRetea07zoE6PUgNL";
                mediaController2.setMediaPlayer(mediaPlayerControl);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        int i2 = this.A03;
        if (i2 > 0) {
            if (i2 >= this.A06.getDuration()) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        EnumC0958Pz enumC0958Pz = this.A0E;
        EnumC0958Pz enumC0958Pz2 = EnumC0958Pz.A0A;
        String[] strArr2 = A0P;
        if (strArr2[2].length() == strArr2[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0P;
        strArr3[3] = "i4HMjCzdRtS7Zf5jyUfqsJgJBFC3Hgk3";
        strArr3[6] = "nPyigXhxANl12gOwrMulZJ84NGYQcgH1";
        if (enumC0958Pz == enumC0958Pz2) {
            ADL(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        Q0 q0 = this.A0F;
        if (q0 == null) {
            return;
        }
        q0.AAv(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A09(this.A08)) {
            setVideoState(EnumC0958Pz.A03);
            this.A0N.A0A().A2z(4);
            destroy();
        } else {
            this.A0J = false;
            if (this.A0C == EnumC0958Pz.A05 && this.A0D != EnumC0958Pz.A05) {
                ADL(this.A0B, 7);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A09(null);
        Surface surface = this.A08;
        if (surface != null) {
            surface.release();
            this.A08 = null;
        }
        if (!this.A0J) {
            this.A0D = this.A0I ? EnumC0958Pz.A0A : this.A0C;
            this.A0J = true;
        }
        if (this.A0C != EnumC0958Pz.A05) {
            ABa(false, 5);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) throws Throwable {
        super.onWindowFocusChanged(z);
        if (this.A06 == null) {
            return;
        }
        MediaController mediaController = this.A0A;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (!this.A0J) {
                this.A0D = this.A0I ? EnumC0958Pz.A0A : this.A0C;
                this.A0J = true;
            }
            if (this.A0C != EnumC0958Pz.A05) {
                A7J();
                return;
            }
            return;
        }
        this.A0J = false;
        if (this.A0C != EnumC0958Pz.A05 || this.A0D == EnumC0958Pz.A05) {
            return;
        }
        ADL(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public final void seekTo(int i2) {
        if (this.A06 != null && A06()) {
            if (i2 < getDuration() && i2 > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i2;
                this.A06.seekTo(i2);
                return;
            }
            return;
        }
        this.A03 = i2;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A02(122, 102, 58));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0G = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC0955Pw(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A02(224, 94, 7));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public void setFullScreen(boolean z) {
        this.A0I = z;
        if (this.A0I && !this.A0H) {
            setOnTouchListener(new ViewOnTouchListenerC0954Pv(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public void setRequestedVolume(float f2) {
        this.A00 = f2;
        if (this.A06 != null && this.A0C != EnumC0958Pz.A08 && this.A0C != EnumC0958Pz.A04) {
            this.A06.setVolume(f2, f2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public void setVideoMPD(@Nullable String str) {
    }

    private void setVideoState(EnumC0958Pz enumC0958Pz) {
        if (enumC0958Pz != this.A0C) {
            if (BuildConfigApi.isDebug()) {
                String str = A02(366, 23, 17) + enumC0958Pz;
            }
            this.A0C = enumC0958Pz;
            Q0 q0 = this.A0F;
            if (q0 != null) {
                q0.ABP(enumC0958Pz);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    public void setVideoStateChangeListener(Q0 q0) {
        this.A0F = q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0956Px
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setup(android.net.Uri r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GH.setup(android.net.Uri):void");
    }
}
