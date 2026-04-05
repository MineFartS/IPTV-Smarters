package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ck implements AdEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdEvent.AdEventType f21551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ad f21552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f21553c;

    public ck(AdEvent.AdEventType adEventType, Ad ad, Map<String, String> map) {
        this.f21551a = adEventType;
        this.f21552b = ad;
        this.f21553c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return this.f21551a == ckVar.f21551a && auv.w(this.f21552b, ckVar.f21552b) && auv.w(this.f21553c, ckVar.f21553c);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final Ad getAd() {
        return this.f21552b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final Map<String, String> getAdData() {
        return this.f21553c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final AdEvent.AdEventType getType() {
        return this.f21551a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21551a, this.f21552b, this.f21553c});
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(String.format("AdEvent[type=%s, ad=%s", this.f21551a, this.f21552b));
        if (this.f21553c == null) {
            str = "]";
        } else {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder("{");
            Iterator<Map.Entry<String, String>> it = this.f21553c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append(next.getKey());
                sb.append(": ");
                sb.append(next.getValue());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            objArr[0] = sb.toString();
            str = String.format(", adData=%s]", objArr);
        }
        String strValueOf2 = String.valueOf(str);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }
}
