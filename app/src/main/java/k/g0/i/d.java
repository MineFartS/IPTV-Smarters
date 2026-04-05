package k.g0.i;

import com.amazonaws.event.ProgressEvent;
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
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f30689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<l.f, Integer> f30690b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c> f30691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.e f30692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f30693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c[] f30695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f30697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f30698h;

        public a(int i2, int i3, t tVar) {
            this.f30691a = new ArrayList();
            this.f30695e = new c[8];
            this.f30696f = r0.length - 1;
            this.f30697g = 0;
            this.f30698h = 0;
            this.f30693c = i2;
            this.f30694d = i3;
            this.f30692b = l.m.c(tVar);
        }

        public a(int i2, t tVar) {
            this(i2, i2, tVar);
        }

        public final void a() {
            int i2 = this.f30694d;
            int i3 = this.f30698h;
            if (i2 < i3) {
                if (i2 == 0) {
                    b();
                } else {
                    d(i3 - i2);
                }
            }
        }

        public final void b() {
            Arrays.fill(this.f30695e, (Object) null);
            this.f30696f = this.f30695e.length - 1;
            this.f30697g = 0;
            this.f30698h = 0;
        }

        public final int c(int i2) {
            return this.f30696f + 1 + i2;
        }

        public final int d(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f30695e.length;
                while (true) {
                    length--;
                    i3 = this.f30696f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f30695e;
                    i2 -= cVarArr[length].f30688i;
                    this.f30698h -= cVarArr[length].f30688i;
                    this.f30697g--;
                    i4++;
                }
                c[] cVarArr2 = this.f30695e;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i4, this.f30697g);
                this.f30696f += i4;
            }
            return i4;
        }

        public List<c> e() {
            ArrayList arrayList = new ArrayList(this.f30691a);
            this.f30691a.clear();
            return arrayList;
        }

        public final l.f f(int i2) {
            return (h(i2) ? d.f30689a[i2] : this.f30695e[c(i2 - d.f30689a.length)]).f30686g;
        }

        public final void g(int i2, c cVar) {
            this.f30691a.add(cVar);
            int i3 = cVar.f30688i;
            if (i2 != -1) {
                i3 -= this.f30695e[c(i2)].f30688i;
            }
            int i4 = this.f30694d;
            if (i3 > i4) {
                b();
                return;
            }
            int iD = d((this.f30698h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f30697g + 1;
                c[] cVarArr = this.f30695e;
                if (i5 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f30696f = this.f30695e.length - 1;
                    this.f30695e = cVarArr2;
                }
                int i6 = this.f30696f;
                this.f30696f = i6 - 1;
                this.f30695e[i6] = cVar;
                this.f30697g++;
            } else {
                this.f30695e[i2 + c(i2) + iD] = cVar;
            }
            this.f30698h += i3;
        }

        public final boolean h(int i2) {
            return i2 >= 0 && i2 <= d.f30689a.length - 1;
        }

        public final int i() {
            return this.f30692b.T() & 255;
        }

        public l.f j() {
            int i2 = i();
            boolean z = (i2 & 128) == 128;
            int iM = m(i2, 127);
            return z ? l.f.v(k.f().c(this.f30692b.e0(iM))) : this.f30692b.g(iM);
        }

        public void k() throws IOException {
            while (!this.f30692b.H()) {
                int iT = this.f30692b.T() & 255;
                if (iT == 128) {
                    throw new IOException("index == 0");
                }
                if ((iT & 128) == 128) {
                    l(m(iT, 127) - 1);
                } else if (iT == 64) {
                    o();
                } else if ((iT & 64) == 64) {
                    n(m(iT, 63) - 1);
                } else if ((iT & 32) == 32) {
                    int iM = m(iT, 31);
                    this.f30694d = iM;
                    if (iM < 0 || iM > this.f30693c) {
                        throw new IOException("Invalid dynamic table size update " + this.f30694d);
                    }
                    a();
                } else if (iT == 16 || iT == 0) {
                    q();
                } else {
                    p(m(iT, 15) - 1);
                }
            }
        }

        public final void l(int i2) throws IOException {
            if (h(i2)) {
                this.f30691a.add(d.f30689a[i2]);
                return;
            }
            int iC = c(i2 - d.f30689a.length);
            if (iC >= 0) {
                c[] cVarArr = this.f30695e;
                if (iC <= cVarArr.length - 1) {
                    this.f30691a.add(cVarArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        public int m(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int i6 = i();
                if ((i6 & 128) == 0) {
                    return i3 + (i6 << i5);
                }
                i3 += (i6 & 127) << i5;
                i5 += 7;
            }
        }

        public final void n(int i2) {
            g(-1, new c(f(i2), j()));
        }

        public final void o() {
            g(-1, new c(d.a(j()), j()));
        }

        public final void p(int i2) {
            this.f30691a.add(new c(f(i2), j()));
        }

        public final void q() throws IOException {
            this.f30691a.add(new c(d.a(j()), j()));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l.c f30699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f30700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f30702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30704f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f30705g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f30706h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f30707i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f30708j;

        public b(int i2, boolean z, l.c cVar) {
            this.f30701c = Integer.MAX_VALUE;
            this.f30705g = new c[8];
            this.f30706h = r0.length - 1;
            this.f30707i = 0;
            this.f30708j = 0;
            this.f30703e = i2;
            this.f30704f = i2;
            this.f30700b = z;
            this.f30699a = cVar;
        }

        public b(l.c cVar) {
            this(ProgressEvent.PART_FAILED_EVENT_CODE, true, cVar);
        }

        public final void a() {
            int i2 = this.f30704f;
            int i3 = this.f30708j;
            if (i2 < i3) {
                if (i2 == 0) {
                    b();
                } else {
                    c(i3 - i2);
                }
            }
        }

        public final void b() {
            Arrays.fill(this.f30705g, (Object) null);
            this.f30706h = this.f30705g.length - 1;
            this.f30707i = 0;
            this.f30708j = 0;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f30705g.length;
                while (true) {
                    length--;
                    i3 = this.f30706h;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f30705g;
                    i2 -= cVarArr[length].f30688i;
                    this.f30708j -= cVarArr[length].f30688i;
                    this.f30707i--;
                    i4++;
                }
                c[] cVarArr2 = this.f30705g;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i4, this.f30707i);
                c[] cVarArr3 = this.f30705g;
                int i5 = this.f30706h;
                Arrays.fill(cVarArr3, i5 + 1, i5 + 1 + i4, (Object) null);
                this.f30706h += i4;
            }
            return i4;
        }

        public final void d(c cVar) {
            int i2 = cVar.f30688i;
            int i3 = this.f30704f;
            if (i2 > i3) {
                b();
                return;
            }
            c((this.f30708j + i2) - i3);
            int i4 = this.f30707i + 1;
            c[] cVarArr = this.f30705g;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f30706h = this.f30705g.length - 1;
                this.f30705g = cVarArr2;
            }
            int i5 = this.f30706h;
            this.f30706h = i5 - 1;
            this.f30705g[i5] = cVar;
            this.f30707i++;
            this.f30708j += i2;
        }

        public void e(int i2) {
            this.f30703e = i2;
            int iMin = Math.min(i2, 16384);
            int i3 = this.f30704f;
            if (i3 == iMin) {
                return;
            }
            if (iMin < i3) {
                this.f30701c = Math.min(this.f30701c, iMin);
            }
            this.f30702d = true;
            this.f30704f = iMin;
            a();
        }

        public void f(l.f fVar) {
            int size;
            int i2;
            if (!this.f30700b || k.f().e(fVar) >= fVar.size()) {
                size = fVar.size();
                i2 = 0;
            } else {
                l.c cVar = new l.c();
                k.f().d(fVar, cVar);
                fVar = cVar.B0();
                size = fVar.size();
                i2 = 128;
            }
            h(size, 127, i2);
            this.f30699a.j0(fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(java.util.List<k.g0.i.c> r14) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k.g0.i.d.b.g(java.util.List):void");
        }

        public void h(int i2, int i3, int i4) {
            int i5;
            l.c cVar;
            if (i2 < i3) {
                cVar = this.f30699a;
                i5 = i2 | i4;
            } else {
                this.f30699a.I(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.f30699a.I(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                cVar = this.f30699a;
            }
            cVar.I(i5);
        }
    }

    static {
        l.f fVar = c.f30682c;
        l.f fVar2 = c.f30683d;
        l.f fVar3 = c.f30684e;
        l.f fVar4 = c.f30681b;
        f30689a = new c[]{new c(c.f30685f, BuildConfig.FLAVOR), new c(fVar, "GET"), new c(fVar, ClientConstants.HTTP_REQUEST_TYPE_POST), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, ClientConstants.DOMAIN_SCHEME), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", BuildConfig.FLAVOR), new c("accept-encoding", "gzip, deflate"), new c("accept-language", BuildConfig.FLAVOR), new c("accept-ranges", BuildConfig.FLAVOR), new c("accept", BuildConfig.FLAVOR), new c("access-control-allow-origin", BuildConfig.FLAVOR), new c("age", BuildConfig.FLAVOR), new c("allow", BuildConfig.FLAVOR), new c("authorization", BuildConfig.FLAVOR), new c("cache-control", BuildConfig.FLAVOR), new c("content-disposition", BuildConfig.FLAVOR), new c("content-encoding", BuildConfig.FLAVOR), new c("content-language", BuildConfig.FLAVOR), new c("content-length", BuildConfig.FLAVOR), new c("content-location", BuildConfig.FLAVOR), new c("content-range", BuildConfig.FLAVOR), new c("content-type", BuildConfig.FLAVOR), new c("cookie", BuildConfig.FLAVOR), new c("date", BuildConfig.FLAVOR), new c(TransferTable.COLUMN_ETAG, BuildConfig.FLAVOR), new c("expect", BuildConfig.FLAVOR), new c("expires", BuildConfig.FLAVOR), new c("from", BuildConfig.FLAVOR), new c("host", BuildConfig.FLAVOR), new c("if-match", BuildConfig.FLAVOR), new c("if-modified-since", BuildConfig.FLAVOR), new c("if-none-match", BuildConfig.FLAVOR), new c("if-range", BuildConfig.FLAVOR), new c("if-unmodified-since", BuildConfig.FLAVOR), new c("last-modified", BuildConfig.FLAVOR), new c("link", BuildConfig.FLAVOR), new c("location", BuildConfig.FLAVOR), new c("max-forwards", BuildConfig.FLAVOR), new c("proxy-authenticate", BuildConfig.FLAVOR), new c("proxy-authorization", BuildConfig.FLAVOR), new c("range", BuildConfig.FLAVOR), new c("referer", BuildConfig.FLAVOR), new c("refresh", BuildConfig.FLAVOR), new c("retry-after", BuildConfig.FLAVOR), new c("server", BuildConfig.FLAVOR), new c("set-cookie", BuildConfig.FLAVOR), new c("strict-transport-security", BuildConfig.FLAVOR), new c("transfer-encoding", BuildConfig.FLAVOR), new c("user-agent", BuildConfig.FLAVOR), new c("vary", BuildConfig.FLAVOR), new c("via", BuildConfig.FLAVOR), new c("www-authenticate", BuildConfig.FLAVOR)};
        f30690b = b();
    }

    public static l.f a(l.f fVar) throws IOException {
        int size = fVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte bT = fVar.t(i2);
            if (bT >= 65 && bT <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.E());
            }
        }
        return fVar;
    }

    public static Map<l.f, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f30689a.length);
        int i2 = 0;
        while (true) {
            c[] cVarArr = f30689a;
            if (i2 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i2].f30686g)) {
                linkedHashMap.put(cVarArr[i2].f30686g, Integer.valueOf(i2));
            }
            i2++;
        }
    }
}
