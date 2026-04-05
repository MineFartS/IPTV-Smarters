package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class GJChronology extends AssembledChronology {
    public static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    public class CutoverField extends BaseDateTimeField {
        private static final long serialVersionUID = 3528501219481026402L;
        public final boolean iConvertByWeekyear;
        public final long iCutover;
        public DurationField iDurationField;
        public final DateTimeField iGregorianField;
        public final DateTimeField iJulianField;
        public DurationField iRangeDurationField;

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j2) {
            this(gJChronology, dateTimeField, dateTimeField2, j2, false);
        }

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j2, boolean z) {
            this(dateTimeField, dateTimeField2, null, j2, z);
        }

        public CutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j2, boolean z) {
            super(dateTimeField2.getType());
            this.iJulianField = dateTimeField;
            this.iGregorianField = dateTimeField2;
            this.iCutover = j2;
            this.iConvertByWeekyear = z;
            this.iDurationField = dateTimeField2.getDurationField();
            if (durationField == null && (durationField = dateTimeField2.getRangeDurationField()) == null) {
                durationField = dateTimeField.getRangeDurationField();
            }
            this.iRangeDurationField = durationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j2, int i2) {
            return this.iGregorianField.add(j2, i2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j2, long j3) {
            return this.iGregorianField.add(j2, j3);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int[] add(ReadablePartial readablePartial, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                return iArr;
            }
            if (!DateTimeUtils.isContiguous(readablePartial)) {
                return super.add(readablePartial, i2, iArr, i3);
            }
            long j2 = 0;
            int size = readablePartial.size();
            for (int i4 = 0; i4 < size; i4++) {
                j2 = readablePartial.getFieldType(i4).getField(GJChronology.this).set(j2, iArr[i4]);
            }
            return GJChronology.this.get(readablePartial, add(j2, i3));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j2) {
            return (j2 >= this.iCutover ? this.iGregorianField : this.iJulianField).get(j2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i2, Locale locale) {
            return this.iGregorianField.getAsShortText(i2, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j2, Locale locale) {
            return (j2 >= this.iCutover ? this.iGregorianField : this.iJulianField).getAsShortText(j2, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i2, Locale locale) {
            return this.iGregorianField.getAsText(i2, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j2, Locale locale) {
            return (j2 >= this.iCutover ? this.iGregorianField : this.iJulianField).getAsText(j2, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j2, long j3) {
            return this.iGregorianField.getDifference(j2, j3);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j2, long j3) {
            return this.iGregorianField.getDifferenceAsLong(j2, j3);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j2) {
            return (j2 >= this.iCutover ? this.iGregorianField : this.iJulianField).getLeapAmount(j2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getLeapDurationField() {
            return this.iGregorianField.getLeapDurationField();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumShortTextLength(locale), this.iGregorianField.getMaximumShortTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumTextLength(locale), this.iGregorianField.getMaximumTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iGregorianField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j2) {
            if (j2 >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j2);
            }
            int maximumValue = this.iJulianField.getMaximumValue(j2);
            long j3 = this.iJulianField.set(j2, maximumValue);
            long j4 = this.iCutover;
            if (j3 < j4) {
                return maximumValue;
            }
            DateTimeField dateTimeField = this.iJulianField;
            return dateTimeField.get(dateTimeField.add(j4, -1));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0L));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = readablePartial.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                DateTimeField field = readablePartial.getFieldType(i2).getField(instanceUTC);
                if (iArr[i2] <= field.getMaximumValue(j2)) {
                    j2 = field.set(j2, iArr[i2]);
                }
            }
            return getMaximumValue(j2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iJulianField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j2) {
            if (j2 < this.iCutover) {
                return this.iJulianField.getMinimumValue(j2);
            }
            int minimumValue = this.iGregorianField.getMinimumValue(j2);
            long j3 = this.iGregorianField.set(j2, minimumValue);
            long j4 = this.iCutover;
            return j3 < j4 ? this.iGregorianField.get(j4) : minimumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iJulianField.getMinimumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iJulianField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public long gregorianToJulian(long j2) {
            return this.iConvertByWeekyear ? GJChronology.this.gregorianToJulianByWeekyear(j2) : GJChronology.this.gregorianToJulianByYear(j2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j2) {
            return (j2 >= this.iCutover ? this.iGregorianField : this.iJulianField).isLeap(j2);
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return false;
        }

        public long julianToGregorian(long j2) {
            return this.iConvertByWeekyear ? GJChronology.this.julianToGregorianByWeekyear(j2) : GJChronology.this.julianToGregorianByYear(j2);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j2) {
            if (j2 >= this.iCutover) {
                return this.iGregorianField.roundCeiling(j2);
            }
            long jRoundCeiling = this.iJulianField.roundCeiling(j2);
            return (jRoundCeiling < this.iCutover || jRoundCeiling - GJChronology.this.iGapDuration < this.iCutover) ? jRoundCeiling : julianToGregorian(jRoundCeiling);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j2) {
            if (j2 < this.iCutover) {
                return this.iJulianField.roundFloor(j2);
            }
            long jRoundFloor = this.iGregorianField.roundFloor(j2);
            return (jRoundFloor >= this.iCutover || GJChronology.this.iGapDuration + jRoundFloor >= this.iCutover) ? jRoundFloor : gregorianToJulian(jRoundFloor);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j2, int i2) {
            long jJulianToGregorian;
            if (j2 >= this.iCutover) {
                jJulianToGregorian = this.iGregorianField.set(j2, i2);
                if (jJulianToGregorian < this.iCutover) {
                    if (GJChronology.this.iGapDuration + jJulianToGregorian < this.iCutover) {
                        jJulianToGregorian = gregorianToJulian(jJulianToGregorian);
                    }
                    if (get(jJulianToGregorian) != i2) {
                        throw new IllegalFieldValueException(this.iGregorianField.getType(), Integer.valueOf(i2), (Number) null, (Number) null);
                    }
                }
            } else {
                jJulianToGregorian = this.iJulianField.set(j2, i2);
                if (jJulianToGregorian >= this.iCutover) {
                    if (jJulianToGregorian - GJChronology.this.iGapDuration >= this.iCutover) {
                        jJulianToGregorian = julianToGregorian(jJulianToGregorian);
                    }
                    if (get(jJulianToGregorian) != i2) {
                        throw new IllegalFieldValueException(this.iJulianField.getType(), Integer.valueOf(i2), (Number) null, (Number) null);
                    }
                }
            }
            return jJulianToGregorian;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j2, String str, Locale locale) {
            if (j2 >= this.iCutover) {
                long j3 = this.iGregorianField.set(j2, str, locale);
                return (j3 >= this.iCutover || GJChronology.this.iGapDuration + j3 >= this.iCutover) ? j3 : gregorianToJulian(j3);
            }
            long j4 = this.iJulianField.set(j2, str, locale);
            return (j4 < this.iCutover || j4 - GJChronology.this.iGapDuration < this.iCutover) ? j4 : julianToGregorian(j4);
        }
    }

    public final class ImpreciseCutoverField extends CutoverField {
        private static final long serialVersionUID = 3410248757173576441L;

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j2) {
            this(dateTimeField, dateTimeField2, (DurationField) null, j2, false);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j2) {
            this(dateTimeField, dateTimeField2, durationField, j2, false);
        }

        public ImpreciseCutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j2, boolean z) {
            super(GJChronology.this, dateTimeField, dateTimeField2, j2, z);
            this.iDurationField = durationField == null ? new LinkedDurationField(this.iDurationField, this) : durationField;
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j2) {
            this(dateTimeField, dateTimeField2, durationField, j2, false);
            this.iRangeDurationField = durationField2;
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j2, int i2) {
            DateTimeField dateTimeFieldYear;
            if (j2 < this.iCutover) {
                long jAdd = this.iJulianField.add(j2, i2);
                return (jAdd < this.iCutover || jAdd - GJChronology.this.iGapDuration < this.iCutover) ? jAdd : julianToGregorian(jAdd);
            }
            long jAdd2 = this.iGregorianField.add(j2, i2);
            if (jAdd2 >= this.iCutover || GJChronology.this.iGapDuration + jAdd2 >= this.iCutover) {
                return jAdd2;
            }
            if (this.iConvertByWeekyear) {
                if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd2) <= 0) {
                    dateTimeFieldYear = GJChronology.this.iGregorianChronology.weekyear();
                    jAdd2 = dateTimeFieldYear.add(jAdd2, -1);
                }
            } else if (GJChronology.this.iGregorianChronology.year().get(jAdd2) <= 0) {
                dateTimeFieldYear = GJChronology.this.iGregorianChronology.year();
                jAdd2 = dateTimeFieldYear.add(jAdd2, -1);
            }
            return gregorianToJulian(jAdd2);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j2, long j3) {
            DateTimeField dateTimeFieldYear;
            if (j2 < this.iCutover) {
                long jAdd = this.iJulianField.add(j2, j3);
                return (jAdd < this.iCutover || jAdd - GJChronology.this.iGapDuration < this.iCutover) ? jAdd : julianToGregorian(jAdd);
            }
            long jAdd2 = this.iGregorianField.add(j2, j3);
            if (jAdd2 >= this.iCutover || GJChronology.this.iGapDuration + jAdd2 >= this.iCutover) {
                return jAdd2;
            }
            if (this.iConvertByWeekyear) {
                if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd2) <= 0) {
                    dateTimeFieldYear = GJChronology.this.iGregorianChronology.weekyear();
                    jAdd2 = dateTimeFieldYear.add(jAdd2, -1);
                }
            } else if (GJChronology.this.iGregorianChronology.year().get(jAdd2) <= 0) {
                dateTimeFieldYear = GJChronology.this.iGregorianChronology.year();
                jAdd2 = dateTimeFieldYear.add(jAdd2, -1);
            }
            return gregorianToJulian(jAdd2);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j2, long j3) {
            DateTimeField dateTimeField;
            long j4 = this.iCutover;
            if (j2 >= j4) {
                if (j3 < j4) {
                    j2 = gregorianToJulian(j2);
                    dateTimeField = this.iJulianField;
                }
                dateTimeField = this.iGregorianField;
            } else {
                if (j3 >= j4) {
                    j2 = julianToGregorian(j2);
                    dateTimeField = this.iGregorianField;
                }
                dateTimeField = this.iJulianField;
            }
            return dateTimeField.getDifference(j2, j3);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j2, long j3) {
            DateTimeField dateTimeField;
            long j4 = this.iCutover;
            if (j2 >= j4) {
                if (j3 < j4) {
                    j2 = gregorianToJulian(j2);
                    dateTimeField = this.iJulianField;
                }
                dateTimeField = this.iGregorianField;
            } else {
                if (j3 >= j4) {
                    j2 = julianToGregorian(j2);
                    dateTimeField = this.iGregorianField;
                }
                dateTimeField = this.iJulianField;
            }
            return dateTimeField.getDifferenceAsLong(j2, j3);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j2) {
            return (j2 >= this.iCutover ? this.iGregorianField : this.iJulianField).getMaximumValue(j2);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j2) {
            return (j2 >= this.iCutover ? this.iGregorianField : this.iJulianField).getMinimumValue(j2);
        }
    }

    public static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final ImpreciseCutoverField iField;

        public LinkedDurationField(DurationField durationField, ImpreciseCutoverField impreciseCutoverField) {
            super(durationField, durationField.getType());
            this.iField = impreciseCutoverField;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j2, int i2) {
            return this.iField.add(j2, i2);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j2, long j3) {
            return this.iField.add(j2, j3);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j2, long j3) {
            return this.iField.getDifference(j2, j3);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j2, long j3) {
            return this.iField.getDifferenceAsLong(j2, j3);
        }
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j2, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0L, chronology.weekyear().get(j2)), chronology.weekOfWeekyear().get(j2)), chronology.dayOfWeek().get(j2)), chronology.millisOfDay().get(j2));
    }

    private static long convertByYear(long j2, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j2), chronology.monthOfYear().get(j2), chronology.dayOfMonth().get(j2), chronology.millisOfDay().get(j2));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j2, int i2) {
        return getInstance(dateTimeZone, j2 == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j2), i2);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i2) {
        Instant instant;
        GJChronology gJChronology;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.getInstance(zone)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        GJCacheKey gJCacheKey = new GJCacheKey(zone, instant, i2);
        ConcurrentHashMap<GJCacheKey, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology2 = concurrentHashMap.get(gJCacheKey);
        if (gJChronology2 != null) {
            return gJChronology2;
        }
        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
        if (zone == dateTimeZone2) {
            gJChronology = new GJChronology(JulianChronology.getInstance(zone, i2), GregorianChronology.getInstance(zone, i2), instant);
        } else {
            GJChronology gJChronology3 = getInstance(dateTimeZone2, instant, i2);
            gJChronology = new GJChronology(ZonedChronology.getInstance(gJChronology3, zone), gJChronology3.iJulianChronology, gJChronology3.iGregorianChronology, gJChronology3.iCutoverInstant);
        }
        GJChronology gJChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(gJCacheKey, gJChronology);
        return gJChronologyPutIfAbsent != null ? gJChronologyPutIfAbsent : gJChronology;
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() != null) {
            return;
        }
        if (julianChronology.getMinimumDaysInFirstWeek() != gregorianChronology.getMinimumDaysInFirstWeek()) {
            throw new IllegalArgumentException();
        }
        long j2 = this.iCutoverMillis;
        this.iGapDuration = j2 - julianToGregorianByYear(j2);
        fields.copyFieldsFrom(gregorianChronology);
        if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
            fields.millisOfSecond = new CutoverField(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
            fields.millisOfDay = new CutoverField(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
            fields.secondOfMinute = new CutoverField(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
            fields.secondOfDay = new CutoverField(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
            fields.minuteOfHour = new CutoverField(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
            fields.minuteOfDay = new CutoverField(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
            fields.hourOfDay = new CutoverField(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
            fields.hourOfHalfday = new CutoverField(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
            fields.clockhourOfDay = new CutoverField(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
            fields.clockhourOfHalfday = new CutoverField(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
            fields.halfdayOfDay = new CutoverField(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
        }
        fields.era = new CutoverField(this, julianChronology.era(), fields.era, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField = new ImpreciseCutoverField(this, julianChronology.year(), fields.year, this.iCutoverMillis);
        fields.year = impreciseCutoverField;
        fields.years = impreciseCutoverField.getDurationField();
        fields.yearOfEra = new ImpreciseCutoverField(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField2 = new ImpreciseCutoverField(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
        fields.centuryOfEra = impreciseCutoverField2;
        fields.centuries = impreciseCutoverField2.getDurationField();
        fields.yearOfCentury = new ImpreciseCutoverField(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField3 = new ImpreciseCutoverField(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
        fields.monthOfYear = impreciseCutoverField3;
        fields.months = impreciseCutoverField3.getDurationField();
        ImpreciseCutoverField impreciseCutoverField4 = new ImpreciseCutoverField(julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
        fields.weekyear = impreciseCutoverField4;
        fields.weekyears = impreciseCutoverField4.getDurationField();
        fields.weekyearOfCentury = new ImpreciseCutoverField(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
        fields.dayOfYear = new CutoverField(julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
        fields.weekOfWeekyear = new CutoverField(julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
        CutoverField cutoverField = new CutoverField(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
        cutoverField.iRangeDurationField = fields.months;
        fields.dayOfMonth = cutoverField;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        return this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i2, int i3, int i4, int i5) {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i2, i3, i4, i5);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i2, i3, i4, i5);
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i2, i3, i4, i5);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long dateTimeMillis;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i2, i3, i4, i5, i6, i7, i8);
        }
        try {
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i2, i3, i4, i5, i6, i7, i8);
        } catch (IllegalFieldValueException e2) {
            if (i3 != 2 || i4 != 29) {
                throw e2;
            }
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i2, i3, 28, i5, i6, i7, i8);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw e2;
            }
        }
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i2, i3, i4, i5, i6, i7, i8);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public long gregorianToJulianByWeekyear(long j2) {
        return convertByWeekyear(j2, this.iGregorianChronology, this.iJulianChronology);
    }

    public long gregorianToJulianByYear(long j2) {
        return convertByYear(j2, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return 25025 + getZone().hashCode() + getMinimumDaysInFirstWeek() + this.iCutoverInstant.hashCode();
    }

    public long julianToGregorianByWeekyear(long j2) {
        return convertByWeekyear(j2, this.iJulianChronology, this.iGregorianChronology);
    }

    public long julianToGregorianByYear(long j2) {
        return convertByYear(j2, this.iJulianChronology, this.iGregorianChronology);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append('[');
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? ISODateTimeFormat.date() : ISODateTimeFormat.dateTime()).withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone, this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }
}
