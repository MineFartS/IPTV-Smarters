package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class amz implements Handler.Callback, xw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ana f20190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f20191b;

    public amz(ana anaVar, yp ypVar) {
        this.f20190a = anaVar;
        Handler handlerW = amn.w(this);
        this.f20191b = handlerW;
        ypVar.j(this, handlerW);
    }

    private final void b(long j2) {
        ana anaVar = this.f20190a;
        if (this != anaVar.f20202b) {
            return;
        }
        if (j2 == Long.MAX_VALUE) {
            anaVar.ar();
            return;
        }
        try {
            anaVar.aB(j2);
        } catch (jb e2) {
            this.f20190a.as(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xw
    public final void a(long j2) {
        if (amn.f20135a >= 30) {
            b(j2);
        } else {
            this.f20191b.sendMessageAtFrontOfQueue(Message.obtain(this.f20191b, 0, (int) (j2 >> 32), (int) j2));
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        b(amn.r(message.arg1, message.arg2));
        return true;
    }
}
