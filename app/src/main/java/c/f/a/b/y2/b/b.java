package c.f.a.b.y2.b;

import android.net.Uri;
import android.text.TextUtils;
import c.f.a.b.i1;
import c.f.a.b.i3.c0;
import c.f.a.b.i3.d0;
import c.f.a.b.i3.j;
import c.f.a.b.i3.n0;
import c.f.a.b.i3.q;
import c.f.a.b.i3.s;
import c.f.a.b.i3.x;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i;
import c.f.a.b.j3.l;
import c.f.a.b.j3.x0;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.Headers;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes.dex */
public class b extends j implements c0 {
    public IOException A;
    public boolean B;
    public volatile long C;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final UrlRequest.Callback f10478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CronetEngine f10479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f10480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f10483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f10485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c0.f f10487o;
    public final c0.f p;
    public final l q;
    public final i r;
    public c.f.b.a.l<String> s;
    public final boolean t;
    public boolean u;
    public long v;
    public UrlRequest w;
    public s x;
    public ByteBuffer y;
    public UrlResponseInfo z;

    public static class a extends UrlRequest.StatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f10488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f10489b;

        public a(int[] iArr, l lVar) {
            this.f10488a = iArr;
            this.f10489b = lVar;
        }

        @Override // org.chromium.net.UrlRequest.StatusListener
        public void onStatus(int i2) {
            this.f10488a[0] = i2;
            this.f10489b.f();
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.y2.b.b$b, reason: collision with other inner class name */
    public static final class C0142b implements c0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CronetEngine f10490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f10491b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c0.b f10494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c.f.b.a.l<String> f10495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public n0 f10496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f10497h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f10502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f10503n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0.f f10492c = new c0.f();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x.b f10493d = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10498i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f10499j = 8000;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10500k = 8000;

        public C0142b(CronetEngine cronetEngine, Executor executor) {
            this.f10490a = (CronetEngine) g.e(cronetEngine);
            this.f10491b = executor;
        }

        @Override // c.f.a.b.i3.p.a
        public c0 a() {
            if (this.f10490a == null) {
                c0.b bVar = this.f10494e;
                return bVar != null ? bVar.a() : ((x.b) g.e(this.f10493d)).a();
            }
            b bVar2 = new b(this.f10490a, this.f10491b, this.f10498i, this.f10499j, this.f10500k, this.f10501l, this.f10502m, this.f10497h, this.f10492c, this.f10495f, this.f10503n);
            n0 n0Var = this.f10496g;
            if (n0Var != null) {
                bVar2.h(n0Var);
            }
            return bVar2;
        }
    }

    public static final class c extends c0.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10504e;

        public c(s sVar, int i2, int i3) {
            super(sVar, i2, 1);
            this.f10504e = i3;
        }

        public c(IOException iOException, s sVar, int i2, int i3) {
            super(iOException, sVar, i2, 1);
            this.f10504e = i3;
        }

        public c(String str, s sVar, int i2, int i3) {
            super(str, sVar, i2, 1);
            this.f10504e = i3;
        }
    }

    public final class d extends UrlRequest.Callback {
        public d() {
        }

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            if (urlRequest != b.this.w) {
                return;
            }
            if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
                b.this.A = new UnknownHostException();
            } else {
                b.this.A = cronetException;
            }
            b.this.q.f();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (urlRequest != b.this.w) {
                return;
            }
            b.this.q.f();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            if (urlRequest != b.this.w) {
                return;
            }
            UrlRequest urlRequest2 = (UrlRequest) g.e(b.this.w);
            s sVar = (s) g.e(b.this.x);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (sVar.f9063c == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                b.this.A = new c0.e(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getAllHeaders(), sVar, x0.f9301f);
                b.this.q.f();
                return;
            }
            if (b.this.f10484l) {
                b.this.W();
            }
            boolean z = b.this.t && sVar.f9063c == 2 && httpStatusCode == 302;
            if (!z && !b.this.f10485m) {
                urlRequest.followRedirect();
                return;
            }
            String strT = b.T(urlResponseInfo.getAllHeaders().get("Set-Cookie"));
            if (!z && TextUtils.isEmpty(strT)) {
                urlRequest.followRedirect();
                return;
            }
            urlRequest2.cancel();
            try {
                UrlRequest.Builder builderO = b.this.O((z || sVar.f9063c != 2) ? sVar.g(Uri.parse(str)) : sVar.a().j(str).d(1).c(null).a());
                b.M(builderO, strT);
                b.this.w = builderO.build();
                b.this.w.start();
            } catch (IOException e2) {
                b.this.A = e2;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (urlRequest != b.this.w) {
                return;
            }
            b.this.z = urlResponseInfo;
            b.this.q.f();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (urlRequest != b.this.w) {
                return;
            }
            b.this.B = true;
            b.this.q.f();
        }
    }

    static {
        i1.a("goog.exo.cronet");
    }

    public b(CronetEngine cronetEngine, Executor executor, int i2, int i3, int i4, boolean z, boolean z2, String str, c0.f fVar, c.f.b.a.l<String> lVar, boolean z3) {
        super(true);
        this.f10479g = (CronetEngine) g.e(cronetEngine);
        this.f10480h = (Executor) g.e(executor);
        this.f10481i = i2;
        this.f10482j = i3;
        this.f10483k = i4;
        this.f10484l = z;
        this.f10485m = z2;
        this.f10486n = str;
        this.f10487o = fVar;
        this.s = lVar;
        this.t = z3;
        this.r = i.f9202a;
        this.f10478f = new d(this, null);
        this.p = new c0.f();
        this.q = new l();
    }

    public static void M(UrlRequest.Builder builder, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        builder.addHeader("Cookie", str);
    }

    public static String P(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int R(UrlRequest urlRequest) {
        l lVar = new l();
        int[] iArr = new int[1];
        urlRequest.getStatus(new a(iArr, lVar));
        lVar.a();
        return iArr[0];
    }

    public static boolean S(UrlResponseInfo urlResponseInfo) {
        Iterator<Map.Entry<String, String>> it = urlResponseInfo.getAllHeadersAsList().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equalsIgnoreCase("Content-Encoding")) {
                return !r0.getValue().equalsIgnoreCase("identity");
            }
        }
        return false;
    }

    public static String T(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(";", list);
    }

    public final boolean N() {
        long jB = this.r.b();
        boolean zB = false;
        while (!zB && jB < this.C) {
            zB = this.q.b((this.C - jB) + 5);
            jB = this.r.b();
        }
        return zB;
    }

    public UrlRequest.Builder O(s sVar) throws c {
        UrlRequest.Builder builderAllowDirectExecutor = this.f10479g.newUrlRequestBuilder(sVar.f9061a.toString(), this.f10478f, this.f10480h).setPriority(this.f10481i).allowDirectExecutor();
        HashMap map = new HashMap();
        c0.f fVar = this.f10487o;
        if (fVar != null) {
            map.putAll(fVar.a());
        }
        map.putAll(this.p.a());
        map.putAll(sVar.f9065e);
        for (Map.Entry entry : map.entrySet()) {
            builderAllowDirectExecutor.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (sVar.f9064d != null && !map.containsKey("Content-Type")) {
            throw new c("HTTP request with non-empty body must set Content-Type", sVar, 1004, 0);
        }
        String strA = d0.a(sVar.f9067g, sVar.f9068h);
        if (strA != null) {
            builderAllowDirectExecutor.addHeader(Headers.RANGE, strA);
        }
        String str = this.f10486n;
        if (str != null) {
            builderAllowDirectExecutor.addHeader(HttpHeader.USER_AGENT, str);
        }
        builderAllowDirectExecutor.setHttpMethod(sVar.b());
        byte[] bArr = sVar.f9064d;
        if (bArr != null) {
            builderAllowDirectExecutor.setUploadDataProvider(new c.f.a.b.y2.b.a(bArr), this.f10480h);
        }
        return builderAllowDirectExecutor;
    }

    public final ByteBuffer Q() {
        if (this.y == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.y = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.y;
    }

    public final void U(ByteBuffer byteBuffer, s sVar) throws c0.c {
        IOException cVar;
        ((UrlRequest) x0.i(this.w)).read(byteBuffer);
        try {
            if (!this.q.b(this.f10483k)) {
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException unused) {
            if (byteBuffer == this.y) {
                this.y = null;
            }
            Thread.currentThread().interrupt();
            cVar = new InterruptedIOException();
            this.A = cVar;
        } catch (SocketTimeoutException e2) {
            if (byteBuffer == this.y) {
                this.y = null;
            }
            cVar = new c0.c(e2, sVar, AdError.CACHE_ERROR_CODE, 2);
            this.A = cVar;
        }
        IOException iOException = this.A;
        if (iOException != null) {
            if (!(iOException instanceof c0.c)) {
                throw c0.c.b(iOException, sVar, 2);
            }
            throw ((c0.c) iOException);
        }
    }

    public final byte[] V() throws c0.c {
        byte[] bArrCopyOf = x0.f9301f;
        ByteBuffer byteBufferQ = Q();
        while (!this.B) {
            this.q.d();
            byteBufferQ.clear();
            U(byteBufferQ, (s) x0.i(this.x));
            byteBufferQ.flip();
            if (byteBufferQ.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + byteBufferQ.remaining());
                byteBufferQ.get(bArrCopyOf, length, byteBufferQ.remaining());
            }
        }
        return bArrCopyOf;
    }

    public final void W() {
        this.C = this.r.b() + ((long) this.f10482j);
    }

    public final void X(long j2, s sVar) throws c0.c {
        if (j2 == 0) {
            return;
        }
        ByteBuffer byteBufferQ = Q();
        while (j2 > 0) {
            try {
                this.q.d();
                byteBufferQ.clear();
                U(byteBufferQ, sVar);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.B) {
                    throw new c(sVar, AdError.REMOTE_ADS_SERVICE_ERROR, 14);
                }
                byteBufferQ.flip();
                g.g(byteBufferQ.hasRemaining());
                int iMin = (int) Math.min(byteBufferQ.remaining(), j2);
                byteBufferQ.position(byteBufferQ.position() + iMin);
                j2 -= (long) iMin;
            } catch (IOException e2) {
                if (e2 instanceof c0.c) {
                    throw ((c0.c) e2);
                }
                throw new c(e2, sVar, e2 instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : AdError.INTERNAL_ERROR_CODE, 14);
            }
        }
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        UrlResponseInfo urlResponseInfo = this.z;
        if (urlResponseInfo == null) {
            return null;
        }
        return Uri.parse(urlResponseInfo.getUrl());
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws c0.c {
        g.g(this.u);
        if (i3 == 0) {
            return 0;
        }
        if (this.v == 0) {
            return -1;
        }
        ByteBuffer byteBufferQ = Q();
        if (!byteBufferQ.hasRemaining()) {
            this.q.d();
            byteBufferQ.clear();
            U(byteBufferQ, (s) x0.i(this.x));
            if (this.B) {
                this.v = 0L;
                return -1;
            }
            byteBufferQ.flip();
            g.g(byteBufferQ.hasRemaining());
        }
        long[] jArr = new long[3];
        long j2 = this.v;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        jArr[0] = j2;
        jArr[1] = byteBufferQ.remaining();
        jArr[2] = i3;
        int iD = (int) c.f.b.f.d.d(jArr);
        byteBufferQ.get(bArr, i2, iD);
        long j3 = this.v;
        if (j3 != -1) {
            this.v = j3 - ((long) iD);
        }
        v(iD);
        return iD;
    }

    @Override // c.f.a.b.i3.p
    public synchronized void close() {
        UrlRequest urlRequest = this.w;
        if (urlRequest != null) {
            urlRequest.cancel();
            this.w = null;
        }
        ByteBuffer byteBuffer = this.y;
        if (byteBuffer != null) {
            byteBuffer.limit(0);
        }
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = false;
        if (this.u) {
            this.u = false;
            w();
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws c0.c {
        byte[] bArrV;
        String strP;
        g.e(sVar);
        g.g(!this.u);
        this.q.d();
        W();
        this.x = sVar;
        try {
            UrlRequest urlRequestBuild = O(sVar).build();
            this.w = urlRequestBuild;
            urlRequestBuild.start();
            x(sVar);
            try {
                boolean zN = N();
                IOException iOException = this.A;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !c.f.b.a.b.e(message).contains("err_cleartext_not_permitted")) {
                        throw new c(iOException, sVar, AdError.INTERNAL_ERROR_CODE, R(urlRequestBuild));
                    }
                    throw new c0.a(iOException, sVar);
                }
                if (!zN) {
                    throw new c(new SocketTimeoutException(), sVar, AdError.CACHE_ERROR_CODE, R(urlRequestBuild));
                }
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) g.e(this.z);
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                long j2 = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (sVar.f9067g == d0.c(P(allHeaders, Headers.CONTENT_RANGE))) {
                            this.u = true;
                            y(sVar);
                            long j3 = sVar.f9068h;
                            if (j3 != -1) {
                                return j3;
                            }
                            return 0L;
                        }
                    }
                    try {
                        bArrV = V();
                    } catch (IOException unused) {
                        bArrV = x0.f9301f;
                    }
                    throw new c0.e(httpStatusCode, urlResponseInfo.getHttpStatusText(), httpStatusCode == 416 ? new q(AdError.REMOTE_ADS_SERVICE_ERROR) : null, allHeaders, sVar, bArrV);
                }
                c.f.b.a.l<String> lVar = this.s;
                if (lVar != null && (strP = P(allHeaders, "Content-Type")) != null && !lVar.apply(strP)) {
                    throw new c0.d(strP, sVar);
                }
                if (httpStatusCode == 200) {
                    long j4 = sVar.f9067g;
                    if (j4 != 0) {
                        j2 = j4;
                    }
                }
                if (S(urlResponseInfo)) {
                    this.v = sVar.f9068h;
                } else {
                    long j5 = sVar.f9068h;
                    if (j5 != -1) {
                        this.v = j5;
                    } else {
                        long jB = d0.b(P(allHeaders, "Content-Length"), P(allHeaders, Headers.CONTENT_RANGE));
                        this.v = jB != -1 ? jB - j2 : -1L;
                    }
                }
                this.u = true;
                y(sVar);
                X(j2, sVar);
                return this.v;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new c(new InterruptedIOException(), sVar, 1004, -1);
            }
        } catch (IOException e2) {
            if (e2 instanceof c0.c) {
                throw ((c0.c) e2);
            }
            throw new c(e2, sVar, AdError.SERVER_ERROR_CODE, 0);
        }
    }

    @Override // c.f.a.b.i3.j, c.f.a.b.i3.p
    public Map<String, List<String>> q() {
        UrlResponseInfo urlResponseInfo = this.z;
        return urlResponseInfo == null ? Collections.emptyMap() : urlResponseInfo.getAllHeaders();
    }
}
