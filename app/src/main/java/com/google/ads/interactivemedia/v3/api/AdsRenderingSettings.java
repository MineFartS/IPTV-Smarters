package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface AdsRenderingSettings {
    int getBitrateKbps();

    boolean getDisableUi();

    boolean getEnableCustomTabs();

    boolean getEnablePreloading();

    boolean getFocusSkipButtonWhenAvailable();

    List<String> getMimeTypes();

    void setBitrateKbps(int i2);

    void setDisableUi(boolean z);

    void setEnableCustomTabs(boolean z);

    void setEnablePreloading(boolean z);

    void setFocusSkipButtonWhenAvailable(boolean z);

    void setLoadVideoTimeout(int i2);

    void setMimeTypes(List<String> list);

    void setPlayAdsAfterTime(double d2);

    void setUiElements(Set<UiElement> set);
}
