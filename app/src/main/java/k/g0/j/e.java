package k.g0.j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import k.x;
import k.y;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f30862a = g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f30863b = Logger.getLogger(x.class.getName());

    public static List<String> b(List<y> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            y yVar = list.get(i2);
            if (yVar != y.HTTP_1_0) {
                arrayList.add(yVar.toString());
            }
        }
        return arrayList;
    }

    public static byte[] d(List<y> list) {
        l.c cVar = new l.c();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            y yVar = list.get(i2);
            if (yVar != y.HTTP_1_0) {
                cVar.I(yVar.toString().length());
                cVar.P(yVar.toString());
            }
        }
        return cVar.A0();
    }

    public static e g() {
        e eVarN = a.n();
        if (eVarN != null) {
            return eVarN;
        }
        b bVarN = b.n();
        if (bVarN != null) {
            return bVarN;
        }
        e eVarN2 = c.n();
        return eVarN2 != null ? eVarN2 : new e();
    }

    public static e h() {
        return f30862a;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public k.g0.l.b c(X509TrustManager x509TrustManager) {
        return new k.g0.l.a(k.g0.l.e.b(x509TrustManager));
    }

    public void e(SSLSocket sSLSocket, String str, List<y> list) {
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        socket.connect(inetSocketAddress, i2);
    }

    public String i(SSLSocket sSLSocket) {
        return null;
    }

    public Object j(String str) {
        if (f30863b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean k(String str) {
        return true;
    }

    public void l(int i2, String str, Throwable th) {
        f30863b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        l(5, str, (Throwable) obj);
    }
}
