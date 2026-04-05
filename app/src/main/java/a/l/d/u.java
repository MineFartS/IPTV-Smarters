package a.l.d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f2470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f2473n;

    public class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i2) {
            return new u[i2];
        }
    }

    public u(Parcel parcel) {
        this.f2461b = parcel.readString();
        this.f2462c = parcel.readString();
        this.f2463d = parcel.readInt() != 0;
        this.f2464e = parcel.readInt();
        this.f2465f = parcel.readInt();
        this.f2466g = parcel.readString();
        this.f2467h = parcel.readInt() != 0;
        this.f2468i = parcel.readInt() != 0;
        this.f2469j = parcel.readInt() != 0;
        this.f2470k = parcel.readBundle();
        this.f2471l = parcel.readInt() != 0;
        this.f2473n = parcel.readBundle();
        this.f2472m = parcel.readInt();
    }

    public u(Fragment fragment) {
        this.f2461b = fragment.getClass().getName();
        this.f2462c = fragment.mWho;
        this.f2463d = fragment.mFromLayout;
        this.f2464e = fragment.mFragmentId;
        this.f2465f = fragment.mContainerId;
        this.f2466g = fragment.mTag;
        this.f2467h = fragment.mRetainInstance;
        this.f2468i = fragment.mRemoving;
        this.f2469j = fragment.mDetached;
        this.f2470k = fragment.mArguments;
        this.f2471l = fragment.mHidden;
        this.f2472m = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2461b);
        sb.append(" (");
        sb.append(this.f2462c);
        sb.append(")}:");
        if (this.f2463d) {
            sb.append(" fromLayout");
        }
        if (this.f2465f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2465f));
        }
        String str = this.f2466g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2466g);
        }
        if (this.f2467h) {
            sb.append(" retainInstance");
        }
        if (this.f2468i) {
            sb.append(" removing");
        }
        if (this.f2469j) {
            sb.append(" detached");
        }
        if (this.f2471l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2461b);
        parcel.writeString(this.f2462c);
        parcel.writeInt(this.f2463d ? 1 : 0);
        parcel.writeInt(this.f2464e);
        parcel.writeInt(this.f2465f);
        parcel.writeString(this.f2466g);
        parcel.writeInt(this.f2467h ? 1 : 0);
        parcel.writeInt(this.f2468i ? 1 : 0);
        parcel.writeInt(this.f2469j ? 1 : 0);
        parcel.writeBundle(this.f2470k);
        parcel.writeInt(this.f2471l ? 1 : 0);
        parcel.writeBundle(this.f2473n);
        parcel.writeInt(this.f2472m);
    }
}
