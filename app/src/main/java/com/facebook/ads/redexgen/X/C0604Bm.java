package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0604Bm {
    public final CopyOnWriteArrayList<C0603Bl> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        for (C0603Bl handlerAndListener : this.A00) {
            handlerAndListener.A00.post(new RunnableC0599Bh(this, handlerAndListener.A01));
        }
    }

    public final void A01() {
        for (C0603Bl handlerAndListener : this.A00) {
            handlerAndListener.A00.post(new RunnableC0602Bk(this, handlerAndListener.A01));
        }
    }

    public final void A02() {
        for (C0603Bl handlerAndListener : this.A00) {
            handlerAndListener.A00.post(new RunnableC0601Bj(this, handlerAndListener.A01));
        }
    }

    public final void A03(Handler handler, InterfaceC0605Bn interfaceC0605Bn) {
        IM.A03((handler == null || interfaceC0605Bn == null) ? false : true);
        this.A00.add(new C0603Bl(handler, interfaceC0605Bn));
    }

    public final void A04(Exception exc) {
        for (C0603Bl c0603Bl : this.A00) {
            c0603Bl.A00.post(new RunnableC0600Bi(this, c0603Bl.A01, exc));
        }
    }
}
