package c.f.a.c.f.t;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.RecentlyNullable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static String f12706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f12707b;

    @RecentlyNullable
    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f12706a == null) {
            if (f12707b == 0) {
                f12707b = Process.myPid();
            }
            int i2 = f12707b;
            String strTrim = null;
            strTrim = null;
            strTrim = null;
            BufferedReader bufferedReader2 = null;
            if (i2 > 0) {
                try {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("/proc/");
                    sb.append(i2);
                    sb.append("/cmdline");
                    String string = sb.toString();
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(string));
                        try {
                            String line = bufferedReader.readLine();
                            c.f.a.c.f.q.o.i(line);
                            strTrim = line.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            j.a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                j.a(bufferedReader);
            }
            f12706a = strTrim;
        }
        return f12706a;
    }
}
