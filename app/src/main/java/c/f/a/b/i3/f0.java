package c.f.a.b.i3;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface f0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8863d;

        public a(int i2, int i3, int i4, int i5) {
            this.f8860a = i2;
            this.f8861b = i3;
            this.f8862c = i4;
            this.f8863d = i5;
        }

        public boolean a(int i2) {
            if (i2 == 1) {
                if (this.f8860a - this.f8861b <= 1) {
                    return false;
                }
            } else if (this.f8862c - this.f8863d <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8865b;

        public b(int i2, long j2) {
            c.f.a.b.j3.g.a(j2 >= 0);
            this.f8864a = i2;
            this.f8865b = j2;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.e3.a0 f8866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.e3.d0 f8867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f8868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8869d;

        public c(c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var, IOException iOException, int i2) {
            this.f8866a = a0Var;
            this.f8867b = d0Var;
            this.f8868c = iOException;
            this.f8869d = i2;
        }
    }

    long a(c cVar);

    b b(a aVar, c cVar);

    void c(long j2);

    int d(int i2);
}
