package o;

import javax.annotation.Nullable;
import k.a0;
import k.b0;
import k.q;
import k.s;
import k.t;
import k.v;
import k.w;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f31297a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f31300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public t.a f31301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0.a f31302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public v f31303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f31304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public w.a f31305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public q.a f31306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public b0 f31307k;

    /* JADX INFO: loaded from: classes2.dex */
    public static class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f31308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f31309b;

        public a(b0 b0Var, v vVar) {
            this.f31308a = b0Var;
            this.f31309b = vVar;
        }

        @Override // k.b0
        public long a() {
            return this.f31308a.a();
        }

        @Override // k.b0
        public v b() {
            return this.f31309b;
        }

        @Override // k.b0
        public void h(l.d dVar) {
            this.f31308a.h(dVar);
        }
    }

    public k(String str, t tVar, @Nullable String str2, @Nullable s sVar, @Nullable v vVar, boolean z, boolean z2, boolean z3) {
        this.f31298b = str;
        this.f31299c = tVar;
        this.f31300d = str2;
        a0.a aVar = new a0.a();
        this.f31302f = aVar;
        this.f31303g = vVar;
        this.f31304h = z;
        if (sVar != null) {
            aVar.f(sVar);
        }
        if (z2) {
            this.f31306j = new q.a();
        } else if (z3) {
            w.a aVar2 = new w.a();
            this.f31305i = aVar2;
            aVar2.f(w.f30982e);
        }
    }

    public static String h(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                l.c cVar = new l.c();
                cVar.U0(str, 0, iCharCount);
                i(cVar, str, iCharCount, length, z);
                return cVar.D0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public static void i(l.c cVar, String str, int i2, int i3, boolean z) {
        l.c cVar2 = null;
        while (i2 < i3) {
            int iCodePointAt = str.codePointAt(i2);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (cVar2 == null) {
                        cVar2 = new l.c();
                    }
                    cVar2.V0(iCodePointAt);
                    while (!cVar2.H()) {
                        int iT = cVar2.T() & 255;
                        cVar.I(37);
                        char[] cArr = f31297a;
                        cVar.I(cArr[(iT >> 4) & 15]);
                        cVar.I(cArr[iT & 15]);
                    }
                } else {
                    cVar.V0(iCodePointAt);
                }
            }
            i2 += Character.charCount(iCodePointAt);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            this.f31306j.b(str, str2);
        } else {
            this.f31306j.a(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f31302f.a(str, str2);
            return;
        }
        v vVarC = v.c(str2);
        if (vVarC != null) {
            this.f31303g = vVarC;
            return;
        }
        throw new IllegalArgumentException("Malformed content type: " + str2);
    }

    public void c(s sVar, b0 b0Var) {
        this.f31305i.c(sVar, b0Var);
    }

    public void d(w.b bVar) {
        this.f31305i.d(bVar);
    }

    public void e(String str, String str2, boolean z) {
        String str3 = this.f31300d;
        if (str3 == null) {
            throw new AssertionError();
        }
        this.f31300d = str3.replace("{" + str + "}", h(str2, z));
    }

    public void f(String str, @Nullable String str2, boolean z) {
        String str3 = this.f31300d;
        if (str3 != null) {
            t.a aVarP = this.f31299c.p(str3);
            this.f31301e = aVarP;
            if (aVarP == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f31299c + ", Relative: " + this.f31300d);
            }
            this.f31300d = null;
        }
        if (z) {
            this.f31301e.a(str, str2);
        } else {
            this.f31301e.b(str, str2);
        }
    }

    public a0 g() {
        t tVarC;
        t.a aVar = this.f31301e;
        if (aVar != null) {
            tVarC = aVar.c();
        } else {
            tVarC = this.f31299c.C(this.f31300d);
            if (tVarC == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f31299c + ", Relative: " + this.f31300d);
            }
        }
        b0 aVar2 = this.f31307k;
        if (aVar2 == null) {
            q.a aVar3 = this.f31306j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                w.a aVar4 = this.f31305i;
                if (aVar4 != null) {
                    aVar2 = aVar4.e();
                } else if (this.f31304h) {
                    aVar2 = b0.f(null, new byte[0]);
                }
            }
        }
        v vVar = this.f31303g;
        if (vVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, vVar);
            } else {
                this.f31302f.a("Content-Type", vVar.toString());
            }
        }
        return this.f31302f.k(tVarC).g(this.f31298b, aVar2).b();
    }

    public void j(b0 b0Var) {
        this.f31307k = b0Var;
    }

    public void k(Object obj) {
        this.f31300d = obj.toString();
    }
}
