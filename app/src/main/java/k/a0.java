package k;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import javax.annotation.Nullable;
import k.s;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f30468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final b0 f30469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f30470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile d f30471f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f30472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s.a f30474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b0 f30475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f30476e;

        public a() {
            this.f30473b = "GET";
            this.f30474c = new s.a();
        }

        public a(a0 a0Var) {
            this.f30472a = a0Var.f30466a;
            this.f30473b = a0Var.f30467b;
            this.f30475d = a0Var.f30469d;
            this.f30476e = a0Var.f30470e;
            this.f30474c = a0Var.f30468c.d();
        }

        public a a(String str, String str2) {
            this.f30474c.a(str, str2);
            return this;
        }

        public a0 b() {
            if (this.f30472a != null) {
                return new a0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a c() {
            return d(k.g0.c.f30558d);
        }

        public a d(@Nullable b0 b0Var) {
            return g("DELETE", b0Var);
        }

        public a e(String str, String str2) {
            this.f30474c.g(str, str2);
            return this;
        }

        public a f(s sVar) {
            this.f30474c = sVar.d();
            return this;
        }

        public a g(String str, @Nullable b0 b0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (b0Var != null && !k.g0.g.f.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (b0Var != null || !k.g0.g.f.e(str)) {
                this.f30473b = str;
                this.f30475d = b0Var;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        public a h(b0 b0Var) {
            return g(ClientConstants.HTTP_REQUEST_TYPE_POST, b0Var);
        }

        public a i(String str) {
            this.f30474c.f(str);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public k.a0.a j(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L61
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 3
                java.lang.String r3 = "ws:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L26
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "http:"
                r0.append(r1)
                r1 = 3
            L1a:
                java.lang.String r7 = r7.substring(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                goto L3f
            L26:
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 4
                java.lang.String r3 = "wss:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L3f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "https:"
                r0.append(r1)
                r1 = 4
                goto L1a
            L3f:
                k.t r0 = k.t.q(r7)
                if (r0 == 0) goto L4a
                k.a0$a r7 = r6.k(r0)
                return r7
            L4a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected url: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L61:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                goto L6a
            L69:
                throw r7
            L6a:
                goto L69
            */
            throw new UnsupportedOperationException("Method not decompiled: k.a0.a.j(java.lang.String):k.a0$a");
        }

        public a k(t tVar) {
            if (tVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f30472a = tVar;
            return this;
        }
    }

    public a0(a aVar) {
        this.f30466a = aVar.f30472a;
        this.f30467b = aVar.f30473b;
        this.f30468c = aVar.f30474c.d();
        this.f30469d = aVar.f30475d;
        Object obj = aVar.f30476e;
        this.f30470e = obj == null ? this : obj;
    }

    @Nullable
    public b0 a() {
        return this.f30469d;
    }

    public d b() {
        d dVar = this.f30471f;
        if (dVar != null) {
            return dVar;
        }
        d dVarK = d.k(this.f30468c);
        this.f30471f = dVarK;
        return dVarK;
    }

    public String c(String str) {
        return this.f30468c.a(str);
    }

    public s d() {
        return this.f30468c;
    }

    public boolean e() {
        return this.f30466a.m();
    }

    public String f() {
        return this.f30467b;
    }

    public a g() {
        return new a(this);
    }

    public t h() {
        return this.f30466a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f30467b);
        sb.append(", url=");
        sb.append(this.f30466a);
        sb.append(", tag=");
        Object obj = this.f30470e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
