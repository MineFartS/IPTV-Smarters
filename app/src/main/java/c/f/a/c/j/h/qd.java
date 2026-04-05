package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface qd extends IInterface {
    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j2);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(td tdVar);

    void getAppInstanceId(td tdVar);

    void getCachedAppInstanceId(td tdVar);

    void getConditionalUserProperties(String str, String str2, td tdVar);

    void getCurrentScreenClass(td tdVar);

    void getCurrentScreenName(td tdVar);

    void getGmpAppId(td tdVar);

    void getMaxUserProperties(String str, td tdVar);

    void getTestFlag(td tdVar, int i2);

    void getUserProperties(String str, String str2, boolean z, td tdVar);

    void initForTests(Map map);

    void initialize(c.f.a.c.g.a aVar, yd ydVar, long j2);

    void isDataCollectionEnabled(td tdVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, td tdVar, long j2);

    void logHealthData(int i2, String str, c.f.a.c.g.a aVar, c.f.a.c.g.a aVar2, c.f.a.c.g.a aVar3);

    void onActivityCreated(c.f.a.c.g.a aVar, Bundle bundle, long j2);

    void onActivityDestroyed(c.f.a.c.g.a aVar, long j2);

    void onActivityPaused(c.f.a.c.g.a aVar, long j2);

    void onActivityResumed(c.f.a.c.g.a aVar, long j2);

    void onActivitySaveInstanceState(c.f.a.c.g.a aVar, td tdVar, long j2);

    void onActivityStarted(c.f.a.c.g.a aVar, long j2);

    void onActivityStopped(c.f.a.c.g.a aVar, long j2);

    void performAction(Bundle bundle, td tdVar, long j2);

    void registerOnMeasurementEventListener(vd vdVar);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setConsent(Bundle bundle, long j2);

    void setConsentThirdParty(Bundle bundle, long j2);

    void setCurrentScreen(c.f.a.c.g.a aVar, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(vd vdVar);

    void setInstanceIdProvider(xd xdVar);

    void setMeasurementEnabled(boolean z, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, c.f.a.c.g.a aVar, boolean z, long j2);

    void unregisterOnMeasurementEventListener(vd vdVar);
}
