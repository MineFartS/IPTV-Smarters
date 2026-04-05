package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class ami implements alb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Message f20123a;

    private ami() {
    }

    public /* synthetic */ ami(byte[] bArr) {
    }

    private final void d() {
        this.f20123a = null;
        amj.l(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alb
    public final void a() {
        Message message = this.f20123a;
        ajr.b(message);
        message.sendToTarget();
        d();
    }

    public final boolean b(Handler handler) {
        Message message = this.f20123a;
        ajr.b(message);
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        d();
        return zSendMessageAtFrontOfQueue;
    }

    public final void c(Message message) {
        this.f20123a = message;
    }
}
