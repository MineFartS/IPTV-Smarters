package com.google.ads.interactivemedia.v3.internal;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class alu extends PhoneStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ alv f20076a;

    public /* synthetic */ alu(alv alvVar) {
        this.f20076a = alvVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        alv.c(this.f20076a, true != (overrideNetworkType == 3 || overrideNetworkType == 4) ? 5 : 10);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        String string = serviceState == null ? BuildConfig.FLAVOR : serviceState.toString();
        alv.c(this.f20076a, true != (string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED")) ? 5 : 10);
    }
}
