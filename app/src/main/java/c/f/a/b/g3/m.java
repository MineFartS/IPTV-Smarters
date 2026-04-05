package c.f.a.b.g3;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import c.f.a.b.j3.x0;
import c.f.b.b.t;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f8491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final m f8492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t<String> f8504o;
    public final t<String> p;
    public final int q;
    public final int r;
    public final int s;
    public final t<String> t;
    public final t<String> u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public static class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i2) {
            return new m[i2];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8512h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8513i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8514j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f8515k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public t<String> f8516l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public t<String> f8517m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f8518n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8519o;
        public int p;
        public t<String> q;
        public t<String> r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;

        @Deprecated
        public b() {
            this.f8505a = Integer.MAX_VALUE;
            this.f8506b = Integer.MAX_VALUE;
            this.f8507c = Integer.MAX_VALUE;
            this.f8508d = Integer.MAX_VALUE;
            this.f8513i = Integer.MAX_VALUE;
            this.f8514j = Integer.MAX_VALUE;
            this.f8515k = true;
            this.f8516l = t.J();
            this.f8517m = t.J();
            this.f8518n = 0;
            this.f8519o = Integer.MAX_VALUE;
            this.p = Integer.MAX_VALUE;
            this.q = t.J();
            this.r = t.J();
            this.s = 0;
            this.t = false;
            this.u = false;
            this.v = false;
        }

        public b(Context context) {
            this();
            y(context);
            B(context, true);
        }

        public b(m mVar) {
            this.f8505a = mVar.f8493d;
            this.f8506b = mVar.f8494e;
            this.f8507c = mVar.f8495f;
            this.f8508d = mVar.f8496g;
            this.f8509e = mVar.f8497h;
            this.f8510f = mVar.f8498i;
            this.f8511g = mVar.f8499j;
            this.f8512h = mVar.f8500k;
            this.f8513i = mVar.f8501l;
            this.f8514j = mVar.f8502m;
            this.f8515k = mVar.f8503n;
            this.f8516l = mVar.f8504o;
            this.f8517m = mVar.p;
            this.f8518n = mVar.q;
            this.f8519o = mVar.r;
            this.p = mVar.s;
            this.q = mVar.t;
            this.r = mVar.u;
            this.s = mVar.v;
            this.t = mVar.w;
            this.u = mVar.x;
            this.v = mVar.y;
        }

        public b A(int i2, int i3, boolean z) {
            this.f8513i = i2;
            this.f8514j = i3;
            this.f8515k = z;
            return this;
        }

        public b B(Context context, boolean z) {
            Point pointO = x0.O(context);
            return A(pointO.x, pointO.y, z);
        }

        public m w() {
            return new m(this);
        }

        public b x(boolean z) {
            this.v = z;
            return this;
        }

        public b y(Context context) {
            if (x0.f9296a >= 19) {
                z(context);
            }
            return this;
        }

        public final void z(Context context) {
            CaptioningManager captioningManager;
            if ((x0.f9296a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.r = t.K(x0.W(locale));
                }
            }
        }
    }

    static {
        m mVarW = new b().w();
        f8491b = mVarW;
        f8492c = mVarW;
        CREATOR = new a();
    }

    public m(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.p = t.D(arrayList);
        this.q = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.u = t.D(arrayList2);
        this.v = parcel.readInt();
        this.w = x0.L0(parcel);
        this.f8493d = parcel.readInt();
        this.f8494e = parcel.readInt();
        this.f8495f = parcel.readInt();
        this.f8496g = parcel.readInt();
        this.f8497h = parcel.readInt();
        this.f8498i = parcel.readInt();
        this.f8499j = parcel.readInt();
        this.f8500k = parcel.readInt();
        this.f8501l = parcel.readInt();
        this.f8502m = parcel.readInt();
        this.f8503n = x0.L0(parcel);
        ArrayList arrayList3 = new ArrayList();
        parcel.readList(arrayList3, null);
        this.f8504o = t.D(arrayList3);
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        ArrayList arrayList4 = new ArrayList();
        parcel.readList(arrayList4, null);
        this.t = t.D(arrayList4);
        this.x = x0.L0(parcel);
        this.y = x0.L0(parcel);
    }

    public m(b bVar) {
        this.f8493d = bVar.f8505a;
        this.f8494e = bVar.f8506b;
        this.f8495f = bVar.f8507c;
        this.f8496g = bVar.f8508d;
        this.f8497h = bVar.f8509e;
        this.f8498i = bVar.f8510f;
        this.f8499j = bVar.f8511g;
        this.f8500k = bVar.f8512h;
        this.f8501l = bVar.f8513i;
        this.f8502m = bVar.f8514j;
        this.f8503n = bVar.f8515k;
        this.f8504o = bVar.f8516l;
        this.p = bVar.f8517m;
        this.q = bVar.f8518n;
        this.r = bVar.f8519o;
        this.s = bVar.p;
        this.t = bVar.q;
        this.u = bVar.r;
        this.v = bVar.s;
        this.w = bVar.t;
        this.x = bVar.u;
        this.y = bVar.v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f8493d == mVar.f8493d && this.f8494e == mVar.f8494e && this.f8495f == mVar.f8495f && this.f8496g == mVar.f8496g && this.f8497h == mVar.f8497h && this.f8498i == mVar.f8498i && this.f8499j == mVar.f8499j && this.f8500k == mVar.f8500k && this.f8503n == mVar.f8503n && this.f8501l == mVar.f8501l && this.f8502m == mVar.f8502m && this.f8504o.equals(mVar.f8504o) && this.p.equals(mVar.p) && this.q == mVar.q && this.r == mVar.r && this.s == mVar.s && this.t.equals(mVar.t) && this.u.equals(mVar.u) && this.v == mVar.v && this.w == mVar.w && this.x == mVar.x && this.y == mVar.y;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.f8493d + 31) * 31) + this.f8494e) * 31) + this.f8495f) * 31) + this.f8496g) * 31) + this.f8497h) * 31) + this.f8498i) * 31) + this.f8499j) * 31) + this.f8500k) * 31) + (this.f8503n ? 1 : 0)) * 31) + this.f8501l) * 31) + this.f8502m) * 31) + this.f8504o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.p);
        parcel.writeInt(this.q);
        parcel.writeList(this.u);
        parcel.writeInt(this.v);
        x0.g1(parcel, this.w);
        parcel.writeInt(this.f8493d);
        parcel.writeInt(this.f8494e);
        parcel.writeInt(this.f8495f);
        parcel.writeInt(this.f8496g);
        parcel.writeInt(this.f8497h);
        parcel.writeInt(this.f8498i);
        parcel.writeInt(this.f8499j);
        parcel.writeInt(this.f8500k);
        parcel.writeInt(this.f8501l);
        parcel.writeInt(this.f8502m);
        x0.g1(parcel, this.f8503n);
        parcel.writeList(this.f8504o);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeList(this.t);
        x0.g1(parcel, this.x);
        x0.g1(parcel, this.y);
    }
}
