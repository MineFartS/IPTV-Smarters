package c.f.b.b;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f15891a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f15892b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f15893c = new b(1);

    public static class a extends n {
        public a() {
            super(null);
        }

        @Override // c.f.b.b.n
        public n d(int i2, int i3) {
            return k(c.f.b.f.c.d(i2, i3));
        }

        @Override // c.f.b.b.n
        public n e(long j2, long j3) {
            return k(c.f.b.f.d.a(j2, j3));
        }

        @Override // c.f.b.b.n
        public <T> n f(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return k(comparator.compare(t, t2));
        }

        @Override // c.f.b.b.n
        public n g(boolean z, boolean z2) {
            return k(c.f.b.f.a.a(z, z2));
        }

        @Override // c.f.b.b.n
        public n h(boolean z, boolean z2) {
            return k(c.f.b.f.a.a(z2, z));
        }

        @Override // c.f.b.b.n
        public int i() {
            return 0;
        }

        public n k(int i2) {
            return i2 < 0 ? n.f15892b : i2 > 0 ? n.f15893c : n.f15891a;
        }
    }

    public static final class b extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15894d;

        public b(int i2) {
            super(null);
            this.f15894d = i2;
        }

        @Override // c.f.b.b.n
        public n d(int i2, int i3) {
            return this;
        }

        @Override // c.f.b.b.n
        public n e(long j2, long j3) {
            return this;
        }

        @Override // c.f.b.b.n
        public <T> n f(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // c.f.b.b.n
        public n g(boolean z, boolean z2) {
            return this;
        }

        @Override // c.f.b.b.n
        public n h(boolean z, boolean z2) {
            return this;
        }

        @Override // c.f.b.b.n
        public int i() {
            return this.f15894d;
        }
    }

    public n() {
    }

    public /* synthetic */ n(a aVar) {
        this();
    }

    public static n j() {
        return f15891a;
    }

    public abstract n d(int i2, int i3);

    public abstract n e(long j2, long j3);

    public abstract <T> n f(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    public abstract n g(boolean z, boolean z2);

    public abstract n h(boolean z, boolean z2);

    public abstract int i();
}
