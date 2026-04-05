package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ep implements eo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final apd f21724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fo f21725b;

    public ep(Context context, fo foVar) {
        this.f21724a = new api(context);
        this.f21725b = foVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.ads.interactivemedia.v3.internal.aqv] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    @Override // com.google.ads.interactivemedia.v3.internal.eo
    public final com.google.ads.interactivemedia.v3.impl.data.bd a(com.google.ads.interactivemedia.v3.impl.data.bc bcVar) {
        String strId;
        int iA;
        ?? DoRead;
        try {
            final int i2 = bcVar.requestType() == com.google.ads.interactivemedia.v3.impl.data.bb.GET ? 0 : 1;
            apd apdVar = this.f21724a;
            final String strUrl = bcVar.url();
            final String strContent = bcVar.content();
            if (this.f21725b.isLimitedAdTracking) {
                DoRead = arj.a(new ape(8));
            } else {
                final api apiVar = (api) apdVar;
                DoRead = ((api) apdVar).doRead(c.f.a.c.f.o.n.r.a().d(aqe.f20369b).c(false).b(new c.f.a.c.f.o.n.p() { // from class: com.google.ads.interactivemedia.v3.internal.apf
                    @Override // c.f.a.c.f.o.n.p
                    public final void accept(Object obj, Object obj2) {
                        String str = strUrl;
                        int i3 = i2;
                        String str2 = strContent;
                        ((aoz) ((apj) obj).getService()).e(new apa(str, i3, str2), new aph((aqy) obj2));
                    }
                }).a());
            }
            return com.google.ads.interactivemedia.v3.impl.data.bd.forResponse(bcVar.id(), (String) arj.d(DoRead, bcVar.connectionTimeoutMs() + bcVar.readTimeoutMs(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            strId = bcVar.id();
            iA = 101;
            return com.google.ads.interactivemedia.v3.impl.data.bd.forError(strId, iA);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof ape) {
                iA = ((ape) cause).a();
                strId = bcVar.id();
            } else {
                boolean z = cause instanceof c.f.a.c.f.o.b;
                strId = bcVar.id();
                iA = z ? 102 : 100;
            }
            return com.google.ads.interactivemedia.v3.impl.data.bd.forError(strId, iA);
        }
    }
}
