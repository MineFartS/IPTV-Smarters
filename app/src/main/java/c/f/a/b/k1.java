package c.f.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements Parcelable {
    public static final Parcelable.Creator<k1> CREATOR = new a();
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final Class<? extends ExoMediaCrypto> F;
    public int G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.f.a.b.b3.a f9336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f9338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<byte[]> f9340o;
    public final c.f.a.b.x2.w p;
    public final long q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    public final byte[] w;
    public final int x;
    public final c.f.a.b.k3.n y;
    public final int z;

    public static class a implements Parcelable.Creator<k1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k1 createFromParcel(Parcel parcel) {
            return new k1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k1[] newArray(int i2) {
            return new k1[i2];
        }
    }

    public static final class b {
        public int A;
        public int B;
        public int C;
        public Class<? extends ExoMediaCrypto> D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f9342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f9348h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c.f.a.b.b3.a f9349i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f9350j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f9351k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f9352l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List<byte[]> f9353m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public c.f.a.b.x2.w f9354n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f9355o;
        public int p;
        public int q;
        public float r;
        public int s;
        public float t;
        public byte[] u;
        public int v;
        public c.f.a.b.k3.n w;
        public int x;
        public int y;
        public int z;

        public b() {
            this.f9346f = -1;
            this.f9347g = -1;
            this.f9352l = -1;
            this.f9355o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
        }

        public b(k1 k1Var) {
            this.f9341a = k1Var.f9327b;
            this.f9342b = k1Var.f9328c;
            this.f9343c = k1Var.f9329d;
            this.f9344d = k1Var.f9330e;
            this.f9345e = k1Var.f9331f;
            this.f9346f = k1Var.f9332g;
            this.f9347g = k1Var.f9333h;
            this.f9348h = k1Var.f9335j;
            this.f9349i = k1Var.f9336k;
            this.f9350j = k1Var.f9337l;
            this.f9351k = k1Var.f9338m;
            this.f9352l = k1Var.f9339n;
            this.f9353m = k1Var.f9340o;
            this.f9354n = k1Var.p;
            this.f9355o = k1Var.q;
            this.p = k1Var.r;
            this.q = k1Var.s;
            this.r = k1Var.t;
            this.s = k1Var.u;
            this.t = k1Var.v;
            this.u = k1Var.w;
            this.v = k1Var.x;
            this.w = k1Var.y;
            this.x = k1Var.z;
            this.y = k1Var.A;
            this.z = k1Var.B;
            this.A = k1Var.C;
            this.B = k1Var.D;
            this.C = k1Var.E;
            this.D = k1Var.F;
        }

        public /* synthetic */ b(k1 k1Var, a aVar) {
            this(k1Var);
        }

        public k1 E() {
            return new k1(this, null);
        }

        public b F(int i2) {
            this.C = i2;
            return this;
        }

        public b G(int i2) {
            this.f9346f = i2;
            return this;
        }

        public b H(int i2) {
            this.x = i2;
            return this;
        }

        public b I(String str) {
            this.f9348h = str;
            return this;
        }

        public b J(c.f.a.b.k3.n nVar) {
            this.w = nVar;
            return this;
        }

        public b K(String str) {
            this.f9350j = str;
            return this;
        }

        public b L(c.f.a.b.x2.w wVar) {
            this.f9354n = wVar;
            return this;
        }

        public b M(int i2) {
            this.A = i2;
            return this;
        }

        public b N(int i2) {
            this.B = i2;
            return this;
        }

        public b O(Class<? extends ExoMediaCrypto> cls) {
            this.D = cls;
            return this;
        }

        public b P(float f2) {
            this.r = f2;
            return this;
        }

        public b Q(int i2) {
            this.q = i2;
            return this;
        }

        public b R(int i2) {
            this.f9341a = Integer.toString(i2);
            return this;
        }

        public b S(String str) {
            this.f9341a = str;
            return this;
        }

        public b T(List<byte[]> list) {
            this.f9353m = list;
            return this;
        }

        public b U(String str) {
            this.f9342b = str;
            return this;
        }

        public b V(String str) {
            this.f9343c = str;
            return this;
        }

        public b W(int i2) {
            this.f9352l = i2;
            return this;
        }

        public b X(c.f.a.b.b3.a aVar) {
            this.f9349i = aVar;
            return this;
        }

        public b Y(int i2) {
            this.z = i2;
            return this;
        }

        public b Z(int i2) {
            this.f9347g = i2;
            return this;
        }

        public b a0(float f2) {
            this.t = f2;
            return this;
        }

        public b b0(byte[] bArr) {
            this.u = bArr;
            return this;
        }

        public b c0(int i2) {
            this.f9345e = i2;
            return this;
        }

        public b d0(int i2) {
            this.s = i2;
            return this;
        }

        public b e0(String str) {
            this.f9351k = str;
            return this;
        }

        public b f0(int i2) {
            this.y = i2;
            return this;
        }

        public b g0(int i2) {
            this.f9344d = i2;
            return this;
        }

        public b h0(int i2) {
            this.v = i2;
            return this;
        }

        public b i0(long j2) {
            this.f9355o = j2;
            return this;
        }

        public b j0(int i2) {
            this.p = i2;
            return this;
        }
    }

    public k1(Parcel parcel) {
        this.f9327b = parcel.readString();
        this.f9328c = parcel.readString();
        this.f9329d = parcel.readString();
        this.f9330e = parcel.readInt();
        this.f9331f = parcel.readInt();
        int i2 = parcel.readInt();
        this.f9332g = i2;
        int i3 = parcel.readInt();
        this.f9333h = i3;
        this.f9334i = i3 != -1 ? i3 : i2;
        this.f9335j = parcel.readString();
        this.f9336k = (c.f.a.b.b3.a) parcel.readParcelable(c.f.a.b.b3.a.class.getClassLoader());
        this.f9337l = parcel.readString();
        this.f9338m = parcel.readString();
        this.f9339n = parcel.readInt();
        int i4 = parcel.readInt();
        this.f9340o = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            this.f9340o.add((byte[]) c.f.a.b.j3.g.e(parcel.createByteArray()));
        }
        c.f.a.b.x2.w wVar = (c.f.a.b.x2.w) parcel.readParcelable(c.f.a.b.x2.w.class.getClassLoader());
        this.p = wVar;
        this.q = parcel.readLong();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readFloat();
        this.u = parcel.readInt();
        this.v = parcel.readFloat();
        this.w = c.f.a.b.j3.x0.L0(parcel) ? parcel.createByteArray() : null;
        this.x = parcel.readInt();
        this.y = (c.f.a.b.k3.n) parcel.readParcelable(c.f.a.b.k3.n.class.getClassLoader());
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = wVar != null ? c.f.a.b.x2.r0.class : null;
    }

    public k1(b bVar) {
        this.f9327b = bVar.f9341a;
        this.f9328c = bVar.f9342b;
        this.f9329d = c.f.a.b.j3.x0.D0(bVar.f9343c);
        this.f9330e = bVar.f9344d;
        this.f9331f = bVar.f9345e;
        int i2 = bVar.f9346f;
        this.f9332g = i2;
        int i3 = bVar.f9347g;
        this.f9333h = i3;
        this.f9334i = i3 != -1 ? i3 : i2;
        this.f9335j = bVar.f9348h;
        this.f9336k = bVar.f9349i;
        this.f9337l = bVar.f9350j;
        this.f9338m = bVar.f9351k;
        this.f9339n = bVar.f9352l;
        this.f9340o = bVar.f9353m == null ? Collections.emptyList() : bVar.f9353m;
        c.f.a.b.x2.w wVar = bVar.f9354n;
        this.p = wVar;
        this.q = bVar.f9355o;
        this.r = bVar.p;
        this.s = bVar.q;
        this.t = bVar.r;
        this.u = bVar.s == -1 ? 0 : bVar.s;
        this.v = bVar.t == -1.0f ? 1.0f : bVar.t;
        this.w = bVar.u;
        this.x = bVar.v;
        this.y = bVar.w;
        this.z = bVar.x;
        this.A = bVar.y;
        this.B = bVar.z;
        this.C = bVar.A == -1 ? 0 : bVar.A;
        this.D = bVar.B != -1 ? bVar.B : 0;
        this.E = bVar.C;
        this.F = (bVar.D != null || wVar == null) ? bVar.D : c.f.a.b.x2.r0.class;
    }

    public /* synthetic */ k1(b bVar, a aVar) {
        this(bVar);
    }

    public static String f(k1 k1Var) {
        String str;
        if (k1Var == null) {
            return Constants.NULL_VERSION_ID;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(k1Var.f9327b);
        sb.append(", mimeType=");
        sb.append(k1Var.f9338m);
        if (k1Var.f9334i != -1) {
            sb.append(", bitrate=");
            sb.append(k1Var.f9334i);
        }
        if (k1Var.f9335j != null) {
            sb.append(", codecs=");
            sb.append(k1Var.f9335j);
        }
        if (k1Var.p != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (true) {
                c.f.a.b.x2.w wVar = k1Var.p;
                if (i2 >= wVar.f10448e) {
                    break;
                }
                UUID uuid = wVar.f(i2).f10450c;
                if (uuid.equals(w0.f10305b)) {
                    str = "cenc";
                } else if (uuid.equals(w0.f10306c)) {
                    str = "clearkey";
                } else if (uuid.equals(w0.f10308e)) {
                    str = "playready";
                } else if (uuid.equals(w0.f10307d)) {
                    str = "widevine";
                } else if (uuid.equals(w0.f10304a)) {
                    str = "universal";
                } else {
                    str = "unknown (" + uuid + ")";
                }
                linkedHashSet.add(str);
                i2++;
            }
            sb.append(", drm=[");
            sb.append(c.f.b.a.g.e(',').c(linkedHashSet));
            sb.append(']');
        }
        if (k1Var.r != -1 && k1Var.s != -1) {
            sb.append(", res=");
            sb.append(k1Var.r);
            sb.append("x");
            sb.append(k1Var.s);
        }
        if (k1Var.t != -1.0f) {
            sb.append(", fps=");
            sb.append(k1Var.t);
        }
        if (k1Var.z != -1) {
            sb.append(", channels=");
            sb.append(k1Var.z);
        }
        if (k1Var.A != -1) {
            sb.append(", sample_rate=");
            sb.append(k1Var.A);
        }
        if (k1Var.f9329d != null) {
            sb.append(", language=");
            sb.append(k1Var.f9329d);
        }
        if (k1Var.f9328c != null) {
            sb.append(", label=");
            sb.append(k1Var.f9328c);
        }
        if ((k1Var.f9331f & 16384) != 0) {
            sb.append(", trick-play-track");
        }
        return sb.toString();
    }

    public b b() {
        return new b(this, null);
    }

    public k1 c(Class<? extends ExoMediaCrypto> cls) {
        return b().O(cls).E();
    }

    public int d() {
        int i2;
        int i3 = this.r;
        if (i3 == -1 || (i2 = this.s) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e(k1 k1Var) {
        if (this.f9340o.size() != k1Var.f9340o.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f9340o.size(); i2++) {
            if (!Arrays.equals(this.f9340o.get(i2), k1Var.f9340o.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        int i3 = this.G;
        return (i3 == 0 || (i2 = k1Var.G) == 0 || i3 == i2) && this.f9330e == k1Var.f9330e && this.f9331f == k1Var.f9331f && this.f9332g == k1Var.f9332g && this.f9333h == k1Var.f9333h && this.f9339n == k1Var.f9339n && this.q == k1Var.q && this.r == k1Var.r && this.s == k1Var.s && this.u == k1Var.u && this.x == k1Var.x && this.z == k1Var.z && this.A == k1Var.A && this.B == k1Var.B && this.C == k1Var.C && this.D == k1Var.D && this.E == k1Var.E && Float.compare(this.t, k1Var.t) == 0 && Float.compare(this.v, k1Var.v) == 0 && c.f.a.b.j3.x0.b(this.F, k1Var.F) && c.f.a.b.j3.x0.b(this.f9327b, k1Var.f9327b) && c.f.a.b.j3.x0.b(this.f9328c, k1Var.f9328c) && c.f.a.b.j3.x0.b(this.f9335j, k1Var.f9335j) && c.f.a.b.j3.x0.b(this.f9337l, k1Var.f9337l) && c.f.a.b.j3.x0.b(this.f9338m, k1Var.f9338m) && c.f.a.b.j3.x0.b(this.f9329d, k1Var.f9329d) && Arrays.equals(this.w, k1Var.w) && c.f.a.b.j3.x0.b(this.f9336k, k1Var.f9336k) && c.f.a.b.j3.x0.b(this.y, k1Var.y) && c.f.a.b.j3.x0.b(this.p, k1Var.p) && e(k1Var);
    }

    public k1 h(k1 k1Var) {
        String str;
        if (this == k1Var) {
            return this;
        }
        int iL = c.f.a.b.j3.d0.l(this.f9338m);
        String str2 = k1Var.f9327b;
        String str3 = k1Var.f9328c;
        if (str3 == null) {
            str3 = this.f9328c;
        }
        String str4 = this.f9329d;
        if ((iL == 3 || iL == 1) && (str = k1Var.f9329d) != null) {
            str4 = str;
        }
        int i2 = this.f9332g;
        if (i2 == -1) {
            i2 = k1Var.f9332g;
        }
        int i3 = this.f9333h;
        if (i3 == -1) {
            i3 = k1Var.f9333h;
        }
        String str5 = this.f9335j;
        if (str5 == null) {
            String strL = c.f.a.b.j3.x0.L(k1Var.f9335j, iL);
            if (c.f.a.b.j3.x0.W0(strL).length == 1) {
                str5 = strL;
            }
        }
        c.f.a.b.b3.a aVar = this.f9336k;
        c.f.a.b.b3.a aVarC = aVar == null ? k1Var.f9336k : aVar.c(k1Var.f9336k);
        float f2 = this.t;
        if (f2 == -1.0f && iL == 2) {
            f2 = k1Var.t;
        }
        return b().S(str2).U(str3).V(str4).g0(this.f9330e | k1Var.f9330e).c0(this.f9331f | k1Var.f9331f).G(i2).Z(i3).I(str5).X(aVarC).L(c.f.a.b.x2.w.e(k1Var.p, this.p)).P(f2).E();
    }

    public int hashCode() {
        if (this.G == 0) {
            String str = this.f9327b;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f9328c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f9329d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f9330e) * 31) + this.f9331f) * 31) + this.f9332g) * 31) + this.f9333h) * 31;
            String str4 = this.f9335j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            c.f.a.b.b3.a aVar = this.f9336k;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f9337l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f9338m;
            int iHashCode7 = (((((((((((((((((((((((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f9339n) * 31) + ((int) this.q)) * 31) + this.r) * 31) + this.s) * 31) + Float.floatToIntBits(this.t)) * 31) + this.u) * 31) + Float.floatToIntBits(this.v)) * 31) + this.x) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31;
            Class<? extends ExoMediaCrypto> cls = this.F;
            this.G = iHashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.G;
    }

    public String toString() {
        return "Format(" + this.f9327b + ", " + this.f9328c + ", " + this.f9337l + ", " + this.f9338m + ", " + this.f9335j + ", " + this.f9334i + ", " + this.f9329d + ", [" + this.r + ", " + this.s + ", " + this.t + "], [" + this.z + ", " + this.A + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f9327b);
        parcel.writeString(this.f9328c);
        parcel.writeString(this.f9329d);
        parcel.writeInt(this.f9330e);
        parcel.writeInt(this.f9331f);
        parcel.writeInt(this.f9332g);
        parcel.writeInt(this.f9333h);
        parcel.writeString(this.f9335j);
        parcel.writeParcelable(this.f9336k, 0);
        parcel.writeString(this.f9337l);
        parcel.writeString(this.f9338m);
        parcel.writeInt(this.f9339n);
        int size = this.f9340o.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f9340o.get(i3));
        }
        parcel.writeParcelable(this.p, 0);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeFloat(this.t);
        parcel.writeInt(this.u);
        parcel.writeFloat(this.v);
        c.f.a.b.j3.x0.g1(parcel, this.w != null);
        byte[] bArr = this.w;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.x);
        parcel.writeParcelable(this.y, i2);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
    }
}
