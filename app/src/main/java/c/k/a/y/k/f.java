package c.k.a.y.k;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.t;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d[] f18481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<l.f, Integer> f18482b;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.e f18484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18486d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18488f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f18483a = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d[] f18487e = new d[8];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18489g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f18490h = 0;

        public a(int i2, t tVar) {
            this.f18488f = r0.length - 1;
            this.f18485c = i2;
            this.f18486d = i2;
            this.f18484b = l.m.c(tVar);
        }

        public final void a() {
            int i2 = this.f18486d;
            int i3 = this.f18490h;
            if (i2 < i3) {
                if (i2 == 0) {
                    b();
                } else {
                    c(i3 - i2);
                }
            }
        }

        public final void b() {
            this.f18483a.clear();
            Arrays.fill(this.f18487e, (Object) null);
            this.f18488f = this.f18487e.length - 1;
            this.f18489g = 0;
            this.f18490h = 0;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f18487e.length;
                while (true) {
                    length--;
                    i3 = this.f18488f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    d[] dVarArr = this.f18487e;
                    i2 -= dVarArr[length].f18480j;
                    this.f18490h -= dVarArr[length].f18480j;
                    this.f18489g--;
                    i4++;
                }
                d[] dVarArr2 = this.f18487e;
                System.arraycopy(dVarArr2, i3 + 1, dVarArr2, i3 + 1 + i4, this.f18489g);
                this.f18488f += i4;
            }
            return i4;
        }

        public List<d> d() {
            ArrayList arrayList = new ArrayList(this.f18483a);
            this.f18483a.clear();
            return arrayList;
        }

        public final l.f e(int i2) {
            return (h(i2) ? f.f18481a[i2] : this.f18487e[f(i2 - f.f18481a.length)]).f18478h;
        }

        public final int f(int i2) {
            return this.f18488f + 1 + i2;
        }

        public final void g(int i2, d dVar) {
            this.f18483a.add(dVar);
            int i3 = dVar.f18480j;
            if (i2 != -1) {
                i3 -= this.f18487e[f(i2)].f18480j;
            }
            int i4 = this.f18486d;
            if (i3 > i4) {
                b();
                return;
            }
            int iC = c((this.f18490h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f18489g + 1;
                d[] dVarArr = this.f18487e;
                if (i5 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f18488f = this.f18487e.length - 1;
                    this.f18487e = dVarArr2;
                }
                int i6 = this.f18488f;
                this.f18488f = i6 - 1;
                this.f18487e[i6] = dVar;
                this.f18489g++;
            } else {
                this.f18487e[i2 + f(i2) + iC] = dVar;
            }
            this.f18490h += i3;
        }

        public final boolean h(int i2) {
            return i2 >= 0 && i2 <= f.f18481a.length - 1;
        }

        public void i(int i2) {
            this.f18485c = i2;
            this.f18486d = i2;
            a();
        }

        public final int j() {
            return this.f18484b.T() & 255;
        }

        public l.f k() {
            int iJ = j();
            boolean z = (iJ & 128) == 128;
            int iN = n(iJ, 127);
            return z ? l.f.v(h.d().c(this.f18484b.e0(iN))) : this.f18484b.g(iN);
        }

        public void l() throws IOException {
            while (!this.f18484b.H()) {
                int iT = this.f18484b.T() & 255;
                if (iT == 128) {
                    throw new IOException("index == 0");
                }
                if ((iT & 128) == 128) {
                    m(n(iT, 127) - 1);
                } else if (iT == 64) {
                    p();
                } else if ((iT & 64) == 64) {
                    o(n(iT, 63) - 1);
                } else if ((iT & 32) == 32) {
                    int iN = n(iT, 31);
                    this.f18486d = iN;
                    if (iN < 0 || iN > this.f18485c) {
                        throw new IOException("Invalid header table byte count " + this.f18486d);
                    }
                    a();
                } else if (iT == 16 || iT == 0) {
                    r();
                } else {
                    q(n(iT, 15) - 1);
                }
            }
        }

        public final void m(int i2) throws IOException {
            if (h(i2)) {
                this.f18483a.add(f.f18481a[i2]);
                return;
            }
            int iF = f(i2 - f.f18481a.length);
            if (iF >= 0) {
                d[] dVarArr = this.f18487e;
                if (iF <= dVarArr.length - 1) {
                    this.f18483a.add(dVarArr[iF]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        public int n(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int iJ = j();
                if ((iJ & 128) == 0) {
                    return i3 + (iJ << i5);
                }
                i3 += (iJ & 127) << i5;
                i5 += 7;
            }
        }

        public final void o(int i2) {
            g(-1, new d(e(i2), k()));
        }

        public final void p() {
            g(-1, new d(f.d(k()), k()));
        }

        public final void q(int i2) {
            this.f18483a.add(new d(e(i2), k()));
        }

        public final void r() throws IOException {
            this.f18483a.add(new d(f.d(k()), k()));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l.c f18491a;

        public b(l.c cVar) {
            this.f18491a = cVar;
        }

        public void a(l.f fVar) {
            c(fVar.size(), 127, 0);
            this.f18491a.j0(fVar);
        }

        public void b(List<d> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                l.f fVarC = list.get(i2).f18478h.C();
                Integer num = (Integer) f.f18482b.get(fVarC);
                if (num != null) {
                    c(num.intValue() + 1, 15, 0);
                } else {
                    this.f18491a.I(0);
                    a(fVarC);
                }
                a(list.get(i2).f18479i);
            }
        }

        public void c(int i2, int i3, int i4) {
            int i5;
            l.c cVar;
            if (i2 < i3) {
                cVar = this.f18491a;
                i5 = i2 | i4;
            } else {
                this.f18491a.I(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.f18491a.I(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                cVar = this.f18491a;
            }
            cVar.I(i5);
        }
    }

    static {
        l.f fVar = d.f18472b;
        l.f fVar2 = d.f18473c;
        l.f fVar3 = d.f18474d;
        l.f fVar4 = d.f18471a;
        f18481a = new d[]{new d(d.f18475e, BuildConfig.FLAVOR), new d(fVar, "GET"), new d(fVar, ClientConstants.HTTP_REQUEST_TYPE_POST), new d(fVar2, "/"), new d(fVar2, "/index.html"), new d(fVar3, "http"), new d(fVar3, ClientConstants.DOMAIN_SCHEME), new d(fVar4, "200"), new d(fVar4, "204"), new d(fVar4, "206"), new d(fVar4, "304"), new d(fVar4, "400"), new d(fVar4, "404"), new d(fVar4, "500"), new d("accept-charset", BuildConfig.FLAVOR), new d("accept-encoding", "gzip, deflate"), new d("accept-language", BuildConfig.FLAVOR), new d("accept-ranges", BuildConfig.FLAVOR), new d("accept", BuildConfig.FLAVOR), new d("access-control-allow-origin", BuildConfig.FLAVOR), new d("age", BuildConfig.FLAVOR), new d("allow", BuildConfig.FLAVOR), new d("authorization", BuildConfig.FLAVOR), new d("cache-control", BuildConfig.FLAVOR), new d("content-disposition", BuildConfig.FLAVOR), new d("content-encoding", BuildConfig.FLAVOR), new d("content-language", BuildConfig.FLAVOR), new d("content-length", BuildConfig.FLAVOR), new d("content-location", BuildConfig.FLAVOR), new d("content-range", BuildConfig.FLAVOR), new d("content-type", BuildConfig.FLAVOR), new d("cookie", BuildConfig.FLAVOR), new d("date", BuildConfig.FLAVOR), new d(TransferTable.COLUMN_ETAG, BuildConfig.FLAVOR), new d("expect", BuildConfig.FLAVOR), new d("expires", BuildConfig.FLAVOR), new d("from", BuildConfig.FLAVOR), new d("host", BuildConfig.FLAVOR), new d("if-match", BuildConfig.FLAVOR), new d("if-modified-since", BuildConfig.FLAVOR), new d("if-none-match", BuildConfig.FLAVOR), new d("if-range", BuildConfig.FLAVOR), new d("if-unmodified-since", BuildConfig.FLAVOR), new d("last-modified", BuildConfig.FLAVOR), new d("link", BuildConfig.FLAVOR), new d("location", BuildConfig.FLAVOR), new d("max-forwards", BuildConfig.FLAVOR), new d("proxy-authenticate", BuildConfig.FLAVOR), new d("proxy-authorization", BuildConfig.FLAVOR), new d("range", BuildConfig.FLAVOR), new d("referer", BuildConfig.FLAVOR), new d("refresh", BuildConfig.FLAVOR), new d("retry-after", BuildConfig.FLAVOR), new d("server", BuildConfig.FLAVOR), new d("set-cookie", BuildConfig.FLAVOR), new d("strict-transport-security", BuildConfig.FLAVOR), new d("transfer-encoding", BuildConfig.FLAVOR), new d("user-agent", BuildConfig.FLAVOR), new d("vary", BuildConfig.FLAVOR), new d("via", BuildConfig.FLAVOR), new d("www-authenticate", BuildConfig.FLAVOR)};
        f18482b = e();
    }

    public static l.f d(l.f fVar) throws IOException {
        int size = fVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte bT = fVar.t(i2);
            if (bT >= 65 && bT <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.E());
            }
        }
        return fVar;
    }

    public static Map<l.f, Integer> e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f18481a.length);
        int i2 = 0;
        while (true) {
            d[] dVarArr = f18481a;
            if (i2 >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i2].f18478h)) {
                linkedHashMap.put(dVarArr[i2].f18478h, Integer.valueOf(i2));
            }
            i2++;
        }
    }
}
