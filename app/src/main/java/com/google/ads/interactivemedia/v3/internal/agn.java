package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class agn implements yr {
    public static final Parcelable.Creator<agn> CREATOR = new agl(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<agm> f19618c;

    public agn(Parcel parcel) {
        this.f19616a = parcel.readString();
        this.f19617b = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((agm) parcel.readParcelable(agm.class.getClassLoader()));
        }
        this.f19618c = Collections.unmodifiableList(arrayList);
    }

    public agn(String str, String str2, List<agm> list) {
        this.f19616a = str;
        this.f19617b = str2;
        this.f19618c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yr
    public final /* synthetic */ void a(ko koVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && agn.class == obj.getClass()) {
            agn agnVar = (agn) obj;
            if (TextUtils.equals(this.f19616a, agnVar.f19616a) && TextUtils.equals(this.f19617b, agnVar.f19617b) && this.f19618c.equals(agnVar.f19618c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19616a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19617b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f19618c.hashCode();
    }

    public final String toString() {
        String string;
        String str = this.f19616a;
        if (str != null) {
            String str2 = this.f19617b;
            StringBuilder sb = new StringBuilder(str.length() + 5 + String.valueOf(str2).length());
            sb.append(" [");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("]");
            string = sb.toString();
        } else {
            string = BuildConfig.FLAVOR;
        }
        String strValueOf = String.valueOf(string);
        return strValueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(strValueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f19616a);
        parcel.writeString(this.f19617b);
        int size = this.f19618c.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeParcelable(this.f19618c.get(i3), 0);
        }
    }
}
