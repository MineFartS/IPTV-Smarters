package c.f.a.c.m.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.f;
import c.f.a.c.f.q.c;
import c.f.a.c.f.q.j0;
import c.f.a.c.f.q.o;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c.f.a.c.f.q.g<g> implements c.f.a.c.m.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14527a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.f.q.d f14529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f14530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f14531e;

    public a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, boolean z, @RecentlyNonNull c.f.a.c.f.q.d dVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull f.a aVar, @RecentlyNonNull f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f14528b = true;
        this.f14529c = dVar;
        this.f14530d = bundle;
        this.f14531e = dVar.h();
    }

    @RecentlyNonNull
    public static Bundle a(@RecentlyNonNull c.f.a.c.f.q.d dVar) {
        dVar.g();
        Integer numH = dVar.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (numH != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numH.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // c.f.a.c.m.g
    public final void b() {
        connect(new c.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.f.a.c.m.g
    public final void c(f fVar) {
        o.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f14529c.b();
            ((g) getService()).K2(new j(1, new j0(accountB, ((Integer) o.i(this.f14531e)).intValue(), c.f.a.c.f.q.c.DEFAULT_ACCOUNT.equals(accountB.name) ? c.f.a.c.b.a.a.a.a.a(getContext()).b() : null)), fVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.b0(new l(1, new c.f.a.c.f.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // c.f.a.c.f.q.c
    @RecentlyNonNull
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // c.f.a.c.f.q.c
    @RecentlyNonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f14529c.d())) {
            this.f14530d.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f14529c.d());
        }
        return this.f14530d;
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // c.f.a.c.f.q.c
    @RecentlyNonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // c.f.a.c.f.q.c
    @RecentlyNonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final boolean requiresSignIn() {
        return this.f14528b;
    }
}
