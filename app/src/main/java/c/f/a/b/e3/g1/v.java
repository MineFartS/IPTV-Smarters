package c.f.a.b.e3.g1;

import c.f.a.b.j3.x0;
import c.f.b.b.u;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.Headers;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f7694a = new b().e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.b.b.u<String, String> f7695b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u.a<String, String> f7696a = new u.a<>();

        public b b(String str, String str2) {
            this.f7696a.g(v.c(str.trim()), str2.trim());
            return this;
        }

        public b c(List<String> list) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String[] strArrV0 = x0.V0(list.get(i2), ":\\s?");
                if (strArrV0.length == 2) {
                    b(strArrV0[0], strArrV0[1]);
                }
            }
            return this;
        }

        public b d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public v e() {
            return new v(this);
        }
    }

    public v(b bVar) {
        this.f7695b = bVar.f7696a.f();
    }

    public static String c(String str) {
        return c.f.b.a.b.a(str, HttpHeader.ACCEPT) ? HttpHeader.ACCEPT : c.f.b.a.b.a(str, JsonDocumentFields.EFFECT_VALUE_ALLOW) ? JsonDocumentFields.EFFECT_VALUE_ALLOW : c.f.b.a.b.a(str, "Authorization") ? "Authorization" : c.f.b.a.b.a(str, "Bandwidth") ? "Bandwidth" : c.f.b.a.b.a(str, "Blocksize") ? "Blocksize" : c.f.b.a.b.a(str, Headers.CACHE_CONTROL) ? Headers.CACHE_CONTROL : c.f.b.a.b.a(str, Headers.CONNECTION) ? Headers.CONNECTION : c.f.b.a.b.a(str, "Content-Base") ? "Content-Base" : c.f.b.a.b.a(str, "Content-Encoding") ? "Content-Encoding" : c.f.b.a.b.a(str, Headers.CONTENT_LANGUAGE) ? Headers.CONTENT_LANGUAGE : c.f.b.a.b.a(str, "Content-Length") ? "Content-Length" : c.f.b.a.b.a(str, "Content-Location") ? "Content-Location" : c.f.b.a.b.a(str, "Content-Type") ? "Content-Type" : c.f.b.a.b.a(str, "CSeq") ? "CSeq" : c.f.b.a.b.a(str, "Date") ? "Date" : c.f.b.a.b.a(str, Headers.EXPIRES) ? Headers.EXPIRES : c.f.b.a.b.a(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : c.f.b.a.b.a(str, "Proxy-Require") ? "Proxy-Require" : c.f.b.a.b.a(str, "Public") ? "Public" : c.f.b.a.b.a(str, Headers.RANGE) ? Headers.RANGE : c.f.b.a.b.a(str, "RTP-Info") ? "RTP-Info" : c.f.b.a.b.a(str, "RTCP-Interval") ? "RTCP-Interval" : c.f.b.a.b.a(str, "Scale") ? "Scale" : c.f.b.a.b.a(str, "Session") ? "Session" : c.f.b.a.b.a(str, "Speed") ? "Speed" : c.f.b.a.b.a(str, "Supported") ? "Supported" : c.f.b.a.b.a(str, "Timestamp") ? "Timestamp" : c.f.b.a.b.a(str, "Transport") ? "Transport" : c.f.b.a.b.a(str, HttpHeader.USER_AGENT) ? HttpHeader.USER_AGENT : c.f.b.a.b.a(str, "Via") ? "Via" : c.f.b.a.b.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public c.f.b.b.u<String, String> b() {
        return this.f7695b;
    }

    public String d(String str) {
        c.f.b.b.t<String> tVarE = e(str);
        if (tVarE.isEmpty()) {
            return null;
        }
        return (String) c.f.b.b.y.c(tVarE);
    }

    public c.f.b.b.t<String> e(String str) {
        return this.f7695b.get(c(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f7695b.equals(((v) obj).f7695b);
        }
        return false;
    }

    public int hashCode() {
        return this.f7695b.hashCode();
    }
}
