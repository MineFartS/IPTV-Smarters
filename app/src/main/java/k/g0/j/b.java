package k.g0.j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import k.y;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f30849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f30850d;

    public b(Method method, Method method2) {
        this.f30849c = method;
        this.f30850d = method2;
    }

    public static b n() {
        try {
            return new b(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // k.g0.j.e
    public void e(SSLSocket sSLSocket, String str, List<y> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listB = e.b(list);
            this.f30849c.invoke(sSLParameters, listB.toArray(new String[listB.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    @Override // k.g0.j.e
    public String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f30850d.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals(BuildConfig.FLAVOR)) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }
}
