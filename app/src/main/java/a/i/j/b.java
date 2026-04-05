package a.i.j;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1796a = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1800e;

    public b(int i2, int i3, int i4, int i5) {
        this.f1797b = i2;
        this.f1798c = i3;
        this.f1799d = i4;
        this.f1800e = i5;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f1797b, bVar2.f1797b), Math.max(bVar.f1798c, bVar2.f1798c), Math.max(bVar.f1799d, bVar2.f1799d), Math.max(bVar.f1800e, bVar2.f1800e));
    }

    public static b b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f1796a : new b(i2, i3, i4, i5);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.f1797b, this.f1798c, this.f1799d, this.f1800e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1800e == bVar.f1800e && this.f1797b == bVar.f1797b && this.f1799d == bVar.f1799d && this.f1798c == bVar.f1798c;
    }

    public int hashCode() {
        return (((((this.f1797b * 31) + this.f1798c) * 31) + this.f1799d) * 31) + this.f1800e;
    }

    public String toString() {
        return "Insets{left=" + this.f1797b + ", top=" + this.f1798c + ", right=" + this.f1799d + ", bottom=" + this.f1800e + '}';
    }
}
