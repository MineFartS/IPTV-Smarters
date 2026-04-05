package c.c.b;

import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f5258a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5259b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5260c = v.class.getName();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f5261a = v.f5259b;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<C0098a> f5262b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5263c = false;

        /* JADX INFO: renamed from: c.c.b.v$a$a, reason: collision with other inner class name */
        public static class C0098a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5264a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f5265b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f5266c;

            public C0098a(String str, long j2, long j3) {
                this.f5264a = str;
                this.f5265b = j2;
                this.f5266c = j3;
            }
        }

        public synchronized void a(String str, long j2) {
            if (this.f5263c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f5262b.add(new C0098a(str, j2, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f5263c = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j2 = this.f5262b.get(0).f5266c;
            v.b("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C0098a c0098a : this.f5262b) {
                long j3 = c0098a.f5266c;
                v.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(c0098a.f5265b), c0098a.f5264a);
                j2 = j3;
            }
        }

        public final long c() {
            if (this.f5262b.size() == 0) {
                return 0L;
            }
            return this.f5262b.get(r2.size() - 1).f5266c - this.f5262b.get(0).f5266c;
        }

        public void finalize() {
            if (this.f5263c) {
                return;
            }
            b("Request on the loose");
            v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i2 = 2;
        while (true) {
            if (i2 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i2].getClassName().equals(f5260c)) {
                String className = stackTrace[i2].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + InstructionFileId.DOT + stackTrace[i2].getMethodName();
                break;
            }
            i2++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f5258a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f5258a, a(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(f5258a, a(str, objArr), th);
    }

    public static void e(String str, Object... objArr) {
        if (f5259b) {
            Log.v(f5258a, a(str, objArr));
        }
    }
}
