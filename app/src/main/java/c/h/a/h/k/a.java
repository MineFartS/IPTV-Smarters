package c.h.a.h.k;

import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16912c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16913d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f16914e = 0.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16915f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f16916g = 0.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16917h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f16918i = 0.0d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16919j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HttpURLConnection f16920k = null;

    public a(String str) {
        this.f16911b = BuildConfig.FLAVOR;
        this.f16911b = str;
    }

    public double a() {
        return d(this.f16916g, 2);
    }

    public double b() {
        return this.f16918i;
    }

    public boolean c() {
        return this.f16917h;
    }

    public final double d(double d2, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        try {
            return new BigDecimal(d2).setScale(i2, RoundingMode.HALF_UP).doubleValue();
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public void e(int i2, double d2) {
        double d3;
        if (i2 >= 0) {
            double d4 = (i2 * 8) / 1000000;
            Double.isNaN(d4);
            d3 = d(Double.valueOf(d4 / d2).doubleValue(), 2);
        } else {
            d3 = 0.0d;
        }
        this.f16918i = d3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int responseCode = 0;
        this.f16915f = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f16911b + "random4000x4000.jpg");
        arrayList.add(this.f16911b + "random3000x3000.jpg");
        this.f16912c = System.currentTimeMillis();
        Iterator it = arrayList.iterator();
        loop0: while (it.hasNext()) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) it.next()).openConnection();
                this.f16920k = httpURLConnection;
                responseCode = httpURLConnection.getResponseCode();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (responseCode == 200) {
                try {
                    byte[] bArr = new byte[10240];
                    InputStream inputStream = this.f16920k.getInputStream();
                    do {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            this.f16915f += i2;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            this.f16913d = jCurrentTimeMillis;
                            double d2 = jCurrentTimeMillis - this.f16912c;
                            Double.isNaN(d2);
                            double d3 = d2 / 1000.0d;
                            this.f16914e = d3;
                            e(this.f16915f, d3);
                        } else {
                            inputStream.close();
                            this.f16920k.disconnect();
                        }
                    } while (this.f16914e < this.f16919j);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                System.out.println("Link not found...");
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.f16913d = jCurrentTimeMillis2;
        double d4 = jCurrentTimeMillis2 - this.f16912c;
        Double.isNaN(d4);
        double d5 = d4 / 1000.0d;
        this.f16914e = d5;
        double d6 = this.f16915f * 8;
        Double.isNaN(d6);
        this.f16916g = (d6 / 1000000.0d) / d5;
        this.f16917h = true;
    }
}
