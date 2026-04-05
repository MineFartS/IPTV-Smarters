package a.a.e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0000a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f5c;

    /* JADX INFO: renamed from: a.a.e.a$a, reason: collision with other inner class name */
    public class C0000a implements Parcelable.Creator<a> {
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

    public a(int i2, Intent intent) {
        this.f4b = i2;
        this.f5c = intent;
    }

    public a(Parcel parcel) {
        this.f4b = parcel.readInt();
        this.f5c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String d(int i2) {
        return i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent b() {
        return this.f5c;
    }

    public int c() {
        return this.f4b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + d(this.f4b) + ", data=" + this.f5c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4b);
        parcel.writeInt(this.f5c == null ? 0 : 1);
        Intent intent = this.f5c;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
