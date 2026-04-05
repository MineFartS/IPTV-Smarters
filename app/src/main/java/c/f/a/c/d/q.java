package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q extends c.f.a.c.f.q.w.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaInfo f11740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f11743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f11747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f11748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f11750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11752o;
    public String p;
    public JSONObject q;
    public int r;
    public final List<o> s;
    public boolean t;
    public c u;
    public t v;
    public i w;
    public n x;
    public final SparseArray<Integer> y;
    public final a z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11739b = new c.f.a.c.d.v.b("MediaStatus");
    public static final Parcelable.Creator<q> CREATOR = new q1();

    public class a {
        public a() {
        }

        public void a(boolean z) {
            q.this.t = z;
        }
    }

    public q(MediaInfo mediaInfo, long j2, int i2, double d2, int i3, int i4, long j3, long j4, double d3, boolean z, long[] jArr, int i5, int i6, String str, int i7, List<o> list, boolean z2, c cVar, t tVar, i iVar, n nVar) {
        this.s = new ArrayList();
        this.y = new SparseArray<>();
        this.z = new a();
        this.f11740c = mediaInfo;
        this.f11741d = j2;
        this.f11742e = i2;
        this.f11743f = d2;
        this.f11744g = i3;
        this.f11745h = i4;
        this.f11746i = j3;
        this.f11747j = j4;
        this.f11748k = d3;
        this.f11749l = z;
        this.f11750m = jArr;
        this.f11751n = i5;
        this.f11752o = i6;
        this.p = str;
        if (str != null) {
            try {
                this.q = new JSONObject(this.p);
            } catch (JSONException unused) {
                this.q = null;
                this.p = null;
            }
        } else {
            this.q = null;
        }
        this.r = i7;
        if (list != null && !list.isEmpty()) {
            l0(list);
        }
        this.t = z2;
        this.u = cVar;
        this.v = tVar;
        this.w = iVar;
        this.x = nVar;
    }

    public q(JSONObject jSONObject) throws JSONException {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        j0(jSONObject, 0);
    }

    public static boolean k0(int i2, int i3, int i4, int i5) {
        if (i2 != 1) {
            return false;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return i5 != 2;
            }
            if (i3 != 3) {
                return true;
            }
        }
        return i4 == 0;
    }

    public static JSONObject m0(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject == null) {
            return jSONObject;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                arrayList.add(itKeys.next());
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            while (itKeys2.hasNext()) {
                String next = itKeys2.next();
                jSONObject2.put(next, jSONObjectOptJSONObject.get(next));
            }
            jSONObject2.remove("extendedStatus");
            return jSONObject2;
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    public long[] I() {
        return this.f11750m;
    }

    public c J() {
        return this.u;
    }

    public c.f.a.c.d.a K() {
        List<c.f.a.c.d.a> listI;
        c cVar = this.u;
        if (cVar != null && this.f11740c != null) {
            String strI = cVar.I();
            if (!TextUtils.isEmpty(strI) && (listI = this.f11740c.I()) != null && !listI.isEmpty()) {
                for (c.f.a.c.d.a aVar : listI) {
                    if (strI.equals(aVar.N())) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    public int L() {
        return this.f11742e;
    }

    public int M() {
        return this.f11745h;
    }

    public Integer N(int i2) {
        return this.y.get(i2);
    }

    public o O(int i2) {
        Integer num = this.y.get(i2);
        if (num == null) {
            return null;
        }
        return this.s.get(num.intValue());
    }

    public o P(int i2) {
        if (i2 < 0 || i2 >= this.s.size()) {
            return null;
        }
        return this.s.get(i2);
    }

    public i Q() {
        return this.w;
    }

    public int R() {
        return this.f11751n;
    }

    public MediaInfo S() {
        return this.f11740c;
    }

    public double T() {
        return this.f11743f;
    }

    public int U() {
        return this.f11744g;
    }

    public int V() {
        return this.f11752o;
    }

    public n W() {
        return this.x;
    }

    public o X(int i2) {
        return P(i2);
    }

    public o Y(int i2) {
        return O(i2);
    }

    public int Z() {
        return this.s.size();
    }

    public List<o> a0() {
        return this.s;
    }

    public int b0() {
        return this.r;
    }

    public long c0() {
        return this.f11746i;
    }

    public double d0() {
        return this.f11748k;
    }

    public t e0() {
        return this.v;
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if ((this.q == null) == (qVar.q == null) && this.f11741d == qVar.f11741d && this.f11742e == qVar.f11742e && this.f11743f == qVar.f11743f && this.f11744g == qVar.f11744g && this.f11745h == qVar.f11745h && this.f11746i == qVar.f11746i && this.f11748k == qVar.f11748k && this.f11749l == qVar.f11749l && this.f11751n == qVar.f11751n && this.f11752o == qVar.f11752o && this.r == qVar.r && Arrays.equals(this.f11750m, qVar.f11750m) && c.f.a.c.d.v.a.f(Long.valueOf(this.f11747j), Long.valueOf(qVar.f11747j)) && c.f.a.c.d.v.a.f(this.s, qVar.s) && c.f.a.c.d.v.a.f(this.f11740c, qVar.f11740c)) {
            JSONObject jSONObject2 = this.q;
            if ((jSONObject2 == null || (jSONObject = qVar.q) == null || c.f.a.c.f.t.k.a(jSONObject2, jSONObject)) && this.t == qVar.i0() && c.f.a.c.d.v.a.f(this.u, qVar.u) && c.f.a.c.d.v.a.f(this.v, qVar.v) && c.f.a.c.d.v.a.f(this.w, qVar.w) && c.f.a.c.f.q.n.a(this.x, qVar.x)) {
                return true;
            }
        }
        return false;
    }

    public a f0() {
        return this.z;
    }

    public boolean g0(long j2) {
        return (j2 & this.f11747j) != 0;
    }

    public boolean h0() {
        return this.f11749l;
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f11740c, Long.valueOf(this.f11741d), Integer.valueOf(this.f11742e), Double.valueOf(this.f11743f), Integer.valueOf(this.f11744g), Integer.valueOf(this.f11745h), Long.valueOf(this.f11746i), Long.valueOf(this.f11747j), Double.valueOf(this.f11748k), Boolean.valueOf(this.f11749l), Integer.valueOf(Arrays.hashCode(this.f11750m)), Integer.valueOf(this.f11751n), Integer.valueOf(this.f11752o), String.valueOf(this.q), Integer.valueOf(this.r), this.s, Boolean.valueOf(this.t), this.u, this.v, this.w, this.x);
    }

    public boolean i0() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j0(org.json.JSONObject r14, int r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.d.q.j0(org.json.JSONObject, int):int");
    }

    public final void l0(List<o> list) {
        this.s.clear();
        this.y.clear();
        if (list == null) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            o oVar = list.get(i2);
            this.s.add(oVar);
            this.y.put(oVar.L(), Integer.valueOf(i2));
        }
    }

    public final long n0() {
        return this.f11741d;
    }

    public final boolean o0() {
        MediaInfo mediaInfo = this.f11740c;
        return k0(this.f11744g, this.f11745h, this.f11751n, mediaInfo == null ? -1 : mediaInfo.S());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.q;
        this.p = jSONObject == null ? null : jSONObject.toString();
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.r(parcel, 2, S(), i2, false);
        c.f.a.c.f.q.w.c.o(parcel, 3, this.f11741d);
        c.f.a.c.f.q.w.c.l(parcel, 4, L());
        c.f.a.c.f.q.w.c.g(parcel, 5, T());
        c.f.a.c.f.q.w.c.l(parcel, 6, U());
        c.f.a.c.f.q.w.c.l(parcel, 7, M());
        c.f.a.c.f.q.w.c.o(parcel, 8, c0());
        c.f.a.c.f.q.w.c.o(parcel, 9, this.f11747j);
        c.f.a.c.f.q.w.c.g(parcel, 10, d0());
        c.f.a.c.f.q.w.c.c(parcel, 11, h0());
        c.f.a.c.f.q.w.c.p(parcel, 12, I(), false);
        c.f.a.c.f.q.w.c.l(parcel, 13, R());
        c.f.a.c.f.q.w.c.l(parcel, 14, V());
        c.f.a.c.f.q.w.c.s(parcel, 15, this.p, false);
        c.f.a.c.f.q.w.c.l(parcel, 16, this.r);
        c.f.a.c.f.q.w.c.w(parcel, 17, this.s, false);
        c.f.a.c.f.q.w.c.c(parcel, 18, i0());
        c.f.a.c.f.q.w.c.r(parcel, 19, J(), i2, false);
        c.f.a.c.f.q.w.c.r(parcel, 20, e0(), i2, false);
        c.f.a.c.f.q.w.c.r(parcel, 21, Q(), i2, false);
        c.f.a.c.f.q.w.c.r(parcel, 22, W(), i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
