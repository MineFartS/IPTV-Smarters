package c.f.b.a;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15776b = b.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NullableDecl
    public T f15777c;

    /* JADX INFO: renamed from: c.f.b.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class C0182a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15778a;

        static {
            int[] iArr = new int[b.values().length];
            f15778a = iArr;
            try {
                iArr[b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15778a[b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T a();

    @CanIgnoreReturnValue
    @NullableDecl
    public final T b() {
        this.f15776b = b.DONE;
        return null;
    }

    public final boolean c() {
        this.f15776b = b.FAILED;
        this.f15777c = a();
        if (this.f15776b == b.DONE) {
            return false;
        }
        this.f15776b = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        k.o(this.f15776b != b.FAILED);
        int i2 = C0182a.f15778a[this.f15776b.ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15776b = b.NOT_READY;
        T t = this.f15777c;
        this.f15777c = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
