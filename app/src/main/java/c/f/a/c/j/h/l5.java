package c.f.a.c.j.h;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l5 implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l5 f13413b = new j5(u6.f13548c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f5 f13414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator<l5> f13415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13416e = 0;

    static {
        a5 a5Var = null;
        f13414c = v4.a() ? new k5(a5Var) : new d5(a5Var);
        f13415d = new b5();
    }

    public static h5 B(int i2) {
        return new h5(i2, null);
    }

    public static int D(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i3);
        sb3.append(" >= ");
        sb3.append(i4);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static l5 t(byte[] bArr, int i2, int i3) {
        D(i2, i2 + i3, bArr.length);
        return new j5(f13414c.a(bArr, i2, i3));
    }

    public static l5 v(String str) {
        return new j5(str.getBytes(u6.f13546a));
    }

    public final int C() {
        return this.f13416e;
    }

    public abstract byte a(int i2);

    public abstract byte b(int i2);

    public abstract int d();

    public abstract l5 e(int i2, int i3);

    public abstract boolean equals(Object obj);

    public abstract void f(z4 z4Var);

    public abstract String g(Charset charset);

    public final int hashCode() {
        int iS = this.f13416e;
        if (iS == 0) {
            int iD = d();
            iS = s(iD, 0, iD);
            if (iS == 0) {
                iS = 1;
            }
            this.f13416e = iS;
        }
        return iS;
    }

    public abstract boolean i();

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new a5(this);
    }

    public abstract int s(int i2, int i3, int i4);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        objArr[2] = d() <= 50 ? o8.a(this) : String.valueOf(o8.a(e(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String x(Charset charset) {
        return d() == 0 ? BuildConfig.FLAVOR : g(charset);
    }
}
