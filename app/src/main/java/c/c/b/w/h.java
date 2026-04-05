package c.c.b.w;

import c.c.b.n;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class h extends c.c.b.w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f5295b;

    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HttpURLConnection f5296b;

        public a(HttpURLConnection httpURLConnection) {
            super(h.h(httpURLConnection));
            this.f5296b = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f5296b.disconnect();
        }
    }

    public interface b {
        String a(String str);
    }

    public h() {
        this(null);
    }

    public h(b bVar) {
        this(bVar, null);
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f5294a = bVar;
        this.f5295b = sSLSocketFactory;
    }

    public static void c(HttpURLConnection httpURLConnection, n<?> nVar, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", nVar.t());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static void d(HttpURLConnection httpURLConnection, n<?> nVar) {
        byte[] bArrS = nVar.s();
        if (bArrS != null) {
            c(httpURLConnection, nVar, bArrS);
        }
    }

    public static List<c.c.b.g> e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new c.c.b.g(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    public static boolean g(int i2, int i3) {
        return (i2 == 4 || (100 <= i3 && i3 < 200) || i3 == 204 || i3 == 304) ? false : true;
    }

    public static InputStream h(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    public static void j(HttpURLConnection httpURLConnection, n<?> nVar) throws ProtocolException {
        String str;
        String str2;
        switch (nVar.x()) {
            case -1:
                byte[] bArrA = nVar.A();
                if (bArrA != null) {
                    httpURLConnection.setRequestMethod(ClientConstants.HTTP_REQUEST_TYPE_POST);
                    c(httpURLConnection, nVar, bArrA);
                    return;
                }
                return;
            case 0:
                str = "GET";
                httpURLConnection.setRequestMethod(str);
                return;
            case 1:
                httpURLConnection.setRequestMethod(ClientConstants.HTTP_REQUEST_TYPE_POST);
                d(httpURLConnection, nVar);
                return;
            case 2:
                str2 = "PUT";
                httpURLConnection.setRequestMethod(str2);
                d(httpURLConnection, nVar);
                return;
            case 3:
                str = "DELETE";
                httpURLConnection.setRequestMethod(str);
                return;
            case 4:
                str = "HEAD";
                httpURLConnection.setRequestMethod(str);
                return;
            case 5:
                str = "OPTIONS";
                httpURLConnection.setRequestMethod(str);
                return;
            case 6:
                str = "TRACE";
                httpURLConnection.setRequestMethod(str);
                return;
            case 7:
                str2 = "PATCH";
                httpURLConnection.setRequestMethod(str2);
                d(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // c.c.b.w.a
    public f a(n<?> nVar, Map<String, String> map) throws IOException {
        String strH = nVar.H();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(nVar.w());
        b bVar = this.f5294a;
        if (bVar != null) {
            String strA = bVar.a(strH);
            if (strA == null) {
                throw new IOException("URL blocked by rewriter: " + strH);
            }
            strH = strA;
        }
        HttpURLConnection httpURLConnectionI = i(new URL(strH), nVar);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionI.setRequestProperty(str, (String) map2.get(str));
            }
            j(httpURLConnectionI, nVar);
            int responseCode = httpURLConnectionI.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (g(nVar.x(), responseCode)) {
                return new f(responseCode, e(httpURLConnectionI.getHeaderFields()), httpURLConnectionI.getContentLength(), new a(httpURLConnectionI));
            }
            f fVar = new f(responseCode, e(httpURLConnectionI.getHeaderFields()));
            httpURLConnectionI.disconnect();
            return fVar;
        } catch (Throwable th) {
            if (0 == 0) {
                httpURLConnectionI.disconnect();
            }
            throw th;
        }
    }

    public HttpURLConnection f(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    public final HttpURLConnection i(URL url, n<?> nVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionF = f(url);
        int iF = nVar.F();
        httpURLConnectionF.setConnectTimeout(iF);
        httpURLConnectionF.setReadTimeout(iF);
        httpURLConnectionF.setUseCaches(false);
        httpURLConnectionF.setDoInput(true);
        if (ClientConstants.DOMAIN_SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.f5295b) != null) {
            ((HttpsURLConnection) httpURLConnectionF).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionF;
    }
}
