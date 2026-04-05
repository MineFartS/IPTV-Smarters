package k;

import com.amazonaws.services.s3.Headers;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class w extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f30978a = v.c("multipart/mixed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f30979b = v.c("multipart/alternative");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f30980c = v.c("multipart/digest");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f30981d = v.c("multipart/parallel");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f30982e = v.c("multipart/form-data");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f30983f = {58, 32};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f30984g = {DateTimeFieldType.HALFDAY_OF_DAY, 10};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f30985h = {45, 45};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l.f f30986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f30987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v f30988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<b> f30989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f30990m = -1;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l.f f30991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public v f30992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f30993c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a(String str) {
            this.f30992b = w.f30978a;
            this.f30993c = new ArrayList();
            this.f30991a = l.f.s(str);
        }

        public a a(String str, String str2) {
            return d(b.b(str, str2));
        }

        public a b(String str, @Nullable String str2, b0 b0Var) {
            return d(b.c(str, str2, b0Var));
        }

        public a c(@Nullable s sVar, b0 b0Var) {
            return d(b.a(sVar, b0Var));
        }

        public a d(b bVar) {
            if (bVar == null) {
                throw new NullPointerException("part == null");
            }
            this.f30993c.add(bVar);
            return this;
        }

        public w e() {
            if (this.f30993c.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new w(this.f30991a, this.f30992b, this.f30993c);
        }

        public a f(v vVar) {
            if (vVar == null) {
                throw new NullPointerException("type == null");
            }
            if (vVar.d().equals("multipart")) {
                this.f30992b = vVar;
                return this;
            }
            throw new IllegalArgumentException("multipart != " + vVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final s f30994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f30995b;

        public b(@Nullable s sVar, b0 b0Var) {
            this.f30994a = sVar;
            this.f30995b = b0Var;
        }

        public static b a(@Nullable s sVar, b0 b0Var) {
            if (b0Var == null) {
                throw new NullPointerException("body == null");
            }
            if (sVar != null && sVar.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (sVar == null || sVar.a("Content-Length") == null) {
                return new b(sVar, b0Var);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static b b(String str, String str2) {
            return c(str, null, b0.d(null, str2));
        }

        public static b c(String str, @Nullable String str2, b0 b0Var) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            w.i(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                w.i(sb, str2);
            }
            return a(s.e(Headers.CONTENT_DISPOSITION, sb.toString()), b0Var);
        }
    }

    public w(l.f fVar, v vVar, List<b> list) {
        this.f30986i = fVar;
        this.f30987j = vVar;
        this.f30988k = v.c(vVar + "; boundary=" + fVar.E());
        this.f30989l = k.g0.c.n(list);
    }

    public static StringBuilder i(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\n') {
                str2 = "%0A";
            } else if (cCharAt == '\r') {
                str2 = "%0D";
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb;
    }

    @Override // k.b0
    public long a() {
        long j2 = this.f30990m;
        if (j2 != -1) {
            return j2;
        }
        long j3 = j(null, true);
        this.f30990m = j3;
        return j3;
    }

    @Override // k.b0
    public v b() {
        return this.f30988k;
    }

    @Override // k.b0
    public void h(l.d dVar) {
        j(dVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long j(@Nullable l.d dVar, boolean z) {
        l.c cVar;
        if (z) {
            dVar = new l.c();
            cVar = dVar;
        } else {
            cVar = 0;
        }
        int size = this.f30989l.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f30989l.get(i2);
            s sVar = bVar.f30994a;
            b0 b0Var = bVar.f30995b;
            dVar.i0(f30985h);
            dVar.j0(this.f30986i);
            dVar.i0(f30984g);
            if (sVar != null) {
                int iF = sVar.f();
                for (int i3 = 0; i3 < iF; i3++) {
                    dVar.P(sVar.c(i3)).i0(f30983f).P(sVar.g(i3)).i0(f30984g);
                }
            }
            v vVarB = b0Var.b();
            if (vVarB != null) {
                dVar.P("Content-Type: ").P(vVarB.toString()).i0(f30984g);
            }
            long jA = b0Var.a();
            if (jA != -1) {
                dVar.P("Content-Length: ").x0(jA).i0(f30984g);
            } else if (z) {
                cVar.l();
                return -1L;
            }
            byte[] bArr = f30984g;
            dVar.i0(bArr);
            if (z) {
                j2 += jA;
            } else {
                b0Var.h(dVar);
            }
            dVar.i0(bArr);
        }
        byte[] bArr2 = f30985h;
        dVar.i0(bArr2);
        dVar.j0(this.f30986i);
        dVar.i0(bArr2);
        dVar.i0(f30984g);
        if (!z) {
            return j2;
        }
        long jH0 = j2 + cVar.H0();
        cVar.l();
        return jH0;
    }
}
