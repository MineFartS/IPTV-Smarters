package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public final class TimingInfoUnmodifiable extends TimingInfo {
    public TimingInfoUnmodifiable(Long l2, long j2, Long l3) {
        super(l2, j2, l3);
    }

    @Override // com.amazonaws.util.TimingInfo
    public TimingInfo endTiming() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setEndTime(long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazonaws.util.TimingInfo
    public void setEndTimeNano(long j2) {
        throw new UnsupportedOperationException();
    }
}
