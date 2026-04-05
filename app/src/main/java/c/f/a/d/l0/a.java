package c.f.a.d.l0;

import a.f.i;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class a extends a.k.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0168a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<String, Bundle> f15041d;

    /* JADX INFO: renamed from: c.f.a.d.l0.a$a, reason: collision with other inner class name */
    public static class C0168a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i2 = parcel.readInt();
        String[] strArr = new String[i2];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i2];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f15041d = new i<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f15041d.put(strArr[i3], bundleArr[i3]);
        }
    }

    public /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0168a c0168a) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f15041d = new i<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f15041d + "}";
    }

    @Override // a.k.a.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        int size = this.f15041d.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = this.f15041d.j(i3);
            bundleArr[i3] = this.f15041d.n(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
