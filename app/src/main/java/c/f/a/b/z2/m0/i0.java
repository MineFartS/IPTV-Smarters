package c.f.a.b.z2.m0;

import android.util.SparseArray;
import c.f.a.b.j3.u0;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public interface i0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f11217c;

        public a(String str, int i2, byte[] bArr) {
            this.f11215a = str;
            this.f11216b = i2;
            this.f11217c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f11220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f11221d;

        public b(int i2, String str, List<a> list, byte[] bArr) {
            this.f11218a = i2;
            this.f11219b = str;
            this.f11220c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f11221d = bArr;
        }
    }

    public interface c {
        i0 a(int i2, b bVar);

        SparseArray<i0> b();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f11226e;

        public d(int i2, int i3) {
            this(Integer.MIN_VALUE, i2, i3);
        }

        public d(int i2, int i3, int i4) {
            String str;
            if (i2 != Integer.MIN_VALUE) {
                str = i2 + "/";
            } else {
                str = BuildConfig.FLAVOR;
            }
            this.f11222a = str;
            this.f11223b = i3;
            this.f11224c = i4;
            this.f11225d = Integer.MIN_VALUE;
            this.f11226e = BuildConfig.FLAVOR;
        }

        public void a() {
            int i2 = this.f11225d;
            this.f11225d = i2 == Integer.MIN_VALUE ? this.f11223b : i2 + this.f11224c;
            this.f11226e = this.f11222a + this.f11225d;
        }

        public String b() {
            d();
            return this.f11226e;
        }

        public int c() {
            d();
            return this.f11225d;
        }

        public final void d() {
            if (this.f11225d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    void a(u0 u0Var, c.f.a.b.z2.l lVar, d dVar);

    void b(c.f.a.b.j3.i0 i0Var, int i2);

    void c();
}
