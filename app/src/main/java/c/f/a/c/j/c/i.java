package c.f.a.c.j.c;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;
import c.f.a.c.d.u.j0;
import c.f.a.c.d.u.m0;
import c.f.a.c.d.u.p0;
import c.f.a.c.d.u.s0;
import c.f.a.c.d.u.u.k.g;
import com.amazonaws.services.s3.internal.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends t implements j {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // c.f.a.c.j.c.j
    public final c.f.a.c.d.u.m0 D0(c.f.a.c.d.u.c cVar, c.f.a.c.g.a aVar, c.f.a.c.d.u.h0 h0Var) {
        Parcel parcelJ = J();
        v0.d(parcelJ, cVar);
        v0.c(parcelJ, aVar);
        v0.c(parcelJ, h0Var);
        Parcel parcelC1 = c1(3, parcelJ);
        c.f.a.c.d.u.m0 m0VarC1 = m0.a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return m0VarC1;
    }

    @Override // c.f.a.c.j.c.j
    public final c.f.a.c.d.u.u.k.g F2(c.f.a.c.g.a aVar, c.f.a.c.d.u.u.k.k kVar, int i2, int i3, boolean z, long j2, int i4, int i5, int i6) {
        Parcel parcelJ = J();
        v0.c(parcelJ, aVar);
        v0.c(parcelJ, kVar);
        parcelJ.writeInt(i2);
        parcelJ.writeInt(i3);
        v0.a(parcelJ, z);
        parcelJ.writeLong(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        parcelJ.writeInt(5);
        parcelJ.writeInt(333);
        parcelJ.writeInt(Constants.MAXIMUM_UPLOAD_PARTS);
        Parcel parcelC1 = c1(6, parcelJ);
        c.f.a.c.d.u.u.k.g gVarC1 = g.a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return gVarC1;
    }

    @Override // c.f.a.c.j.c.j
    public final c.f.a.c.d.u.s0 j0(String str, String str2, c.f.a.c.d.u.w wVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        v0.c(parcelJ, wVar);
        Parcel parcelC1 = c1(2, parcelJ);
        c.f.a.c.d.u.s0 s0VarC1 = s0.a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return s0VarC1;
    }

    @Override // c.f.a.c.j.c.j
    public final c.f.a.c.d.u.j0 k0(c.f.a.c.g.a aVar, c.f.a.c.d.u.c cVar, l lVar, Map map) {
        Parcel parcelJ = J();
        v0.c(parcelJ, aVar);
        v0.d(parcelJ, cVar);
        v0.c(parcelJ, lVar);
        parcelJ.writeMap(map);
        Parcel parcelC1 = c1(1, parcelJ);
        c.f.a.c.d.u.j0 j0VarC1 = j0.a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return j0VarC1;
    }

    @Override // c.f.a.c.j.c.j
    public final c.f.a.c.d.u.p0 s1(c.f.a.c.g.a aVar, c.f.a.c.g.a aVar2, c.f.a.c.g.a aVar3) {
        Parcel parcelJ = J();
        v0.c(parcelJ, aVar);
        v0.c(parcelJ, aVar2);
        v0.c(parcelJ, aVar3);
        Parcel parcelC1 = c1(5, parcelJ);
        c.f.a.c.d.u.p0 p0VarC1 = p0.a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return p0VarC1;
    }
}
