package c.c.b;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import c.c.b.b;
import c.c.b.p;
import c.c.b.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class n<T> implements Comparable<n<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.a f5225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p.a f5230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f5231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f5232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f5237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b.a f5238o;
    public b p;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f5240c;

        public a(String str, long j2) {
            this.f5239b = str;
            this.f5240c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f5225b.a(this.f5239b, this.f5240c);
            n.this.f5225b.b(n.this.toString());
        }
    }

    public interface b {
        void a(n<?> nVar);

        void b(n<?> nVar, p<?> pVar);
    }

    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public n(int i2, String str, p.a aVar) {
        this.f5225b = v.a.f5261a ? new v.a() : null;
        this.f5229f = new Object();
        this.f5233j = true;
        this.f5234k = false;
        this.f5235l = false;
        this.f5236m = false;
        this.f5238o = null;
        this.f5226c = i2;
        this.f5227d = str;
        this.f5230g = aVar;
        S(new e());
        this.f5228e = q(str);
    }

    public static int q(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    @Deprecated
    public byte[] A() {
        Map<String, String> mapB = B();
        if (mapB == null || mapB.size() <= 0) {
            return null;
        }
        return p(mapB, C());
    }

    @Deprecated
    public Map<String, String> B() {
        return y();
    }

    @Deprecated
    public String C() {
        return z();
    }

    public c D() {
        return c.NORMAL;
    }

    public r E() {
        return this.f5237n;
    }

    public final int F() {
        return E().b();
    }

    public int G() {
        return this.f5228e;
    }

    public String H() {
        return this.f5227d;
    }

    public boolean I() {
        boolean z;
        synchronized (this.f5229f) {
            z = this.f5235l;
        }
        return z;
    }

    public boolean J() {
        boolean z;
        synchronized (this.f5229f) {
            z = this.f5234k;
        }
        return z;
    }

    public void K() {
        synchronized (this.f5229f) {
            this.f5235l = true;
        }
    }

    public void L() {
        b bVar;
        synchronized (this.f5229f) {
            bVar = this.p;
        }
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void M(p<?> pVar) {
        b bVar;
        synchronized (this.f5229f) {
            bVar = this.p;
        }
        if (bVar != null) {
            bVar.b(this, pVar);
        }
    }

    public u N(u uVar) {
        return uVar;
    }

    public abstract p<T> O(k kVar);

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> P(b.a aVar) {
        this.f5238o = aVar;
        return this;
    }

    public void Q(b bVar) {
        synchronized (this.f5229f) {
            this.p = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> R(o oVar) {
        this.f5232i = oVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n<?> S(r rVar) {
        this.f5237n = rVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n<?> T(int i2) {
        this.f5231h = Integer.valueOf(i2);
        return this;
    }

    public final boolean U() {
        return this.f5233j;
    }

    public final boolean V() {
        return this.f5236m;
    }

    public void b(String str) {
        if (v.a.f5261a) {
            this.f5225b.a(str, Thread.currentThread().getId());
        }
    }

    public void d() {
        synchronized (this.f5229f) {
            this.f5234k = true;
            this.f5230g = null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(n<T> nVar) {
        c cVarD = D();
        c cVarD2 = nVar.D();
        return cVarD == cVarD2 ? this.f5231h.intValue() - nVar.f5231h.intValue() : cVarD2.ordinal() - cVarD.ordinal();
    }

    public void i(u uVar) {
        p.a aVar;
        synchronized (this.f5229f) {
            aVar = this.f5230g;
        }
        if (aVar != null) {
            aVar.b(uVar);
        }
    }

    public abstract void o(T t);

    public final byte[] p(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Encoding not supported: " + str, e2);
        }
    }

    public void r(String str) {
        o oVar = this.f5232i;
        if (oVar != null) {
            oVar.b(this);
        }
        if (v.a.f5261a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id));
            } else {
                this.f5225b.a(str, id);
                this.f5225b.b(toString());
            }
        }
    }

    public byte[] s() {
        Map<String, String> mapY = y();
        if (mapY == null || mapY.size() <= 0) {
            return null;
        }
        return p(mapY, z());
    }

    public String t() {
        return "application/x-www-form-urlencoded; charset=" + z();
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(G());
        StringBuilder sb = new StringBuilder();
        sb.append(J() ? "[X] " : "[ ] ");
        sb.append(H());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(D());
        sb.append(" ");
        sb.append(this.f5231h);
        return sb.toString();
    }

    public b.a u() {
        return this.f5238o;
    }

    public String v() {
        String strH = H();
        int iX = x();
        if (iX == 0 || iX == -1) {
            return strH;
        }
        return Integer.toString(iX) + '-' + strH;
    }

    public Map<String, String> w() {
        return Collections.emptyMap();
    }

    public int x() {
        return this.f5226c;
    }

    public Map<String, String> y() {
        return null;
    }

    public String z() {
        return "UTF-8";
    }
}
