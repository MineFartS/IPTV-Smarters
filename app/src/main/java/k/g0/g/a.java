package k.g0.g;

import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.Headers;
import java.util.List;
import k.a0;
import k.b0;
import k.c0;
import k.l;
import k.m;
import k.s;
import k.u;
import k.v;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f30634a;

    public a(m mVar) {
        this.f30634a = mVar;
    }

    @Override // k.u
    public c0 a(u.a aVar) {
        a0 a0VarRequest = aVar.request();
        a0.a aVarG = a0VarRequest.g();
        b0 b0VarA = a0VarRequest.a();
        if (b0VarA != null) {
            v vVarB = b0VarA.b();
            if (vVarB != null) {
                aVarG.e("Content-Type", vVarB.toString());
            }
            long jA = b0VarA.a();
            if (jA != -1) {
                aVarG.e("Content-Length", Long.toString(jA));
                aVarG.i("Transfer-Encoding");
            } else {
                aVarG.e("Transfer-Encoding", "chunked");
                aVarG.i("Content-Length");
            }
        }
        boolean z = false;
        if (a0VarRequest.c(HttpHeader.HOST) == null) {
            aVarG.e(HttpHeader.HOST, k.g0.c.m(a0VarRequest.h(), false));
        }
        if (a0VarRequest.c(Headers.CONNECTION) == null) {
            aVarG.e(Headers.CONNECTION, "Keep-Alive");
        }
        if (a0VarRequest.c("Accept-Encoding") == null && a0VarRequest.c(Headers.RANGE) == null) {
            z = true;
            aVarG.e("Accept-Encoding", "gzip");
        }
        List<l> listB = this.f30634a.b(a0VarRequest.h());
        if (!listB.isEmpty()) {
            aVarG.e("Cookie", b(listB));
        }
        if (a0VarRequest.c(HttpHeader.USER_AGENT) == null) {
            aVarG.e(HttpHeader.USER_AGENT, k.g0.d.a());
        }
        c0 c0VarA = aVar.a(aVarG.b());
        e.e(this.f30634a, a0VarRequest.h(), c0VarA.p());
        c0.a aVarO = c0VarA.r().o(a0VarRequest);
        if (z && "gzip".equalsIgnoreCase(c0VarA.n("Content-Encoding")) && e.c(c0VarA)) {
            l.k kVar = new l.k(c0VarA.d().p());
            s sVarD = c0VarA.p().d().f("Content-Encoding").f("Content-Length").d();
            aVarO.i(sVarD);
            aVarO.b(new h(sVarD, l.m.c(kVar)));
        }
        return aVarO.c();
    }

    public final String b(List<l> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append("; ");
            }
            l lVar = list.get(i2);
            sb.append(lVar.c());
            sb.append('=');
            sb.append(lVar.k());
        }
        return sb.toString();
    }
}
