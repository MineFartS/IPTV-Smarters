package c.k.a.y;

import c.k.a.r;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f18348a = d();

    public static class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f18349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f18350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Method f18351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Method f18352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Method f18353f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Method f18354g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Method f18355h;

        public b(Class<?> cls, Method method, Method method2, Method method3, Method method4, Method method5, Method method6) {
            this.f18349b = cls;
            this.f18350c = method;
            this.f18351d = method2;
            this.f18352e = method3;
            this.f18353f = method4;
            this.f18354g = method5;
            this.f18355h = method6;
        }

        @Override // c.k.a.y.f
        public void b(SSLSocket sSLSocket, String str, List<r> list) {
            if (this.f18349b.isInstance(sSLSocket)) {
                if (str != null) {
                    try {
                        this.f18350c.invoke(sSLSocket, Boolean.TRUE);
                        this.f18351d.invoke(sSLSocket, str);
                    } catch (IllegalAccessException e2) {
                        throw new AssertionError(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException(e3.getCause());
                    }
                }
                if (this.f18354g != null) {
                    try {
                        this.f18354g.invoke(sSLSocket, f.a(list));
                    } catch (IllegalAccessException e4) {
                        throw new AssertionError(e4);
                    } catch (InvocationTargetException e5) {
                        throw new RuntimeException(e5.getCause());
                    }
                }
            }
        }

        @Override // c.k.a.y.f
        public void c(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
            try {
                socket.connect(inetSocketAddress, i2);
            } catch (SecurityException e2) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
        }

        @Override // c.k.a.y.f
        public String g(SSLSocket sSLSocket) {
            if (this.f18355h == null || !this.f18349b.isInstance(sSLSocket)) {
                return null;
            }
            try {
                byte[] bArr = (byte[]) this.f18355h.invoke(sSLSocket, new Object[0]);
                if (bArr == null) {
                    return null;
                }
                return new String(bArr, h.f18367d);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }

        @Override // c.k.a.y.f
        public void i(Socket socket) {
            Method method = this.f18352e;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }

        @Override // c.k.a.y.f
        public void k(Socket socket) {
            Method method = this.f18353f;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f18356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f18357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Class<?> f18358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class<?> f18359e;

        public c(Method method, Method method2, Class<?> cls, Class<?> cls2) {
            this.f18357c = method;
            this.f18356b = method2;
            this.f18358d = cls;
            this.f18359e = cls2;
        }

        @Override // c.k.a.y.f
        public void b(SSLSocket sSLSocket, String str, List<r> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                r rVar = list.get(i2);
                if (rVar != r.HTTP_1_0) {
                    arrayList.add(rVar.toString());
                }
            }
            try {
                this.f18357c.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f18358d, this.f18359e}, new d(arrayList)));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }

        @Override // c.k.a.y.f
        public String g(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.f18356b.invoke(null, sSLSocket));
                if (!dVar.f18361b && dVar.f18362c == null) {
                    c.k.a.y.b.f18344a.log(Level.INFO, "NPN/ALPN callback dropped: SPDY and HTTP/2 are disabled. Is npn-boot or alpn-boot on the boot class path?");
                    return null;
                }
                if (dVar.f18361b) {
                    return null;
                }
                return dVar.f18362c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }
    }

    public static class d implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f18360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18362c;

        public d(List<String> list) {
            this.f18360a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = h.f18365b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f18361b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f18360a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f18362c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj2 = this.f18360a.get(0);
                    break;
                }
                if (this.f18360a.contains(list.get(i2))) {
                    obj2 = list.get(i2);
                    break;
                }
                i2++;
            }
            String str = (String) obj2;
            this.f18362c = str;
            return str;
        }
    }

    public static byte[] a(List<r> list) {
        l.c cVar = new l.c();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = list.get(i2);
            if (rVar != r.HTTP_1_0) {
                cVar.I(rVar.toString().length());
                cVar.P(rVar.toString());
            }
        }
        return cVar.A0();
    }

    public static f d() throws NoSuchMethodException {
        Class<?> cls;
        Class<?> cls2;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls3;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            Class<?> cls4 = cls;
            Method method4 = cls4.getMethod("setUseSessionTickets", Boolean.TYPE);
            Method method5 = cls4.getMethod("setHostname", String.class);
            Method method6 = null;
            try {
                cls3 = Class.forName("android.net.TrafficStats");
                method = cls3.getMethod("tagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            try {
                method2 = cls3.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                method2 = null;
            }
            try {
                method3 = cls4.getMethod("setNpnProtocols", byte[].class);
                try {
                    method6 = cls4.getMethod("getNpnSelectedProtocol", new Class[0]);
                } catch (NoSuchMethodException unused4) {
                }
            } catch (NoSuchMethodException unused5) {
                method3 = null;
            }
            return new b(cls4, method4, method5, method, method2, method3, method6);
        } catch (ClassNotFoundException | NoSuchMethodException unused6) {
            String str = "org.eclipse.jetty.alpn.ALPN";
            try {
                try {
                    cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                    return new f();
                }
            } catch (ClassNotFoundException unused8) {
                str = "org.eclipse.jetty.npn.NextProtoNego";
                cls2 = Class.forName("org.eclipse.jetty.npn.NextProtoNego");
            }
            Class<?> cls5 = Class.forName(str + "$Provider");
            return new c(cls2.getMethod("put", SSLSocket.class, cls5), cls2.getMethod("get", SSLSocket.class), Class.forName(str + "$ClientProvider"), Class.forName(str + "$ServerProvider"));
        }
    }

    public static f e() {
        return f18348a;
    }

    public void b(SSLSocket sSLSocket, String str, List<r> list) {
    }

    public void c(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        socket.connect(inetSocketAddress, i2);
    }

    public String f() {
        return "OkHttp";
    }

    public String g(SSLSocket sSLSocket) {
        return null;
    }

    public void h(String str) {
        System.out.println(str);
    }

    public void i(Socket socket) {
    }

    public URI j(URL url) {
        return url.toURI();
    }

    public void k(Socket socket) {
    }
}
