package c.f.a.c.j.c;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m9 implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m9 f12941b = new w9(sa.f13072c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s9 f12942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Comparator<m9> f12943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12944e = 0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        l9 l9Var = null;
        f12942c = j9.b() ? new v9(l9Var) : new q9(l9Var);
        f12943d = new o9();
    }

    public static int a(byte b2) {
        return b2 & 255;
    }

    public static u9 h(int i2) {
        return new u9(i2, null);
    }

    public static m9 i(String str) {
        return new w9(str.getBytes(sa.f13070a));
    }

    public static int v(int i2, int i3, int i4) {
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

    public final String B() {
        return size() == 0 ? BuildConfig.FLAVOR : b(sa.f13070a);
    }

    public abstract boolean C();

    public final int D() {
        return this.f12944e;
    }

    public abstract String b(Charset charset);

    public abstract void d(i9 i9Var);

    public abstract byte e(int i2);

    public abstract boolean equals(Object obj);

    public abstract byte g(int i2);

    public final int hashCode() {
        int iT = this.f12944e;
        if (iT == 0) {
            int size = size();
            iT = t(size, 0, size);
            if (iT == 0) {
                iT = 1;
            }
            this.f12944e = iT;
        }
        return iT;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new l9(this);
    }

    public abstract int size();

    public abstract int t(int i2, int i3, int i4);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? dd.a(this) : String.valueOf(dd.a(x(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract m9 x(int i2, int i3);
}
