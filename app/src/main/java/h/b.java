package h;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30355g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30351c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f30350b = new b(1, 3, 71);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h.l.c.e eVar) {
            this();
        }
    }

    public b(int i2, int i3, int i4) {
        this.f30353e = i2;
        this.f30354f = i3;
        this.f30355g = i4;
        this.f30352d = b(i2, i3, i4);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull b bVar) {
        h.l.c.g.c(bVar, "other");
        return this.f30352d - bVar.f30352d;
    }

    public final int b(int i2, int i3, int i4) {
        if (i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3 && i4 >= 0 && 255 >= i4) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            obj = null;
        }
        b bVar = (b) obj;
        return bVar != null && this.f30352d == bVar.f30352d;
    }

    public int hashCode() {
        return this.f30352d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30353e);
        sb.append('.');
        sb.append(this.f30354f);
        sb.append('.');
        sb.append(this.f30355g);
        return sb.toString();
    }
}
