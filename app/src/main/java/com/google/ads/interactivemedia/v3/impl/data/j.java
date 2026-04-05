package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final ar nativeViewBounds;
    private final boolean nativeViewHidden;
    private final ar nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    private j(String str, String str2, String str3, long j2, double d2, boolean z, ar arVar, ar arVar2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j2;
        this.nativeVolume = d2;
        this.nativeViewHidden = z;
        this.nativeViewBounds = arVar;
        this.nativeViewVisibleBounds = arVar2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.queryId.equals(bVar.queryId()) && this.eventId.equals(bVar.eventId()) && this.appState.equals(bVar.appState()) && this.nativeTime == bVar.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(bVar.nativeVolume()) && this.nativeViewHidden == bVar.nativeViewHidden() && this.nativeViewBounds.equals(bVar.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(bVar.nativeViewVisibleBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int iHashCode = this.queryId.hashCode();
        int iHashCode2 = this.eventId.hashCode();
        int iHashCode3 = this.appState.hashCode();
        long j2 = this.nativeTime;
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume)))) * 1000003) ^ (true != this.nativeViewHidden ? 1237 : 1231)) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003) ^ this.nativeViewVisibleBounds.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public long nativeTime() {
        return this.nativeTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public ar nativeViewBounds() {
        return this.nativeViewBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public ar nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public double nativeVolume() {
        return this.nativeVolume;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String queryId() {
        return this.queryId;
    }

    public String toString() {
        String str = this.queryId;
        String str2 = this.eventId;
        String str3 = this.appState;
        long j2 = this.nativeTime;
        double d2 = this.nativeVolume;
        boolean z = this.nativeViewHidden;
        String strValueOf = String.valueOf(this.nativeViewBounds);
        String strValueOf2 = String.valueOf(this.nativeViewVisibleBounds);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 191 + length2 + length3 + strValueOf.length() + strValueOf2.length());
        sb.append("ActivityMonitorData{queryId=");
        sb.append(str);
        sb.append(", eventId=");
        sb.append(str2);
        sb.append(", appState=");
        sb.append(str3);
        sb.append(", nativeTime=");
        sb.append(j2);
        sb.append(", nativeVolume=");
        sb.append(d2);
        sb.append(", nativeViewHidden=");
        sb.append(z);
        sb.append(", nativeViewBounds=");
        sb.append(strValueOf);
        sb.append(", nativeViewVisibleBounds=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
