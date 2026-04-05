package a.l.d;

import a.l.d.n;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<u> f2440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<String> f2441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b[] f2442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<String> f2445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<Bundle> f2446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<n.m> f2447i;

    public class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i2) {
            return new p[i2];
        }
    }

    public p() {
        this.f2444f = null;
        this.f2445g = new ArrayList<>();
        this.f2446h = new ArrayList<>();
    }

    public p(Parcel parcel) {
        this.f2444f = null;
        this.f2445g = new ArrayList<>();
        this.f2446h = new ArrayList<>();
        this.f2440b = parcel.createTypedArrayList(u.CREATOR);
        this.f2441c = parcel.createStringArrayList();
        this.f2442d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2443e = parcel.readInt();
        this.f2444f = parcel.readString();
        this.f2445g = parcel.createStringArrayList();
        this.f2446h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2447i = parcel.createTypedArrayList(n.m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f2440b);
        parcel.writeStringList(this.f2441c);
        parcel.writeTypedArray(this.f2442d, i2);
        parcel.writeInt(this.f2443e);
        parcel.writeString(this.f2444f);
        parcel.writeStringList(this.f2445g);
        parcel.writeTypedList(this.f2446h);
        parcel.writeTypedList(this.f2447i);
    }
}
