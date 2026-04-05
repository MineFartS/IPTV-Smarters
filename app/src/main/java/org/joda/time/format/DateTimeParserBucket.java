package org.joda.time.format;

import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* JADX INFO: loaded from: classes2.dex */
public class DateTimeParserBucket {
    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    private Integer iOffset;
    private Integer iPivotYear;
    private SavedField[] iSavedFields;
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    private Object iSavedState;
    private DateTimeZone iZone;

    public static class SavedField implements Comparable<SavedField> {
        public DateTimeField iField;
        public Locale iLocale;
        public String iText;
        public int iValue;

        @Override // java.lang.Comparable
        public int compareTo(SavedField savedField) {
            DateTimeField dateTimeField = savedField.iField;
            int iCompareReverse = DateTimeParserBucket.compareReverse(this.iField.getRangeDurationField(), dateTimeField.getRangeDurationField());
            return iCompareReverse != 0 ? iCompareReverse : DateTimeParserBucket.compareReverse(this.iField.getDurationField(), dateTimeField.getDurationField());
        }

        public void init(DateTimeField dateTimeField, int i2) {
            this.iField = dateTimeField;
            this.iValue = i2;
            this.iText = null;
            this.iLocale = null;
        }

        public void init(DateTimeField dateTimeField, String str, Locale locale) {
            this.iField = dateTimeField;
            this.iValue = 0;
            this.iText = str;
            this.iLocale = locale;
        }

        public long set(long j2, boolean z) {
            String str = this.iText;
            long j3 = str == null ? this.iField.set(j2, this.iValue) : this.iField.set(j2, str, this.iLocale);
            return z ? this.iField.roundFloor(j3) : j3;
        }
    }

    public class SavedState {
        public final Integer iOffset;
        public final SavedField[] iSavedFields;
        public final int iSavedFieldsCount;
        public final DateTimeZone iZone;

        public SavedState() {
            this.iZone = DateTimeParserBucket.this.iZone;
            this.iOffset = DateTimeParserBucket.this.iOffset;
            this.iSavedFields = DateTimeParserBucket.this.iSavedFields;
            this.iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }

        public boolean restoreState(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket != DateTimeParserBucket.this) {
                return false;
            }
            dateTimeParserBucket.iZone = this.iZone;
            dateTimeParserBucket.iOffset = this.iOffset;
            dateTimeParserBucket.iSavedFields = this.iSavedFields;
            if (this.iSavedFieldsCount < dateTimeParserBucket.iSavedFieldsCount) {
                dateTimeParserBucket.iSavedFieldsShared = true;
            }
            dateTimeParserBucket.iSavedFieldsCount = this.iSavedFieldsCount;
            return true;
        }
    }

    @Deprecated
    public DateTimeParserBucket(long j2, Chronology chronology, Locale locale) {
        this(j2, chronology, locale, null, AdError.SERVER_ERROR_CODE);
    }

    @Deprecated
    public DateTimeParserBucket(long j2, Chronology chronology, Locale locale, Integer num) {
        this(j2, chronology, locale, num, AdError.SERVER_ERROR_CODE);
    }

    public DateTimeParserBucket(long j2, Chronology chronology, Locale locale, Integer num, int i2) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iMillis = j2;
        DateTimeZone zone = chronology2.getZone();
        this.iDefaultZone = zone;
        this.iChrono = chronology2.withUTC();
        this.iLocale = locale == null ? Locale.getDefault() : locale;
        this.iDefaultYear = i2;
        this.iDefaultPivotYear = num;
        this.iZone = zone;
        this.iPivotYear = num;
        this.iSavedFields = new SavedField[8];
    }

    public static int compareReverse(DurationField durationField, DurationField durationField2) {
        if (durationField == null || !durationField.isSupported()) {
            return (durationField2 == null || !durationField2.isSupported()) ? 0 : -1;
        }
        if (durationField2 == null || !durationField2.isSupported()) {
            return 1;
        }
        return -durationField.compareTo(durationField2);
    }

    private SavedField obtainSaveField() {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i2 = this.iSavedFieldsCount;
        if (i2 == savedFieldArr.length || this.iSavedFieldsShared) {
            SavedField[] savedFieldArr2 = new SavedField[i2 == savedFieldArr.length ? i2 * 2 : savedFieldArr.length];
            System.arraycopy(savedFieldArr, 0, savedFieldArr2, 0, i2);
            this.iSavedFields = savedFieldArr2;
            this.iSavedFieldsShared = false;
            savedFieldArr = savedFieldArr2;
        }
        this.iSavedState = null;
        SavedField savedField = savedFieldArr[i2];
        if (savedField == null) {
            savedField = new SavedField();
            savedFieldArr[i2] = savedField;
        }
        this.iSavedFieldsCount = i2 + 1;
        return savedField;
    }

    private static void sort(SavedField[] savedFieldArr, int i2) {
        if (i2 > 10) {
            Arrays.sort(savedFieldArr, 0, i2);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = i3; i4 > 0; i4--) {
                int i5 = i4 - 1;
                if (savedFieldArr[i5].compareTo(savedFieldArr[i4]) > 0) {
                    SavedField savedField = savedFieldArr[i4];
                    savedFieldArr[i4] = savedFieldArr[i5];
                    savedFieldArr[i5] = savedField;
                }
            }
        }
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }

    public long computeMillis(boolean z) {
        return computeMillis(z, (CharSequence) null);
    }

    public long computeMillis(boolean z, CharSequence charSequence) {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i2 = this.iSavedFieldsCount;
        if (this.iSavedFieldsShared) {
            savedFieldArr = (SavedField[]) savedFieldArr.clone();
            this.iSavedFields = savedFieldArr;
            this.iSavedFieldsShared = false;
        }
        sort(savedFieldArr, i2);
        if (i2 > 0) {
            DurationField field = DurationFieldType.months().getField(this.iChrono);
            DurationField field2 = DurationFieldType.days().getField(this.iChrono);
            DurationField durationField = savedFieldArr[0].iField.getDurationField();
            if (compareReverse(durationField, field) >= 0 && compareReverse(durationField, field2) <= 0) {
                saveField(DateTimeFieldType.year(), this.iDefaultYear);
                return computeMillis(z, charSequence);
            }
        }
        long j2 = this.iMillis;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                j2 = savedFieldArr[i3].set(j2, z);
            } catch (IllegalFieldValueException e2) {
                if (charSequence != null) {
                    e2.prependMessage("Cannot parse \"" + ((Object) charSequence) + '\"');
                }
                throw e2;
            }
        }
        if (z) {
            int i4 = 0;
            while (i4 < i2) {
                j2 = savedFieldArr[i4].set(j2, i4 == i2 + (-1));
                i4++;
            }
        }
        Integer num = this.iOffset;
        if (num != null) {
            return j2 - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.iZone;
        if (dateTimeZone == null) {
            return j2;
        }
        int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j2);
        long j3 = j2 - ((long) offsetFromLocal);
        if (offsetFromLocal == this.iZone.getOffset(j3)) {
            return j3;
        }
        String str = "Illegal instant due to time zone offset transition (" + this.iZone + ')';
        if (charSequence != null) {
            str = "Cannot parse \"" + ((Object) charSequence) + "\": " + str;
        }
        throw new IllegalInstantException(str);
    }

    public long computeMillis(boolean z, String str) {
        return computeMillis(z, (CharSequence) str);
    }

    public long doParseMillis(InternalParser internalParser, CharSequence charSequence) {
        int into = internalParser.parseInto(this, charSequence, 0);
        if (into < 0) {
            into ^= -1;
        } else if (into >= charSequence.length()) {
            return computeMillis(true, charSequence);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(charSequence.toString(), into));
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.iOffset;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Integer getOffsetInteger() {
        return this.iOffset;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return doParseMillis(DateTimeParserInternalParser.of(dateTimeParser), charSequence);
    }

    public void reset() {
        this.iZone = this.iDefaultZone;
        this.iOffset = null;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFieldsCount = 0;
        this.iSavedFieldsShared = false;
        this.iSavedState = null;
    }

    public boolean restoreState(Object obj) {
        if (!(obj instanceof SavedState) || !((SavedState) obj).restoreState(this)) {
            return false;
        }
        this.iSavedState = obj;
        return true;
    }

    public void saveField(DateTimeField dateTimeField, int i2) {
        obtainSaveField().init(dateTimeField, i2);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i2) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), i2);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), str, locale);
    }

    public Object saveState() {
        if (this.iSavedState == null) {
            this.iSavedState = new SavedState();
        }
        return this.iSavedState;
    }

    @Deprecated
    public void setOffset(int i2) {
        this.iSavedState = null;
        this.iOffset = Integer.valueOf(i2);
    }

    public void setOffset(Integer num) {
        this.iSavedState = null;
        this.iOffset = num;
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.iPivotYear = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.iSavedState = null;
        this.iZone = dateTimeZone;
    }
}
