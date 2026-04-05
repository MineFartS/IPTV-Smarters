package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.69, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass69 extends Handler {
    public final /* synthetic */ C6A A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass69(C6A c6a, Looper looper) {
        super(looper);
        this.A00 = c6a;
    }

    @Override // android.os.Handler
    @SuppressLint({"CatchGeneralException"})
    public final void handleMessage(Message message) throws Throwable {
        MotionEvent motionEvent;
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (AnonymousClass67.A00[AnonymousClass68.values()[message.what].ordinal()] == 1 && (motionEvent = (MotionEvent) message.obj) != null) {
                this.A00.A02.A01(motionEvent);
            }
        } catch (Throwable th) {
            try {
                AnonymousClass66.A04(th);
            } catch (Throwable th2) {
                C0822Kp.A00(th2, this);
            }
        }
    }
}
