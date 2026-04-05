package c.f.a.a.i.f;

import c.f.a.a.i.f.l;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f6108g;

    public static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f6109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f6110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f6111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f6112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f6113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f6114f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f6115g;

        @Override // c.f.a.a.i.f.l.a
        public l a() {
            Long l2 = this.f6109a;
            String str = BuildConfig.FLAVOR;
            if (l2 == null) {
                str = BuildConfig.FLAVOR + " eventTimeMs";
            }
            if (this.f6111c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f6114f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f6109a.longValue(), this.f6110b, this.f6111c.longValue(), this.f6112d, this.f6113e, this.f6114f.longValue(), this.f6115g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.f.a.a.i.f.l.a
        public l.a b(Integer num) {
            this.f6110b = num;
            return this;
        }

        @Override // c.f.a.a.i.f.l.a
        public l.a c(long j2) {
            this.f6109a = Long.valueOf(j2);
            return this;
        }

        @Override // c.f.a.a.i.f.l.a
        public l.a d(long j2) {
            this.f6111c = Long.valueOf(j2);
            return this;
        }

        @Override // c.f.a.a.i.f.l.a
        public l.a e(o oVar) {
            this.f6115g = oVar;
            return this;
        }

        @Override // c.f.a.a.i.f.l.a
        public l.a f(byte[] bArr) {
            this.f6112d = bArr;
            return this;
        }

        @Override // c.f.a.a.i.f.l.a
        public l.a g(String str) {
            this.f6113e = str;
            return this;
        }

        @Override // c.f.a.a.i.f.l.a
        public l.a h(long j2) {
            this.f6114f = Long.valueOf(j2);
            return this;
        }
    }

    public f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, o oVar) {
        this.f6102a = j2;
        this.f6103b = num;
        this.f6104c = j3;
        this.f6105d = bArr;
        this.f6106e = str;
        this.f6107f = j4;
        this.f6108g = oVar;
    }

    @Override // c.f.a.a.i.f.l
    public Integer b() {
        return this.f6103b;
    }

    @Override // c.f.a.a.i.f.l
    public long c() {
        return this.f6102a;
    }

    @Override // c.f.a.a.i.f.l
    public long d() {
        return this.f6104c;
    }

    @Override // c.f.a.a.i.f.l
    public o e() {
        return this.f6108g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f6102a == lVar.c() && ((num = this.f6103b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f6104c == lVar.d()) {
            if (Arrays.equals(this.f6105d, lVar instanceof f ? ((f) lVar).f6105d : lVar.f()) && ((str = this.f6106e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f6107f == lVar.h()) {
                o oVar = this.f6108g;
                o oVarE = lVar.e();
                if (oVar == null) {
                    if (oVarE == null) {
                        return true;
                    }
                } else if (oVar.equals(oVarE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c.f.a.a.i.f.l
    public byte[] f() {
        return this.f6105d;
    }

    @Override // c.f.a.a.i.f.l
    public String g() {
        return this.f6106e;
    }

    @Override // c.f.a.a.i.f.l
    public long h() {
        return this.f6107f;
    }

    public int hashCode() {
        long j2 = this.f6102a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f6103b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j3 = this.f6104c;
        int iHashCode2 = (((((i2 ^ iHashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f6105d)) * 1000003;
        String str = this.f6106e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f6107f;
        int i3 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        o oVar = this.f6108g;
        return i3 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f6102a + ", eventCode=" + this.f6103b + ", eventUptimeMs=" + this.f6104c + ", sourceExtension=" + Arrays.toString(this.f6105d) + ", sourceExtensionJsonProto3=" + this.f6106e + ", timezoneOffsetSeconds=" + this.f6107f + ", networkConnectionInfo=" + this.f6108g + "}";
    }
}
