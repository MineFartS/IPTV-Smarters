package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class qg implements Comparator<qf>, Parcelable {
    public static final Parcelable.Creator<qg> CREATOR = new qe(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qf[] f22823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22824d;

    public qg(Parcel parcel) {
        this.f22821a = parcel.readString();
        qf[] qfVarArr = (qf[]) amn.A((qf[]) parcel.createTypedArray(qf.CREATOR));
        this.f22823c = qfVarArr;
        this.f22822b = qfVarArr.length;
    }

    public qg(String str, List<qf> list) {
        this(str, false, (qf[]) list.toArray(new qf[0]));
    }

    private qg(String str, boolean z, qf... qfVarArr) {
        this.f22821a = str;
        qfVarArr = z ? (qf[]) qfVarArr.clone() : qfVarArr;
        this.f22823c = qfVarArr;
        this.f22822b = qfVarArr.length;
        Arrays.sort(qfVarArr, this);
    }

    public qg(String str, qf... qfVarArr) {
        this(str, true, qfVarArr);
    }

    public qg(List<qf> list) {
        this(null, false, (qf[]) list.toArray(new qf[0]));
    }

    public static qg b(qg qgVar, qg qgVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (qgVar != null) {
            str = qgVar.f22821a;
            for (qf qfVar : qgVar.f22823c) {
                if (qfVar.c()) {
                    arrayList.add(qfVar);
                }
            }
        } else {
            str = null;
        }
        if (qgVar2 != null) {
            if (str == null) {
                str = qgVar2.f22821a;
            }
            int size = arrayList.size();
            for (qf qfVar2 : qgVar2.f22823c) {
                if (qfVar2.c()) {
                    UUID uuid = qfVar2.f22816a;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            arrayList.add(qfVar2);
                            break;
                        }
                        if (((qf) arrayList.get(i2)).f22816a.equals(uuid)) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new qg(str, arrayList);
    }

    public final qg a(String str) {
        return amn.O(this.f22821a, str) ? this : new qg(str, false, this.f22823c);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(qf qfVar, qf qfVar2) {
        qf qfVar3 = qfVar;
        qf qfVar4 = qfVar2;
        UUID uuid = iw.f21995a;
        return uuid.equals(qfVar3.f22816a) ? !uuid.equals(qfVar4.f22816a) ? 1 : 0 : qfVar3.f22816a.compareTo(qfVar4.f22816a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qg.class == obj.getClass()) {
            qg qgVar = (qg) obj;
            if (amn.O(this.f22821a, qgVar.f22821a) && Arrays.equals(this.f22823c, qgVar.f22823c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f22824d;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f22821a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f22823c);
        this.f22824d = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f22821a);
        parcel.writeTypedArray(this.f22823c, 0);
    }
}
