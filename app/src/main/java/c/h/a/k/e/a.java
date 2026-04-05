package c.h.a.k.e;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c.h.a.i.f;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0236a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f17877b;
    public boolean A;
    public boolean B;
    public String C;
    public int D;
    public String E;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet<?> f17878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f17880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Uri f17886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f17889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17890o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public long t;
    public int u;
    public int v;
    public ArrayList<f> w;
    public List<GetEpisdoeDetailsCallback> x;
    public String y;
    public boolean z;

    /* JADX INFO: renamed from: c.h.a.k.e.a$a, reason: collision with other inner class name */
    public static class C0236a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a() {
        this.f17878c = new HashSet<>();
        this.f17879d = false;
        this.f17881f = "12345";
        this.f17882g = true;
        this.f17884i = 0;
        this.f17887l = 0;
        this.f17888m = DefaultRenderer.BACKGROUND_COLOR;
        this.f17889n = "ijk";
        this.f17890o = true;
        this.p = false;
        this.q = true;
        this.r = false;
        this.s = 0;
        this.u = 0;
        this.z = false;
        this.A = false;
        this.B = false;
    }

    public a(Parcel parcel) {
        this.f17878c = new HashSet<>();
        this.f17879d = false;
        this.f17881f = "12345";
        this.f17882g = true;
        this.f17884i = 0;
        this.f17887l = 0;
        this.f17888m = DefaultRenderer.BACKGROUND_COLOR;
        this.f17889n = "ijk";
        this.f17890o = true;
        this.p = false;
        this.q = true;
        this.r = false;
        this.s = 0;
        this.u = 0;
        this.z = false;
        this.A = false;
        this.B = false;
        this.f17881f = parcel.readString();
        this.f17880e = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f17883h = parcel.readString();
        this.f17882g = parcel.readByte() != 0;
        this.f17884i = parcel.readInt();
        this.f17885j = parcel.readString();
        this.f17886k = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f17878c = (HashSet) parcel.readSerializable();
        this.f17879d = parcel.readByte() != 0;
        this.f17887l = parcel.readInt();
        this.f17888m = parcel.readInt();
        this.f17889n = parcel.readString();
        this.f17890o = parcel.readByte() != 0;
        this.p = parcel.readByte() != 0;
        this.q = parcel.readByte() != 0;
        this.r = parcel.readByte() != 0;
    }

    public static a f() {
        if (f17877b == null) {
            f17877b = new a();
        }
        return f17877b;
    }

    public String b() {
        return this.y;
    }

    public ArrayList<f> c() {
        return this.w;
    }

    public int d() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.C;
    }

    public String h() {
        return this.E;
    }

    public int j() {
        return this.D;
    }

    public int k() {
        return this.v;
    }

    public a l(String str) {
        this.y = str;
        return this;
    }

    public a m(ArrayList<f> arrayList) {
        this.w = arrayList;
        return this;
    }

    public a n(List<GetEpisdoeDetailsCallback> list) {
        this.x = list;
        return this;
    }

    public a o(int i2) {
        this.s = i2;
        return this;
    }

    public a p(String str) {
        this.C = str;
        return this;
    }

    public a q(String str) {
        this.E = str;
        return this;
    }

    public a r(int i2) {
        this.D = i2;
        return this;
    }

    public a t(int i2) {
        this.v = i2;
        return this;
    }

    public a u(long j2) {
        this.t = j2;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f17881f);
        parcel.writeParcelable(this.f17880e, i2);
        parcel.writeString(this.f17883h);
        parcel.writeByte(this.f17882g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f17884i);
        parcel.writeString(this.f17885j);
        parcel.writeParcelable(this.f17886k, i2);
        parcel.writeSerializable(this.f17878c);
        parcel.writeByte(this.f17879d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f17887l);
        parcel.writeInt(this.f17888m);
        parcel.writeString(this.f17889n);
        parcel.writeByte(this.f17890o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
    }
}
