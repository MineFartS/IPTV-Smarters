package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes.dex */
public final class af extends bf {
    private Boolean attached;
    private ar bounds;
    private String detailedReason;
    private Boolean hidden;
    private FriendlyObstructionPurpose purpose;
    private String type;

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public bf attached(boolean z) {
        this.attached = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public bf bounds(ar arVar) {
        if (arVar == null) {
            throw new NullPointerException("Null bounds");
        }
        this.bounds = arVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public bg build() {
        Boolean bool = this.attached;
        if (bool != null && this.bounds != null && this.hidden != null && this.purpose != null && this.type != null) {
            return new ag(bool.booleanValue(), this.bounds, this.detailedReason, this.hidden.booleanValue(), this.purpose, this.type);
        }
        StringBuilder sb = new StringBuilder();
        if (this.attached == null) {
            sb.append(" attached");
        }
        if (this.bounds == null) {
            sb.append(" bounds");
        }
        if (this.hidden == null) {
            sb.append(" hidden");
        }
        if (this.purpose == null) {
            sb.append(" purpose");
        }
        if (this.type == null) {
            sb.append(" type");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public bf detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public bf hidden(boolean z) {
        this.hidden = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public bf purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (friendlyObstructionPurpose == null) {
            throw new NullPointerException("Null purpose");
        }
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public bf type(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        return this;
    }
}
