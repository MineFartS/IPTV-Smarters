package com.facebook.ads.redexgen.X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GE implements QM {
    public static byte[] A01;
    public static String[] A02;
    public final QN A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 123, 123, 125, -120, -116, 69, 91, -128, 121, -118, -117, 125, -116, -98, -67, -49, -59, -65, -82, -63, -51, -47, -63, -49, -48, -92, -67, -54, -64, -56, -63, -50, -118, -53, -54, -95, -50, -50, -53, -50, 124, -61, -53, -48, -102, -58, -59, -53, -68, -59, -53, -124, -85, -48, -57, -68, -71, -72, -86, -111, -100};
    }

    public static void A02() {
        A02 = new String[]{"rzjVC70O4bd9DzHjbWZgWXgUSmVLYSU4", "d5zo8W4K", "Hv98ROwnq0amXTKQof8zpMynpU6nXYzw", "m02wtPmJvn7xvEVIhgILVdsvYaekd1y1", "NwXA6aDXoJPzKJxJycW", "lujFiBBwg3lGF", "5iNla1hEs57TMoL8Mlh58N0Q757SBHKY", "iek06qmxI9TIJY"};
    }

    public GE() {
        this(new G6());
    }

    public GE(QN qn) {
        this.A00 = qn;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final boolean A9d(QK qk) {
        Q6 q6A00 = qk.A00();
        if (this.A00.A7k()) {
            this.A00.A7y(A00(14, 31, 78));
            qk.printStackTrace();
        }
        if (q6A00 != null && q6A00.A79() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final HttpURLConnection ABU(String str) throws IOException {
        return (HttpURLConnection) new URL(str).openConnection();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final InputStream ABV(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final OutputStream ABW(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void ABn(HttpURLConnection httpURLConnection, QI qi, String str) throws IOException {
        httpURLConnection.setRequestMethod(qi.A03());
        httpURLConnection.setDoOutput(qi.A05());
        httpURLConnection.setDoInput(qi.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(45, 12, 73), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 10), A00(57, 5, 86));
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final byte[] AC7(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            if (A02[4].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "eO7qbggyddGiOQuVn8N8jDULGwym82oB";
            strArr[6] = "iN6CFd4LV6hdOWp44ZZbGtT2nODAuDvC";
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QM
    public final void AE0(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
