package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xc extends s implements qd {
    public xc() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static qd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof qd ? (qd) iInterfaceQueryLocalInterface : new wb(iBinder);
    }

    @Override // c.f.a.c.j.h.s
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        td rdVar;
        td rdVar2 = null;
        td rdVar3 = null;
        td rdVar4 = null;
        vd udVar = null;
        vd udVar2 = null;
        vd udVar3 = null;
        td rdVar5 = null;
        td rdVar6 = null;
        td rdVar7 = null;
        td rdVar8 = null;
        td rdVar9 = null;
        td rdVar10 = null;
        xd wdVar = null;
        td rdVar11 = null;
        td rdVar12 = null;
        td rdVar13 = null;
        td rdVar14 = null;
        switch (i2) {
            case 1:
                initialize(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), (yd) n0.c(parcel, yd.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) n0.c(parcel, Bundle.CREATOR), n0.a(parcel), n0.a(parcel), parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) n0.c(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    rdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar = iInterfaceQueryLocalInterface instanceof td ? (td) iInterfaceQueryLocalInterface : new rd(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, rdVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), n0.a(parcel), parcel.readLong());
                break;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean zA = n0.a(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar2 = iInterfaceQueryLocalInterface2 instanceof td ? (td) iInterfaceQueryLocalInterface2 : new rd(strongBinder2);
                }
                getUserProperties(string3, string4, zA, rdVar2);
                break;
            case 6:
                String string5 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar14 = iInterfaceQueryLocalInterface3 instanceof td ? (td) iInterfaceQueryLocalInterface3 : new rd(strongBinder3);
                }
                getMaxUserProperties(string5, rdVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) n0.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) n0.c(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar13 = iInterfaceQueryLocalInterface4 instanceof td ? (td) iInterfaceQueryLocalInterface4 : new rd(strongBinder4);
                }
                getConditionalUserProperties(string6, string7, rdVar13);
                break;
            case 11:
                setMeasurementEnabled(n0.a(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar12 = iInterfaceQueryLocalInterface5 instanceof td ? (td) iInterfaceQueryLocalInterface5 : new rd(strongBinder5);
                }
                getCurrentScreenName(rdVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar11 = iInterfaceQueryLocalInterface6 instanceof td ? (td) iInterfaceQueryLocalInterface6 : new rd(strongBinder6);
                }
                getCurrentScreenClass(rdVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    wdVar = iInterfaceQueryLocalInterface7 instanceof xd ? (xd) iInterfaceQueryLocalInterface7 : new wd(strongBinder7);
                }
                setInstanceIdProvider(wdVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar10 = iInterfaceQueryLocalInterface8 instanceof td ? (td) iInterfaceQueryLocalInterface8 : new rd(strongBinder8);
                }
                getCachedAppInstanceId(rdVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar9 = iInterfaceQueryLocalInterface9 instanceof td ? (td) iInterfaceQueryLocalInterface9 : new rd(strongBinder9);
                }
                getAppInstanceId(rdVar9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar8 = iInterfaceQueryLocalInterface10 instanceof td ? (td) iInterfaceQueryLocalInterface10 : new rd(strongBinder10);
                }
                getGmpAppId(rdVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar7 = iInterfaceQueryLocalInterface11 instanceof td ? (td) iInterfaceQueryLocalInterface11 : new rd(strongBinder11);
                }
                generateEventId(rdVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), (Bundle) n0.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar6 = iInterfaceQueryLocalInterface12 instanceof td ? (td) iInterfaceQueryLocalInterface12 : new rd(strongBinder12);
                }
                onActivitySaveInstanceState(aVarC1, rdVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) n0.c(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar5 = iInterfaceQueryLocalInterface13 instanceof td ? (td) iInterfaceQueryLocalInterface13 : new rd(strongBinder13);
                }
                performAction(bundle2, rdVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), a.AbstractBinderC0161a.c1(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    udVar3 = iInterfaceQueryLocalInterface14 instanceof vd ? (vd) iInterfaceQueryLocalInterface14 : new ud(strongBinder14);
                }
                setEventInterceptor(udVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    udVar2 = iInterfaceQueryLocalInterface15 instanceof vd ? (vd) iInterfaceQueryLocalInterface15 : new ud(strongBinder15);
                }
                registerOnMeasurementEventListener(udVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    udVar = iInterfaceQueryLocalInterface16 instanceof vd ? (vd) iInterfaceQueryLocalInterface16 : new ud(strongBinder16);
                }
                unregisterOnMeasurementEventListener(udVar);
                break;
            case 37:
                initForTests(n0.f(parcel));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar4 = iInterfaceQueryLocalInterface17 instanceof td ? (td) iInterfaceQueryLocalInterface17 : new rd(strongBinder17);
                }
                getTestFlag(rdVar4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(n0.a(parcel));
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rdVar3 = iInterfaceQueryLocalInterface18 instanceof td ? (td) iInterfaceQueryLocalInterface18 : new rd(strongBinder18);
                }
                isDataCollectionEnabled(rdVar3);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) n0.c(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) n0.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) n0.c(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
