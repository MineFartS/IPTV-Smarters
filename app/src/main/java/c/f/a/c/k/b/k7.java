package c.f.a.c.k.b;

import android.os.Build;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class k7 extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f14029c;

    public k7(c5 c5Var) {
        super(c5Var);
        this.f14029c = Build.VERSION.SDK_INT < 19 ? new ga(HttpsURLConnection.getDefaultSSLSocketFactory()) : null;
    }

    @Override // c.f.a.c.k.b.x5
    public final boolean h() {
        return false;
    }

    public final HttpURLConnection o(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        SSLSocketFactory sSLSocketFactory = this.f14029c;
        if (sSLSocketFactory != null && (uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) uRLConnectionOpenConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        this.f14413a.z();
        httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
        this.f14413a.z();
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }
}
