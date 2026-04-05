package c.k.a.y;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f18347a = new a();

    public static class a implements e {
        @Override // c.k.a.y.e
        public InetAddress[] a(String str) throws UnknownHostException {
            if (str != null) {
                return InetAddress.getAllByName(str);
            }
            throw new UnknownHostException("host == null");
        }
    }

    InetAddress[] a(String str);
}
