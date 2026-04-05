package c.d.a.n.h;

import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.http.HttpHeader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f implements c.d.a.n.h.c<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5507a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.j.d f5508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f5510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f5511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f5512f;

    public static class b implements c {
        public b() {
        }

        @Override // c.d.a.n.h.f.c
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface c {
        HttpURLConnection a(URL url);
    }

    public f(c.d.a.n.j.d dVar) {
        this(dVar, f5507a);
    }

    public f(c.d.a.n.j.d dVar, c cVar) {
        this.f5508b = dVar;
        this.f5509c = cVar;
    }

    @Override // c.d.a.n.h.c
    public void a() {
        InputStream inputStream = this.f5511e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5510d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final InputStream c(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = c.d.a.t.b.i(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f5511e = inputStream;
        return this.f5511e;
    }

    @Override // c.d.a.n.h.c
    public void cancel() {
        this.f5512f = true;
    }

    @Override // c.d.a.n.h.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream b(c.d.a.i iVar) {
        return e(this.f5508b.e(), 0, null, this.f5508b.b());
    }

    public final InputStream e(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 >= 5) {
            throw new IOException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new IOException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f5510d = this.f5509c.a(url);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f5510d.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f5510d.setConnectTimeout(2500);
        this.f5510d.setReadTimeout(2500);
        this.f5510d.setUseCaches(false);
        this.f5510d.setDoInput(true);
        this.f5510d.connect();
        if (this.f5512f) {
            return null;
        }
        int responseCode = this.f5510d.getResponseCode();
        int i3 = responseCode / 100;
        if (i3 == 2) {
            return c(this.f5510d);
        }
        if (i3 == 3) {
            String headerField = this.f5510d.getHeaderField(HttpHeader.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                throw new IOException("Received empty or null redirect url");
            }
            return e(new URL(url, headerField), i2 + 1, url, map);
        }
        if (responseCode == -1) {
            throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
        }
        throw new IOException("Request failed " + responseCode + ": " + this.f5510d.getResponseMessage());
    }

    @Override // c.d.a.n.h.c
    public String getId() {
        return this.f5508b.a();
    }
}
