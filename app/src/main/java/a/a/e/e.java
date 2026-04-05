package a.a.e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentSender f6b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f7c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9e;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IntentSender f10a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f11b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13d;

        public b(IntentSender intentSender) {
            this.f10a = intentSender;
        }

        public e a() {
            return new e(this.f10a, this.f11b, this.f12c, this.f13d);
        }

        public b b(Intent intent) {
            this.f11b = intent;
            return this;
        }

        public b c(int i2, int i3) {
            this.f13d = i2;
            this.f12c = i3;
            return this;
        }
    }

    public e(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.f6b = intentSender;
        this.f7c = intent;
        this.f8d = i2;
        this.f9e = i3;
    }

    public e(Parcel parcel) {
        this.f6b = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f7c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f8d = parcel.readInt();
        this.f9e = parcel.readInt();
    }

    public Intent b() {
        return this.f7c;
    }

    public int c() {
        return this.f8d;
    }

    public int d() {
        return this.f9e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSender e() {
        return this.f6b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f6b, i2);
        parcel.writeParcelable(this.f7c, i2);
        parcel.writeInt(this.f8d);
        parcel.writeInt(this.f9e);
    }
}
