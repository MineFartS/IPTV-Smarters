package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class ai extends bi {
    private final Integer height;
    private final Integer width;

    public ai(Integer num, Integer num2) {
        if (num == null) {
            throw new NullPointerException("Null width");
        }
        this.width = num;
        if (num2 == null) {
            throw new NullPointerException("Null height");
        }
        this.height = num2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bi) {
            bi biVar = (bi) obj;
            if (this.width.equals(biVar.width()) && this.height.equals(biVar.height())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.width.hashCode() ^ 1000003) * 1000003) ^ this.height.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bi
    public Integer height() {
        return this.height;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.width);
        String strValueOf2 = String.valueOf(this.height);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 25 + strValueOf2.length());
        sb.append("SizeData{width=");
        sb.append(strValueOf);
        sb.append(", height=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bi
    public Integer width() {
        return this.width;
    }
}
