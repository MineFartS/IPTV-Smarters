package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class am extends bj {
    private final long currentTime;
    private final long duration;
    private final String timeUnit;

    public am(long j2, long j3, String str) {
        this.currentTime = j2;
        this.duration = j3;
        if (str == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.timeUnit = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bj
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bj
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bj) {
            bj bjVar = (bj) obj;
            if (this.currentTime == bjVar.currentTime() && this.duration == bjVar.duration() && this.timeUnit.equals(bjVar.timeUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.currentTime;
        long j3 = this.duration;
        return this.timeUnit.hashCode() ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bj
    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        long j2 = this.currentTime;
        long j3 = this.duration;
        String str = this.timeUnit;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 90);
        sb.append("TimeUpdateData{currentTime=");
        sb.append(j2);
        sb.append(", duration=");
        sb.append(j3);
        sb.append(", timeUnit=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
