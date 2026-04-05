package c.h.a.h.k;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f16922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f16924d = 0.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16925e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f16926f = 0.0d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f16927g = 0.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16928h;

    public c(String str) {
        this.f16923c = BuildConfig.FLAVOR;
        this.f16923c = str;
    }

    public double a() {
        return d(this.f16927g, 2);
    }

    public double b() {
        try {
            new BigDecimal(f16922b);
            if (f16922b < 0) {
                return 0.0d;
            }
            double dCurrentTimeMillis = System.currentTimeMillis() - this.f16928h;
            Double.isNaN(dCurrentTimeMillis);
            double d2 = dCurrentTimeMillis / 1000.0d;
            this.f16926f = d2;
            double d3 = f16922b;
            Double.isNaN(d3);
            return d(Double.valueOf(((d3 / 1000.0d) * 8.0d) / d2).doubleValue(), 2);
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public boolean c() {
        return this.f16925e;
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

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            URL url = new URL(this.f16923c);
            f16922b = 0;
            this.f16928h = System.currentTimeMillis();
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
            for (int i2 = 0; i2 < 4; i2++) {
                executorServiceNewFixedThreadPool.execute(new b(url));
            }
            executorServiceNewFixedThreadPool.shutdown();
            while (!executorServiceNewFixedThreadPool.isTerminated()) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
            double dCurrentTimeMillis = System.currentTimeMillis() - this.f16928h;
            Double.isNaN(dCurrentTimeMillis);
            double d2 = dCurrentTimeMillis / 1000.0d;
            this.f16924d = d2;
            double d3 = f16922b;
            Double.isNaN(d3);
            this.f16927g = Double.valueOf(((d3 / 1000.0d) * 8.0d) / d2).doubleValue();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f16925e = true;
    }
}
