package c.f.a.a.j.u;

import c.f.a.a.j.u.f;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<c.f.a.a.j.h> f6204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6205b;

    public static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable<c.f.a.a.j.h> f6206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f6207b;

        @Override // c.f.a.a.j.u.f.a
        public f a() {
            Iterable<c.f.a.a.j.h> iterable = this.f6206a;
            String str = BuildConfig.FLAVOR;
            if (iterable == null) {
                str = BuildConfig.FLAVOR + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f6206a, this.f6207b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.f.a.a.j.u.f.a
        public f.a b(Iterable<c.f.a.a.j.h> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f6206a = iterable;
            return this;
        }

        @Override // c.f.a.a.j.u.f.a
        public f.a c(byte[] bArr) {
            this.f6207b = bArr;
            return this;
        }
    }

    public a(Iterable<c.f.a.a.j.h> iterable, byte[] bArr) {
        this.f6204a = iterable;
        this.f6205b = bArr;
    }

    @Override // c.f.a.a.j.u.f
    public Iterable<c.f.a.a.j.h> b() {
        return this.f6204a;
    }

    @Override // c.f.a.a.j.u.f
    public byte[] c() {
        return this.f6205b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f6204a.equals(fVar.b())) {
            if (Arrays.equals(this.f6205b, fVar instanceof a ? ((a) fVar).f6205b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6204a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6205b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f6204a + ", extras=" + Arrays.toString(this.f6205b) + "}";
    }
}
