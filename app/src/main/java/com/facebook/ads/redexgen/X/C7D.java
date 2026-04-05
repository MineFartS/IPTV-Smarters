package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7D {
    public static byte[] A02;
    public static String[] A03;
    public static final String A04;
    public static volatile C7D A05;
    public final X3 A00;
    public final Map<String, AnonymousClass79> A01 = Collections.synchronizedMap(new HashMap());

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A02 = new byte[]{97, 102, 34, 124, 98, 107, 68, 103, 98, 38, 105, 115, 114, 118, 115, 114, 38, 98, 99, 117, 114, 111, 104, 103, 114, 111, 105, 104, 38, 46, 96, 111, 106, 99, 59, 27, 57, 59, 48, 61, 120, 61, 42, 42, 55, 42, 118, 120, 26, 49, 44, 53, 57, 40, 120, 49, 43, 120, 54, 45, 52, 52, 118, 98, 69, 77, 72, 65, 64, 4, 80, 75, 4, 71, 75, 84, 93, 4, 72, 75, 71, 69, 72, 4, 77, 73, 69, 67, 65, 4, 77, 74, 80, 75, 4, 71, 69, 71, 76, 65, 4, 12, 81, 86, 72, 25, 42, DateTimeFieldType.HOUR_OF_DAY, 30, 29, DateTimeFieldType.MINUTE_OF_HOUR, 26, 95, 11, DateTimeFieldType.CLOCKHOUR_OF_DAY, 95, 8, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 11, 26, 95, 29, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.MINUTE_OF_DAY, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 95, 11, DateTimeFieldType.CLOCKHOUR_OF_DAY, 95, 25, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 26, 95, 87, 10, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 66, 53, DateTimeFieldType.HOUR_OF_HALFDAY, 1, 2, 12, 5, 64, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 64, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 9, DateTimeFieldType.SECOND_OF_DAY, 5, 64, 2, 9, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 1, DateTimeFieldType.CLOCKHOUR_OF_DAY, 64, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 64, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 64, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 5, 1, DateTimeFieldType.HALFDAY_OF_DAY, 100, 118, 118, 96, 113, 63, 42, 42, 42, 121, 118, 115, 122, 37, 48, 48, 48, 52, 56, 62, 60, 78, 77, 67, 70, 7, 28, 25, 28, 29, 5, 28};
    }

    public static void A09() {
        A03 = new String[]{"xEW9LSpkxtcMkiVkCjWXuTu5CJHPJiyq", "tTP", "A", "dhAFlm3SiPB0s9864OvgcmZEVzRtwwmX", "mnE9bSEHBlleLkXo6La2W5bpkmZqSUyN", "0jwmHWkFqK", "xBcWrb6s57BN1yke0uYkFqIHC7aAgPEb", "dL0KwaEpZdlIbw3ka3MpOkzONR5qkJY2"};
    }

    static {
        A09();
        A08();
        A04 = C7D.class.getSimpleName();
    }

    public C7D(X3 x3) {
        this.A00 = x3;
    }

    private int A00(String str, @Nullable Bitmap bitmap) {
        String strA07 = A07(0, 2, 17);
        if (bitmap == null) {
            A0B(null);
            return 0;
        }
        File file = new File(this.A00.getCacheDir(), str.hashCode() + A07(2, 4, 85));
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int size = byteArrayOutputStream.size();
            int size2 = JT.A0C(this.A00);
            if (size >= size2) {
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (FileNotFoundException e2) {
            Log.e(A04, A07(6, 29, 95) + file.getPath() + strA07, e2);
            A0B(e2);
            return 0;
        } catch (IOException e3) {
            A0B(e3);
            Log.e(A04, A07(106, 36, 38) + str + strA07, e3);
            return 0;
        } catch (OutOfMemoryError e4) {
            A0B(e4);
            Log.e(A04, A07(142, 39, 57), e4);
            return 0;
        } finally {
            A0A(byteArrayOutputStream);
            A0A(fileOutputStream);
        }
    }

    @Nullable
    private final Bitmap A01(C8C c8c, AnonymousClass79 anonymousClass79, int i2, int i3, String str) {
        if (C7F.A06(c8c) && A07(202, 4, 123).equals(str)) {
            Map<String, AnonymousClass79> map = this.A01;
            if (A03[4].charAt(4) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "FHlvPh";
            strArr[1] = "FHlvPh";
            map.put(anonymousClass79.A07, anonymousClass79);
        }
        String str2 = anonymousClass79.A07;
        C7E c7e = new C7E(anonymousClass79.A05, anonymousClass79.A06, A07(197, 5, 0), str, str2);
        File file = new File(this.A00.getCacheDir(), str2.hashCode() + A07(2, 4, 85));
        if (!file.exists()) {
            C7F.A04(c8c, c7e, false);
            return str2.startsWith(A07(190, 7, 70)) ? A04(str2, i3, i2) : A02(c8c, anonymousClass79, str);
        }
        C7F.A04(c8c, c7e, true);
        try {
            if (A0C(i3, i2)) {
                return C7G.A02(file.getCanonicalPath(), i3, i2, this.A00);
            }
            return BitmapFactory.decodeFile(file.getCanonicalPath());
        } catch (IOException e2) {
            A0B(e2);
            return null;
        }
    }

    @Nullable
    private Bitmap A02(C8C c8c, AnonymousClass79 anonymousClass79, String str) {
        Bitmap bitmapA03;
        String failureReason = anonymousClass79.A07;
        int i2 = anonymousClass79.A03;
        int i3 = anonymousClass79.A04;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IOException e2 = null;
        if (failureReason.startsWith(A07(181, 9, 92))) {
            try {
                try {
                    try {
                        InputStream inputStreamOpen = this.A00.getAssets().open(failureReason.substring(9));
                        if (A0C(i2, i3)) {
                            bitmapA03 = C7G.A01(inputStreamOpen, i2, i3);
                        } else {
                            bitmapA03 = BitmapFactory.decodeStream(inputStreamOpen);
                        }
                        if (inputStreamOpen != null) {
                            A0A(inputStreamOpen);
                        }
                    } catch (IOException e3) {
                        A0B(e3);
                        if (0 != 0) {
                            A0A(null);
                        }
                        return null;
                    }
                } catch (OutOfMemoryError e4) {
                    A0B(e4);
                    if (0 != 0) {
                        A0A(null);
                    }
                    return null;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    A0A(null);
                }
                throw th;
            }
        } else if (A0C(i2, i3)) {
            try {
                bitmapA03 = A05(failureReason, i2, i3);
            } catch (IOException e5) {
                e2 = e5;
                A0B(e2);
                bitmapA03 = A03(failureReason);
            }
            int height = A03[2].length();
            if (height == 5) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
            strArr[3] = "EtuvklQgZLPMp8CYh3QQVMKsyyqrprqR";
        } else {
            bitmapA03 = A03(failureReason);
        }
        String string = e2 != null ? e2.toString() : null;
        if (bitmapA03 == null) {
            C7F.A03(c8c, anonymousClass79, str, C7F.A03, string, null, null);
        } else {
            int iA00 = A00(failureReason, bitmapA03);
            long requestTime = System.currentTimeMillis();
            long loadTime = requestTime - jCurrentTimeMillis;
            if (iA00 > 0) {
                C7F.A03(c8c, anonymousClass79, str, C7F.A02, string, Integer.valueOf(iA00), Long.valueOf(loadTime));
            } else {
                int i4 = C7F.A01;
                String[] strArr2 = A03;
                String str2 = strArr2[0];
                String str3 = strArr2[6];
                int storedSize = str2.charAt(0);
                if (storedSize != str3.charAt(0)) {
                    C7F.A03(c8c, anonymousClass79, str, i4, string, null, null);
                } else {
                    String[] strArr3 = A03;
                    strArr3[1] = "v696HPT8k3klpjO3N";
                    strArr3[1] = "v696HPT8k3klpjO3N";
                    C7F.A03(c8c, anonymousClass79, str, i4, string, null, null);
                }
            }
        }
        return bitmapA03;
    }

    @Nullable
    private Bitmap A03(String str) {
        byte[] bArrA5U;
        Q6 q6ABf = QP.A00(this.A00).ABf(str, new QL());
        if (q6ABf != null && (bArrA5U = q6ABf.A5U()) != null) {
            return BitmapFactory.decodeByteArray(bArrA5U, 0, bArrA5U.length);
        }
        return null;
    }

    @Nullable
    private Bitmap A04(String str, int i2, int i3) {
        Bitmap bitmapA02;
        try {
            boolean zA0C = A0C(i2, i3);
            String strA07 = A07(190, 7, 70);
            if (!zA0C) {
                bitmapA02 = BitmapFactory.decodeStream(new FileInputStream(str.substring(strA07.length())), null, null);
            } else {
                bitmapA02 = C7G.A02(str.substring(strA07.length()), i2, i3, this.A00);
            }
            A00(str, bitmapA02);
            return bitmapA02;
        } catch (IOException e2) {
            Log.e(A04, A07(63, 43, 125) + str + A07(0, 2, 17), e2);
            return null;
        }
    }

    @Nullable
    private Bitmap A05(String str, int i2, int i3) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        Bitmap bitmapA01 = C7G.A01(inputStream, i2, i3);
        A0A(inputStream);
        return bitmapA01;
    }

    public static C7D A06(X3 x3) {
        if (A05 == null) {
            synchronized (C7D.class) {
                if (A05 == null) {
                    A05 = new C7D(x3);
                }
            }
        }
        return A05;
    }

    public static void A0A(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(@Nullable Throwable th) {
        String strA07 = A07(197, 5, 0);
        if (th != null) {
            this.A00.A04().A86(strA07, C05228d.A1K, new C05238e(th));
        } else {
            this.A00.A04().A86(strA07, C05228d.A1K, new C05238e(A07(35, 28, 1)));
        }
    }

    private boolean A0C(int i2, int i3) {
        return i2 > 0 && i3 > 0 && JT.A0r(this.A00);
    }

    @Nullable
    public final Bitmap A0D(AnonymousClass79 anonymousClass79) {
        return A01(this.A00, anonymousClass79, anonymousClass79.A04, anonymousClass79.A03, anonymousClass79.A01);
    }

    @Nullable
    public final Bitmap A0E(C8C c8c, String str, int i2, int i3, String str2) {
        AnonymousClass79 anonymousClass79 = this.A01.get(str);
        return (!C7F.A06(c8c) || anonymousClass79 == null) ? A01(c8c, new AnonymousClass79(str, i2, i3, A07(206, 7, 43), A07(206, 7, 43)), i3, i2, str2) : A01(c8c, anonymousClass79, i3, i2, str2);
    }

    public final String A0F(String str) {
        File file = new File(this.A00.getCacheDir(), str.hashCode() + A07(2, 4, 85));
        return file.exists() ? file.getPath() : str;
    }
}
