package c.k.a.y;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import l.t;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f18364a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f18365b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f18366c = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f18367d = Charset.forName("UTF-8");

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f18369b;

        public a(String str, boolean z) {
            this.f18368a = str;
            this.f18369b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f18368a);
            thread.setDaemon(this.f18369b);
            return thread;
        }
    }

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void b(Closeable closeable, Closeable closeable2) throws IOException {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
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
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void e(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                e(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }

    public static boolean f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int g(String str) {
        if ("http".equals(str)) {
            return 80;
        }
        return ClientConstants.DOMAIN_SCHEME.equals(str) ? 443 : -1;
    }

    public static int h(String str, int i2) {
        return i2 != -1 ? i2 : g(str);
    }

    public static int i(URI uri) {
        return h(uri.getScheme(), uri.getPort());
    }

    public static int j(URL url) {
        return h(url.getProtocol(), url.getPort());
    }

    public static String k(String str) {
        try {
            return l.f.v(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).u();
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }

    public static <T> List<T> l(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> m(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> n(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static <T> List<T> o(Collection<T> collection, Collection<T> collection2) {
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            if (collection2.contains(t)) {
                arrayList.add(t);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static l.f p(l.f fVar) {
        try {
            return l.f.v(MessageDigest.getInstance("SHA-1").digest(fVar.D()));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static boolean q(t tVar, int i2) {
        long jNanoTime = System.nanoTime();
        l.c cVar = new l.c();
        while (TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime) < i2) {
            if (tVar.k(cVar, 2048L) == -1) {
                return true;
            }
            cVar.l();
        }
        return false;
    }

    public static ThreadFactory r(String str, boolean z) {
        return new a(str, z);
    }
}
