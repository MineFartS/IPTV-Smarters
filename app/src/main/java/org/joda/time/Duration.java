package org.joda.time;

import java.io.Serializable;
import org.achartengine.chart.TimeChart;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes.dex */
public final class Duration extends BaseDuration implements ReadableDuration, Serializable {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j2) {
        super(j2);
    }

    public Duration(long j2, long j3) {
        super(j2, j3);
    }

    public Duration(Object obj) {
        super(obj);
    }

    public Duration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public static Duration millis(long j2) {
        return j2 == 0 ? ZERO : new Duration(j2);
    }

    @FromString
    public static Duration parse(String str) {
        return new Duration(str);
    }

    public static Duration standardDays(long j2) {
        return j2 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j2, DateTimeConstants.MILLIS_PER_DAY));
    }

    public static Duration standardHours(long j2) {
        return j2 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j2, DateTimeConstants.MILLIS_PER_HOUR));
    }

    public static Duration standardMinutes(long j2) {
        return j2 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j2, DateTimeConstants.MILLIS_PER_MINUTE));
    }

    public static Duration standardSeconds(long j2) {
        return j2 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j2, 1000));
    }

    public Duration dividedBy(long j2) {
        return j2 == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j2));
    }

    public long getStandardDays() {
        return getMillis() / TimeChart.DAY;
    }

    public long getStandardHours() {
        return getMillis() / 3600000;
    }

    public long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public Duration minus(long j2) {
        return withDurationAdded(j2, -1);
    }

    public Duration minus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), -1);
    }

    public Duration multipliedBy(long j2) {
        return j2 == 1 ? this : new Duration(FieldUtils.safeMultiply(getMillis(), j2));
    }

    public Duration negated() {
        if (getMillis() != Long.MIN_VALUE) {
            return new Duration(-getMillis());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }

    public Duration plus(long j2) {
        return withDurationAdded(j2, 1);
    }

    public Duration plus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), 1);
    }

    @Override // org.joda.time.base.AbstractDuration, org.joda.time.ReadableDuration
    public Duration toDuration() {
        return this;
    }

    public Days toStandardDays() {
        return Days.days(FieldUtils.safeToInt(getStandardDays()));
    }

    public Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
    }

    public Duration withDurationAdded(long j2, int i2) {
        if (j2 == 0 || i2 == 0) {
            return this;
        }
        return new Duration(FieldUtils.safeAdd(getMillis(), FieldUtils.safeMultiply(j2, i2)));
    }

    public Duration withDurationAdded(ReadableDuration readableDuration, int i2) {
        return (readableDuration == null || i2 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i2);
    }

    public Duration withMillis(long j2) {
        return j2 == getMillis() ? this : new Duration(j2);
    }
}
