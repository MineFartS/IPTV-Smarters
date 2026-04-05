package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class s extends au {
    private final double end;
    private final boolean played;
    private final double start;

    public s(double d2, double d3, boolean z) {
        this.start = d2;
        this.end = d3;
        this.played = z;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.au
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof au) {
            au auVar = (au) obj;
            if (Double.doubleToLongBits(this.start) == Double.doubleToLongBits(auVar.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(auVar.end()) && this.played == auVar.played()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (true != this.played ? 1237 : 1231) ^ ((((((int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end)))) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.au
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.au
    public double start() {
        return this.start;
    }

    public String toString() {
        double d2 = this.start;
        double d3 = this.end;
        boolean z = this.played;
        StringBuilder sb = new StringBuilder(88);
        sb.append("CuePointData{start=");
        sb.append(d2);
        sb.append(", end=");
        sb.append(d3);
        sb.append(", played=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
