package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<AdErrorEvent.AdErrorListener> f21662a = new ArrayList(1);

    public final void a(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f21662a.add(adErrorListener);
    }

    public final void b() {
        this.f21662a.clear();
    }

    public final void c(AdErrorEvent adErrorEvent) {
        Iterator<AdErrorEvent.AdErrorListener> it = this.f21662a.iterator();
        while (it.hasNext()) {
            it.next().onAdError(adErrorEvent);
        }
    }

    public final void d(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f21662a.remove(adErrorListener);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f21662a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 38);
        sb.append("ErrorListenerSupport [errorListeners=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
