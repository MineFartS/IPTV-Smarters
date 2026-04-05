package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class dd extends ez {
    private final String TXXX;

    public dd(String str) {
        if (str == null) {
            throw new NullPointerException("Null TXXX");
        }
        this.TXXX = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ez
    public String TXXX() {
        return this.TXXX;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ez) {
            return this.TXXX.equals(((ez) obj).TXXX());
        }
        return false;
    }

    public int hashCode() {
        return this.TXXX.hashCode() ^ 1000003;
    }

    public String toString() {
        String str = this.TXXX;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
        sb.append("TimedMetadataWithKeys{TXXX=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
