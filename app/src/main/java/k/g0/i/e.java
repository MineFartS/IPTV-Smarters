package k.g0.i;

import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l.f f30709a = l.f.s("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f30710b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f30711c = new String[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f30712d = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = f30712d;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = k.g0.c.l("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = f30711c;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 = 0; i4 < 1; i4++) {
            int i5 = iArr[i4];
            String[] strArr3 = f30711c;
            strArr3[i5 | 8] = strArr3[i5] + "|PADDED";
        }
        String[] strArr4 = f30711c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            for (int i8 = 0; i8 < 1; i8++) {
                int i9 = iArr[i8];
                String[] strArr5 = f30711c;
                int i10 = i9 | i7;
                strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                strArr5[i10 | 8] = strArr5[i9] + '|' + strArr5[i7] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f30711c;
            if (i2 >= strArr6.length) {
                return;
            }
            if (strArr6[i2] == null) {
                strArr6[i2] = f30712d[i2];
            }
            i2++;
        }
    }

    public static String a(byte b2, byte b3) {
        if (b3 == 0) {
            return BuildConfig.FLAVOR;
        }
        if (b2 != 2 && b2 != 3) {
            if (b2 == 4 || b2 == 6) {
                return b3 == 1 ? "ACK" : f30712d[b3];
            }
            if (b2 != 7 && b2 != 8) {
                String[] strArr = f30711c;
                String str = b3 < strArr.length ? strArr[b3] : f30712d[b3];
                return (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f30712d[b3];
    }

    public static String b(boolean z, int i2, int i3, byte b2, byte b3) {
        String[] strArr = f30710b;
        String strL = b2 < strArr.length ? strArr[b2] : k.g0.c.l("0x%02x", Byte.valueOf(b2));
        String strA = a(b2, b3);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = strL;
        objArr[4] = strA;
        return k.g0.c.l("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static IllegalArgumentException c(String str, Object... objArr) {
        throw new IllegalArgumentException(k.g0.c.l(str, objArr));
    }

    public static IOException d(String str, Object... objArr) throws IOException {
        throw new IOException(k.g0.c.l(str, objArr));
    }
}
