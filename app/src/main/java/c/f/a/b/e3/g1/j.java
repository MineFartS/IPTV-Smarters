package c.f.a.b.e3.g1;

import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import c.f.b.b.v;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.b.b.v<String, String> f7561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f7562j;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashMap<String, String> f7567e = new HashMap<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7568f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f7569g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f7570h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f7571i;

        public b(String str, int i2, String str2, int i3) {
            this.f7563a = str;
            this.f7564b = i2;
            this.f7565c = str2;
            this.f7566d = i3;
        }

        public b i(String str, String str2) {
            this.f7567e.put(str, str2);
            return this;
        }

        public j j() {
            try {
                c.f.a.b.j3.g.g(this.f7567e.containsKey("rtpmap"));
                return new j(this, c.f.b.b.v.d(this.f7567e), c.a((String) x0.i(this.f7567e.get("rtpmap"))));
            } catch (w1 e2) {
                throw new IllegalStateException(e2);
            }
        }

        public b k(int i2) {
            this.f7568f = i2;
            return this;
        }

        public b l(String str) {
            this.f7570h = str;
            return this;
        }

        public b m(String str) {
            this.f7571i = str;
            return this;
        }

        public b n(String str) {
            this.f7569g = str;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7575d;

        public c(int i2, String str, int i3, int i4) {
            this.f7572a = i2;
            this.f7573b = str;
            this.f7574c = i3;
            this.f7575d = i4;
        }

        public static c a(String str) {
            String[] strArrU0 = x0.U0(str, " ");
            c.f.a.b.j3.g.a(strArrU0.length == 2);
            int iE = a0.e(strArrU0[0]);
            String[] strArrU02 = x0.U0(strArrU0[1], "/");
            c.f.a.b.j3.g.a(strArrU02.length >= 2);
            return new c(iE, strArrU02[0], a0.e(strArrU02[1]), strArrU02.length == 3 ? a0.e(strArrU02[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f7572a == cVar.f7572a && this.f7573b.equals(cVar.f7573b) && this.f7574c == cVar.f7574c && this.f7575d == cVar.f7575d;
        }

        public int hashCode() {
            return ((((((217 + this.f7572a) * 31) + this.f7573b.hashCode()) * 31) + this.f7574c) * 31) + this.f7575d;
        }
    }

    public j(b bVar, c.f.b.b.v<String, String> vVar, c cVar) {
        this.f7553a = bVar.f7563a;
        this.f7554b = bVar.f7564b;
        this.f7555c = bVar.f7565c;
        this.f7556d = bVar.f7566d;
        this.f7558f = bVar.f7569g;
        this.f7559g = bVar.f7570h;
        this.f7557e = bVar.f7568f;
        this.f7560h = bVar.f7571i;
        this.f7561i = vVar;
        this.f7562j = cVar;
    }

    public c.f.b.b.v<String, String> a() {
        String str = this.f7561i.get("fmtp");
        if (str == null) {
            return c.f.b.b.v.k();
        }
        String[] strArrV0 = x0.V0(str, " ");
        c.f.a.b.j3.g.b(strArrV0.length == 2, str);
        String[] strArrSplit = strArrV0[1].split(";\\s?", 0);
        v.a aVar = new v.a();
        for (String str2 : strArrSplit) {
            String[] strArrV02 = x0.V0(str2, "=");
            aVar.c(strArrV02[0], strArrV02[1]);
        }
        return aVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f7553a.equals(jVar.f7553a) && this.f7554b == jVar.f7554b && this.f7555c.equals(jVar.f7555c) && this.f7556d == jVar.f7556d && this.f7557e == jVar.f7557e && this.f7561i.equals(jVar.f7561i) && this.f7562j.equals(jVar.f7562j) && x0.b(this.f7558f, jVar.f7558f) && x0.b(this.f7559g, jVar.f7559g) && x0.b(this.f7560h, jVar.f7560h);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.f7553a.hashCode()) * 31) + this.f7554b) * 31) + this.f7555c.hashCode()) * 31) + this.f7556d) * 31) + this.f7557e) * 31) + this.f7561i.hashCode()) * 31) + this.f7562j.hashCode()) * 31;
        String str = this.f7558f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7559g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7560h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
