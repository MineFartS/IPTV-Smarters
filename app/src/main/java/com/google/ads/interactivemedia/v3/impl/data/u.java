package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes.dex */
public final class u implements av {
    private String detailedReason;
    private FriendlyObstructionPurpose purpose;
    private View view;

    @Override // com.google.ads.interactivemedia.v3.impl.data.av
    public aw build() {
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        View view = this.view;
        if (view != null && (friendlyObstructionPurpose = this.purpose) != null) {
            return new v(view, friendlyObstructionPurpose, this.detailedReason);
        }
        StringBuilder sb = new StringBuilder();
        if (this.view == null) {
            sb.append(" view");
        }
        if (this.purpose == null) {
            sb.append(" purpose");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.av
    public av detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.av
    public av purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (friendlyObstructionPurpose == null) {
            throw new NullPointerException("Null purpose");
        }
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.av
    public av view(View view) {
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.view = view;
        return this;
    }
}
