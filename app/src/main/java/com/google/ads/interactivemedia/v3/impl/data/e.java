package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public abstract f build();

    public abstract e setBitrate(int i2);

    public abstract e setDisableUi(boolean z);

    public abstract e setEnableFocusSkipButton(boolean z);

    public abstract e setEnablePreloading(boolean z);

    public abstract e setLoadVideoTimeout(int i2);

    public abstract e setMimeTypes(List<String> list);

    public abstract e setPlayAdsAfterTime(double d2);

    public abstract e setUiElements(Set<UiElement> set);
}
