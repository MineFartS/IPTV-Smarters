package a.k.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Parcelable f2178c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2177b = new C0049a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a.k.a.a$a, reason: collision with other inner class name */
    public class C0049a extends a {
        public C0049a() {
            super((C0049a) null);
        }
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2177b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a() {
        this.f2178c = null;
    }

    public /* synthetic */ a(C0049a c0049a) {
        this();
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f2178c = parcelable == null ? f2177b : parcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2178c = parcelable == f2177b ? null : parcelable;
    }

    public final Parcelable b() {
        return this.f2178c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2178c, i2);
    }
}
