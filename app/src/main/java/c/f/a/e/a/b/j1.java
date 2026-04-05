package c.f.a.e.a.b;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f15500a;

    public static String a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int i2;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream(it.next());
            do {
                try {
                    i2 = fileInputStream.read(bArr);
                    if (i2 > 0) {
                        messageDigest.update(bArr, 0, i2);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        c.f.a.e.a.e.y.a(th, th2);
                    }
                    throw th;
                }
            } while (i2 != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static long b(byte[] bArr, int i2) {
        return ((long) ((c(bArr, i2 + 2) << 16) | c(bArr, i2))) & 4294967295L;
    }

    public static int c(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public static boolean d(int i2) {
        return i2 == 1 || i2 == 7 || i2 == 2 || i2 == 3;
    }

    public static boolean e(int i2) {
        return i2 == 5 || i2 == 6 || i2 == 4;
    }

    public static boolean f(int i2) {
        return i2 == 2 || i2 == 7 || i2 == 3;
    }

    public static boolean g(int i2, int i3) {
        if (i2 == 5) {
            if (i3 != 5) {
                return true;
            }
            i2 = 5;
        }
        if (i2 == 6 && i3 != 6 && i3 != 5) {
            return true;
        }
        if (i2 == 4 && i3 != 4) {
            return true;
        }
        if (i2 == 3 && (i3 == 2 || i3 == 7 || i3 == 1 || i3 == 8)) {
            return true;
        }
        if (i2 == 2) {
            return i3 == 1 || i3 == 8;
        }
        return false;
    }

    public static synchronized d h(Context context) {
        if (f15500a == null) {
            g0 g0Var = new g0(null);
            g0Var.b(new k2(c.f.a.e.a.g.a.b(context)));
            f15500a = g0Var.a();
        }
        return f15500a;
    }
}
