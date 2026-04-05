package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfo {
    private static final double TIME_CONVERSION = 1000.0d;
    public static final int UNKNOWN = -1;
    private Long endTimeNano;
    private final Long startEpochTimeMilli;
    private final long startTimeNano;

    public TimingInfo(Long l2, long j2, Long l3) {
        this.startEpochTimeMilli = l2;
        this.startTimeNano = j2;
        this.endTimeNano = l3;
    }

    public static double durationMilliOf(long j2, long j3) {
        double micros = TimeUnit.NANOSECONDS.toMicros(j3 - j2);
        Double.isNaN(micros);
        return micros / TIME_CONVERSION;
    }

    public static TimingInfo newTimingInfoFullSupport(long j2, long j3) {
        return new TimingInfoFullSupport(null, j2, Long.valueOf(j3));
    }

    public static TimingInfo newTimingInfoFullSupport(long j2, long j3, long j4) {
        return new TimingInfoFullSupport(Long.valueOf(j2), j3, Long.valueOf(j4));
    }

    public static TimingInfo startTiming() {
        return new TimingInfo(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static TimingInfo startTimingFullSupport() {
        return new TimingInfoFullSupport(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), null);
    }

    public static TimingInfo startTimingFullSupport(long j2) {
        return new TimingInfoFullSupport(null, j2, null);
    }

    public static TimingInfo unmodifiableTimingInfo(long j2, long j3, Long l2) {
        return new TimingInfoUnmodifiable(Long.valueOf(j2), j3, l2);
    }

    public static TimingInfo unmodifiableTimingInfo(long j2, Long l2) {
        return new TimingInfoUnmodifiable(null, j2, l2);
    }

    public void addSubMeasurement(String str, TimingInfo timingInfo) {
    }

    public TimingInfo endTiming() {
        this.endTimeNano = Long.valueOf(System.nanoTime());
        return this;
    }

    public Map<String, Number> getAllCounters() {
        return Collections.emptyMap();
    }

    public List<TimingInfo> getAllSubMeasurements(String str) {
        return null;
    }

    public Number getCounter(String str) {
        return null;
    }

    @Deprecated
    public final long getElapsedTimeMillis() {
        Double timeTakenMillisIfKnown = getTimeTakenMillisIfKnown();
        if (timeTakenMillisIfKnown == null) {
            return -1L;
        }
        return timeTakenMillisIfKnown.longValue();
    }

    @Deprecated
    public final long getEndEpochTimeMilli() {
        Long endEpochTimeMilliIfKnown = getEndEpochTimeMilliIfKnown();
        if (endEpochTimeMilliIfKnown == null) {
            return -1L;
        }
        return endEpochTimeMilliIfKnown.longValue();
    }

    public final Long getEndEpochTimeMilliIfKnown() {
        if (isStartEpochTimeMilliKnown() && isEndTimeKnown()) {
            return Long.valueOf(this.startEpochTimeMilli.longValue() + TimeUnit.NANOSECONDS.toMillis(this.endTimeNano.longValue() - this.startTimeNano));
        }
        return null;
    }

    @Deprecated
    public final long getEndTime() {
        return getEndEpochTimeMilli();
    }

    public final long getEndTimeNano() {
        Long l2 = this.endTimeNano;
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final Long getEndTimeNanoIfKnown() {
        return this.endTimeNano;
    }

    public TimingInfo getLastSubMeasurement(String str) {
        return null;
    }

    @Deprecated
    public final long getStartEpochTimeMilli() {
        Long startEpochTimeMilliIfKnown = getStartEpochTimeMilliIfKnown();
        if (startEpochTimeMilliIfKnown == null) {
            return -1L;
        }
        return startEpochTimeMilliIfKnown.longValue();
    }

    public final Long getStartEpochTimeMilliIfKnown() {
        return this.startEpochTimeMilli;
    }

    @Deprecated
    public final long getStartTime() {
        return isStartEpochTimeMilliKnown() ? this.startEpochTimeMilli.longValue() : TimeUnit.NANOSECONDS.toMillis(this.startTimeNano);
    }

    public final long getStartTimeNano() {
        return this.startTimeNano;
    }

    public TimingInfo getSubMeasurement(String str) {
        return null;
    }

    public TimingInfo getSubMeasurement(String str, int i2) {
        return null;
    }

    public Map<String, List<TimingInfo>> getSubMeasurementsByName() {
        return Collections.emptyMap();
    }

    @Deprecated
    public final double getTimeTakenMillis() {
        Double timeTakenMillisIfKnown = getTimeTakenMillisIfKnown();
        if (timeTakenMillisIfKnown == null) {
            return -1.0d;
        }
        return timeTakenMillisIfKnown.doubleValue();
    }

    public final Double getTimeTakenMillisIfKnown() {
        if (isEndTimeKnown()) {
            return Double.valueOf(durationMilliOf(this.startTimeNano, this.endTimeNano.longValue()));
        }
        return null;
    }

    public void incrementCounter(String str) {
    }

    public final boolean isEndTimeKnown() {
        return this.endTimeNano != null;
    }

    public final boolean isStartEpochTimeMilliKnown() {
        return this.startEpochTimeMilli != null;
    }

    public void setCounter(String str, long j2) {
    }

    @Deprecated
    public void setEndTime(long j2) {
        this.endTimeNano = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j2));
    }

    public void setEndTimeNano(long j2) {
        this.endTimeNano = Long.valueOf(j2);
    }

    public final String toString() {
        return String.valueOf(getTimeTakenMillis());
    }
}
