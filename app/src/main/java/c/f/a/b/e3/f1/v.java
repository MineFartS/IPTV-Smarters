package c.f.a.b.e3.f1;

import android.text.TextUtils;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.u0;
import c.f.a.b.k1;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements c.f.a.b.z2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7355a = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7356b = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f7358d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.f.a.b.z2.l f7360f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7362h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f7359e = new i0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f7361g = new byte[1024];

    public v(String str, u0 u0Var) {
        this.f7357c = str;
        this.f7358d = u0Var;
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        throw new IllegalStateException();
    }

    @RequiresNonNull({"output"})
    public final a0 b(long j2) {
        a0 a0VarE = this.f7360f.e(0, 3);
        a0VarE.e(new k1.b().e0("text/vtt").V(this.f7357c).i0(j2).E());
        this.f7360f.p();
        return a0VarE;
    }

    @Override // c.f.a.b.z2.j
    public void c(c.f.a.b.z2.l lVar) {
        this.f7360f = lVar;
        lVar.i(new x.b(-9223372036854775807L));
    }

    @RequiresNonNull({"output"})
    public final void d() throws w1 {
        i0 i0Var = new i0(this.f7361g);
        c.f.a.b.f3.v.j.e(i0Var);
        long jF = 0;
        long jD = 0;
        for (String strP = i0Var.p(); !TextUtils.isEmpty(strP); strP = i0Var.p()) {
            if (strP.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f7355a.matcher(strP);
                if (!matcher.find()) {
                    throw w1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strP, null);
                }
                Matcher matcher2 = f7356b.matcher(strP);
                if (!matcher2.find()) {
                    throw w1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strP, null);
                }
                jD = c.f.a.b.f3.v.j.d((String) c.f.a.b.j3.g.e(matcher.group(1)));
                jF = u0.f(Long.parseLong((String) c.f.a.b.j3.g.e(matcher2.group(1))));
            }
        }
        Matcher matcherA = c.f.a.b.f3.v.j.a(i0Var);
        if (matcherA == null) {
            b(0L);
            return;
        }
        long jD2 = c.f.a.b.f3.v.j.d((String) c.f.a.b.j3.g.e(matcherA.group(1)));
        long jB = this.f7358d.b(u0.j((jF + jD2) - jD));
        a0 a0VarB = b(jB - jD2);
        this.f7359e.N(this.f7361g, this.f7362h);
        a0VarB.c(this.f7359e, this.f7362h);
        a0VarB.d(jB, 1, this.f7362h, 0, null);
    }

    @Override // c.f.a.b.z2.j
    public boolean e(c.f.a.b.z2.k kVar) {
        kVar.i(this.f7361g, 0, 6, false);
        this.f7359e.N(this.f7361g, 6);
        if (c.f.a.b.f3.v.j.b(this.f7359e)) {
            return true;
        }
        kVar.i(this.f7361g, 6, 3, false);
        this.f7359e.N(this.f7361g, 9);
        return c.f.a.b.f3.v.j.b(this.f7359e);
    }

    @Override // c.f.a.b.z2.j
    public int g(c.f.a.b.z2.k kVar, w wVar) throws w1 {
        c.f.a.b.j3.g.e(this.f7360f);
        int length = (int) kVar.getLength();
        int i2 = this.f7362h;
        byte[] bArr = this.f7361g;
        if (i2 == bArr.length) {
            this.f7361g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f7361g;
        int i3 = this.f7362h;
        int iB = kVar.b(bArr2, i3, bArr2.length - i3);
        if (iB != -1) {
            int i4 = this.f7362h + iB;
            this.f7362h = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        d();
        return -1;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
