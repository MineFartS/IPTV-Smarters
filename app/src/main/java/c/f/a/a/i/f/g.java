package c.f.a.a.i.f;

import c.f.a.a.i.f.m;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f6118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f6119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<l> f6121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f6122g;

    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f6123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f6124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k f6125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f6126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f6127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<l> f6128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p f6129g;

        @Override // c.f.a.a.i.f.m.a
        public m a() {
            Long l2 = this.f6123a;
            String str = BuildConfig.FLAVOR;
            if (l2 == null) {
                str = BuildConfig.FLAVOR + " requestTimeMs";
            }
            if (this.f6124b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f6123a.longValue(), this.f6124b.longValue(), this.f6125c, this.f6126d, this.f6127e, this.f6128f, this.f6129g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c.f.a.a.i.f.m.a
        public m.a b(k kVar) {
            this.f6125c = kVar;
            return this;
        }

        @Override // c.f.a.a.i.f.m.a
        public m.a c(List<l> list) {
            this.f6128f = list;
            return this;
        }

        @Override // c.f.a.a.i.f.m.a
        public m.a d(Integer num) {
            this.f6126d = num;
            return this;
        }

        @Override // c.f.a.a.i.f.m.a
        public m.a e(String str) {
            this.f6127e = str;
            return this;
        }

        @Override // c.f.a.a.i.f.m.a
        public m.a f(p pVar) {
            this.f6129g = pVar;
            return this;
        }

        @Override // c.f.a.a.i.f.m.a
        public m.a g(long j2) {
            this.f6123a = Long.valueOf(j2);
            return this;
        }

        @Override // c.f.a.a.i.f.m.a
        public m.a h(long j2) {
            this.f6124b = Long.valueOf(j2);
            return this;
        }
    }

    public g(long j2, long j3, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f6116a = j2;
        this.f6117b = j3;
        this.f6118c = kVar;
        this.f6119d = num;
        this.f6120e = str;
        this.f6121f = list;
        this.f6122g = pVar;
    }

    @Override // c.f.a.a.i.f.m
    public k b() {
        return this.f6118c;
    }

    @Override // c.f.a.a.i.f.m
    public List<l> c() {
        return this.f6121f;
    }

    @Override // c.f.a.a.i.f.m
    public Integer d() {
        return this.f6119d;
    }

    @Override // c.f.a.a.i.f.m
    public String e() {
        return this.f6120e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f6116a == mVar.g() && this.f6117b == mVar.h() && ((kVar = this.f6118c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f6119d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f6120e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f6121f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f6122g;
            p pVarF = mVar.f();
            if (pVar == null) {
                if (pVarF == null) {
                    return true;
                }
            } else if (pVar.equals(pVarF)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.a.i.f.m
    public p f() {
        return this.f6122g;
    }

    @Override // c.f.a.a.i.f.m
    public long g() {
        return this.f6116a;
    }

    @Override // c.f.a.a.i.f.m
    public long h() {
        return this.f6117b;
    }

    public int hashCode() {
        long j2 = this.f6116a;
        long j3 = this.f6117b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        k kVar = this.f6118c;
        int iHashCode = (i2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f6119d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f6120e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f6121f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f6122g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f6116a + ", requestUptimeMs=" + this.f6117b + ", clientInfo=" + this.f6118c + ", logSource=" + this.f6119d + ", logSourceName=" + this.f6120e + ", logEvents=" + this.f6121f + ", qosTier=" + this.f6122g + "}";
    }
}
