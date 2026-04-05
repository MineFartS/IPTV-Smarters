package c.f.a.b.i3;

import android.net.Uri;
import c.f.a.b.i3.c0;
import c.f.a.b.j3.x0;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.Headers;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class x extends j implements c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0.f f9128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c0.f f9129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.f.b.a.l<String> f9131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f9132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HttpURLConnection f9133o;
    public InputStream p;
    public boolean q;
    public int r;
    public long s;
    public long t;

    public static final class b implements c0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n0 f9135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.f.b.a.l<String> f9136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9137d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f9140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f9141h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0.f f9134a = new c0.f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9138e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9139f = 8000;

        @Override // c.f.a.b.i3.p.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a() {
            x xVar = new x(this.f9137d, this.f9138e, this.f9139f, this.f9140g, this.f9134a, this.f9136c, this.f9141h);
            n0 n0Var = this.f9135b;
            if (n0Var != null) {
                xVar.h(n0Var);
            }
            return xVar;
        }

        public b c(String str) {
            this.f9137d = str;
            return this;
        }
    }

    public x(String str, int i2, int i3, boolean z, c0.f fVar, c.f.b.a.l<String> lVar, boolean z2) {
        super(true);
        this.f9127i = str;
        this.f9125g = i2;
        this.f9126h = i3;
        this.f9124f = z;
        this.f9128j = fVar;
        this.f9131m = lVar;
        this.f9129k = new c0.f();
        this.f9130l = z2;
    }

    public static boolean B(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public static void E(HttpURLConnection httpURLConnection, long j2) {
        int i2;
        if (httpURLConnection == null || (i2 = x0.f9296a) < 19 || i2 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j2 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j2 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) c.f.a.b.j3.g.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    public final URL A(URL url, String str, s sVar) throws c0.c {
        if (str == null) {
            throw new c0.c("Null location redirect", sVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ClientConstants.DOMAIN_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new c0.c("Unsupported protocol redirect: " + protocol, sVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f9124f || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new c0.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", sVar, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e2) {
            throw new c0.c(e2, sVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    public final HttpURLConnection C(s sVar) throws IOException {
        HttpURLConnection httpURLConnectionD;
        URL url = new URL(sVar.f9061a.toString());
        int i2 = sVar.f9063c;
        byte[] bArr = sVar.f9064d;
        long j2 = sVar.f9067g;
        long j3 = sVar.f9068h;
        boolean zD = sVar.d(1);
        if (!this.f9124f && !this.f9130l) {
            return D(url, i2, bArr, j2, j3, zD, true, sVar.f9065e);
        }
        URL urlA = url;
        int i3 = i2;
        byte[] bArr2 = bArr;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (i4 > 20) {
                throw new c0.c(new NoRouteToHostException("Too many redirects: " + i5), sVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            int i6 = i3;
            long j4 = j2;
            URL url2 = urlA;
            long j5 = j3;
            httpURLConnectionD = D(urlA, i3, bArr2, j2, j3, zD, false, sVar.f9065e);
            int responseCode = httpURLConnectionD.getResponseCode();
            String headerField = httpURLConnectionD.getHeaderField(HttpHeader.LOCATION);
            if ((i6 == 1 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionD.disconnect();
                urlA = A(url2, headerField, sVar);
                i3 = i6;
            } else {
                if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionD.disconnect();
                if (this.f9130l && responseCode == 302) {
                    i3 = i6;
                } else {
                    bArr2 = null;
                    i3 = 1;
                }
                urlA = A(url2, headerField, sVar);
            }
            i4 = i5;
            j2 = j4;
            j3 = j5;
        }
        return httpURLConnectionD;
    }

    public final HttpURLConnection D(URL url, int i2, byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionF = F(url);
        httpURLConnectionF.setConnectTimeout(this.f9125g);
        httpURLConnectionF.setReadTimeout(this.f9126h);
        HashMap map2 = new HashMap();
        c0.f fVar = this.f9128j;
        if (fVar != null) {
            map2.putAll(fVar.a());
        }
        map2.putAll(this.f9129k.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionF.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = d0.a(j2, j3);
        if (strA != null) {
            httpURLConnectionF.setRequestProperty(Headers.RANGE, strA);
        }
        String str = this.f9127i;
        if (str != null) {
            httpURLConnectionF.setRequestProperty(HttpHeader.USER_AGENT, str);
        }
        httpURLConnectionF.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnectionF.setInstanceFollowRedirects(z2);
        httpURLConnectionF.setDoOutput(bArr != null);
        httpURLConnectionF.setRequestMethod(s.c(i2));
        if (bArr != null) {
            httpURLConnectionF.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionF.connect();
            OutputStream outputStream = httpURLConnectionF.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionF.connect();
        }
        return httpURLConnectionF;
    }

    public HttpURLConnection F(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final int G(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.s;
        if (j2 != -1) {
            long j3 = j2 - this.t;
            if (j3 == 0) {
                return -1;
            }
            i3 = (int) Math.min(i3, j3);
        }
        int i4 = ((InputStream) x0.i(this.p)).read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        this.t += (long) i4;
        v(i4);
        return i4;
    }

    public final void H(long j2, s sVar) throws IOException {
        if (j2 == 0) {
            return;
        }
        byte[] bArr = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
        while (j2 > 0) {
            int i2 = ((InputStream) x0.i(this.p)).read(bArr, 0, (int) Math.min(j2, ProgressEvent.PART_FAILED_EVENT_CODE));
            if (Thread.currentThread().isInterrupted()) {
                throw new c0.c(new InterruptedIOException(), sVar, AdError.SERVER_ERROR_CODE, 1);
            }
            if (i2 == -1) {
                throw new c0.c(sVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
            j2 -= (long) i2;
            v(i2);
        }
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        HttpURLConnection httpURLConnection = this.f9133o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // c.f.a.b.i3.l
    public int b(byte[] bArr, int i2, int i3) throws c0.c {
        try {
            return G(bArr, i2, i3);
        } catch (IOException e2) {
            throw c0.c.b(e2, (s) x0.i(this.f9132n), 2);
        }
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        try {
            InputStream inputStream = this.p;
            if (inputStream != null) {
                long j2 = this.s;
                long j3 = -1;
                if (j2 != -1) {
                    j3 = j2 - this.t;
                }
                E(this.f9133o, j3);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new c0.c(e2, (s) x0.i(this.f9132n), AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.p = null;
            z();
            if (this.q) {
                this.q = false;
                w();
            }
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(s sVar) throws c0.c {
        byte[] bArrA1;
        this.f9132n = sVar;
        long j2 = 0;
        this.t = 0L;
        this.s = 0L;
        x(sVar);
        try {
            HttpURLConnection httpURLConnectionC = C(sVar);
            this.f9133o = httpURLConnectionC;
            this.r = httpURLConnectionC.getResponseCode();
            String responseMessage = httpURLConnectionC.getResponseMessage();
            int i2 = this.r;
            if (i2 < 200 || i2 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionC.getHeaderFields();
                if (this.r == 416) {
                    if (sVar.f9067g == d0.c(httpURLConnectionC.getHeaderField(Headers.CONTENT_RANGE))) {
                        this.q = true;
                        y(sVar);
                        long j3 = sVar.f9068h;
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionC.getErrorStream();
                try {
                    bArrA1 = errorStream != null ? x0.a1(errorStream) : x0.f9301f;
                } catch (IOException unused) {
                    bArrA1 = x0.f9301f;
                }
                byte[] bArr = bArrA1;
                z();
                throw new c0.e(this.r, responseMessage, this.r == 416 ? new q(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, sVar, bArr);
            }
            String contentType = httpURLConnectionC.getContentType();
            c.f.b.a.l<String> lVar = this.f9131m;
            if (lVar != null && !lVar.apply(contentType)) {
                z();
                throw new c0.d(contentType, sVar);
            }
            if (this.r == 200) {
                long j4 = sVar.f9067g;
                if (j4 != 0) {
                    j2 = j4;
                }
            }
            boolean zB = B(httpURLConnectionC);
            if (zB) {
                this.s = sVar.f9068h;
            } else {
                long j5 = sVar.f9068h;
                if (j5 != -1) {
                    this.s = j5;
                } else {
                    long jB = d0.b(httpURLConnectionC.getHeaderField("Content-Length"), httpURLConnectionC.getHeaderField(Headers.CONTENT_RANGE));
                    this.s = jB != -1 ? jB - j2 : -1L;
                }
            }
            try {
                this.p = httpURLConnectionC.getInputStream();
                if (zB) {
                    this.p = new GZIPInputStream(this.p);
                }
                this.q = true;
                y(sVar);
                try {
                    H(j2, sVar);
                    return this.s;
                } catch (IOException e2) {
                    z();
                    if (e2 instanceof c0.c) {
                        throw ((c0.c) e2);
                    }
                    throw new c0.c(e2, sVar, AdError.SERVER_ERROR_CODE, 1);
                }
            } catch (IOException e3) {
                z();
                throw new c0.c(e3, sVar, AdError.SERVER_ERROR_CODE, 1);
            }
        } catch (IOException e4) {
            z();
            throw c0.c.b(e4, sVar, 1);
        }
    }

    @Override // c.f.a.b.i3.j, c.f.a.b.i3.p
    public Map<String, List<String>> q() {
        HttpURLConnection httpURLConnection = this.f9133o;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    public final void z() {
        HttpURLConnection httpURLConnection = this.f9133o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                c.f.a.b.j3.z.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f9133o = null;
        }
    }
}
