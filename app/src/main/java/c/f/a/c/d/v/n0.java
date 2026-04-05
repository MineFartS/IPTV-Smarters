package c.f.a.c.d.v;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import c.f.a.c.f.o.f;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends c.f.a.c.f.q.g<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12179a = new b("CastClientImplCxless");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CastDevice f12180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f12182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12183e;

    public n0(Context context, Looper looper, c.f.a.c.f.q.d dVar, CastDevice castDevice, long j2, Bundle bundle, String str, f.a aVar, f.b bVar) {
        super(context, looper, 10, dVar, aVar, bVar);
        this.f12180b = castDevice;
        this.f12181c = j2;
        this.f12182d = bundle;
        this.f12183e = str;
    }

    @Override // c.f.a.c.f.q.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final void disconnect() {
        try {
            try {
                ((h) getService()).disconnect();
            } catch (RemoteException | IllegalStateException e2) {
                f12179a.b(e2, "Error while disconnecting the controller interface: %s", e2.getMessage());
            }
        } finally {
            super.disconnect();
        }
    }

    @Override // c.f.a.c.f.q.c
    public final c.f.a.c.f.d[] getApiFeatures() {
        return c.f.a.c.d.b0.f11574h;
    }

    @Override // c.f.a.c.f.q.c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f12179a.a("getRemoteService()", new Object[0]);
        this.f12180b.P(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f12181c);
        bundle.putString("connectionless_client_record_id", this.f12183e);
        Bundle bundle2 = this.f12182d;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return 19390000;
    }

    @Override // c.f.a.c.f.q.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // c.f.a.c.f.q.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
