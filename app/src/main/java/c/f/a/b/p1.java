package c.f.a.b;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f9640a = new c().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0<p1> f9641b = new v0() { // from class: c.f.a.b.e0
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f9643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f9644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1 f9645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f9646g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9648b;

        public b(Uri uri, Object obj) {
            this.f9647a = uri;
            this.f9648b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9647a.equals(bVar.f9647a) && c.f.a.b.j3.x0.b(this.f9648b, bVar.f9648b);
        }

        public int hashCode() {
            int iHashCode = this.f9647a.hashCode() * 31;
            Object obj = this.f9648b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class c {
        public float A;
        public float B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f9650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f9655g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f9656h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Uri f9657i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Map<String, String> f9658j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public UUID f9659k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f9660l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f9661m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f9662n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<Integer> f9663o;
        public byte[] p;
        public List<c.f.a.b.c3.i0> q;
        public String r;
        public List<h> s;
        public Uri t;
        public Object u;
        public Object v;
        public q1 w;
        public long x;
        public long y;
        public long z;

        public c() {
            this.f9653e = Long.MIN_VALUE;
            this.f9663o = Collections.emptyList();
            this.f9658j = Collections.emptyMap();
            this.q = Collections.emptyList();
            this.s = Collections.emptyList();
            this.x = -9223372036854775807L;
            this.y = -9223372036854775807L;
            this.z = -9223372036854775807L;
            this.A = -3.4028235E38f;
            this.B = -3.4028235E38f;
        }

        public c(p1 p1Var) {
            this();
            d dVar = p1Var.f9646g;
            this.f9653e = dVar.f9666c;
            this.f9654f = dVar.f9667d;
            this.f9655g = dVar.f9668e;
            this.f9652d = dVar.f9665b;
            this.f9656h = dVar.f9669f;
            this.f9649a = p1Var.f9642c;
            this.w = p1Var.f9645f;
            f fVar = p1Var.f9644e;
            this.x = fVar.f9680c;
            this.y = fVar.f9681d;
            this.z = fVar.f9682e;
            this.A = fVar.f9683f;
            this.B = fVar.f9684g;
            g gVar = p1Var.f9643d;
            if (gVar != null) {
                this.r = gVar.f9690f;
                this.f9651c = gVar.f9686b;
                this.f9650b = gVar.f9685a;
                this.q = gVar.f9689e;
                this.s = gVar.f9691g;
                this.v = gVar.f9692h;
                e eVar = gVar.f9687c;
                if (eVar != null) {
                    this.f9657i = eVar.f9671b;
                    this.f9658j = eVar.f9672c;
                    this.f9660l = eVar.f9673d;
                    this.f9662n = eVar.f9675f;
                    this.f9661m = eVar.f9674e;
                    this.f9663o = eVar.f9676g;
                    this.f9659k = eVar.f9670a;
                    this.p = eVar.a();
                }
                b bVar = gVar.f9688d;
                if (bVar != null) {
                    this.t = bVar.f9647a;
                    this.u = bVar.f9648b;
                }
            }
        }

        public c A(Object obj) {
            this.v = obj;
            return this;
        }

        public c B(Uri uri) {
            this.f9650b = uri;
            return this;
        }

        public c C(String str) {
            return B(str == null ? null : Uri.parse(str));
        }

        public p1 a() {
            g gVar;
            c.f.a.b.j3.g.g(this.f9657i == null || this.f9659k != null);
            Uri uri = this.f9650b;
            if (uri != null) {
                String str = this.f9651c;
                UUID uuid = this.f9659k;
                e eVar = uuid != null ? new e(uuid, this.f9657i, this.f9658j, this.f9660l, this.f9662n, this.f9661m, this.f9663o, this.p) : null;
                Uri uri2 = this.t;
                gVar = new g(uri, str, eVar, uri2 != null ? new b(uri2, this.u) : null, this.q, this.r, this.s, this.v);
            } else {
                gVar = null;
            }
            String str2 = this.f9649a;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            String str3 = str2;
            d dVar = new d(this.f9652d, this.f9653e, this.f9654f, this.f9655g, this.f9656h);
            f fVar = new f(this.x, this.y, this.z, this.A, this.B);
            q1 q1Var = this.w;
            if (q1Var == null) {
                q1Var = q1.f9729a;
            }
            return new p1(str3, dVar, gVar, fVar, q1Var);
        }

        public c b(Uri uri) {
            return c(uri, null);
        }

        public c c(Uri uri, Object obj) {
            this.t = uri;
            this.u = obj;
            return this;
        }

        public c d(String str) {
            return b(str != null ? Uri.parse(str) : null);
        }

        public c e(long j2) {
            c.f.a.b.j3.g.a(j2 == Long.MIN_VALUE || j2 >= 0);
            this.f9653e = j2;
            return this;
        }

        public c f(long j2) {
            c.f.a.b.j3.g.a(j2 >= 0);
            this.f9652d = j2;
            return this;
        }

        public c g(String str) {
            this.r = str;
            return this;
        }

        public c h(boolean z) {
            this.f9662n = z;
            return this;
        }

        public c i(byte[] bArr) {
            this.p = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
            return this;
        }

        public c j(Map<String, String> map) {
            this.f9658j = (map == null || map.isEmpty()) ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(map));
            return this;
        }

        public c k(Uri uri) {
            this.f9657i = uri;
            return this;
        }

        public c l(String str) {
            this.f9657i = str == null ? null : Uri.parse(str);
            return this;
        }

        public c m(boolean z) {
            this.f9660l = z;
            return this;
        }

        public c n(boolean z) {
            this.f9661m = z;
            return this;
        }

        public c o(List<Integer> list) {
            this.f9663o = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c p(UUID uuid) {
            this.f9659k = uuid;
            return this;
        }

        public c q(long j2) {
            this.z = j2;
            return this;
        }

        public c r(float f2) {
            this.B = f2;
            return this;
        }

        public c s(long j2) {
            this.y = j2;
            return this;
        }

        public c t(float f2) {
            this.A = f2;
            return this;
        }

        public c u(long j2) {
            this.x = j2;
            return this;
        }

        public c v(String str) {
            this.f9649a = (String) c.f.a.b.j3.g.e(str);
            return this;
        }

        public c w(q1 q1Var) {
            this.w = q1Var;
            return this;
        }

        public c x(String str) {
            this.f9651c = str;
            return this;
        }

        public c y(List<c.f.a.b.c3.i0> list) {
            this.q = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c z(List<h> list) {
            this.s = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v0<d> f9664a = new v0() { // from class: c.f.a.b.c0
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f9667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f9668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f9669f;

        public d(long j2, long j3, boolean z, boolean z2, boolean z3) {
            this.f9665b = j2;
            this.f9666c = j3;
            this.f9667d = z;
            this.f9668e = z2;
            this.f9669f = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f9665b == dVar.f9665b && this.f9666c == dVar.f9666c && this.f9667d == dVar.f9667d && this.f9668e == dVar.f9668e && this.f9669f == dVar.f9669f;
        }

        public int hashCode() {
            long j2 = this.f9665b;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.f9666c;
            return ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f9667d ? 1 : 0)) * 31) + (this.f9668e ? 1 : 0)) * 31) + (this.f9669f ? 1 : 0);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f9670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f9671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, String> f9672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f9673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f9674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f9675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<Integer> f9676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f9677h;

        public e(UUID uuid, Uri uri, Map<String, String> map, boolean z, boolean z2, boolean z3, List<Integer> list, byte[] bArr) {
            c.f.a.b.j3.g.a((z2 && uri == null) ? false : true);
            this.f9670a = uuid;
            this.f9671b = uri;
            this.f9672c = map;
            this.f9673d = z;
            this.f9675f = z2;
            this.f9674e = z3;
            this.f9676g = list;
            this.f9677h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public byte[] a() {
            byte[] bArr = this.f9677h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f9670a.equals(eVar.f9670a) && c.f.a.b.j3.x0.b(this.f9671b, eVar.f9671b) && c.f.a.b.j3.x0.b(this.f9672c, eVar.f9672c) && this.f9673d == eVar.f9673d && this.f9675f == eVar.f9675f && this.f9674e == eVar.f9674e && this.f9676g.equals(eVar.f9676g) && Arrays.equals(this.f9677h, eVar.f9677h);
        }

        public int hashCode() {
            int iHashCode = this.f9670a.hashCode() * 31;
            Uri uri = this.f9671b;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f9672c.hashCode()) * 31) + (this.f9673d ? 1 : 0)) * 31) + (this.f9675f ? 1 : 0)) * 31) + (this.f9674e ? 1 : 0)) * 31) + this.f9676g.hashCode()) * 31) + Arrays.hashCode(this.f9677h);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f9678a = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v0<f> f9679b = new v0() { // from class: c.f.a.b.d0
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f9681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f9682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f9683f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f9684g;

        public f(long j2, long j3, long j4, float f2, float f3) {
            this.f9680c = j2;
            this.f9681d = j3;
            this.f9682e = j4;
            this.f9683f = f2;
            this.f9684g = f3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f9680c == fVar.f9680c && this.f9681d == fVar.f9681d && this.f9682e == fVar.f9682e && this.f9683f == fVar.f9683f && this.f9684g == fVar.f9684g;
        }

        public int hashCode() {
            long j2 = this.f9680c;
            long j3 = this.f9681d;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f9682e;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            float f2 = this.f9683f;
            int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f9684g;
            return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f9687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f9688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<c.f.a.b.c3.i0> f9689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f9690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<h> f9691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f9692h;

        public g(Uri uri, String str, e eVar, b bVar, List<c.f.a.b.c3.i0> list, String str2, List<h> list2, Object obj) {
            this.f9685a = uri;
            this.f9686b = str;
            this.f9687c = eVar;
            this.f9688d = bVar;
            this.f9689e = list;
            this.f9690f = str2;
            this.f9691g = list2;
            this.f9692h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f9685a.equals(gVar.f9685a) && c.f.a.b.j3.x0.b(this.f9686b, gVar.f9686b) && c.f.a.b.j3.x0.b(this.f9687c, gVar.f9687c) && c.f.a.b.j3.x0.b(this.f9688d, gVar.f9688d) && this.f9689e.equals(gVar.f9689e) && c.f.a.b.j3.x0.b(this.f9690f, gVar.f9690f) && this.f9691g.equals(gVar.f9691g) && c.f.a.b.j3.x0.b(this.f9692h, gVar.f9692h);
        }

        public int hashCode() {
            int iHashCode = this.f9685a.hashCode() * 31;
            String str = this.f9686b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f9687c;
            int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b bVar = this.f9688d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f9689e.hashCode()) * 31;
            String str2 = this.f9690f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f9691g.hashCode()) * 31;
            Object obj = this.f9692h;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f9693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f9694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f9695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f9698f;

        public h(Uri uri, String str, String str2) {
            this(uri, str, str2, 0);
        }

        public h(Uri uri, String str, String str2, int i2) {
            this(uri, str, str2, i2, 0, null);
        }

        public h(Uri uri, String str, String str2, int i2, int i3, String str3) {
            this.f9693a = uri;
            this.f9694b = str;
            this.f9695c = str2;
            this.f9696d = i2;
            this.f9697e = i3;
            this.f9698f = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f9693a.equals(hVar.f9693a) && this.f9694b.equals(hVar.f9694b) && c.f.a.b.j3.x0.b(this.f9695c, hVar.f9695c) && this.f9696d == hVar.f9696d && this.f9697e == hVar.f9697e && c.f.a.b.j3.x0.b(this.f9698f, hVar.f9698f);
        }

        public int hashCode() {
            int iHashCode = ((this.f9693a.hashCode() * 31) + this.f9694b.hashCode()) * 31;
            String str = this.f9695c;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f9696d) * 31) + this.f9697e) * 31;
            String str2 = this.f9698f;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public p1(String str, d dVar, g gVar, f fVar, q1 q1Var) {
        this.f9642c = str;
        this.f9643d = gVar;
        this.f9644e = fVar;
        this.f9645f = q1Var;
        this.f9646g = dVar;
    }

    public static p1 b(Uri uri) {
        return new c().B(uri).a();
    }

    public static p1 c(String str) {
        return new c().C(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return c.f.a.b.j3.x0.b(this.f9642c, p1Var.f9642c) && this.f9646g.equals(p1Var.f9646g) && c.f.a.b.j3.x0.b(this.f9643d, p1Var.f9643d) && c.f.a.b.j3.x0.b(this.f9644e, p1Var.f9644e) && c.f.a.b.j3.x0.b(this.f9645f, p1Var.f9645f);
    }

    public int hashCode() {
        int iHashCode = this.f9642c.hashCode() * 31;
        g gVar = this.f9643d;
        return ((((((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f9644e.hashCode()) * 31) + this.f9646g.hashCode()) * 31) + this.f9645f.hashCode();
    }
}
