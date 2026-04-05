package c.f.a.b.e3.d1;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f7060a = new a();

    public static class a implements o {
        @Override // c.f.a.b.e3.d1.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // c.f.a.b.e3.d1.o
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // c.f.a.b.e3.d1.o
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
