package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class p extends ar {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private p(int i2, int i3, int i4, int i5) {
        this.left = i2;
        this.top = i3;
        this.height = i4;
        this.width = i5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ar) {
            ar arVar = (ar) obj;
            if (this.left == arVar.left() && this.top == arVar.top() && this.height == arVar.height() && this.width == arVar.width()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ar
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ar
    public int left() {
        return this.left;
    }

    public String toString() {
        int i2 = this.left;
        int i3 = this.top;
        int i4 = this.height;
        int i5 = this.width;
        StringBuilder sb = new StringBuilder(90);
        sb.append("BoundingRectData{left=");
        sb.append(i2);
        sb.append(", top=");
        sb.append(i3);
        sb.append(", height=");
        sb.append(i4);
        sb.append(", width=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ar
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ar
    public int width() {
        return this.width;
    }
}
