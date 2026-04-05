package c.f.a.c.d.u.u;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends c.f.a.c.j.c.t implements m0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // c.f.a.c.d.u.u.m0
    public final List<f> F() {
        Parcel parcelC1 = c1(3, J());
        ArrayList arrayListCreateTypedArrayList = parcelC1.createTypedArrayList(f.CREATOR);
        parcelC1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // c.f.a.c.d.u.u.m0
    public final int[] k1() {
        Parcel parcelC1 = c1(4, J());
        int[] iArrCreateIntArray = parcelC1.createIntArray();
        parcelC1.recycle();
        return iArrCreateIntArray;
    }
}
