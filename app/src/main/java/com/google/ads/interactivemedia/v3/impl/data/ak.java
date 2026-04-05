package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.internal.aty;
import com.google.ads.interactivemedia.v3.internal.aud;

/* JADX INFO: loaded from: classes.dex */
public final class ak implements TestingConfiguration.Builder {
    private Boolean disableExperiments;
    private Boolean disableOnScreenDetection;
    private Boolean disableSkipFadeTransition;
    private Boolean enableMonitorAppLifecycle;
    private aud<String, Object> extraParams;
    private aty<Integer> forceExperimentIds;
    private Boolean forceTvMode;
    private Boolean ignoreStrictModeFalsePositives;
    private Boolean useTestStreamManager;
    private Boolean useVideoElementMock;
    private Float videoElementMockDuration;

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration build() {
        Boolean bool = this.disableExperiments;
        if (bool != null && this.disableOnScreenDetection != null && this.disableSkipFadeTransition != null && this.useVideoElementMock != null && this.videoElementMockDuration != null && this.useTestStreamManager != null && this.enableMonitorAppLifecycle != null && this.forceTvMode != null && this.ignoreStrictModeFalsePositives != null) {
            return new al(bool.booleanValue(), this.disableOnScreenDetection.booleanValue(), this.disableSkipFadeTransition.booleanValue(), this.forceExperimentIds, this.useVideoElementMock.booleanValue(), this.videoElementMockDuration.floatValue(), this.useTestStreamManager.booleanValue(), this.enableMonitorAppLifecycle.booleanValue(), this.forceTvMode.booleanValue(), this.ignoreStrictModeFalsePositives.booleanValue(), this.extraParams);
        }
        StringBuilder sb = new StringBuilder();
        if (this.disableExperiments == null) {
            sb.append(" disableExperiments");
        }
        if (this.disableOnScreenDetection == null) {
            sb.append(" disableOnScreenDetection");
        }
        if (this.disableSkipFadeTransition == null) {
            sb.append(" disableSkipFadeTransition");
        }
        if (this.useVideoElementMock == null) {
            sb.append(" useVideoElementMock");
        }
        if (this.videoElementMockDuration == null) {
            sb.append(" videoElementMockDuration");
        }
        if (this.useTestStreamManager == null) {
            sb.append(" useTestStreamManager");
        }
        if (this.enableMonitorAppLifecycle == null) {
            sb.append(" enableMonitorAppLifecycle");
        }
        if (this.forceTvMode == null) {
            sb.append(" forceTvMode");
        }
        if (this.ignoreStrictModeFalsePositives == null) {
            sb.append(" ignoreStrictModeFalsePositives");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder disableExperiments(boolean z) {
        this.disableExperiments = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder disableOnScreenDetection(boolean z) {
        this.disableOnScreenDetection = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder disableSkipFadeTransition(boolean z) {
        this.disableSkipFadeTransition = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder enableMonitorAppLifecycle(boolean z) {
        this.enableMonitorAppLifecycle = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder extraParams(aud<String, Object> audVar) {
        this.extraParams = audVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder forceExperimentIds(aty<Integer> atyVar) {
        this.forceExperimentIds = atyVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder forceTvMode(boolean z) {
        this.forceTvMode = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder ignoreStrictModeFalsePositives(boolean z) {
        this.ignoreStrictModeFalsePositives = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder useTestStreamManager(boolean z) {
        this.useTestStreamManager = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder useVideoElementMock(boolean z) {
        this.useVideoElementMock = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration.Builder
    public TestingConfiguration.Builder videoElementMockDuration(float f2) {
        this.videoElementMockDuration = Float.valueOf(f2);
        return this;
    }
}
