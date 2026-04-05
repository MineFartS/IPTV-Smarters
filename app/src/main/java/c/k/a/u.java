package c.k.a;

import c.k.a.o;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Collections;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f18285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f18286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f18289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f18290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f18291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f18292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f18293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f18294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile d f18295k;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f18296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r f18297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f18299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public n f18300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o.b f18301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public v f18302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public u f18303h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public u f18304i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public u f18305j;

        public b() {
            this.f18298c = -1;
            this.f18301f = new o.b();
        }

        public b(u uVar) {
            this.f18298c = -1;
            this.f18296a = uVar.f18285a;
            this.f18297b = uVar.f18286b;
            this.f18298c = uVar.f18287c;
            this.f18299d = uVar.f18288d;
            this.f18300e = uVar.f18289e;
            this.f18301f = uVar.f18290f.e();
            this.f18302g = uVar.f18291g;
            this.f18303h = uVar.f18292h;
            this.f18304i = uVar.f18293i;
            this.f18305j = uVar.f18294j;
        }

        public b k(String str, String str2) {
            this.f18301f.b(str, str2);
            return this;
        }

        public b l(v vVar) {
            this.f18302g = vVar;
            return this;
        }

        public u m() {
            if (this.f18296a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f18297b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f18298c >= 0) {
                return new u(this);
            }
            throw new IllegalStateException("code < 0: " + this.f18298c);
        }

        public b n(u uVar) {
            if (uVar != null) {
                p("cacheResponse", uVar);
            }
            this.f18304i = uVar;
            return this;
        }

        public final void o(u uVar) {
            if (uVar.f18291g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final void p(String str, u uVar) {
            if (uVar.f18291g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (uVar.f18292h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (uVar.f18293i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (uVar.f18294j == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        public b q(int i2) {
            this.f18298c = i2;
            return this;
        }

        public b r(n nVar) {
            this.f18300e = nVar;
            return this;
        }

        public b s(String str, String str2) {
            this.f18301f.g(str, str2);
            return this;
        }

        public b t(o oVar) {
            this.f18301f = oVar.e();
            return this;
        }

        public b u(String str) {
            this.f18299d = str;
            return this;
        }

        public b v(u uVar) {
            if (uVar != null) {
                p("networkResponse", uVar);
            }
            this.f18303h = uVar;
            return this;
        }

        public b w(u uVar) {
            if (uVar != null) {
                o(uVar);
            }
            this.f18305j = uVar;
            return this;
        }

        public b x(r rVar) {
            this.f18297b = rVar;
            return this;
        }

        public b y(String str) {
            this.f18301f.f(str);
            return this;
        }

        public b z(s sVar) {
            this.f18296a = sVar;
            return this;
        }
    }

    public u(b bVar) {
        this.f18285a = bVar.f18296a;
        this.f18286b = bVar.f18297b;
        this.f18287c = bVar.f18298c;
        this.f18288d = bVar.f18299d;
        this.f18289e = bVar.f18300e;
        this.f18290f = bVar.f18301f.e();
        this.f18291g = bVar.f18302g;
        this.f18292h = bVar.f18303h;
        this.f18293i = bVar.f18304i;
        this.f18294j = bVar.f18305j;
    }

    public v k() {
        return this.f18291g;
    }

    public d l() {
        d dVar = this.f18295k;
        if (dVar != null) {
            return dVar;
        }
        d dVarH = d.h(this.f18290f);
        this.f18295k = dVarH;
        return dVarH;
    }

    public u m() {
        return this.f18293i;
    }

    public List<g> n() {
        String str;
        int i2 = this.f18287c;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i2 != 407) {
                return Collections.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return c.k.a.y.j.j.h(s(), str);
    }

    public int o() {
        return this.f18287c;
    }

    public n p() {
        return this.f18289e;
    }

    public String q(String str) {
        return r(str, null);
    }

    public String r(String str, String str2) {
        String strA = this.f18290f.a(str);
        return strA != null ? strA : str2;
    }

    public o s() {
        return this.f18290f;
    }

    public boolean t() {
        int i2 = this.f18287c;
        if (i2 == 307 || i2 == 308) {
            return true;
        }
        switch (i2) {
            case IjkMediaCodecInfo.RANK_SECURE /* 300 */:
            case Constants.BUCKET_REDIRECT_STATUS_CODE /* 301 */:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public String toString() {
        return "Response{protocol=" + this.f18286b + ", code=" + this.f18287c + ", message=" + this.f18288d + ", url=" + this.f18285a.q() + '}';
    }

    public String u() {
        return this.f18288d;
    }

    public u v() {
        return this.f18292h;
    }

    public b w() {
        return new b();
    }

    public r x() {
        return this.f18286b;
    }

    public s y() {
        return this.f18285a;
    }
}
