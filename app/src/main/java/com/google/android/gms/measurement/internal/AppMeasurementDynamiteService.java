package com.google.android.gms.measurement.internal;

import a.f.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;
import c.f.a.c.g.b;
import c.f.a.c.j.h.td;
import c.f.a.c.j.h.vd;
import c.f.a.c.j.h.xc;
import c.f.a.c.j.h.xd;
import c.f.a.c.j.h.yd;
import c.f.a.c.k.b.c5;
import c.f.a.c.k.b.e6;
import c.f.a.c.k.b.e7;
import c.f.a.c.k.b.ea;
import c.f.a.c.k.b.f7;
import c.f.a.c.k.b.h6;
import c.f.a.c.k.b.h7;
import c.f.a.c.k.b.h8;
import c.f.a.c.k.b.ha;
import c.f.a.c.k.b.i9;
import c.f.a.c.k.b.ia;
import c.f.a.c.k.b.j6;
import c.f.a.c.k.b.ja;
import c.f.a.c.k.b.ka;
import c.f.a.c.k.b.l6;
import c.f.a.c.k.b.m3;
import c.f.a.c.k.b.r;
import c.f.a.c.k.b.t;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends xc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c5 f24282b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, e6> f24283c = new a();

    public final void I2(td tdVar, String str) {
        this.f24282b.G().R(tdVar, str);
    }

    @Override // c.f.a.c.j.h.qd
    public void beginAdUnitExposure(@RecentlyNonNull String str, long j2) {
        c1();
        this.f24282b.g().h(str, j2);
    }

    public final void c1() {
        if (this.f24282b == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void clearConditionalUserProperty(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        c1();
        this.f24282b.F().B(str, str2, bundle);
    }

    @Override // c.f.a.c.j.h.qd
    public void clearMeasurementEnabled(long j2) {
        c1();
        this.f24282b.F().T(null);
    }

    @Override // c.f.a.c.j.h.qd
    public void endAdUnitExposure(@RecentlyNonNull String str, long j2) {
        c1();
        this.f24282b.g().i(str, j2);
    }

    @Override // c.f.a.c.j.h.qd
    public void generateEventId(td tdVar) {
        c1();
        this.f24282b.G().S(tdVar, this.f24282b.G().g0());
    }

    @Override // c.f.a.c.j.h.qd
    public void getAppInstanceId(td tdVar) {
        c1();
        this.f24282b.d().r(new h6(this, tdVar));
    }

    @Override // c.f.a.c.j.h.qd
    public void getCachedAppInstanceId(td tdVar) {
        c1();
        I2(tdVar, this.f24282b.F().q());
    }

    @Override // c.f.a.c.j.h.qd
    public void getConditionalUserProperties(String str, String str2, td tdVar) {
        c1();
        this.f24282b.d().r(new ha(this, tdVar, str, str2));
    }

    @Override // c.f.a.c.j.h.qd
    public void getCurrentScreenClass(td tdVar) {
        c1();
        I2(tdVar, this.f24282b.F().F());
    }

    @Override // c.f.a.c.j.h.qd
    public void getCurrentScreenName(td tdVar) {
        c1();
        I2(tdVar, this.f24282b.F().E());
    }

    @Override // c.f.a.c.j.h.qd
    public void getGmpAppId(td tdVar) {
        c1();
        I2(tdVar, this.f24282b.F().G());
    }

    @Override // c.f.a.c.j.h.qd
    public void getMaxUserProperties(String str, td tdVar) {
        c1();
        this.f24282b.F().y(str);
        this.f24282b.G().T(tdVar, 25);
    }

    @Override // c.f.a.c.j.h.qd
    public void getTestFlag(td tdVar, int i2) {
        c1();
        if (i2 == 0) {
            this.f24282b.G().R(tdVar, this.f24282b.F().P());
            return;
        }
        if (i2 == 1) {
            this.f24282b.G().S(tdVar, this.f24282b.F().Q().longValue());
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                this.f24282b.G().T(tdVar, this.f24282b.F().R().intValue());
                return;
            } else {
                if (i2 != 4) {
                    return;
                }
                this.f24282b.G().V(tdVar, this.f24282b.F().O().booleanValue());
                return;
            }
        }
        ea eaVarG = this.f24282b.G();
        double dDoubleValue = this.f24282b.F().S().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            eaVarG.f14413a.c().r().b("Error returning double value to wrapper", e2);
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void getUserProperties(String str, String str2, boolean z, td tdVar) {
        c1();
        this.f24282b.d().r(new h8(this, tdVar, str, str2, z));
    }

    @Override // c.f.a.c.j.h.qd
    public void initForTests(@RecentlyNonNull Map map) {
        c1();
    }

    @Override // c.f.a.c.j.h.qd
    public void initialize(c.f.a.c.g.a aVar, yd ydVar, long j2) {
        Context context = (Context) b.I2(aVar);
        c5 c5Var = this.f24282b;
        if (c5Var == null) {
            this.f24282b = c5.h(context, ydVar, Long.valueOf(j2));
        } else {
            c5Var.c().r().a("Attempting to initialize multiple times");
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void isDataCollectionEnabled(td tdVar) {
        c1();
        this.f24282b.d().r(new ia(this, tdVar));
    }

    @Override // c.f.a.c.j.h.qd
    public void logEvent(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle, boolean z, boolean z2, long j2) {
        c1();
        this.f24282b.F().a0(str, str2, bundle, z, z2, j2);
    }

    @Override // c.f.a.c.j.h.qd
    public void logEventAndBundle(String str, String str2, Bundle bundle, td tdVar, long j2) {
        c1();
        o.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f24282b.d().r(new h7(this, tdVar, new t(str2, new r(bundle), "app", j2), str));
    }

    @Override // c.f.a.c.j.h.qd
    public void logHealthData(int i2, @RecentlyNonNull String str, @RecentlyNonNull c.f.a.c.g.a aVar, @RecentlyNonNull c.f.a.c.g.a aVar2, @RecentlyNonNull c.f.a.c.g.a aVar3) {
        c1();
        this.f24282b.c().y(i2, true, false, str, aVar == null ? null : b.I2(aVar), aVar2 == null ? null : b.I2(aVar2), aVar3 != null ? b.I2(aVar3) : null);
    }

    @Override // c.f.a.c.j.h.qd
    public void onActivityCreated(@RecentlyNonNull c.f.a.c.g.a aVar, @RecentlyNonNull Bundle bundle, long j2) {
        c1();
        e7 e7Var = this.f24282b.F().f13877c;
        if (e7Var != null) {
            this.f24282b.F().N();
            e7Var.onActivityCreated((Activity) b.I2(aVar), bundle);
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void onActivityDestroyed(@RecentlyNonNull c.f.a.c.g.a aVar, long j2) {
        c1();
        e7 e7Var = this.f24282b.F().f13877c;
        if (e7Var != null) {
            this.f24282b.F().N();
            e7Var.onActivityDestroyed((Activity) b.I2(aVar));
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void onActivityPaused(@RecentlyNonNull c.f.a.c.g.a aVar, long j2) {
        c1();
        e7 e7Var = this.f24282b.F().f13877c;
        if (e7Var != null) {
            this.f24282b.F().N();
            e7Var.onActivityPaused((Activity) b.I2(aVar));
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void onActivityResumed(@RecentlyNonNull c.f.a.c.g.a aVar, long j2) {
        c1();
        e7 e7Var = this.f24282b.F().f13877c;
        if (e7Var != null) {
            this.f24282b.F().N();
            e7Var.onActivityResumed((Activity) b.I2(aVar));
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void onActivitySaveInstanceState(c.f.a.c.g.a aVar, td tdVar, long j2) {
        c1();
        e7 e7Var = this.f24282b.F().f13877c;
        Bundle bundle = new Bundle();
        if (e7Var != null) {
            this.f24282b.F().N();
            e7Var.onActivitySaveInstanceState((Activity) b.I2(aVar), bundle);
        }
        try {
            tdVar.w1(bundle);
        } catch (RemoteException e2) {
            this.f24282b.c().r().b("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void onActivityStarted(@RecentlyNonNull c.f.a.c.g.a aVar, long j2) {
        c1();
        if (this.f24282b.F().f13877c != null) {
            this.f24282b.F().N();
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void onActivityStopped(@RecentlyNonNull c.f.a.c.g.a aVar, long j2) {
        c1();
        if (this.f24282b.F().f13877c != null) {
            this.f24282b.F().N();
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void performAction(Bundle bundle, td tdVar, long j2) {
        c1();
        tdVar.w1(null);
    }

    @Override // c.f.a.c.j.h.qd
    public void registerOnMeasurementEventListener(vd vdVar) {
        e6 kaVar;
        c1();
        synchronized (this.f24283c) {
            kaVar = this.f24283c.get(Integer.valueOf(vdVar.d()));
            if (kaVar == null) {
                kaVar = new ka(this, vdVar);
                this.f24283c.put(Integer.valueOf(vdVar.d()), kaVar);
            }
        }
        this.f24282b.F().w(kaVar);
    }

    @Override // c.f.a.c.j.h.qd
    public void resetAnalyticsData(long j2) {
        c1();
        this.f24282b.F().s(j2);
    }

    @Override // c.f.a.c.j.h.qd
    public void setConditionalUserProperty(@RecentlyNonNull Bundle bundle, long j2) {
        c1();
        if (bundle == null) {
            this.f24282b.c().o().a("Conditional user property must not be null");
        } else {
            this.f24282b.F().A(bundle, j2);
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void setConsent(@RecentlyNonNull Bundle bundle, long j2) {
        c1();
        f7 f7VarF = this.f24282b.F();
        c.f.a.c.j.h.ha.a();
        if (f7VarF.f14413a.z().w(null, m3.G0)) {
            f7VarF.U(bundle, 30, j2);
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void setConsentThirdParty(@RecentlyNonNull Bundle bundle, long j2) {
        c1();
        f7 f7VarF = this.f24282b.F();
        c.f.a.c.j.h.ha.a();
        if (f7VarF.f14413a.z().w(null, m3.H0)) {
            f7VarF.U(bundle, 10, j2);
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void setCurrentScreen(@RecentlyNonNull c.f.a.c.g.a aVar, @RecentlyNonNull String str, @RecentlyNonNull String str2, long j2) {
        c1();
        this.f24282b.Q().v((Activity) b.I2(aVar), str, str2);
    }

    @Override // c.f.a.c.j.h.qd
    public void setDataCollectionEnabled(boolean z) {
        c1();
        f7 f7VarF = this.f24282b.F();
        f7VarF.i();
        f7VarF.f14413a.d().r(new j6(f7VarF, z));
    }

    @Override // c.f.a.c.j.h.qd
    public void setDefaultEventParameters(@RecentlyNonNull Bundle bundle) {
        c1();
        final f7 f7VarF = this.f24282b.F();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        f7VarF.f14413a.d().r(new Runnable(f7VarF, bundle2) { // from class: c.f.a.c.k.b.g6

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final f7 f13918b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Bundle f13919c;

            {
                this.f13918b = f7VarF;
                this.f13919c = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f13918b.H(this.f13919c);
            }
        });
    }

    @Override // c.f.a.c.j.h.qd
    public void setEventInterceptor(vd vdVar) {
        c1();
        ja jaVar = new ja(this, vdVar);
        if (this.f24282b.d().o()) {
            this.f24282b.F().v(jaVar);
        } else {
            this.f24282b.d().r(new i9(this, jaVar));
        }
    }

    @Override // c.f.a.c.j.h.qd
    public void setInstanceIdProvider(xd xdVar) {
        c1();
    }

    @Override // c.f.a.c.j.h.qd
    public void setMeasurementEnabled(boolean z, long j2) {
        c1();
        this.f24282b.F().T(Boolean.valueOf(z));
    }

    @Override // c.f.a.c.j.h.qd
    public void setMinimumSessionDuration(long j2) {
        c1();
    }

    @Override // c.f.a.c.j.h.qd
    public void setSessionTimeoutDuration(long j2) {
        c1();
        f7 f7VarF = this.f24282b.F();
        f7VarF.f14413a.d().r(new l6(f7VarF, j2));
    }

    @Override // c.f.a.c.j.h.qd
    public void setUserId(@RecentlyNonNull String str, long j2) {
        c1();
        this.f24282b.F().d0(null, TransferTable.COLUMN_ID, str, true, j2);
    }

    @Override // c.f.a.c.j.h.qd
    public void setUserProperty(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull c.f.a.c.g.a aVar, boolean z, long j2) {
        c1();
        this.f24282b.F().d0(str, str2, b.I2(aVar), z, j2);
    }

    @Override // c.f.a.c.j.h.qd
    public void unregisterOnMeasurementEventListener(vd vdVar) {
        e6 e6VarRemove;
        c1();
        synchronized (this.f24283c) {
            e6VarRemove = this.f24283c.remove(Integer.valueOf(vdVar.d()));
        }
        if (e6VarRemove == null) {
            e6VarRemove = new ka(this, vdVar);
        }
        this.f24282b.F().x(e6VarRemove);
    }
}
