package c.f.a.b.i3;

import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f9061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f9065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f9066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f9071k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f9072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f9073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f9075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<String, String> f9076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f9078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f9079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9080i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f9081j;

        public b() {
            this.f9074c = 1;
            this.f9076e = Collections.emptyMap();
            this.f9078g = -1L;
        }

        public b(s sVar) {
            this.f9072a = sVar.f9061a;
            this.f9073b = sVar.f9062b;
            this.f9074c = sVar.f9063c;
            this.f9075d = sVar.f9064d;
            this.f9076e = sVar.f9065e;
            this.f9077f = sVar.f9067g;
            this.f9078g = sVar.f9068h;
            this.f9079h = sVar.f9069i;
            this.f9080i = sVar.f9070j;
            this.f9081j = sVar.f9071k;
        }

        public s a() {
            c.f.a.b.j3.g.j(this.f9072a, "The uri must be set.");
            return new s(this.f9072a, this.f9073b, this.f9074c, this.f9075d, this.f9076e, this.f9077f, this.f9078g, this.f9079h, this.f9080i, this.f9081j);
        }

        public b b(int i2) {
            this.f9080i = i2;
            return this;
        }

        public b c(byte[] bArr) {
            this.f9075d = bArr;
            return this;
        }

        public b d(int i2) {
            this.f9074c = i2;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f9076e = map;
            return this;
        }

        public b f(String str) {
            this.f9079h = str;
            return this;
        }

        public b g(long j2) {
            this.f9078g = j2;
            return this;
        }

        public b h(long j2) {
            this.f9077f = j2;
            return this;
        }

        public b i(Uri uri) {
            this.f9072a = uri;
            return this;
        }

        public b j(String str) {
            this.f9072a = Uri.parse(str);
            return this;
        }

        public b k(long j2) {
            this.f9073b = j2;
            return this;
        }
    }

    public s(Uri uri) {
        this(uri, 0L, -1L);
    }

    public s(Uri uri, long j2, int i2, byte[] bArr, Map<String, String> map, long j3, long j4, String str, int i3, Object obj) {
        byte[] bArr2 = bArr;
        long j5 = j2 + j3;
        boolean z = true;
        c.f.a.b.j3.g.a(j5 >= 0);
        c.f.a.b.j3.g.a(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        c.f.a.b.j3.g.a(z);
        this.f9061a = uri;
        this.f9062b = j2;
        this.f9063c = i2;
        this.f9064d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f9065e = Collections.unmodifiableMap(new HashMap(map));
        this.f9067g = j3;
        this.f9066f = j5;
        this.f9068h = j4;
        this.f9069i = str;
        this.f9070j = i3;
        this.f9071k = obj;
    }

    public s(Uri uri, long j2, long j3) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j2, j3, null, 0, null);
    }

    public static String c(int i2) {
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return ClientConstants.HTTP_REQUEST_TYPE_POST;
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f9063c);
    }

    public boolean d(int i2) {
        return (this.f9070j & i2) == i2;
    }

    public s e(long j2) {
        long j3 = this.f9068h;
        return f(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    public s f(long j2, long j3) {
        return (j2 == 0 && this.f9068h == j3) ? this : new s(this.f9061a, this.f9062b, this.f9063c, this.f9064d, this.f9065e, this.f9067g + j2, j3, this.f9069i, this.f9070j, this.f9071k);
    }

    public s g(Uri uri) {
        return new s(uri, this.f9062b, this.f9063c, this.f9064d, this.f9065e, this.f9067g, this.f9068h, this.f9069i, this.f9070j, this.f9071k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f9061a + ", " + this.f9067g + ", " + this.f9068h + ", " + this.f9069i + ", " + this.f9070j + "]";
    }
}
