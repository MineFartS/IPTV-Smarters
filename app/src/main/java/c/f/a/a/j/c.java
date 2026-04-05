package c.f.a.a.j;

import c.f.a.a.j.m;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.d f6163c;

    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f6164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f6165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.f.a.a.d f6166c;

        @Override // c.f.a.a.j.m.a
        public m a() {
            String str = this.f6164a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " backendName";
            }
            if (this.f6166c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new c(this.f6164a, this.f6165b, this.f6166c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // c.f.a.a.j.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f6164a = str;
            return this;
        }

        @Override // c.f.a.a.j.m.a
        public m.a c(byte[] bArr) {
            this.f6165b = bArr;
            return this;
        }

        @Override // c.f.a.a.j.m.a
        public m.a d(c.f.a.a.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f6166c = dVar;
            return this;
        }
    }

    public c(String str, byte[] bArr, c.f.a.a.d dVar) {
        this.f6161a = str;
        this.f6162b = bArr;
        this.f6163c = dVar;
    }

    @Override // c.f.a.a.j.m
    public String b() {
        return this.f6161a;
    }

    @Override // c.f.a.a.j.m
    public byte[] c() {
        return this.f6162b;
    }

    @Override // c.f.a.a.j.m
    public c.f.a.a.d d() {
        return this.f6163c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f6161a.equals(mVar.b())) {
            if (Arrays.equals(this.f6162b, mVar instanceof c ? ((c) mVar).f6162b : mVar.c()) && this.f6163c.equals(mVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f6161a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6162b)) * 1000003) ^ this.f6163c.hashCode();
    }
}
