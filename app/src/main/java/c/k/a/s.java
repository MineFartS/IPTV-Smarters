package c.k.a;

import c.k.a.o;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.Headers;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f18271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f18272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f18273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile URL f18274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile URI f18275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile d f18276h;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public URL f18278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o.b f18280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t f18281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f18282f;

        public b() {
            this.f18279c = "GET";
            this.f18280d = new o.b();
        }

        public b(s sVar) {
            this.f18277a = sVar.f18269a;
            this.f18278b = sVar.f18274f;
            this.f18279c = sVar.f18270b;
            this.f18281e = sVar.f18272d;
            this.f18282f = sVar.f18273e;
            this.f18280d = sVar.f18271c.e();
        }

        public b g(String str, String str2) {
            this.f18280d.b(str, str2);
            return this;
        }

        public s h() {
            if (this.f18277a != null) {
                return new s(this);
            }
            throw new IllegalStateException("url == null");
        }

        public b i(d dVar) {
            String string = dVar.toString();
            return string.isEmpty() ? m(Headers.CACHE_CONTROL) : j(Headers.CACHE_CONTROL, string);
        }

        public b j(String str, String str2) {
            this.f18280d.g(str, str2);
            return this;
        }

        public b k(o oVar) {
            this.f18280d = oVar.e();
            return this;
        }

        public b l(String str, t tVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (tVar != null && !c.k.a.y.j.h.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (tVar == null && c.k.a.y.j.h.b(str)) {
                tVar = t.c(null, c.k.a.y.h.f18364a);
            }
            this.f18279c = str;
            this.f18281e = tVar;
            return this;
        }

        public b m(String str) {
            this.f18280d.f(str);
            return this;
        }

        public b n(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f18277a = str;
            return this;
        }

        public b o(URL url) {
            if (url == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f18278b = url;
            this.f18277a = url.toString();
            return this;
        }
    }

    public s(b bVar) {
        this.f18269a = bVar.f18277a;
        this.f18270b = bVar.f18279c;
        this.f18271c = bVar.f18280d.e();
        this.f18272d = bVar.f18281e;
        this.f18273e = bVar.f18282f != null ? bVar.f18282f : this;
        this.f18274f = bVar.f18278b;
    }

    public t g() {
        return this.f18272d;
    }

    public d h() {
        d dVar = this.f18276h;
        if (dVar != null) {
            return dVar;
        }
        d dVarH = d.h(this.f18271c);
        this.f18276h = dVarH;
        return dVarH;
    }

    public String i(String str) {
        return this.f18271c.a(str);
    }

    public o j() {
        return this.f18271c;
    }

    public List<String> k(String str) {
        return this.f18271c.h(str);
    }

    public boolean l() {
        return p().getProtocol().equals(ClientConstants.DOMAIN_SCHEME);
    }

    public String m() {
        return this.f18270b;
    }

    public b n() {
        return new b();
    }

    public URI o() throws IOException {
        try {
            URI uri = this.f18275g;
            if (uri != null) {
                return uri;
            }
            URI uriJ = c.k.a.y.f.e().j(p());
            this.f18275g = uriJ;
            return uriJ;
        } catch (URISyntaxException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public URL p() {
        try {
            URL url = this.f18274f;
            if (url != null) {
                return url;
            }
            URL url2 = new URL(this.f18269a);
            this.f18274f = url2;
            return url2;
        } catch (MalformedURLException e2) {
            throw new RuntimeException("Malformed URL: " + this.f18269a, e2);
        }
    }

    public String q() {
        return this.f18269a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f18270b);
        sb.append(", url=");
        sb.append(this.f18269a);
        sb.append(", tag=");
        Object obj = this.f18273e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
