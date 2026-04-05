package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> extends w0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC0185b f15806b = EnumC0185b.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NullableDecl
    public T f15807c;

    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15808a;

        static {
            int[] iArr = new int[EnumC0185b.values().length];
            f15808a = iArr;
            try {
                iArr[EnumC0185b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15808a[EnumC0185b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: c.f.b.b.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes2.dex */
    public enum EnumC0185b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T a();

    @CanIgnoreReturnValue
    public final T b() {
        this.f15806b = EnumC0185b.DONE;
        return null;
    }

    public final boolean c() {
        this.f15806b = EnumC0185b.FAILED;
        this.f15807c = a();
        if (this.f15806b == EnumC0185b.DONE) {
            return false;
        }
        this.f15806b = EnumC0185b.READY;
        return true;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        c.f.b.a.k.o(this.f15806b != EnumC0185b.FAILED);
        int i2 = a.f15808a[this.f15806b.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15806b = EnumC0185b.NOT_READY;
        T t = this.f15807c;
        this.f15807c = null;
        return t;
    }
}
