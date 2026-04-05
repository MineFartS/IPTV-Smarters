package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class i implements a {
    private String appState;
    private String eventId;
    private Long nativeTime;
    private ar nativeViewBounds;
    private Boolean nativeViewHidden;
    private ar nativeViewVisibleBounds;
    private Double nativeVolume;
    private String queryId;

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a appState(String str) {
        if (str == null) {
            throw new NullPointerException("Null appState");
        }
        this.appState = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public b build() {
        String str;
        String str2;
        Long l2;
        String str3 = this.queryId;
        if (str3 != null && (str = this.eventId) != null && (str2 = this.appState) != null && (l2 = this.nativeTime) != null && this.nativeVolume != null && this.nativeViewHidden != null && this.nativeViewBounds != null && this.nativeViewVisibleBounds != null) {
            return new j(str3, str, str2, l2.longValue(), this.nativeVolume.doubleValue(), this.nativeViewHidden.booleanValue(), this.nativeViewBounds, this.nativeViewVisibleBounds);
        }
        StringBuilder sb = new StringBuilder();
        if (this.queryId == null) {
            sb.append(" queryId");
        }
        if (this.eventId == null) {
            sb.append(" eventId");
        }
        if (this.appState == null) {
            sb.append(" appState");
        }
        if (this.nativeTime == null) {
            sb.append(" nativeTime");
        }
        if (this.nativeVolume == null) {
            sb.append(" nativeVolume");
        }
        if (this.nativeViewHidden == null) {
            sb.append(" nativeViewHidden");
        }
        if (this.nativeViewBounds == null) {
            sb.append(" nativeViewBounds");
        }
        if (this.nativeViewVisibleBounds == null) {
            sb.append(" nativeViewVisibleBounds");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a eventId(String str) {
        if (str == null) {
            throw new NullPointerException("Null eventId");
        }
        this.eventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeTime(long j2) {
        this.nativeTime = Long.valueOf(j2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewBounds(ar arVar) {
        if (arVar == null) {
            throw new NullPointerException("Null nativeViewBounds");
        }
        this.nativeViewBounds = arVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewHidden(boolean z) {
        this.nativeViewHidden = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewVisibleBounds(ar arVar) {
        if (arVar == null) {
            throw new NullPointerException("Null nativeViewVisibleBounds");
        }
        this.nativeViewVisibleBounds = arVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeVolume(double d2) {
        this.nativeVolume = Double.valueOf(d2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a queryId(String str) {
        if (str == null) {
            throw new NullPointerException("Null queryId");
        }
        this.queryId = str;
        return this;
    }
}
