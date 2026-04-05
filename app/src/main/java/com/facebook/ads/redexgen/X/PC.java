package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PC extends ContentObserver {
    public final KT A00;

    public PC(Handler handler, KT kt) {
        super(handler);
        this.A00 = kt;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0a();
    }
}
