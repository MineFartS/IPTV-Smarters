package k.g0.k;

import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k.g0.c;
import l.e;
import l.k;
import l.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f30864a = {42};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f30865b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f30866c = {"*"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30867d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f30868e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f30869f = new CountDownLatch(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f30870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f30871h;

    public static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > -1 && bArr[i7] != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (bArr[i3] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i4 = 46;
                    z = false;
                } else {
                    z = z2;
                    i4 = bArr2[i11][i12] & 255;
                }
                i5 = i4 - (bArr[i8 + i13] & 255);
                if (i5 == 0) {
                    i13++;
                    i12++;
                    if (i13 == i10) {
                        break;
                    }
                    if (bArr2[i11].length != i12) {
                        z2 = z;
                    } else {
                        if (i11 == bArr2.length - 1) {
                            break;
                        }
                        i11++;
                        z2 = true;
                        i12 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i14 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    while (true) {
                        i11++;
                        if (i11 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i11].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i8, i10, c.f30564j);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            length = i8 - 1;
        }
        return null;
    }

    public static a c() {
        return f30867d;
    }

    public final String[] b(String[] strArr) {
        String str;
        String strA;
        String strA2;
        int i2 = 0;
        if (this.f30868e.get() || !this.f30868e.compareAndSet(false, true)) {
            try {
                this.f30869f.await();
            } catch (InterruptedException unused) {
            }
        } else {
            e();
        }
        synchronized (this) {
            if (this.f30870g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            bArr[i3] = strArr[i3].getBytes(c.f30564j);
        }
        int i4 = 0;
        while (true) {
            str = null;
            if (i4 >= length) {
                strA = null;
                break;
            }
            strA = a(this.f30870g, bArr, i4);
            if (strA != null) {
                break;
            }
            i4++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i5 = 0; i5 < bArr2.length - 1; i5++) {
                bArr2[i5] = f30864a;
                strA2 = a(this.f30870g, bArr2, i5);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            while (true) {
                if (i2 >= length - 1) {
                    break;
                }
                String strA3 = a(this.f30871h, bArr, i2);
                if (strA3 != null) {
                    str = strA3;
                    break;
                }
                i2++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (strA == null && strA2 == null) {
            return f30866c;
        }
        String[] strArrSplit = strA != null ? strA.split("\\.") : f30865b;
        String[] strArrSplit2 = strA2 != null ? strA2.split("\\.") : f30865b;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    public String d(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrB = b(strArrSplit);
        if (strArrSplit.length == strArrB.length && strArrB[0].charAt(0) != '!') {
            return null;
        }
        char cCharAt = strArrB[0].charAt(0);
        int length = strArrSplit.length;
        int length2 = strArrB.length;
        if (cCharAt != '!') {
            length2++;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i2 = length - length2; i2 < strArrSplit2.length; i2++) {
            sb.append(strArrSplit2[i2]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public final void e() {
        byte[] bArr;
        InputStream resourceAsStream = a.class.getClassLoader().getResourceAsStream("publicsuffixes.gz");
        byte[] bArr2 = null;
        if (resourceAsStream != null) {
            e eVarC = m.c(new k(m.j(resourceAsStream)));
            try {
                try {
                    byte[] bArr3 = new byte[eVarC.C()];
                    eVarC.W(bArr3);
                    bArr = new byte[eVarC.C()];
                    eVarC.W(bArr);
                    c.c(eVarC);
                    bArr2 = bArr3;
                } catch (IOException e2) {
                    k.g0.j.e.h().l(5, "Failed to read public suffix list", e2);
                    c.c(eVarC);
                    bArr = null;
                }
            } catch (Throwable th) {
                c.c(eVarC);
                throw th;
            }
        } else {
            bArr = null;
        }
        synchronized (this) {
            this.f30870g = bArr2;
            this.f30871h = bArr;
        }
        this.f30869f.countDown();
    }
}
