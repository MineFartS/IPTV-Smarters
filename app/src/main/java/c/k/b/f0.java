package c.k.b;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import c.k.b.j;
import com.amazonaws.services.s3.Headers;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class f0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Object f18693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f18694b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f18695c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f18696d;

    public static class a extends ThreadLocal<StringBuilder> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    public static class b {
        public static Object a(Context context) {
            File fileF = g0.f(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(fileF, g0.a(fileF)) : installed;
        }
    }

    public f0(Context context) {
        this.f18696d = context.getApplicationContext();
    }

    public static void b(Context context) {
        if (f18693a == null) {
            try {
                synchronized (f18694b) {
                    if (f18693a == null) {
                        f18693a = b.a(context);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // c.k.b.j
    public j.a a(Uri uri, int i2) throws IOException {
        String string;
        if (Build.VERSION.SDK_INT >= 14) {
            b(this.f18696d);
        }
        HttpURLConnection httpURLConnectionC = c(uri);
        httpURLConnectionC.setUseCaches(true);
        if (i2 != 0) {
            if (q.isOfflineOnly(i2)) {
                string = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = f18695c.get();
                sb.setLength(0);
                if (!q.shouldReadFromDiskCache(i2)) {
                    sb.append("no-cache");
                }
                if (!q.shouldWriteToDiskCache(i2)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                string = sb.toString();
            }
            httpURLConnectionC.setRequestProperty(Headers.CACHE_CONTROL, string);
        }
        int responseCode = httpURLConnectionC.getResponseCode();
        if (responseCode < 300) {
            return new j.a(httpURLConnectionC.getInputStream(), g0.w(httpURLConnectionC.getHeaderField("X-Android-Response-Source")), httpURLConnectionC.getHeaderFieldInt("Content-Length", -1));
        }
        httpURLConnectionC.disconnect();
        throw new j.b(responseCode + " " + httpURLConnectionC.getResponseMessage(), i2, responseCode);
    }

    public HttpURLConnection c(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
