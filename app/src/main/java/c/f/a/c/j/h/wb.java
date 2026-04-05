package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class wb extends a implements qd {
    public wb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // c.f.a.c.j.h.qd
    public final void beginAdUnitExposure(String str, long j2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeLong(j2);
        c1(23, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        n0.d(parcelJ, bundle);
        c1(9, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void endAdUnitExposure(String str, long j2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeLong(j2);
        c1(24, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void generateEventId(td tdVar) {
        Parcel parcelJ = J();
        n0.e(parcelJ, tdVar);
        c1(22, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void getCachedAppInstanceId(td tdVar) {
        Parcel parcelJ = J();
        n0.e(parcelJ, tdVar);
        c1(19, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void getConditionalUserProperties(String str, String str2, td tdVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        n0.e(parcelJ, tdVar);
        c1(10, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void getCurrentScreenClass(td tdVar) {
        Parcel parcelJ = J();
        n0.e(parcelJ, tdVar);
        c1(17, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void getCurrentScreenName(td tdVar) {
        Parcel parcelJ = J();
        n0.e(parcelJ, tdVar);
        c1(16, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void getGmpAppId(td tdVar) {
        Parcel parcelJ = J();
        n0.e(parcelJ, tdVar);
        c1(21, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void getMaxUserProperties(String str, td tdVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        n0.e(parcelJ, tdVar);
        c1(6, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void getUserProperties(String str, String str2, boolean z, td tdVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        n0.b(parcelJ, z);
        n0.e(parcelJ, tdVar);
        c1(5, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void initialize(c.f.a.c.g.a aVar, yd ydVar, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        n0.d(parcelJ, ydVar);
        parcelJ.writeLong(j2);
        c1(1, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        n0.d(parcelJ, bundle);
        n0.b(parcelJ, z);
        n0.b(parcelJ, z2);
        parcelJ.writeLong(j2);
        c1(2, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void logHealthData(int i2, String str, c.f.a.c.g.a aVar, c.f.a.c.g.a aVar2, c.f.a.c.g.a aVar3) {
        Parcel parcelJ = J();
        parcelJ.writeInt(5);
        parcelJ.writeString(str);
        n0.e(parcelJ, aVar);
        n0.e(parcelJ, aVar2);
        n0.e(parcelJ, aVar3);
        c1(33, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void onActivityCreated(c.f.a.c.g.a aVar, Bundle bundle, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        n0.d(parcelJ, bundle);
        parcelJ.writeLong(j2);
        c1(27, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void onActivityDestroyed(c.f.a.c.g.a aVar, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        parcelJ.writeLong(j2);
        c1(28, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void onActivityPaused(c.f.a.c.g.a aVar, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        parcelJ.writeLong(j2);
        c1(29, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void onActivityResumed(c.f.a.c.g.a aVar, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        parcelJ.writeLong(j2);
        c1(30, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void onActivitySaveInstanceState(c.f.a.c.g.a aVar, td tdVar, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        n0.e(parcelJ, tdVar);
        parcelJ.writeLong(j2);
        c1(31, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void onActivityStarted(c.f.a.c.g.a aVar, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        parcelJ.writeLong(j2);
        c1(25, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void onActivityStopped(c.f.a.c.g.a aVar, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        parcelJ.writeLong(j2);
        c1(26, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        Parcel parcelJ = J();
        n0.d(parcelJ, bundle);
        parcelJ.writeLong(j2);
        c1(8, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void setCurrentScreen(c.f.a.c.g.a aVar, String str, String str2, long j2) {
        Parcel parcelJ = J();
        n0.e(parcelJ, aVar);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeLong(j2);
        c1(15, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelJ = J();
        n0.b(parcelJ, z);
        c1(39, parcelJ);
    }

    @Override // c.f.a.c.j.h.qd
    public final void setUserProperty(String str, String str2, c.f.a.c.g.a aVar, boolean z, long j2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        n0.e(parcelJ, aVar);
        n0.b(parcelJ, z);
        parcelJ.writeLong(j2);
        c1(4, parcelJ);
    }
}
