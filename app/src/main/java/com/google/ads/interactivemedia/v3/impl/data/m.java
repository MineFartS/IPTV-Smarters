package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.aty;
import com.google.ads.interactivemedia.v3.internal.auk;

/* JADX INFO: loaded from: classes.dex */
public final class m extends f {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final aty<String> mimeTypes;
    private final double playAdsAfterTime;
    private final auk<UiElement> uiElements;

    private m(int i2, aty<String> atyVar, auk<UiElement> aukVar, boolean z, boolean z2, double d2, boolean z3, int i3) {
        this.bitrate = i2;
        this.mimeTypes = atyVar;
        this.uiElements = aukVar;
        this.enablePreloading = z;
        this.enableFocusSkipButton = z2;
        this.playAdsAfterTime = d2;
        this.disableUi = z3;
        this.loadVideoTimeout = i3;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        aty<String> atyVar;
        auk<UiElement> aukVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.bitrate == fVar.bitrate() && ((atyVar = this.mimeTypes) != null ? atyVar.equals(fVar.mimeTypes()) : fVar.mimeTypes() == null) && ((aukVar = this.uiElements) != null ? aukVar.equals(fVar.uiElements()) : fVar.uiElements() == null) && this.enablePreloading == fVar.enablePreloading() && this.enableFocusSkipButton == fVar.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(fVar.playAdsAfterTime()) && this.disableUi == fVar.disableUi() && this.loadVideoTimeout == fVar.loadVideoTimeout()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (this.bitrate ^ 1000003) * 1000003;
        aty<String> atyVar = this.mimeTypes;
        int iHashCode = (i2 ^ (atyVar == null ? 0 : atyVar.hashCode())) * 1000003;
        auk<UiElement> aukVar = this.uiElements;
        return ((((((((((iHashCode ^ (aukVar != null ? aukVar.hashCode() : 0)) * 1000003) ^ (true != this.enablePreloading ? 1237 : 1231)) * 1000003) ^ (true != this.enableFocusSkipButton ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003) ^ (true == this.disableUi ? 1231 : 1237)) * 1000003) ^ this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public aty<String> mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public e toBuilder() {
        return new l(this);
    }

    public String toString() {
        int i2 = this.bitrate;
        String strValueOf = String.valueOf(this.mimeTypes);
        String strValueOf2 = String.valueOf(this.uiElements);
        boolean z = this.enablePreloading;
        boolean z2 = this.enableFocusSkipButton;
        double d2 = this.playAdsAfterTime;
        boolean z3 = this.disableUi;
        int i3 = this.loadVideoTimeout;
        StringBuilder sb = new StringBuilder(strValueOf.length() + 213 + strValueOf2.length());
        sb.append("AdsRenderingSettingsData{bitrate=");
        sb.append(i2);
        sb.append(", mimeTypes=");
        sb.append(strValueOf);
        sb.append(", uiElements=");
        sb.append(strValueOf2);
        sb.append(", enablePreloading=");
        sb.append(z);
        sb.append(", enableFocusSkipButton=");
        sb.append(z2);
        sb.append(", playAdsAfterTime=");
        sb.append(d2);
        sb.append(", disableUi=");
        sb.append(z3);
        sb.append(", loadVideoTimeout=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public auk<UiElement> uiElements() {
        return this.uiElements;
    }
}
