package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass77 implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C7C A01;

    public AnonymousClass77(C7C c7c, C7B c7b) {
        this.A01 = c7c;
        new Handler(Looper.getMainLooper()).post(new X0(this, c7c, c7b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C7B c7b) {
        C0949Pq c0949PqA05 = C0949Pq.A05(this.A01.A04);
        Uri uri = Uri.parse(c7b.A08);
        long jA0K = c7b.A00;
        if (jA0K == -1) {
            jA0K = JT.A0K(this.A01.A04);
        }
        c0949PqA05.A0F(uri, new X1(this), jA0K);
    }
}
