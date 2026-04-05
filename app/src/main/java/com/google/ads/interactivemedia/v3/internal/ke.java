package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ke implements Parcelable {
    public static final Parcelable.Creator<ke> CREATOR = new kc();
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final Class<? extends qt> E;
    private int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ys f22154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f22155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f22156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f22157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<byte[]> f22158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qg f22159o;
    public final long p;
    public final int q;
    public final int r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final amq x;
    public final int y;
    public final int z;

    public ke(Parcel parcel) {
        this.f22145a = parcel.readString();
        this.f22146b = parcel.readString();
        this.f22147c = parcel.readString();
        this.f22148d = parcel.readInt();
        this.f22149e = parcel.readInt();
        int i2 = parcel.readInt();
        this.f22150f = i2;
        int i3 = parcel.readInt();
        this.f22151g = i3;
        this.f22152h = i3 != -1 ? i3 : i2;
        this.f22153i = parcel.readString();
        this.f22154j = (ys) parcel.readParcelable(ys.class.getClassLoader());
        this.f22155k = parcel.readString();
        this.f22156l = parcel.readString();
        this.f22157m = parcel.readInt();
        int i4 = parcel.readInt();
        this.f22158n = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            this.f22158n.add((byte[]) ajr.b(parcel.createByteArray()));
        }
        qg qgVar = (qg) parcel.readParcelable(qg.class.getClassLoader());
        this.f22159o = qgVar;
        this.p = parcel.readLong();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readFloat();
        this.t = parcel.readInt();
        this.u = parcel.readFloat();
        this.v = amn.V(parcel) ? parcel.createByteArray() : null;
        this.w = parcel.readInt();
        this.x = (amq) parcel.readParcelable(amq.class.getClassLoader());
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = qgVar != null ? qw.class : null;
    }

    public /* synthetic */ ke(kd kdVar) {
        this.f22145a = kdVar.f22130a;
        this.f22146b = kdVar.f22131b;
        this.f22147c = amn.I(kdVar.f22132c);
        this.f22148d = kdVar.f22133d;
        this.f22149e = kdVar.f22134e;
        int i2 = kdVar.f22135f;
        this.f22150f = i2;
        int i3 = kdVar.f22136g;
        this.f22151g = i3;
        this.f22152h = i3 != -1 ? i3 : i2;
        this.f22153i = kdVar.f22137h;
        this.f22154j = kdVar.f22138i;
        this.f22155k = kdVar.f22139j;
        this.f22156l = kdVar.f22140k;
        this.f22157m = kdVar.f22141l;
        this.f22158n = kdVar.f22142m == null ? Collections.emptyList() : kdVar.f22142m;
        qg qgVar = kdVar.f22143n;
        this.f22159o = qgVar;
        this.p = kdVar.f22144o;
        this.q = kdVar.p;
        this.r = kdVar.q;
        this.s = kdVar.r;
        this.t = kdVar.s == -1 ? 0 : kdVar.s;
        this.u = kdVar.t == -1.0f ? 1.0f : kdVar.t;
        this.v = kdVar.u;
        this.w = kdVar.v;
        this.x = kdVar.w;
        this.y = kdVar.x;
        this.z = kdVar.y;
        this.A = kdVar.z;
        this.B = kdVar.A == -1 ? 0 : kdVar.A;
        this.C = kdVar.B != -1 ? kdVar.B : 0;
        this.D = kdVar.C;
        this.E = (kdVar.D != null || qgVar == null) ? kdVar.D : qw.class;
    }

    public final int a() {
        int i2;
        int i3 = this.q;
        if (i3 == -1 || (i2 = this.r) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final kd b() {
        return new kd(this);
    }

    public final ke c(Class<? extends qt> cls) {
        kd kdVarB = b();
        kdVarB.O(cls);
        return kdVarB.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.ke d(com.google.ads.interactivemedia.v3.internal.ke r14) {
        /*
            r13 = this;
            if (r13 != r14) goto L3
            return r13
        L3:
            java.lang.String r0 = r13.f22156l
            int r0 = com.google.ads.interactivemedia.v3.internal.alo.a(r0)
            java.lang.String r1 = r14.f22145a
            java.lang.String r2 = r14.f22146b
            if (r2 != 0) goto L11
            java.lang.String r2 = r13.f22146b
        L11:
            java.lang.String r3 = r13.f22147c
            r4 = 3
            r5 = 1
            if (r0 == r4) goto L1a
            if (r0 != r5) goto L1f
            r0 = 1
        L1a:
            java.lang.String r4 = r14.f22147c
            if (r4 == 0) goto L1f
            r3 = r4
        L1f:
            int r4 = r13.f22150f
            r6 = -1
            if (r4 != r6) goto L26
            int r4 = r14.f22150f
        L26:
            int r7 = r13.f22151g
            if (r7 != r6) goto L2c
            int r7 = r14.f22151g
        L2c:
            java.lang.String r6 = r13.f22153i
            if (r6 != 0) goto L3e
            java.lang.String r8 = r14.f22153i
            java.lang.String r8 = com.google.ads.interactivemedia.v3.internal.amn.E(r8, r0)
            java.lang.String[] r9 = com.google.ads.interactivemedia.v3.internal.amn.af(r8)
            int r9 = r9.length
            if (r9 != r5) goto L3e
            r6 = r8
        L3e:
            com.google.ads.interactivemedia.v3.internal.ys r5 = r13.f22154j
            if (r5 != 0) goto L45
            com.google.ads.interactivemedia.v3.internal.ys r5 = r14.f22154j
            goto L4b
        L45:
            com.google.ads.interactivemedia.v3.internal.ys r8 = r14.f22154j
            com.google.ads.interactivemedia.v3.internal.ys r5 = r5.d(r8)
        L4b:
            float r8 = r13.s
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L58
            r9 = 2
            if (r0 != r9) goto L58
            float r8 = r14.s
        L58:
            int r0 = r13.f22148d
            int r9 = r14.f22148d
            int r10 = r13.f22149e
            int r11 = r14.f22149e
            com.google.ads.interactivemedia.v3.internal.qg r14 = r14.f22159o
            com.google.ads.interactivemedia.v3.internal.qg r12 = r13.f22159o
            com.google.ads.interactivemedia.v3.internal.qg r14 = com.google.ads.interactivemedia.v3.internal.qg.b(r14, r12)
            com.google.ads.interactivemedia.v3.internal.kd r12 = r13.b()
            r12.S(r1)
            r12.U(r2)
            r12.V(r3)
            r0 = r0 | r9
            r12.ag(r0)
            r0 = r10 | r11
            r12.ac(r0)
            r12.G(r4)
            r12.Z(r7)
            r12.I(r6)
            r12.X(r5)
            r12.L(r14)
            r12.P(r8)
            com.google.ads.interactivemedia.v3.internal.ke r14 = r12.s()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ke.d(com.google.ads.interactivemedia.v3.internal.ke):com.google.ads.interactivemedia.v3.internal.ke");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(ke keVar) {
        if (this.f22158n.size() != keVar.f22158n.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f22158n.size(); i2++) {
            if (!Arrays.equals(this.f22158n.get(i2), keVar.f22158n.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj != null && ke.class == obj.getClass()) {
            ke keVar = (ke) obj;
            int i3 = this.F;
            if ((i3 == 0 || (i2 = keVar.F) == 0 || i3 == i2) && this.f22148d == keVar.f22148d && this.f22149e == keVar.f22149e && this.f22150f == keVar.f22150f && this.f22151g == keVar.f22151g && this.f22157m == keVar.f22157m && this.p == keVar.p && this.q == keVar.q && this.r == keVar.r && this.t == keVar.t && this.w == keVar.w && this.y == keVar.y && this.z == keVar.z && this.A == keVar.A && this.B == keVar.B && this.C == keVar.C && this.D == keVar.D && Float.compare(this.s, keVar.s) == 0 && Float.compare(this.u, keVar.u) == 0 && amn.O(this.E, keVar.E) && amn.O(this.f22145a, keVar.f22145a) && amn.O(this.f22146b, keVar.f22146b) && amn.O(this.f22153i, keVar.f22153i) && amn.O(this.f22155k, keVar.f22155k) && amn.O(this.f22156l, keVar.f22156l) && amn.O(this.f22147c, keVar.f22147c) && Arrays.equals(this.v, keVar.v) && amn.O(this.f22154j, keVar.f22154j) && amn.O(this.x, keVar.x) && amn.O(this.f22159o, keVar.f22159o) && e(keVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.F;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f22145a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.f22146b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22147c;
        int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f22148d) * 31) + this.f22149e) * 31) + this.f22150f) * 31) + this.f22151g) * 31;
        String str4 = this.f22153i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ys ysVar = this.f22154j;
        int iHashCode5 = (iHashCode4 + (ysVar == null ? 0 : ysVar.hashCode())) * 31;
        String str5 = this.f22155k;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f22156l;
        int iHashCode7 = (((((((((((((((((((((((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f22157m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.r) * 31) + Float.floatToIntBits(this.s)) * 31) + this.t) * 31) + Float.floatToIntBits(this.u)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31;
        Class<? extends qt> cls = this.E;
        int iHashCode8 = iHashCode7 + (cls != null ? cls.hashCode() : 0);
        this.F = iHashCode8;
        return iHashCode8;
    }

    public final String toString() {
        String str = this.f22145a;
        String str2 = this.f22146b;
        String str3 = this.f22155k;
        String str4 = this.f22156l;
        String str5 = this.f22153i;
        int i2 = this.f22152h;
        String str6 = this.f22147c;
        int i3 = this.q;
        int i4 = this.r;
        float f2 = this.s;
        int i5 = this.y;
        int i6 = this.z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f22145a);
        parcel.writeString(this.f22146b);
        parcel.writeString(this.f22147c);
        parcel.writeInt(this.f22148d);
        parcel.writeInt(this.f22149e);
        parcel.writeInt(this.f22150f);
        parcel.writeInt(this.f22151g);
        parcel.writeString(this.f22153i);
        parcel.writeParcelable(this.f22154j, 0);
        parcel.writeString(this.f22155k);
        parcel.writeString(this.f22156l);
        parcel.writeInt(this.f22157m);
        int size = this.f22158n.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f22158n.get(i3));
        }
        parcel.writeParcelable(this.f22159o, 0);
        parcel.writeLong(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeFloat(this.s);
        parcel.writeInt(this.t);
        parcel.writeFloat(this.u);
        amn.N(parcel, this.v != null);
        byte[] bArr = this.v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.w);
        parcel.writeParcelable(this.x, i2);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
    }
}
