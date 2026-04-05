package c.f.a.b.i3;

import c.f.a.b.i3.p;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface c0 extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.b.a.l<String> f8845a = new c.f.b.a.l() { // from class: c.f.a.b.i3.d
        @Override // c.f.b.a.l
        public final boolean apply(Object obj) {
            return b0.a((String) obj);
        }
    };

    public static final class a extends c {
        public a(IOException iOException, s sVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, sVar, 2007, 1);
        }
    }

    public interface b extends p.a {
        @Override // c.f.a.b.i3.p.a
        c0 a();
    }

    public static class c extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f8846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8847d;

        public c(s sVar, int i2, int i3) {
            super(a(i2, i3));
            this.f8846c = sVar;
            this.f8847d = i3;
        }

        public c(IOException iOException, s sVar, int i2, int i3) {
            super(iOException, a(i2, i3));
            this.f8846c = sVar;
            this.f8847d = i3;
        }

        public c(String str, s sVar, int i2, int i3) {
            super(str, a(i2, i3));
            this.f8846c = sVar;
            this.f8847d = i3;
        }

        public c(String str, IOException iOException, s sVar, int i2, int i3) {
            super(str, iOException, a(i2, i3));
            this.f8846c = sVar;
            this.f8847d = i3;
        }

        public static int a(int i2, int i3) {
            return (i2 == 2000 && i3 == 1) ? AdError.INTERNAL_ERROR_CODE : i2;
        }

        public static c b(IOException iOException, s sVar, int i2) {
            String message = iOException.getMessage();
            int i3 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !c.f.b.a.b.e(message).matches("cleartext.*not permitted.*")) ? AdError.INTERNAL_ERROR_CODE : 2007;
            return i3 == 2007 ? new a(iOException, sVar) : new c(iOException, sVar, i3, i2);
        }
    }

    public static final class d extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f8848e;

        public d(String str, s sVar) {
            super("Invalid content type: " + str, sVar, AdError.INTERNAL_ERROR_2003, 1);
            this.f8848e = str;
        }
    }

    public static final class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f8850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Map<String, List<String>> f8851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f8852h;

        public e(int i2, String str, IOException iOException, Map<String, List<String>> map, s sVar, byte[] bArr) {
            super("Response code: " + i2, iOException, sVar, AdError.INTERNAL_ERROR_2004, 1);
            this.f8849e = i2;
            this.f8850f = str;
            this.f8851g = map;
            this.f8852h = bArr;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f8853a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f8854b;

        public synchronized Map<String, String> a() {
            if (this.f8854b == null) {
                this.f8854b = Collections.unmodifiableMap(new HashMap(this.f8853a));
            }
            return this.f8854b;
        }
    }
}
