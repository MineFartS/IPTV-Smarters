package c.h.a.h.n;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Integer, String> f17054b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<Integer, List<String>> f17055c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f17056d = 0.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f17057e = 0.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17058f = false;

    public HashMap<Integer, String> a() {
        return this.f17054b;
    }

    public double b() {
        return this.f17056d;
    }

    public double c() {
        return this.f17057e;
    }

    public HashMap<Integer, List<String>> d() {
        return this.f17055c;
    }

    public boolean e() {
        return this.f17058f;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://www.speedtest.net/speedtest-config.php").openConnection();
            httpURLConnection.getContentLength();
            char c2 = 0;
            char c3 = 1;
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        if (line.contains("isp=")) {
                            this.f17056d = Double.parseDouble(line.split("lat=\"")[1].split(" ")[0].replace("\"", BuildConfig.FLAVOR));
                            this.f17057e = Double.parseDouble(line.split("lon=\"")[1].split(" ")[0].replace("\"", BuildConfig.FLAVOR));
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bufferedReader.close();
            }
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://www.speedtest.net/speedtest-servers-static.php").openConnection();
                if (httpURLConnection2.getResponseCode() == 200) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    int i2 = 0;
                    while (true) {
                        String line2 = bufferedReader2.readLine();
                        if (line2 == null) {
                            break;
                        }
                        if (line2.contains("<server url")) {
                            String str = line2.split("server url=\"")[c3].split("\"")[c2];
                            String str2 = line2.split("lat=\"")[c3].split("\"")[c2];
                            String str3 = line2.split("lon=\"")[c3].split("\"")[c2];
                            String str4 = line2.split("name=\"")[c3].split("\"")[c2];
                            String str5 = line2.split("country=\"")[c3].split("\"")[c2];
                            String str6 = line2.split("cc=\"")[c3].split("\"")[c2];
                            String str7 = line2.split("sponsor=\"")[c3].split("\"")[c2];
                            c2 = 0;
                            List<String> listAsList = Arrays.asList(str2, str3, str4, str5, str6, str7, line2.split("host=\"")[c3].split("\"")[0]);
                            this.f17054b.put(Integer.valueOf(i2), str);
                            this.f17055c.put(Integer.valueOf(i2), listAsList);
                            i2++;
                            c3 = 1;
                        }
                    }
                    bufferedReader2.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.f17058f = true;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
