package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.aty;
import com.google.ads.interactivemedia.v3.internal.auk;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l extends e {
    private Integer bitrate;
    private Boolean disableUi;
    private Boolean enableFocusSkipButton;
    private Boolean enablePreloading;
    private Integer loadVideoTimeout;
    private aty<String> mimeTypes;
    private Double playAdsAfterTime;
    private auk<UiElement> uiElements;

    public l() {
    }

    private l(f fVar) {
        this.bitrate = Integer.valueOf(fVar.bitrate());
        this.mimeTypes = fVar.mimeTypes();
        this.uiElements = fVar.uiElements();
        this.enablePreloading = Boolean.valueOf(fVar.enablePreloading());
        this.enableFocusSkipButton = Boolean.valueOf(fVar.enableFocusSkipButton());
        this.playAdsAfterTime = Double.valueOf(fVar.playAdsAfterTime());
        this.disableUi = Boolean.valueOf(fVar.disableUi());
        this.loadVideoTimeout = Integer.valueOf(fVar.loadVideoTimeout());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public f build() {
        Integer num = this.bitrate;
        if (num != null && this.enablePreloading != null && this.enableFocusSkipButton != null && this.playAdsAfterTime != null && this.disableUi != null && this.loadVideoTimeout != null) {
            return new m(num.intValue(), this.mimeTypes, this.uiElements, this.enablePreloading.booleanValue(), this.enableFocusSkipButton.booleanValue(), this.playAdsAfterTime.doubleValue(), this.disableUi.booleanValue(), this.loadVideoTimeout.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.bitrate == null) {
            sb.append(" bitrate");
        }
        if (this.enablePreloading == null) {
            sb.append(" enablePreloading");
        }
        if (this.enableFocusSkipButton == null) {
            sb.append(" enableFocusSkipButton");
        }
        if (this.playAdsAfterTime == null) {
            sb.append(" playAdsAfterTime");
        }
        if (this.disableUi == null) {
            sb.append(" disableUi");
        }
        if (this.loadVideoTimeout == null) {
            sb.append(" loadVideoTimeout");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setBitrate(int i2) {
        this.bitrate = Integer.valueOf(i2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setDisableUi(boolean z) {
        this.disableUi = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setEnableFocusSkipButton(boolean z) {
        this.enableFocusSkipButton = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setEnablePreloading(boolean z) {
        this.enablePreloading = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setLoadVideoTimeout(int i2) {
        this.loadVideoTimeout = Integer.valueOf(i2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setMimeTypes(List<String> list) {
        this.mimeTypes = list == null ? null : aty.l(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setPlayAdsAfterTime(double d2) {
        this.playAdsAfterTime = Double.valueOf(d2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setUiElements(Set<UiElement> set) {
        this.uiElements = set == null ? null : auk.j(set);
        return this;
    }
}
