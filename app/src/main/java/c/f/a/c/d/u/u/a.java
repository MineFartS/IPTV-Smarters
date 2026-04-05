package c.f.a.c.d.u.u;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c.f.a.c.d.u.u.h;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c.f.a.c.f.q.w.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f11930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f11931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11933h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11927b = new c.f.a.c.d.v.b("CastMediaOptions");
    public static final Parcelable.Creator<a> CREATOR = new n();

    /* JADX INFO: renamed from: c.f.a.c.d.u.u.a$a, reason: collision with other inner class name */
    public static final class C0153a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f11936c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11934a = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h f11937d = new h.a().a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f11938e = true;

        public final a a() {
            c cVar = this.f11936c;
            return new a(this.f11934a, this.f11935b, cVar == null ? null : cVar.c().asBinder(), this.f11937d, false, this.f11938e);
        }

        public final C0153a b(String str) {
            this.f11935b = str;
            return this;
        }

        public final C0153a c(h hVar) {
            this.f11937d = hVar;
            return this;
        }
    }

    public a(String str, String str2, IBinder iBinder, h hVar, boolean z, boolean z2) {
        f0 n0Var;
        this.f11928c = str;
        this.f11929d = str2;
        if (iBinder == null) {
            n0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            n0Var = iInterfaceQueryLocalInterface instanceof f0 ? (f0) iInterfaceQueryLocalInterface : new n0(iBinder);
        }
        this.f11930e = n0Var;
        this.f11931f = hVar;
        this.f11932g = z;
        this.f11933h = z2;
    }

    public String I() {
        return this.f11929d;
    }

    public c J() {
        f0 f0Var = this.f11930e;
        if (f0Var == null) {
            return null;
        }
        try {
            return (c) c.f.a.c.g.b.I2(f0Var.z());
        } catch (RemoteException e2) {
            f11927b.b(e2, "Unable to call %s on %s.", "getWrappedClientObject", f0.class.getSimpleName());
            return null;
        }
    }

    public String K() {
        return this.f11928c;
    }

    public boolean L() {
        return this.f11933h;
    }

    public h M() {
        return this.f11931f;
    }

    public final boolean N() {
        return this.f11932g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, K(), false);
        c.f.a.c.f.q.w.c.s(parcel, 3, I(), false);
        f0 f0Var = this.f11930e;
        c.f.a.c.f.q.w.c.k(parcel, 4, f0Var == null ? null : f0Var.asBinder(), false);
        c.f.a.c.f.q.w.c.r(parcel, 5, M(), i2, false);
        c.f.a.c.f.q.w.c.c(parcel, 6, this.f11932g);
        c.f.a.c.f.q.w.c.c(parcel, 7, L());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
