package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ark;
import com.google.ads.interactivemedia.v3.internal.aty;
import com.google.ads.interactivemedia.v3.internal.aud;

/* JADX INFO: loaded from: classes.dex */
@ark(a = al.class, b = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
public abstract class TestingConfiguration {
    public static final String PARAMETER_KEY = "tcnfp";

    public interface Builder {
        TestingConfiguration build();

        Builder disableExperiments(boolean z);

        Builder disableOnScreenDetection(boolean z);

        Builder disableSkipFadeTransition(boolean z);

        Builder enableMonitorAppLifecycle(boolean z);

        Builder extraParams(aud<String, Object> audVar);

        Builder forceExperimentIds(aty<Integer> atyVar);

        Builder forceTvMode(boolean z);

        Builder ignoreStrictModeFalsePositives(boolean z);

        Builder useTestStreamManager(boolean z);

        Builder useVideoElementMock(boolean z);

        Builder videoElementMockDuration(float f2);
    }

    public static Builder builder() {
        ak akVar = new ak();
        akVar.disableExperiments(true);
        akVar.disableOnScreenDetection(false);
        akVar.disableSkipFadeTransition(true);
        akVar.useVideoElementMock(false);
        akVar.videoElementMockDuration(30.0f);
        akVar.useTestStreamManager(false);
        akVar.ignoreStrictModeFalsePositives(false);
        akVar.forceTvMode(false);
        akVar.forceExperimentIds(null);
        akVar.enableMonitorAppLifecycle(true);
        return akVar;
    }

    public Builder copy() {
        ak akVar = new ak();
        akVar.disableExperiments(disableExperiments());
        akVar.disableOnScreenDetection(disableOnScreenDetection());
        akVar.disableSkipFadeTransition(disableSkipFadeTransition());
        akVar.useVideoElementMock(useVideoElementMock());
        akVar.videoElementMockDuration(videoElementMockDuration());
        akVar.useTestStreamManager(useTestStreamManager());
        akVar.forceExperimentIds(forceExperimentIds());
        akVar.enableMonitorAppLifecycle(enableMonitorAppLifecycle());
        akVar.forceTvMode(forceTvMode());
        akVar.ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives());
        akVar.extraParams(extraParams());
        return akVar;
    }

    public abstract boolean disableExperiments();

    public abstract boolean disableOnScreenDetection();

    public abstract boolean disableSkipFadeTransition();

    public abstract boolean enableMonitorAppLifecycle();

    public abstract aud<String, Object> extraParams();

    public abstract aty<Integer> forceExperimentIds();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();

    public abstract boolean useTestStreamManager();

    public abstract boolean useVideoElementMock();

    public abstract float videoElementMockDuration();
}
