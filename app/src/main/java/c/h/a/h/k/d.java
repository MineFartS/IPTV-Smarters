package c.h.a.h.k;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class d extends Thread {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16931d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, Object> f16929b = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f16932e = 0.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f16933f = 0.0d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16934g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16935h = false;

    public d(String str, int i2) {
        this.f16930c = BuildConfig.FLAVOR;
        this.f16930c = str;
        this.f16931d = i2;
    }

    public double a() {
        return this.f16933f;
    }

    public double b() {
        return this.f16932e;
    }

    public boolean c() {
        return this.f16934g;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("ping", "-c" + this.f16931d, this.f16930c);
            processBuilder.redirectErrorStream(true);
            Process processStart = processBuilder.start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains("icmp_seq")) {
                    this.f16932e = Double.parseDouble(line.split(" ")[line.split(" ").length - 2].replace("time=", BuildConfig.FLAVOR));
                }
                if (line.startsWith("rtt ")) {
                    this.f16933f = Double.parseDouble(line.split("/")[4]);
                    break;
                }
            }
            processStart.waitFor();
            bufferedReader.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (InterruptedException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f16934g = true;
    }
}
