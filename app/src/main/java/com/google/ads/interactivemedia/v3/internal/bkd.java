package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class bkd implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bjy f21261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bkd f21262b = new bkb(bld.f21342b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21263c = 0;

    static {
        int i2 = bjs.f21247a;
        f21261a = new bkc(null);
    }

    public static int l(int i2, int i3, int i4) {
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

    public static bkd o(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static bkd p(byte[] bArr, int i2, int i3) {
        l(i2, i2 + i3, bArr.length);
        return new bkb(f21261a.a(bArr, i2, i3));
    }

    public static bkd q(String str) {
        return new bkb(str.getBytes(bld.f21341a));
    }

    public static bkd r(byte[] bArr) {
        return new bkb(bArr);
    }

    public abstract byte a(int i2);

    public abstract byte b(int i2);

    public abstract int d();

    public abstract void e(byte[] bArr, int i2);

    public abstract boolean equals(Object obj);

    public abstract bke f();

    public abstract String g(Charset charset);

    public abstract boolean h();

    public final int hashCode() {
        int i2 = this.f21263c;
        if (i2 == 0) {
            int iD = d();
            i2 = i(iD, iD);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f21263c = i2;
        }
        return i2;
    }

    public abstract int i(int i2, int i3);

    public abstract bkd j(int i2);

    public abstract void k(avq avqVar);

    public final int m() {
        return this.f21263c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final bjz iterator() {
        return new bjw(this);
    }

    public final String s() {
        return d() == 0 ? BuildConfig.FLAVOR : g(bld.f21341a);
    }

    public final byte[] t() {
        int iD = d();
        if (iD == 0) {
            return bld.f21342b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, iD);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(d());
        objArr[2] = d() <= 50 ? bmx.a(this) : String.valueOf(bmx.a(j(47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
