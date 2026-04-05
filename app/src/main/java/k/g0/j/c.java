package k.g0.j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k.y;

/* JADX INFO: loaded from: classes2.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f30851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f30852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f30853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f30854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f30855g;

    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f30856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30858c;

        public a(List<String> list) {
            this.f30856a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = k.g0.c.f30556b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f30857b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f30856a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f30858c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj2 = this.f30856a.get(0);
                    break;
                }
                if (this.f30856a.contains(list.get(i2))) {
                    obj2 = list.get(i2);
                    break;
                }
                i2++;
            }
            String str = (String) obj2;
            this.f30858c = str;
            return str;
        }
    }

    public c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f30851c = method;
        this.f30852d = method2;
        this.f30853e = method3;
        this.f30854f = cls;
        this.f30855g = cls2;
    }

    public static e n() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new c(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // k.g0.j.e
    public void a(SSLSocket sSLSocket) {
        try {
            this.f30853e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    @Override // k.g0.j.e
    public void e(SSLSocket sSLSocket, String str, List<y> list) {
        try {
            this.f30851c.invoke(null, sSLSocket, Proxy.newProxyInstance(e.class.getClassLoader(), new Class[]{this.f30854f, this.f30855g}, new a(e.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // k.g0.j.e
    public String i(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f30852d.invoke(null, sSLSocket));
            boolean z = aVar.f30857b;
            if (!z && aVar.f30858c == null) {
                e.h().l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.f30858c;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }
}
