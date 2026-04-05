package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y9 implements BB {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;

    @Nullable
    public AudioTrack A0N;

    @Nullable
    public AK A0O;
    public AK A0P;
    public C0585Aq A0Q;

    @Nullable
    public B9 A0R;

    @Nullable
    public ByteBuffer A0S;

    @Nullable
    public ByteBuffer A0T;

    @Nullable
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public InterfaceC0593Ay[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;

    @Nullable
    public final C0586Ar A0g;
    public final BH A0h;
    public final Y6 A0i;
    public final BK A0j;
    public final YG A0k;
    public final ArrayDeque<BM> A0l;
    public final boolean A0m;
    public final InterfaceC0593Ay[] A0n;
    public final InterfaceC0593Ay[] A0o;

    public static String A0I(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0r, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{68, 72, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 7, 28, 72, 94, 106, 123, 118, 112, 75, 109, 126, 124, 116, 78, 99, 121, 105, 101, 100, 126, 99, 100, 127, 99, 126, 115, 42, 110, 111, 126, 111, 105, 126, 111, 110, 42, 81, 111, 114, 122, 111, 105, 126, 111, 110, 42, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_DAY, 9, 4, 9, 1, 8, 63, 41, 63, 46, 46, 51, 52, 61, 122, 41, 46, 59, 54, 54, 63, 62, 122, 59, 47, 62, 51, 53, 122, 46, 40, 59, 57, 49, 102, 93, 86, 75, 67, 86, 80, 71, 86, 87, DateTimeFieldType.MINUTE_OF_HOUR, 82, 70, 87, 90, 92, DateTimeFieldType.MINUTE_OF_HOUR, 86, 93, 80, 92, 87, 90, 93, 84, 9, DateTimeFieldType.MINUTE_OF_HOUR, 96, 91, 70, 64, 69, 69, 90, 71, 65, 80, 81, DateTimeFieldType.SECOND_OF_MINUTE, 86, 93, 84, 91, 91, 80, 89, DateTimeFieldType.SECOND_OF_MINUTE, 86, 90, 64, 91, 65, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 101, 10, 3, 31, 24, 9, 30, 59, 40, 58, 40};
    }

    public static void A0P() {
        A0s = new String[]{"5Nyv0guRYVcKSAuezGPcUxg9vJAOBGI4", "vvUbbcGamjazB6O7sNKlV2Due1EGN4h1", "bCdq7Y65nqLa7O1PpyZ9UmfFfim1tIKH", "XSMaSGyqY735xp0uf5mX1ioiT5AfU73", "LbuXdG3g6wlkS0wgubrQcd1EFcxL1vaW", "BfdFnDj7fdcaZnnCNK5XWBslzsEwyMTC", "82TROEAjyC6M053XP3PwF3IgkAnZSWb8", "TH4S9e3rxD8emXavfeipeAwkF3kWLOvQ"};
    }

    static {
        A0P();
        A0O();
        A0p = false;
        A0q = false;
    }

    public Y9(@Nullable C0586Ar c0586Ar, BK bk, boolean z) {
        this.A0g = c0586Ar;
        this.A0j = (BK) IM.A01(bk);
        this.A0m = z;
        this.A0f = new ConditionVariable(true);
        this.A0h = new BH(new Y8(this, null));
        this.A0i = new Y6();
        this.A0k = new YG();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new YC(), this.A0i, this.A0k);
        Collections.addAll(arrayList, bk.A5R());
        this.A0o = (InterfaceC0593Ay[]) arrayList.toArray(new InterfaceC0593Ay[arrayList.size()]);
        this.A0n = new InterfaceC0593Ay[]{new YA()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = C0585Aq.A04;
        this.A01 = 0;
        this.A0P = AK.A04;
        this.A04 = -1;
        this.A0d = new InterfaceC0593Ay[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public Y9(@Nullable C0586Ar c0586Ar, InterfaceC0593Ay[] interfaceC0593AyArr) {
        this(c0586Ar, interfaceC0593AyArr, false);
    }

    public Y9(@Nullable C0586Ar c0586Ar, InterfaceC0593Ay[] interfaceC0593AyArr, boolean z) {
        this(c0586Ar, new Y7(interfaceC0593AyArr), z);
    }

    public static int A00(int i2, ByteBuffer byteBuffer) {
        if (i2 == 7 || i2 == 8) {
            return BO.A00(byteBuffer);
        }
        if (i2 == 5) {
            return C0582An.A00();
        }
        if (i2 == 6) {
            return C0582An.A03(byteBuffer);
        }
        if (i2 == 14) {
            int iA02 = C0582An.A02(byteBuffer);
            if (iA02 == -1) {
                return 0;
            }
            int iA04 = C0582An.A04(byteBuffer, iA02);
            String[] strArr = A0s;
            if (strArr[5].charAt(2) != strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "Dqt88CMr8vwwAc3fZIJcRVt2XyhD8Cl";
            strArr2[3] = "Dqt88CMr8vwwAc3fZIJcRVt2XyhD8Cl";
            return iA04 * 16;
        }
        throw new IllegalStateException(A0I(84, 27, 120) + i2);
    }

    @TargetApi(21)
    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    @TargetApi(21)
    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (this.A0S == null) {
            this.A0S = ByteBuffer.allocate(16);
            this.A0S.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i2);
            this.A0S.putLong(8, 1000 * j2);
            this.A0S.position(0);
            this.A03 = i2;
        }
        int iRemaining = this.A0S.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.A0S, iRemaining, 1);
            if (iWrite < 0) {
                this.A03 = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA01 = A01(audioTrack, byteBuffer, i2);
        String[] strArr = A0s;
        if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[5] = "EGdI4VK4aN1uiBzzsuaeFo7lQ03tB7Gh";
        strArr2[2] = "vodoofn0TiYpLi76FRuwTlDh379TFVaK";
        if (iA01 < 0) {
            this.A03 = 0;
            return iA01;
        }
        this.A03 -= iA01;
        return iA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A0X ? this.A0J / ((long) this.A0B) : this.A0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / ((long) this.A09) : this.A0K;
    }

    private long A05(long j2) {
        return A08(this.A0j.A74()) + j2;
    }

    private long A06(long j2) {
        BM bmRemove = null;
        while (!this.A0l.isEmpty() && j2 >= this.A0l.getFirst().A01) {
            bmRemove = this.A0l.remove();
        }
        if (bmRemove != null) {
            this.A0P = bmRemove.A02;
            this.A0G = bmRemove.A01;
            this.A0F = bmRemove.A00 - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j2) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A6a(j2 - this.A0G);
        }
        return this.A0F + J1.A0C(j2 - this.A0G, this.A0P.A01);
    }

    private long A07(long j2) {
        return (((long) this.A0A) * j2) / 1000000;
    }

    private long A08(long j2) {
        return (1000000 * j2) / ((long) this.A0A);
    }

    private long A09(long j2) {
        return (1000000 * j2) / ((long) this.A06);
    }

    @TargetApi(21)
    private AudioTrack A0D() {
        AudioAttributes audioAttributesA00;
        if (this.A0b) {
            audioAttributesA00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributesA00 = this.A0Q.A00();
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int i2 = this.A01;
        if (i2 == 0) {
            i2 = 0;
        }
        return new AudioTrack(audioAttributesA00, audioFormatBuild, this.A02, 1, i2);
    }

    private AudioTrack A0E() throws B8 {
        AudioTrack audioTrack;
        if (J1.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int iA03 = J1.A03(this.A0Q.A03);
            int i2 = this.A01;
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[1];
            int state = str.charAt(9);
            if (state == str2.charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "uEqtixTroQ47jvhgXsjygxp317gkhCVZ";
            strArr2[1] = "MeWTB72qJhBmjPGmSmxXQDSK14yx53vJ";
            if (i2 == 0) {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1, i2);
            }
        }
        int state2 = audioTrack.getState();
        if (state2 == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new B8(state2, this.A0A, this.A07, this.A02);
    }

    private AudioTrack A0F(int i2) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
    }

    private void A0J() {
        int i2 = 0;
        while (true) {
            InterfaceC0593Ay[] interfaceC0593AyArr = this.A0d;
            if (i2 < interfaceC0593AyArr.length) {
                InterfaceC0593Ay interfaceC0593Ay = interfaceC0593AyArr[i2];
                interfaceC0593Ay.flush();
                this.A0e[i2] = interfaceC0593Ay.A6d();
                i2++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws B8 {
        AK akA3R;
        this.A0f.block();
        this.A0M = A0E();
        int audioSessionId = this.A0M.getAudioSessionId();
        if (A0p && J1.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                String[] strArr = A0s;
                if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[7] = "BXErtyYgJXamt9yde7CeLqS26Q9j6Dt3";
                strArr2[7] = "BXErtyYgJXamt9yde7CeLqS26Q9j6Dt3";
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        if (this.A01 != audioSessionId) {
            this.A01 = audioSessionId;
            B9 b9 = this.A0R;
            if (b9 != null) {
                b9.A92(audioSessionId);
            }
        }
        if (this.A0V) {
            akA3R = this.A0j.A3R(this.A0P);
        } else {
            akA3R = AK.A04;
        }
        this.A0P = akA3R;
        A0N();
        this.A0h.A0H(this.A0M, this.A08, this.A09, this.A02);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new BJ(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0V()) {
            return;
        }
        if (J1.A02 >= 21) {
            AudioTrack audioTrack = this.A0M;
            float f2 = this.A00;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[7] = "8NL9PZoDB9Ch1WQJQaXfXaVAIVHPoweZ";
            strArr[7] = "8NL9PZoDB9Ch1WQJQaXfXaVAIVHPoweZ";
            A0R(audioTrack, f2);
            return;
        }
        A0S(this.A0M, this.A00);
    }

    private void A0N() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0593Ay interfaceC0593Ay : A0W()) {
            if (interfaceC0593Ay.A7a()) {
                arrayList.add(interfaceC0593Ay);
            } else {
                interfaceC0593Ay.flush();
            }
        }
        int size = arrayList.size();
        InterfaceC0593Ay[] interfaceC0593AyArr = new InterfaceC0593Ay[size];
        if (A0s[3].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0s;
        strArr[5] = "YRdEguSYP1wOqJMzR8T0sEbN9ru3F1GF";
        strArr[2] = "jCd7Ib2fALhdhS4xedSLoMHgXMVbMQ2Z";
        this.A0d = (InterfaceC0593Ay[]) arrayList.toArray(interfaceC0593AyArr);
        this.A0e = new ByteBuffer[size];
        A0J();
    }

    private void A0Q(long j2) throws BA {
        ByteBuffer input;
        int length = this.A0d.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                input = this.A0e[i2 - 1];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = InterfaceC0593Ay.A00;
                }
            }
            if (i2 == length) {
                A0T(input, j2);
            } else {
                InterfaceC0593Ay audioProcessor = this.A0d[i2];
                audioProcessor.ABy(input);
                ByteBuffer byteBufferA6d = audioProcessor.A6d();
                this.A0e[i2] = byteBufferA6d;
                if (byteBufferA6d.hasRemaining()) {
                    i2++;
                }
            }
            if (input.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    @TargetApi(21)
    public static void A0R(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    public static void A0S(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(java.nio.ByteBuffer r12, long r13) throws com.facebook.ads.redexgen.X.BA {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y9.A0T(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0U() throws com.facebook.ads.redexgen.X.BA {
        /*
            r9 = this;
            r5 = 0
            int r0 = r9.A04
            r6 = -1
            r8 = 0
            if (r0 != r6) goto Lf
            boolean r0 = r9.A0Z
            if (r0 == 0) goto L54
            r0 = 0
        Lc:
            r9.A04 = r0
            r5 = 1
        Lf:
            int r4 = r9.A04
            com.facebook.ads.redexgen.X.Ay[] r1 = r9.A0d
            int r0 = r1.length
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            if (r4 >= r0) goto L5e
            r0 = r1[r4]
            if (r5 == 0) goto L23
            r0.ABx()
        L23:
            r9.A0Q(r2)
            boolean r3 = r0.A7e()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.Y9.A0s
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L58
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.Y9.A0s
            java.lang.String r1 = "2xZTToEoCwsl8MeSQ9EIUdCBiuq4j6Lb"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "WXli42TSAlQlgSv7suJf6xw7W0hHNYE8"
            r0 = 1
            r2[r0] = r1
            if (r3 != 0) goto L4d
            return r8
        L4d:
            r5 = 1
            int r0 = r9.A04
            int r0 = r0 + r7
            r9.A04 = r0
            goto Lf
        L54:
            com.facebook.ads.redexgen.X.Ay[] r0 = r9.A0d
            int r0 = r0.length
            goto Lc
        L58:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5e:
            java.nio.ByteBuffer r5 = r9.A0U
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.Y9.A0s
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 31
            if (r1 == r0) goto L77
            if (r5 == 0) goto L86
        L6f:
            r9.A0T(r5, r2)
            java.nio.ByteBuffer r0 = r9.A0U
            if (r0 == 0) goto L86
            return r8
        L77:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.Y9.A0s
            java.lang.String r1 = "9QdkqYSTFHb7WYiPiRp7Y6nS2TP2i0It"
            r0 = 5
            r4[r0] = r1
            java.lang.String r1 = "gIdgEUZyaZheDXAdPlxJ5YfvFSsVsGnk"
            r0 = 2
            r4[r0] = r1
            if (r5 == 0) goto L86
            goto L6f
        L86:
            r9.A04 = r6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y9.A0U():boolean");
    }

    private boolean A0V() {
        return this.A0M != null;
    }

    private InterfaceC0593Ay[] A0W() {
        return this.A0a ? this.A0n : this.A0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0 A[PHI: r2
  0x00f0: PHI (r2v6 'channelCount' int) = (r2v3 'channelCount' int), (r2v7 'channelCount' int) binds: [B:76:0x0162, B:53:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    @Override // com.facebook.ads.redexgen.X.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A46(int r11, int r12, int r13, int r14, @androidx.annotation.Nullable int[] r15, int r16, int r17) throws com.facebook.ads.redexgen.X.B7 {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y9.A46(int, int, int, int, int[], int, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A4m() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A4v(int i2) {
        IM.A04(J1.A02 >= 21);
        if (!this.A0b || this.A01 != i2) {
            this.A0b = true;
            this.A01 = i2;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final long A5w(boolean z) {
        if (!A0V() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        return this.A0H + A05(A06(Math.min(this.A0h.A0D(z), A08(A04()))));
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final AK A6o() {
        return this.A0P;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    @Override // com.facebook.ads.redexgen.X.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A7K(java.nio.ByteBuffer r20, long r21) throws com.facebook.ads.redexgen.X.B8, com.facebook.ads.redexgen.X.BA {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y9.A7K(java.nio.ByteBuffer, long):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A7L() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final boolean A7O() {
        return A0V() && this.A0h.A0K(A04());
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final boolean A7d(int i2) {
        if (J1.A0g(i2)) {
            return i2 != 4 || J1.A02 >= 21;
        }
        C0586Ar c0586Ar = this.A0g;
        return c0586Ar != null && c0586Ar.A04(i2);
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final boolean A7e() {
        return !A0V() || (this.A0W && !A7O());
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void ABj() {
        this.A0Y = true;
        if (A0V()) {
            this.A0h.A0F();
            AudioTrack audioTrack = this.A0M;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[3] = "NrYH7da7InJYZ7DcifiCDIWgHy9XttZ";
            strArr[3] = "NrYH7da7InJYZ7DcifiCDIWgHy9XttZ";
            audioTrack.play();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void ABk() throws BA {
        if (this.A0W) {
            return;
        }
        boolean zA0V = A0V();
        String[] strArr = A0s;
        if (strArr[6].charAt(18) != strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "potoNIjJr8c5PhhOHWP3V8xbrUltb98O";
        strArr2[0] = "s7h49TBBG9Upv5zOzLPi805BwVxtpEdY";
        if (zA0V && A0U()) {
            this.A0h.A0G(A04());
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void ACG() {
        reset();
        A0L();
        for (InterfaceC0593Ay interfaceC0593Ay : this.A0o) {
            interfaceC0593Ay.reset();
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[5] = "qwdTDv5zTd3QZESqVqPfOIKdJj7Lz8kg";
            strArr[2] = "LbdTDWALSGuogzF76GUONHDiI7JL2ED4";
        }
        for (InterfaceC0593Ay interfaceC0593Ay2 : this.A0n) {
            interfaceC0593Ay2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
        if (A0s[7].charAt(5) != 'v') {
            String[] strArr2 = A0s;
            strArr2[3] = "7yJp0zMcRreZgWUPzTirOlbpECU1qPL";
            strArr2[3] = "7yJp0zMcRreZgWUPzTirOlbpECU1qPL";
        } else {
            String[] strArr3 = A0s;
            strArr3[5] = "IJdzF7l1OUCqcHSZRNfx63TpictB3CeC";
            strArr3[2] = "IidC6PogfV1YW6p29FProDWayU60rDbu";
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void ACv(C0585Aq c0585Aq) {
        if (this.A0Q.equals(c0585Aq)) {
            return;
        }
        this.A0Q = c0585Aq;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void AD2(B9 b9) {
        this.A0R = b9;
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final AK AD6(AK ak) {
        if (A0V() && !this.A0V) {
            this.A0P = AK.A04;
            return this.A0P;
        }
        AK ak2 = this.A0O;
        if (ak2 == null) {
            ak2 = !this.A0l.isEmpty() ? this.A0l.getLast().A02 : this.A0P;
        }
        if (!ak.equals(ak2)) {
            if (A0V()) {
                this.A0O = ak;
            } else {
                this.A0P = this.A0j.A3R(ak);
            }
        }
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void pause() {
        this.A0Y = false;
        if (A0V() && this.A0h.A0J()) {
            this.A0M.pause();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void reset() {
        if (A0V()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            AK ak = this.A0O;
            if (ak != null) {
                this.A0P = ak;
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                ArrayDeque<BM> arrayDeque = this.A0l;
                if (A0s[7].charAt(5) == 'v') {
                    throw new RuntimeException();
                }
                String[] strArr = A0s;
                strArr[7] = "7Zd0LJuJ8v1AsDIGeh9Ten8e10sO09Lx";
                strArr[7] = "7Zd0LJuJ8v1AsDIGeh9Ten8e10sO09Lx";
                this.A0P = arrayDeque.getLast().A02;
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0I()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0E();
            this.A0f.close();
            new BI(this, audioTrack).start();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void setVolume(float f2) {
        if (this.A00 != f2) {
            this.A00 = f2;
            A0M();
        }
    }
}
