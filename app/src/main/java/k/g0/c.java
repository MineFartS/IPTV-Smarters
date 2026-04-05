package k.g0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k.b0;
import k.d0;
import l.e;
import l.f;
import l.t;
import l.u;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f30555a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f30557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f30558d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f30556b = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f30559e = f.p("efbbbf");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f30560f = f.p("feff");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f30561g = f.p("fffe");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f30562h = f.p("0000ffff");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f30563i = f.p("ffff0000");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Charset f30564j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Charset f30565k = Charset.forName("UTF-16BE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Charset f30566l = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Charset f30567m = Charset.forName("UTF-32BE");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Charset f30568n = Charset.forName("UTF-32LE");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final TimeZone f30569o = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> p = new a();
    public static final Pattern q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f30571b;

        public b(String str, boolean z) {
            this.f30570a = str;
            this.f30571b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f30570a);
            thread.setDaemon(this.f30571b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f30555a = bArr;
        f30557c = d0.o(null, bArr);
        f30558d = b0.f(null, bArr);
    }

    public static Charset a(e eVar, Charset charset) {
        if (eVar.R(0L, f30559e)) {
            eVar.Z(r0.size());
            return f30564j;
        }
        if (eVar.R(0L, f30560f)) {
            eVar.Z(r0.size());
            return f30565k;
        }
        if (eVar.R(0L, f30561g)) {
            eVar.Z(r0.size());
            return f30566l;
        }
        if (eVar.R(0L, f30562h)) {
            eVar.Z(r0.size());
            return f30567m;
        }
        if (!eVar.R(0L, f30563i)) {
            return charset;
        }
        eVar.Z(r0.size());
        return f30568n;
    }

    public static void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!s(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] e(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static boolean f(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int g(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int h(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean i(t tVar, int i2, TimeUnit timeUnit) {
        try {
            return u(tVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String j(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (f(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String l(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String m(k.t tVar, boolean z) {
        String strL;
        if (tVar.l().contains(":")) {
            strL = "[" + tVar.l() + "]";
        } else {
            strL = tVar.l();
        }
        if (!z && tVar.y() == k.t.e(tVar.D())) {
            return strL;
        }
        return strL + ":" + tVar.y();
    }

    public static <T> List<T> n(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> o(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static int p(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static int q(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] r(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean s(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean t(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean u(t tVar, int i2, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jC = tVar.timeout().e() ? tVar.timeout().c() - jNanoTime : Long.MAX_VALUE;
        tVar.timeout().d(Math.min(jC, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            l.c cVar = new l.c();
            while (tVar.k(cVar, 8192L) != -1) {
                cVar.l();
            }
            u uVarTimeout = tVar.timeout();
            if (jC == Long.MAX_VALUE) {
                uVarTimeout.a();
            } else {
                uVarTimeout.d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            u uVarTimeout2 = tVar.timeout();
            if (jC == Long.MAX_VALUE) {
                uVarTimeout2.a();
            } else {
                uVarTimeout2.d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            u uVarTimeout3 = tVar.timeout();
            if (jC == Long.MAX_VALUE) {
                uVarTimeout3.a();
            } else {
                uVarTimeout3.d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static int v(String str, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int w(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static ThreadFactory x(String str, boolean z) {
        return new b(str, z);
    }

    public static String y(String str, int i2, int i3) {
        int iV = v(str, i2, i3);
        return str.substring(iV, w(str, iV, i3));
    }

    public static boolean z(String str) {
        return q.matcher(str).matches();
    }
}
