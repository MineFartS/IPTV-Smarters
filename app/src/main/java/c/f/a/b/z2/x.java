package c.f.a.b.z2;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public interface x {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f11507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f11508b;

        public a(y yVar) {
            this(yVar, yVar);
        }

        public a(y yVar, y yVar2) {
            this.f11507a = (y) c.f.a.b.j3.g.e(yVar);
            this.f11508b = (y) c.f.a.b.j3.g.e(yVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11507a.equals(aVar.f11507a) && this.f11508b.equals(aVar.f11508b);
        }

        public int hashCode() {
            return (this.f11507a.hashCode() * 31) + this.f11508b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f11507a);
            if (this.f11507a.equals(this.f11508b)) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", " + this.f11508b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    public static class b implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f11509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f11510b;

        public b(long j2) {
            this(j2, 0L);
        }

        public b(long j2, long j3) {
            this.f11509a = j2;
            this.f11510b = new a(j3 == 0 ? y.f11511a : new y(0L, j3));
        }

        @Override // c.f.a.b.z2.x
        public boolean f() {
            return false;
        }

        @Override // c.f.a.b.z2.x
        public a h(long j2) {
            return this.f11510b;
        }

        @Override // c.f.a.b.z2.x
        public long i() {
            return this.f11509a;
        }
    }

    boolean f();

    a h(long j2);

    long i();
}
