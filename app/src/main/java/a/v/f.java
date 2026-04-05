package a.v;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f3543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f3545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f3546e;

    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public f(e eVar) {
        this.f3543b = eVar.f3538g;
        this.f3544c = eVar.b().v();
        this.f3545d = eVar.a();
        Bundle bundle = new Bundle();
        this.f3546e = bundle;
        eVar.g(bundle);
    }

    public f(Parcel parcel) {
        this.f3543b = UUID.fromString(parcel.readString());
        this.f3544c = parcel.readInt();
        this.f3545d = parcel.readBundle(f.class.getClassLoader());
        this.f3546e = parcel.readBundle(f.class.getClassLoader());
    }

    public Bundle b() {
        return this.f3545d;
    }

    public int c() {
        return this.f3544c;
    }

    public Bundle d() {
        return this.f3546e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UUID e() {
        return this.f3543b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f3543b.toString());
        parcel.writeInt(this.f3544c);
        parcel.writeBundle(this.f3545d);
        parcel.writeBundle(this.f3546e);
    }
}
