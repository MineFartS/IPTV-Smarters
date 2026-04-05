package c.d.a.n.k.e;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5739b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5740c;

    public enum a {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        a(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f5741a;

        public b(byte[] bArr) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f5741a = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        public short a(int i2) {
            return this.f5741a.getShort(i2);
        }

        public int b(int i2) {
            return this.f5741a.getInt(i2);
        }

        public int c() {
            return this.f5741a.array().length;
        }

        public void d(ByteOrder byteOrder) {
            this.f5741a.order(byteOrder);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f5742a;

        public c(InputStream inputStream) {
            this.f5742a = inputStream;
        }

        public int a() {
            return this.f5742a.read();
        }

        public int b() {
            return ((this.f5742a.read() << 8) & 65280) | (this.f5742a.read() & 255);
        }

        public short c() {
            return (short) (this.f5742a.read() & 255);
        }

        public int d(byte[] bArr) throws IOException {
            int length = bArr.length;
            while (length > 0) {
                int i2 = this.f5742a.read(bArr, bArr.length - length, length);
                if (i2 == -1) {
                    break;
                }
                length -= i2;
            }
            return bArr.length - length;
        }

        public long e(long j2) throws IOException {
            if (j2 < 0) {
                return 0L;
            }
            long j3 = j2;
            while (j3 > 0) {
                long jSkip = this.f5742a.skip(j3);
                if (jSkip <= 0) {
                    if (this.f5742a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j3 -= jSkip;
            }
            return j2 - j3;
        }
    }

    static {
        byte[] bytes = new byte[0];
        try {
            bytes = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        f5738a = bytes;
    }

    public l(InputStream inputStream) {
        this.f5740c = new c(inputStream);
    }

    public static int a(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    public static boolean e(int i2) {
        return (i2 & 65496) == 65496 || i2 == 19789 || i2 == 18761;
    }

    public static int g(b bVar) {
        ByteOrder byteOrder;
        StringBuilder sb;
        String str;
        String string;
        short sA = bVar.a(6);
        if (sA == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (sA == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.d(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i2 = 0; i2 < sA2; i2++) {
            int iA = a(iB, i2);
            short sA3 = bVar.a(iA);
            if (sA3 == 274) {
                short sA4 = bVar.a(iA + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iA + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got tagIndex=" + i2 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i3 = iB2 + f5739b[sA4];
                        if (i3 <= 4) {
                            int i4 = iA + 8;
                            if (i4 >= 0 && i4 <= bVar.c()) {
                                if (i3 >= 0 && i3 + i4 <= bVar.c()) {
                                    return bVar.a(i4);
                                }
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append((int) sA3);
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                string = "Illegal tagValueOffset=" + i4 + " tagType=" + ((int) sA3);
                                Log.d("ImageHeaderParser", string);
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                            sb.append(str);
                            sb.append((int) sA4);
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        string = "Negative tiff component count";
                        Log.d("ImageHeaderParser", string);
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str = "Got invalid format code=";
                    sb.append(str);
                    sb.append((int) sA4);
                }
                string = sb.toString();
                Log.d("ImageHeaderParser", string);
            }
        }
        return -1;
    }

    public final byte[] b() throws IOException {
        short sC;
        int iB;
        long j2;
        long jE;
        do {
            short sC2 = this.f5740c.c();
            if (sC2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) sC2));
                }
                return null;
            }
            sC = this.f5740c.c();
            if (sC == 218) {
                return null;
            }
            if (sC == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return null;
            }
            iB = this.f5740c.b() - 2;
            if (sC == 225) {
                byte[] bArr = new byte[iB];
                int iD = this.f5740c.d(bArr);
                if (iD == iB) {
                    return bArr;
                }
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unable to read segment data, type: " + ((int) sC) + ", length: " + iB + ", actually read: " + iD);
                }
                return null;
            }
            j2 = iB;
            jE = this.f5740c.e(j2);
        } while (jE == j2);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) sC) + ", wanted to skip: " + iB + ", but actually skipped: " + jE);
        }
        return null;
    }

    public int c() throws IOException {
        if (!e(this.f5740c.b())) {
            return -1;
        }
        byte[] bArrB = b();
        boolean z = false;
        boolean z2 = bArrB != null && bArrB.length > f5738a.length;
        if (z2) {
            int i2 = 0;
            while (true) {
                byte[] bArr = f5738a;
                if (i2 >= bArr.length) {
                    break;
                }
                if (bArrB[i2] != bArr[i2]) {
                    break;
                }
                i2++;
            }
            z = z2;
        } else {
            z = z2;
        }
        if (z) {
            return g(new b(bArrB));
        }
        return -1;
    }

    public a d() throws IOException {
        int iB = this.f5740c.b();
        if (iB == 65496) {
            return a.JPEG;
        }
        int iB2 = ((iB << 16) & (-65536)) | (this.f5740c.b() & 65535);
        if (iB2 != -1991225785) {
            return (iB2 >> 8) == 4671814 ? a.GIF : a.UNKNOWN;
        }
        this.f5740c.e(21L);
        return this.f5740c.a() >= 3 ? a.PNG_A : a.PNG;
    }

    public boolean f() {
        return d().hasAlpha();
    }
}
