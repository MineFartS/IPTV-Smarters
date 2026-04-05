package l;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f31051b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f31052c = v(new byte[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f31053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f31054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient String f31055f;

    public f(byte[] bArr) {
        this.f31053d = bArr;
    }

    public static int g(String str, int i2) {
        int length = str.length();
        int iCharCount = 0;
        int i3 = 0;
        while (iCharCount < length) {
            if (i3 == i2) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i3++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }

    @Nullable
    public static f o(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] bArrA = b.a(str);
        if (bArrA != null) {
            return new f(bArrA);
        }
        return null;
    }

    public static f p(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((q(str.charAt(i3)) << 4) + q(str.charAt(i3 + 1)));
        }
        return v(bArr);
    }

    public static int q(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    public static f s(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(v.f31099a));
        fVar.f31055f = str;
        return fVar;
    }

    public static f v(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public final boolean A(f fVar) {
        return w(0, fVar, 0, fVar.size());
    }

    public f B(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f31053d;
        if (i3 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f31053d.length + ")");
        }
        int i4 = i3 - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i2 == 0 && i3 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i2, bArr2, 0, i4);
        return new f(bArr2);
    }

    public f C() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f31053d;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i3] = (byte) (b3 + 32);
                    }
                }
                return new f(bArr2);
            }
            i2++;
        }
    }

    public byte[] D() {
        return (byte[]) this.f31053d.clone();
    }

    public String E() {
        String str = this.f31055f;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f31053d, v.f31099a);
        this.f31055f = str2;
        return str2;
    }

    public void F(c cVar) {
        byte[] bArr = this.f31053d;
        cVar.f(bArr, 0, bArr.length);
    }

    public String d() {
        return b.b(this.f31053d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int size = fVar.size();
            byte[] bArr = this.f31053d;
            if (size == bArr.length && fVar.x(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f31054e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f31053d);
        this.f31054e = iHashCode;
        return iHashCode;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int size = size();
        int size2 = fVar.size();
        int iMin = Math.min(size, size2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iT = t(i2) & 255;
            int iT2 = fVar.t(i2) & 255;
            if (iT != iT2) {
                return iT < iT2 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final f r(String str) {
        try {
            return v(MessageDigest.getInstance(str).digest(this.f31053d));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public int size() {
        return this.f31053d.length;
    }

    public byte t(int i2) {
        return this.f31053d[i2];
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f31053d.length == 0) {
            return "[size=0]";
        }
        String strE = E();
        int iG = g(strE, 64);
        if (iG == -1) {
            if (this.f31053d.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(u());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f31053d.length);
                sb2.append(" hex=");
                sb2.append(B(0, 64).u());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String strReplace = strE.substring(0, iG).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iG < strE.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f31053d.length);
            sb.append(" text=");
            sb.append(strReplace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(strReplace);
            sb.append("]");
        }
        return sb.toString();
    }

    public String u() {
        byte[] bArr = this.f31053d;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = f31051b;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY];
        }
        return new String(cArr);
    }

    public boolean w(int i2, f fVar, int i3, int i4) {
        return fVar.x(i3, this.f31053d, i2, i4);
    }

    public boolean x(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.f31053d;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && v.a(bArr2, i2, bArr, i3, i4)) {
                return true;
            }
        }
        return false;
    }

    public f y() {
        return r("SHA-1");
    }

    public f z() {
        return r("SHA-256");
    }
}
