package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes.dex */
public final class v extends aw {
    private final String detailedReason;
    private final FriendlyObstructionPurpose purpose;
    private final View view;

    private v(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.view = view;
        this.purpose = friendlyObstructionPurpose;
        this.detailedReason = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.aw
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aw) {
            aw awVar = (aw) obj;
            if (this.view.equals(awVar.view()) && this.purpose.equals(awVar.purpose())) {
                String str = this.detailedReason;
                String strDetailedReason = awVar.detailedReason();
                if (str != null ? str.equals(strDetailedReason) : strDetailedReason == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.view.hashCode() ^ 1000003) * 1000003) ^ this.purpose.hashCode()) * 1000003;
        String str = this.detailedReason;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.aw
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.view);
        String strValueOf2 = String.valueOf(this.purpose);
        String str = this.detailedReason;
        int length = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 57 + strValueOf2.length() + String.valueOf(str).length());
        sb.append("FriendlyObstructionImpl{view=");
        sb.append(strValueOf);
        sb.append(", purpose=");
        sb.append(strValueOf2);
        sb.append(", detailedReason=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.aw
    public View view() {
        return this.view;
    }
}
