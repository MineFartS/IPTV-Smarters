package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import javax.annotation.Nullable;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"StringFormatUse", "SharedPreferencesUse"})
public final class C05006x {
    public static C05006x A01;
    public static byte[] A02;
    public static String[] A03;
    public final HashMap<Integer, String> A00 = new HashMap<>();

    static {
        A04();
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{103, 114, 116, -70};
    }

    public static void A04() {
        A03 = new String[]{"rLDjBgKz63Bn2bjdq5T9imrieVp5PIBM", "m8wp0Vw9GL6Om21Qq8m8Tj5zfu0l", "YgqNWwRBt3ccTC8L8vt9EnrOaTNX", "Ji4mlDElrKKLO0fU8k8hI0n9H2FXwyxW", "wf5MYK5ehGzLy7SkBsWbSYGwiXhb8bxZ", "VWIuBm7xkqaJ1AqGCIKfvhlqUEnKMMIs", "Q1uyQO5SpdafJkDIvdpZDIFmVDRWB0Ou", "30w5jfTvH5e90EUSXrOKs1RMT2PDXB24"};
    }

    @SuppressLint({"CatchGeneralException"})
    public C05006x(Context context, EnumC04846h enumC04846h, @Nullable String str) {
        try {
            A05(context);
            if (enumC04846h.A05() == EnumC04846h.A0G.A05()) {
                A06(context, str);
            }
        } catch (Throwable th) {
            AnonymousClass66.A04(th);
        }
    }

    public static C05006x A00(Context context, EnumC04846h enumC04846h, @Nullable String str) {
        if (A01 == null) {
            A01 = new C05006x(context, enumC04846h, str);
        }
        return A01;
    }

    public static String A02(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format(A01(0, 4, 62), Byte.valueOf(b2)));
        }
        String string = sb.toString();
        String[] strArr = A03;
        if (strArr[5].charAt(8) == strArr[6].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "YeSBMNELIt08AqlHIfsrA8EpBPFL6cGm";
        strArr2[0] = "YeSBMNELIt08AqlHIfsrA8EpBPFL6cGm";
        return string;
    }

    private void A05(Context context) throws Exception {
        int i2;
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.publicSourceDir)), 1024);
            MessageDigest messageDigest = MessageDigest.getInstance(AnonymousClass70.A04.A03());
            MessageDigest messageDigest2 = MessageDigest.getInstance(AnonymousClass70.A05.A03());
            MessageDigest messageDigest3 = MessageDigest.getInstance(AnonymousClass70.A06.A03());
            byte[] bArr = new byte[1024];
            do {
                i2 = bufferedInputStream.read(bArr);
                if (i2 > 0) {
                    messageDigest.update(bArr, 0, i2);
                    messageDigest2.update(bArr, 0, i2);
                    messageDigest3.update(bArr, 0, i2);
                }
                if (A03[7].charAt(26) != 'P') {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[7] = "sHaOy6LtIlfUQKDjNh2L68IGHQPvVrDu";
                strArr[7] = "sHaOy6LtIlfUQKDjNh2L68IGHQPvVrDu";
            } while (i2 != -1);
            HashMap<Integer, String> map = this.A00;
            byte[] buffer = messageDigest.digest();
            map.put(10003, A02(buffer));
            HashMap<Integer, String> map2 = this.A00;
            Integer numValueOf = Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
            byte[] buffer2 = messageDigest2.digest();
            map2.put(numValueOf, A02(buffer2));
            HashMap<Integer, String> map3 = this.A00;
            Integer numValueOf2 = Integer.valueOf(IMediaPlayer.MEDIA_INFO_OPEN_INPUT);
            byte[] buffer3 = messageDigest3.digest();
            map3.put(numValueOf2, A02(buffer3));
            bufferedInputStream.close();
        } catch (Throwable th) {
            String[] strArr2 = A03;
            if (strArr2[4].charAt(30) != strArr2[3].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A03;
            strArr3[5] = "XS9zpWe4kggJPLQjl3jzxSvjjqaK1CvG";
            strArr3[6] = "1gkHVsehFegipbXpJD0YhFUDmEZYz3Bw";
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    private void A06(Context context, @Nullable String str) throws Throwable {
        int i2;
        if (str == null || str.isEmpty()) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AnonymousClass70.A04.A03());
            byte[] bArr = new byte[1024];
            do {
                i2 = bufferedInputStream.read(bArr);
                if (i2 > 0) {
                    messageDigest.update(bArr, 0, i2);
                }
            } while (i2 != -1);
            HashMap<Integer, String> map = this.A00;
            byte[] buffer = messageDigest.digest();
            map.put(10010, A02(buffer));
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Nullable
    public final String A07(int i2) {
        String str = this.A00.get(Integer.valueOf(i2));
        if (str != null) {
            return str;
        }
        return null;
    }
}
