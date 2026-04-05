package c.f.a.c.d.u.u;

import android.util.Log;
import c.f.a.c.d.u.u.i;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements c.f.a.c.d.v.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f11964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.h f11965b;

    public e0(i.h hVar, i iVar) {
        this.f11965b = hVar;
        this.f11964a = iVar;
    }

    @Override // c.f.a.c.d.v.u
    public final void a(long j2) {
        try {
            i.h hVar = this.f11965b;
            hVar.i((i.c) hVar.e(new Status(2103)));
        } catch (IllegalStateException e2) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e2);
        }
    }

    @Override // c.f.a.c.d.v.u
    public final void b(long j2, int i2, Object obj) {
        c.f.a.c.d.v.s sVar = obj instanceof c.f.a.c.d.v.s ? (c.f.a.c.d.v.s) obj : null;
        try {
            this.f11965b.i(new i.C0154i(new Status(i2), sVar != null ? sVar.f12202a : null, sVar != null ? sVar.f12203b : null));
        } catch (IllegalStateException e2) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e2);
        }
    }
}
