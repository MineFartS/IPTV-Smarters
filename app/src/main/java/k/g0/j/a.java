package k.g0.j;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k.y;

/* JADX INFO: loaded from: classes2.dex */
public class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f30838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d<Socket> f30839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d<Socket> f30840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d<Socket> f30841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d<Socket> f30842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f30843h = b.b();

    /* JADX INFO: renamed from: k.g0.j.a$a, reason: collision with other inner class name */
    public static final class C0313a extends k.g0.l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f30844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f30845b;

        public C0313a(Object obj, Method method) {
            this.f30844a = obj;
            this.f30845b = method;
        }

        @Override // k.g0.l.b
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f30845b.invoke(this.f30844a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0313a;
        }

        public int hashCode() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f30846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f30847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f30848c;

        public b(Method method, Method method2, Method method3) {
            this.f30846a = method;
            this.f30847b = method2;
            this.f30848c = method3;
        }

        public static b b() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new b(method3, method2, method);
        }

        public Object a(String str) {
            Method method = this.f30846a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.f30847b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f30848c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public a(Class<?> cls, d<Socket> dVar, d<Socket> dVar2, d<Socket> dVar3, d<Socket> dVar4) {
        this.f30838c = cls;
        this.f30839d = dVar;
        this.f30840e = dVar2;
        this.f30841f = dVar3;
        this.f30842g = dVar4;
    }

    public static e n() {
        Class<?> cls;
        d dVar;
        d dVar2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            d dVar3 = new d(null, "setUseSessionTickets", Boolean.TYPE);
            d dVar4 = new d(null, "setHostname", String.class);
            try {
                Class.forName("android.net.Network");
                dVar = new d(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                try {
                    dVar2 = new d(null, "setAlpnProtocols", byte[].class);
                } catch (ClassNotFoundException unused2) {
                    dVar2 = null;
                }
            } catch (ClassNotFoundException unused3) {
                dVar = null;
            }
            return new a(cls2, dVar3, dVar4, dVar, dVar2);
        } catch (ClassNotFoundException unused4) {
            return null;
        }
    }

    @Override // k.g0.j.e
    public k.g0.l.b c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0313a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // k.g0.j.e
    public void e(SSLSocket sSLSocket, String str, List<y> list) {
        if (str != null) {
            this.f30839d.e(sSLSocket, Boolean.TRUE);
            this.f30840e.e(sSLSocket, str);
        }
        d<Socket> dVar = this.f30842g;
        if (dVar == null || !dVar.g(sSLSocket)) {
            return;
        }
        this.f30842g.f(sSLSocket, e.d(list));
    }

    @Override // k.g0.j.e
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (!k.g0.c.s(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        }
    }

    @Override // k.g0.j.e
    public String i(SSLSocket sSLSocket) {
        byte[] bArr;
        d<Socket> dVar = this.f30841f;
        if (dVar == null || !dVar.g(sSLSocket) || (bArr = (byte[]) this.f30841f.f(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, k.g0.c.f30564j);
    }

    @Override // k.g0.j.e
    public Object j(String str) {
        return this.f30843h.a(str);
    }

    @Override // k.g0.j.e
    public boolean k(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), str)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.k(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // k.g0.j.e
    public void l(int i2, String str, Throwable th) {
        int iMin;
        int i3 = i2 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i4 = 0;
        int length = str.length();
        while (i4 < length) {
            int iIndexOf = str.indexOf(10, i4);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i4 + 4000);
                Log.println(i3, "OkHttp", str.substring(i4, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i4 = iMin;
                }
            }
            i4 = iMin + 1;
        }
    }

    @Override // k.g0.j.e
    public void m(String str, Object obj) {
        if (this.f30843h.c(obj)) {
            return;
        }
        l(5, str, null);
    }
}
