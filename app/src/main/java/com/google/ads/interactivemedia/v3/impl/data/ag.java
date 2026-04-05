package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes.dex */
public final class ag extends bg {
    private final boolean attached;
    private final ar bounds;
    private final String detailedReason;
    private final boolean hidden;
    private final FriendlyObstructionPurpose purpose;
    private final String type;

    private ag(boolean z, ar arVar, String str, boolean z2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.attached = z;
        this.bounds = arVar;
        this.detailedReason = str;
        this.hidden = z2;
        this.purpose = friendlyObstructionPurpose;
        this.type = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bg
    public boolean attached() {
        return this.attached;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bg
    public ar bounds() {
        return this.bounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bg
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bg) {
            bg bgVar = (bg) obj;
            if (this.attached == bgVar.attached() && this.bounds.equals(bgVar.bounds()) && ((str = this.detailedReason) != null ? str.equals(bgVar.detailedReason()) : bgVar.detailedReason() == null) && this.hidden == bgVar.hidden() && this.purpose.equals(bgVar.purpose()) && this.type.equals(bgVar.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((true != this.attached ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.bounds.hashCode()) * 1000003;
        String str = this.detailedReason;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true == this.hidden ? 1231 : 1237)) * 1000003) ^ this.purpose.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bg
    public boolean hidden() {
        return this.hidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bg
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        boolean z = this.attached;
        String strValueOf = String.valueOf(this.bounds);
        String str = this.detailedReason;
        boolean z2 = this.hidden;
        String strValueOf2 = String.valueOf(this.purpose);
        String str2 = this.type;
        int length = strValueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 88 + length2 + strValueOf2.length() + String.valueOf(str2).length());
        sb.append("ObstructionData{attached=");
        sb.append(z);
        sb.append(", bounds=");
        sb.append(strValueOf);
        sb.append(", detailedReason=");
        sb.append(str);
        sb.append(", hidden=");
        sb.append(z2);
        sb.append(", purpose=");
        sb.append(strValueOf2);
        sb.append(", type=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bg
    public String type() {
        return this.type;
    }
}
