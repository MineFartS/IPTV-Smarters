package org.joda.time.base;

import com.amazonaws.services.s3.model.InstructionFileId;
import org.joda.convert.ToString;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.format.FormatUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDuration implements ReadableDuration {
    @Override // java.lang.Comparable
    public int compareTo(ReadableDuration readableDuration) {
        long millis = getMillis();
        long millis2 = readableDuration.getMillis();
        if (millis < millis2) {
            return -1;
        }
        return millis > millis2 ? 1 : 0;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReadableDuration) && getMillis() == ((ReadableDuration) obj).getMillis();
    }

    @Override // org.joda.time.ReadableDuration
    public int hashCode() {
        long millis = getMillis();
        return (int) (millis ^ (millis >>> 32));
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isEqual(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        return compareTo(readableDuration) == 0;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isLongerThan(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        return compareTo(readableDuration) > 0;
    }

    @Override // org.joda.time.ReadableDuration
    public boolean isShorterThan(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            readableDuration = Duration.ZERO;
        }
        return compareTo(readableDuration) < 0;
    }

    @Override // org.joda.time.ReadableDuration
    public Duration toDuration() {
        return new Duration(getMillis());
    }

    @Override // org.joda.time.ReadableDuration
    public Period toPeriod() {
        return new Period(getMillis());
    }

    @Override // org.joda.time.ReadableDuration
    @ToString
    public String toString() {
        long millis = getMillis();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        boolean z = millis < 0;
        FormatUtils.appendUnpaddedInteger(stringBuffer, millis);
        while (true) {
            int i2 = 3;
            if (stringBuffer.length() >= (z ? 7 : 6)) {
                break;
            }
            if (!z) {
                i2 = 2;
            }
            stringBuffer.insert(i2, "0");
        }
        long j2 = (millis / 1000) * 1000;
        int length = stringBuffer.length() - 3;
        if (j2 == millis) {
            stringBuffer.setLength(length);
        } else {
            stringBuffer.insert(length, InstructionFileId.DOT);
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
