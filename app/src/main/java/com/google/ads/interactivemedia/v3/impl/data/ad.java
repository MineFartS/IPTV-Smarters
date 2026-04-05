package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.aty;

/* JADX INFO: loaded from: classes.dex */
public final class ad extends bh {
    private final aty<bg> obstructions;

    private ad(aty<bg> atyVar) {
        this.obstructions = atyVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bh) {
            return this.obstructions.equals(((bh) obj).obstructions());
        }
        return false;
    }

    public int hashCode() {
        return this.obstructions.hashCode() ^ 1000003;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bh
    public aty<bg> obstructions() {
        return this.obstructions;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.obstructions);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
        sb.append("ObstructionListData{obstructions=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
