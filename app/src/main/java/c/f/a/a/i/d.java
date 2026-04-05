package c.f.a.a.i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import c.f.a.a.i.f.j;
import c.f.a.a.i.f.k;
import c.f.a.a.i.f.l;
import c.f.a.a.i.f.m;
import c.f.a.a.i.f.n;
import c.f.a.a.i.f.o;
import c.f.a.a.i.f.p;
import c.f.a.a.j.h;
import c.f.a.a.j.u.f;
import c.f.a.a.j.u.g;
import c.f.a.a.j.u.m;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.c.n.a f6022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f6023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f6025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6028g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f6029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f6030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f6031c;

        public a(URL url, j jVar, String str) {
            this.f6029a = url;
            this.f6030b = jVar;
            this.f6031c = str;
        }

        public a a(URL url) {
            return new a(url, this.f6030b, this.f6031c);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f6033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6034c;

        public b(int i2, URL url, long j2) {
            this.f6032a = i2;
            this.f6033b = url;
            this.f6034c = j2;
        }
    }

    public d(Context context, c.f.a.a.j.a0.a aVar, c.f.a.a.j.a0.a aVar2) {
        this(context, aVar, aVar2, 40000);
    }

    public d(Context context, c.f.a.a.j.a0.a aVar, c.f.a.a.j.a0.a aVar2, int i2) {
        this.f6022a = j.b();
        this.f6024c = context;
        this.f6023b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6025d = m(c.f.a.a.i.a.f6012a);
        this.f6026e = aVar2;
        this.f6027f = aVar;
        this.f6028g = i2;
    }

    public static int e(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (o.b.forNumber(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = o.b.COMBINED;
        }
        return bVar.getValue();
    }

    public static int f(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.getValue() : networkInfo.getType();
    }

    public static int g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            c.f.a.a.j.w.a.c("CctTransportBackend", "Unable to find version code for package", e2);
            return -1;
        }
    }

    public static TelephonyManager i(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long j() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a k(a aVar, b bVar) {
        URL url = bVar.f6033b;
        if (url == null) {
            return null;
        }
        c.f.a.a.j.w.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f6033b);
    }

    public static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    @Override // c.f.a.a.j.u.m
    public g a(f fVar) {
        j jVarH = h(fVar);
        URL urlM = this.f6025d;
        if (fVar.c() != null) {
            try {
                c.f.a.a.i.a aVarC = c.f.a.a.i.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlM = m(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) c.f.a.a.j.x.b.a(5, new a(urlM, jVarH, strD), c.f.a.a.i.b.a(this), c.b());
            int i2 = bVar.f6032a;
            if (i2 == 200) {
                return g.d(bVar.f6034c);
            }
            if (i2 < 500 && i2 != 404) {
                return g.a();
            }
            return g.e();
        } catch (IOException e2) {
            c.f.a.a.j.w.a.c("CctTransportBackend", "Could not make request to the backend", e2);
            return g.e();
        }
    }

    @Override // c.f.a.a.j.u.m
    public h b(h hVar) {
        NetworkInfo activeNetworkInfo = this.f6023b.getActiveNetworkInfo();
        return hVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", j()).a("net-type", f(activeNetworkInfo)).a("mobile-subtype", e(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", i(this.f6024c).getSimOperator()).c("application_build", Integer.toString(g(this.f6024c))).d();
    }

    public final b d(a aVar) throws IOException {
        c.f.a.a.j.w.a.a("CctTransportBackend", "Making request to: %s", aVar.f6029a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f6029a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f6028g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ClientConstants.HTTP_REQUEST_TYPE_POST);
        httpURLConnection.setRequestProperty(HttpHeader.USER_AGENT, String.format("datatransport/%s android/", "2.3.3"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f6031c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f6022a.a(aVar.f6030b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    c.f.a.a.j.w.a.e("CctTransportBackend", "Status Code: " + responseCode);
                    c.f.a.a.j.w.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    c.f.a.a.j.w.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeader.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (inputStreamL != null) {
                                try {
                                    inputStreamL.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (c.f.c.n.c e2) {
            e = e2;
            c.f.a.a.j.w.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e3) {
            e = e3;
            c.f.a.a.j.w.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            c.f.a.a.j.w.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            c.f.a.a.j.w.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final j h(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (h hVar : fVar.b()) {
            String strJ = hVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(hVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            h hVar2 = (h) ((List) entry.getValue()).get(0);
            m.a aVarB = c.f.a.a.i.f.m.a().f(p.DEFAULT).g(this.f6027f.a()).h(this.f6026e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(c.f.a.a.i.f.a.a().m(Integer.valueOf(hVar2.g("sdk-version"))).j(hVar2.b("model")).f(hVar2.b("hardware")).d(hVar2.b("device")).l(hVar2.b("product")).k(hVar2.b("os-uild")).h(hVar2.b("manufacturer")).e(hVar2.b("fingerprint")).c(hVar2.b("country")).g(hVar2.b("locale")).i(hVar2.b("mcc_mnc")).b(hVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar3 : (List) entry.getValue()) {
                c.f.a.a.j.g gVarE = hVar3.e();
                c.f.a.a.b bVarB = gVarE.b();
                if (bVarB.equals(c.f.a.a.b.b("proto"))) {
                    aVarJ = l.j(gVarE.a());
                } else if (bVarB.equals(c.f.a.a.b.b("json"))) {
                    aVarJ = l.i(new String(gVarE.a(), Charset.forName("UTF-8")));
                } else {
                    c.f.a.a.j.w.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(hVar3.f()).d(hVar3.k()).h(hVar3.h("tz-offset")).e(o.a().c(o.c.forNumber(hVar3.g("net-type"))).b(o.b.forNumber(hVar3.g("mobile-subtype"))).a());
                if (hVar3.d() != null) {
                    aVarJ.b(hVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }
}
