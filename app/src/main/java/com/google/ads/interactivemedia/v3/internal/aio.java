package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aio implements Parcelable {
    public static final aio C;
    public static final Parcelable.Creator<aio> CREATOR;
    public final aty<String> D;
    public final int E;
    public final aty<String> F;
    public final int G;
    public final boolean H;
    public final int I;

    static {
        ain ainVar = new ain();
        C = new aio(ainVar.f19841a, ainVar.f19842b, ainVar.f19843c);
        CREATOR = new aic(2);
    }

    public aio(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.D = aty.l(arrayList);
        this.E = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.F = aty.l(arrayList2);
        this.G = parcel.readInt();
        this.H = amn.V(parcel);
        this.I = parcel.readInt();
    }

    public aio(aty<String> atyVar, aty<String> atyVar2, int i2) {
        this.D = atyVar;
        this.E = 0;
        this.F = atyVar2;
        this.G = i2;
        this.H = false;
        this.I = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aio aioVar = (aio) obj;
            if (this.D.equals(aioVar.D) && this.E == aioVar.E && this.F.equals(aioVar.F) && this.G == aioVar.G && this.H == aioVar.H && this.I == aioVar.I) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.D.hashCode() + 31) * 31) + this.E) * 31) + this.F.hashCode()) * 31) + this.G) * 31) + (this.H ? 1 : 0)) * 31) + this.I;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.D);
        parcel.writeInt(this.E);
        parcel.writeList(this.F);
        parcel.writeInt(this.G);
        amn.N(parcel, this.H);
        parcel.writeInt(this.I);
    }
}
