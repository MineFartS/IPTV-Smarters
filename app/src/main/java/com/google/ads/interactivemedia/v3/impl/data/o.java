package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class o extends aq {
    private Integer height;
    private Integer left;
    private Integer top;
    private Integer width;

    @Override // com.google.ads.interactivemedia.v3.impl.data.aq
    public ar build() {
        Integer num = this.left;
        if (num != null && this.top != null && this.height != null && this.width != null) {
            return new p(num.intValue(), this.top.intValue(), this.height.intValue(), this.width.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.left == null) {
            sb.append(" left");
        }
        if (this.top == null) {
            sb.append(" top");
        }
        if (this.height == null) {
            sb.append(" height");
        }
        if (this.width == null) {
            sb.append(" width");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.aq
    public aq height(int i2) {
        this.height = Integer.valueOf(i2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.aq
    public aq left(int i2) {
        this.left = Integer.valueOf(i2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.aq
    public aq top(int i2) {
        this.top = Integer.valueOf(i2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.aq
    public aq width(int i2) {
        this.width = Integer.valueOf(i2);
        return this;
    }
}
