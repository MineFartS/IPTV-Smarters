package org.joda.time.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
import org.jsoup.parser.Tokeniser;

/* JADX INFO: loaded from: classes2.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        public CharacterLiteral(char c2) {
            this.iValue = c2;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            char upperCase;
            char upperCase2;
            if (i2 >= charSequence.length()) {
                return i2 ^ (-1);
            }
            char cCharAt = charSequence.charAt(i2);
            char c2 = this.iValue;
            return (cCharAt == c2 || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i2 + 1 : i2 ^ (-1);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int iEstimatePrintedLength = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i2);
                    iEstimatePrintedLength += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i2] = internalPrinter;
                }
                this.iPrintedLengthEstimate = iEstimatePrintedLength;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int iEstimateParsedLength = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i3);
                iEstimateParsedLength += internalParser.estimateParsedLength();
                this.iParsers[i3] = internalParser;
            }
            this.iParsedLengthEstimate = iEstimateParsedLength;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2 += 2) {
                Object obj = list.get(i2);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i2 + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = internalParserArr.length;
            for (int i3 = 0; i3 < length && i2 >= 0; i3++) {
                i2 = internalParserArr[i3].parseInto(dateTimeParserBucket, charSequence, i2);
            }
            return i2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, j2, chronology, i2, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, readablePartial, locale);
            }
        }
    }

    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i2, boolean z) {
            super(dateTimeFieldType, i2, z, i2);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            int i3;
            char cCharAt;
            int into = super.parseInto(dateTimeParserBucket, charSequence, i2);
            if (into < 0 || into == (i3 = this.iMaxParsedDigits + i2)) {
                return into;
            }
            if (this.iSigned && ((cCharAt = charSequence.charAt(i2)) == '-' || cCharAt == '+')) {
                i3++;
            }
            return into > i3 ? (i3 + 1) ^ (-1) : into < i3 ? into ^ (-1) : into;
        }
    }

    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        public int iMaxDigits;
        public int iMinDigits;

        public Fraction(DateTimeFieldType dateTimeFieldType, int i2, int i3) {
            this.iFieldType = dateTimeFieldType;
            i3 = i3 > 18 ? 18 : i3;
            this.iMinDigits = i2;
            this.iMaxDigits = i3;
        }

        private long[] getFractionData(long j2, DateTimeField dateTimeField) {
            long j3;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i2 = this.iMaxDigits;
            while (true) {
                switch (i2) {
                    case 1:
                        j3 = 10;
                        break;
                    case 2:
                        j3 = 100;
                        break;
                    case 3:
                        j3 = 1000;
                        break;
                    case 4:
                        j3 = 10000;
                        break;
                    case 5:
                        j3 = 100000;
                        break;
                    case 6:
                        j3 = 1000000;
                        break;
                    case 7:
                        j3 = 10000000;
                        break;
                    case 8:
                        j3 = 100000000;
                        break;
                    case 9:
                        j3 = 1000000000;
                        break;
                    case 10:
                        j3 = 10000000000L;
                        break;
                    case 11:
                        j3 = 100000000000L;
                        break;
                    case 12:
                        j3 = 1000000000000L;
                        break;
                    case 13:
                        j3 = 10000000000000L;
                        break;
                    case 14:
                        j3 = 100000000000000L;
                        break;
                    case 15:
                        j3 = 1000000000000000L;
                        break;
                    case 16:
                        j3 = 10000000000000000L;
                        break;
                    case 17:
                        j3 = 100000000000000000L;
                        break;
                    case 18:
                        j3 = 1000000000000000000L;
                        break;
                    default:
                        j3 = 1;
                        break;
                }
                if ((unitMillis * j3) / j3 == unitMillis) {
                    return new long[]{(j2 * j3) / unitMillis, i2};
                }
                i2--;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int iMin = Math.min(this.iMaxDigits, charSequence.length() - i2);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j2 = 0;
            int i3 = 0;
            while (i3 < iMin) {
                char cCharAt = charSequence.charAt(i2 + i3);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i3++;
                unitMillis /= 10;
                j2 += ((long) (cCharAt - '0')) * unitMillis;
            }
            long j3 = j2 / 10;
            if (i3 != 0 && j3 <= 2147483647L) {
                dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j3);
                return i2 + i3;
            }
            return i2 ^ (-1);
        }

        public void printTo(Appendable appendable, long j2, Chronology chronology) throws IOException {
            DateTimeField field = this.iFieldType.getField(chronology);
            int i2 = this.iMinDigits;
            try {
                long jRemainder = field.remainder(j2);
                if (jRemainder != 0) {
                    long[] fractionData = getFractionData(jRemainder, field);
                    long j3 = fractionData[0];
                    int i3 = (int) fractionData[1];
                    String string = (2147483647L & j3) == j3 ? Integer.toString((int) j3) : Long.toString(j3);
                    int length = string.length();
                    while (length < i3) {
                        appendable.append('0');
                        i2--;
                        i3--;
                    }
                    if (i2 < i3) {
                        while (i2 < i3 && length > 1 && string.charAt(length - 1) == '0') {
                            i3--;
                            length--;
                        }
                        if (length < string.length()) {
                            for (int i4 = 0; i4 < length; i4++) {
                                appendable.append(string.charAt(i4));
                            }
                            return;
                        }
                    }
                    appendable.append(string);
                    return;
                }
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i2);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j2, chronology);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }
    }

    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        public MatchingParser(InternalParser[] internalParserArr) {
            int iEstimateParsedLength;
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i2 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.iParsedLengthEstimate = i2;
                    return;
                }
                InternalParser internalParser = internalParserArr[length];
                if (internalParser != null && (iEstimateParsedLength = internalParser.estimateParsedLength()) > i2) {
                    i2 = iEstimateParsedLength;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
        
            if (r6 > r12) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
        
            if (r6 != r12) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
        
            if (r3 == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
        
            return r7 ^ (-1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
        
            if (r4 == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
        
            r10.restoreState(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
        
            return r6;
         */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r10, java.lang.CharSequence r11, int r12) {
            /*
                r9 = this;
                org.joda.time.format.InternalParser[] r0 = r9.iParsers
                int r1 = r0.length
                java.lang.Object r2 = r10.saveState()
                r3 = 0
                r4 = 0
                r6 = r12
                r7 = r6
                r5 = 0
            Lc:
                if (r5 >= r1) goto L42
                r8 = r0[r5]
                if (r8 != 0) goto L17
                if (r6 > r12) goto L15
                return r12
            L15:
                r3 = 1
                goto L42
            L17:
                int r8 = r8.parseInto(r10, r11, r12)
                if (r8 < r12) goto L35
                if (r8 <= r6) goto L3c
                int r4 = r11.length()
                if (r8 >= r4) goto L34
                int r4 = r5 + 1
                if (r4 >= r1) goto L34
                r4 = r0[r4]
                if (r4 != 0) goto L2e
                goto L34
            L2e:
                java.lang.Object r4 = r10.saveState()
                r6 = r8
                goto L3c
            L34:
                return r8
            L35:
                if (r8 >= 0) goto L3c
                r8 = r8 ^ (-1)
                if (r8 <= r7) goto L3c
                r7 = r8
            L3c:
                r10.restoreState(r2)
                int r5 = r5 + 1
                goto Lc
            L42:
                if (r6 > r12) goto L4c
                if (r6 != r12) goto L49
                if (r3 == 0) goto L49
                goto L4c
            L49:
                r10 = r7 ^ (-1)
                return r10
            L4c:
                if (r4 == 0) goto L51
                r10.restoreState(r4)
            L51:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.MatchingParser.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        public final DateTimeFieldType iFieldType;
        public final int iMaxParsedDigits;
        public final boolean iSigned;

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i2, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i2;
            this.iSigned = z;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int iMin = Math.min(this.iMaxParsedDigits, charSequence.length() - i2);
            int i5 = 0;
            boolean z = false;
            while (i5 < iMin) {
                int i6 = i2 + i5;
                char cCharAt2 = charSequence.charAt(i6);
                if (i5 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.iSigned)) {
                    z = cCharAt2 == '-';
                    int i7 = i5 + 1;
                    if (i7 >= iMin || (cCharAt = charSequence.charAt(i6 + 1)) < '0' || cCharAt > '9') {
                        break;
                    }
                    if (z) {
                        i5 = i7;
                    } else {
                        i2++;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i2);
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i5++;
                }
            }
            if (i5 == 0) {
                return i2 ^ (-1);
            }
            if (i5 >= 9) {
                i3 = i5 + i2;
                i4 = Integer.parseInt(charSequence.subSequence(i2, i3).toString());
            } else {
                int i8 = z ? i2 + 1 : i2;
                int i9 = i8 + 1;
                try {
                    int iCharAt = charSequence.charAt(i8) - '0';
                    i3 = i5 + i2;
                    while (i9 < i3) {
                        int iCharAt2 = (((iCharAt << 3) + (iCharAt << 1)) + charSequence.charAt(i9)) - 48;
                        i9++;
                        iCharAt = iCharAt2;
                    }
                    i4 = z ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return i2 ^ (-1);
                }
            }
            dateTimeParserBucket.saveField(this.iFieldType, i4);
            return i3;
        }
    }

    public static class PaddedNumber extends NumberFormatter {
        public final int iMinPrintedDigits;

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i2, boolean z, int i3) {
            super(dateTimeFieldType, i2, z);
            this.iMinPrintedDigits = i3;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j2), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
        }
    }

    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i2, this.iValue) ? i2 + this.iValue.length() : i2 ^ (-1);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z;
        }

        private String print(long j2, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            return this.iShort ? field.getAsShortText(j2, locale) : field.getAsText(j2, locale);
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.iFieldType)) {
                return "�";
            }
            DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
            return this.iShort ? field.getAsShortText(readablePartial, locale) : field.getAsText(readablePartial, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            int iIntValue;
            Map concurrentHashMap;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> concurrentHashMap2 = cParseCache.get(locale);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                cParseCache.put(locale, concurrentHashMap2);
            }
            Object[] objArr = concurrentHashMap2.get(this.iFieldType);
            if (objArr == null) {
                concurrentHashMap = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return i2 ^ (-1);
                }
                iIntValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap.put(asShortText, bool);
                    concurrentHashMap.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    concurrentHashMap.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale).toLowerCase(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap.put("BCE", bool2);
                    concurrentHashMap.put("bce", bool2);
                    concurrentHashMap.put("CE", bool2);
                    concurrentHashMap.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap2.put(this.iFieldType, new Object[]{concurrentHashMap, Integer.valueOf(iIntValue)});
            } else {
                Map map = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                concurrentHashMap = map;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i2); iMin > i2; iMin--) {
                String string = charSequence.subSequence(i2, iMin).toString();
                if (concurrentHashMap.containsKey(string)) {
                    dateTimeParserBucket.saveField(this.iFieldType, string, locale);
                    return iMin;
                }
            }
            return i2 ^ (-1);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j2, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append(Tokeniser.replacementChar);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append(Tokeniser.replacementChar);
            }
        }
    }

    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;

        public static final Set<String> ALL_IDS;
        public static final int MAX_LENGTH;

        static {
            int iMax = 0;
            Set<String> availableIDs = DateTimeZone.getAvailableIDs();
            ALL_IDS = availableIDs;
            Iterator<String> it = availableIDs.iterator();
            while (it.hasNext()) {
                iMax = Math.max(iMax, it.next().length());
            }
            MAX_LENGTH = iMax;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            String str = null;
            for (String str2 : ALL_IDS) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i2, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return i2 ^ (-1);
            }
            dateTimeParserBucket.setZone(DateTimeZone.forID(str));
            return i2 + str.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : BuildConfig.FLAVOR);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }

    public static class TimeZoneName implements InternalPrinter, InternalParser {
        public static final int LONG_NAME = 0;
        public static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        public TimeZoneName(int i2, Map<String, DateTimeZone> map) {
            this.iType = i2;
            this.iParseLookup = map;
        }

        private String print(long j2, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return BuildConfig.FLAVOR;
            }
            int i2 = this.iType;
            return i2 != 0 ? i2 != 1 ? BuildConfig.FLAVOR : dateTimeZone.getShortName(j2, locale) : dateTimeZone.getName(j2, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            Map<String, DateTimeZone> defaultTimeZoneNames = this.iParseLookup;
            if (defaultTimeZoneNames == null) {
                defaultTimeZoneNames = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : defaultTimeZoneNames.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i2, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return i2 ^ (-1);
            }
            dateTimeParserBucket.setZone(defaultTimeZoneNames.get(str));
            return i2 + str.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j2 - ((long) i2), dateTimeZone, locale));
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }

    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        public TimeZoneOffset(String str, String str2, boolean z, int i2, int i3) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z;
            if (i2 <= 0 || i3 < i2) {
                throw new IllegalArgumentException();
            }
            if (i2 > 4) {
                i2 = 4;
                i3 = 4;
            }
            this.iMinFields = i2;
            this.iMaxFields = i3;
        }

        private int digitCount(CharSequence charSequence, int i2, int i3) {
            int i4 = 0;
            for (int iMin = Math.min(charSequence.length() - i2, i3); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i2 + i4);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i4++;
            }
            return i4;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i2 = this.iMinFields;
            int i3 = (i2 + 1) << 1;
            if (this.iShowSeparators) {
                i3 += i2 - 1;
            }
            String str = this.iZeroOffsetPrintText;
            return (str == null || str.length() <= i3) ? i3 : this.iZeroOffsetPrintText.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r12, java.lang.CharSequence r13, int r14) {
            /*
                Method dump skipped, instruction units count: 305
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i2 == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i2 >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i2 = -i2;
            }
            int i3 = i2 / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i3, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i4 = i2 - (i3 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i4 != 0 || this.iMinFields > 1) {
                int i5 = i4 / DateTimeConstants.MILLIS_PER_MINUTE;
                if (this.iShowSeparators) {
                    appendable.append(':');
                }
                FormatUtils.appendPaddedInteger(appendable, i5, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i6 = i4 - (i5 * DateTimeConstants.MILLIS_PER_MINUTE);
                if (i6 != 0 || this.iMinFields > 2) {
                    int i7 = i6 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(':');
                    }
                    FormatUtils.appendPaddedInteger(appendable, i7, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i8 = i6 - (i7 * 1000);
                    if (i8 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append('.');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i8, 3);
                    }
                }
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }

    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i2, boolean z) {
            this.iType = dateTimeFieldType;
            this.iPivot = i2;
            this.iLenientParse = z;
        }

        private int getTwoDigitYear(long j2, Chronology chronology) {
            try {
                int i2 = this.iType.getField(chronology).get(j2);
                if (i2 < 0) {
                    i2 = -i2;
                }
                return i2 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i2 = readablePartial.get(this.iType);
                if (i2 < 0) {
                    i2 = -i2;
                }
                return i2 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i2) {
            int i3;
            int i4;
            int length = charSequence.length() - i2;
            if (this.iLenientParse) {
                int i5 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i5 < length) {
                    char cCharAt = charSequence.charAt(i2 + i5);
                    if (i5 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z2 = cCharAt == '-';
                        if (z2) {
                            i5++;
                        } else {
                            i2++;
                            length--;
                        }
                        z = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i5++;
                    }
                }
                if (i5 == 0) {
                    return i2 ^ (-1);
                }
                if (z || i5 != 2) {
                    if (i5 >= 9) {
                        i3 = i5 + i2;
                        i4 = Integer.parseInt(charSequence.subSequence(i2, i3).toString());
                    } else {
                        int i6 = z2 ? i2 + 1 : i2;
                        int i7 = i6 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i6) - '0';
                            i3 = i5 + i2;
                            while (i7 < i3) {
                                int iCharAt2 = (((iCharAt << 3) + (iCharAt << 1)) + charSequence.charAt(i7)) - 48;
                                i7++;
                                iCharAt = iCharAt2;
                            }
                            i4 = z2 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return i2 ^ (-1);
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i4);
                    return i3;
                }
            } else if (Math.min(2, length) < 2) {
                return i2 ^ (-1);
            }
            char cCharAt2 = charSequence.charAt(i2);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return i2 ^ (-1);
            }
            int i8 = cCharAt2 - '0';
            char cCharAt3 = charSequence.charAt(i2 + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return i2 ^ (-1);
            }
            int i9 = (((i8 << 3) + (i8 << 1)) + cCharAt3) - 48;
            int iIntValue = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                iIntValue = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i10 = iIntValue - 50;
            int i11 = i10 >= 0 ? i10 % 100 : ((i10 + 1) % 100) + 99;
            dateTimeParserBucket.saveField(this.iType, i9 + ((i10 + (i9 < i11 ? 100 : 0)) - i11));
            return i2 + 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j2, chronology);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append(Tokeniser.replacementChar);
                appendable.append(Tokeniser.replacementChar);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append(Tokeniser.replacementChar);
                appendable.append(Tokeniser.replacementChar);
            }
        }
    }

    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i2, boolean z) {
            super(dateTimeFieldType, i2, z);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j2));
            } catch (RuntimeException unused) {
                appendable.append(Tokeniser.replacementChar);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException unused) {
                }
            }
            appendable.append(Tokeniser.replacementChar);
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public static void appendUnknownString(Appendable appendable, int i2) throws IOException {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                appendable.append(Tokeniser.replacementChar);
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    public static boolean csStartsWith(CharSequence charSequence, int i2, String str) {
        int length = str.length();
        if (charSequence.length() - i2 < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (charSequence.charAt(i2 + i3) != str.charAt(i3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i2, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i2 < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = charSequence.charAt(i2 + i3);
            char cCharAt2 = str.charAt(i3);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object composite = this.iFormatter;
        if (composite == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj = this.iElementPairs.get(0);
                Object obj2 = this.iElementPairs.get(1);
                if (obj == null) {
                    composite = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    composite = obj;
                }
            }
            if (composite == null) {
                composite = new Composite(this.iElementPairs);
            }
            this.iFormatter = composite;
        }
        return composite;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), null);
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        InternalPrinter internalPrinterOf;
        InternalParser matchingParser;
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr == null) {
            throw new IllegalArgumentException("No parsers supplied");
        }
        int length = dateTimeParserArr.length;
        int i2 = 0;
        if (length != 1) {
            InternalParser[] internalParserArr = new InternalParser[length];
            while (i2 < length - 1) {
                InternalParser internalParserOf = DateTimeParserInternalParser.of(dateTimeParserArr[i2]);
                internalParserArr[i2] = internalParserOf;
                if (internalParserOf == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i2++;
            }
            internalParserArr[i2] = DateTimeParserInternalParser.of(dateTimeParserArr[i2]);
            internalPrinterOf = DateTimePrinterInternalPrinter.of(dateTimePrinter);
            matchingParser = new MatchingParser(internalParserArr);
        } else {
            if (dateTimeParserArr[0] == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            internalPrinterOf = DateTimePrinterInternalPrinter.of(dateTimePrinter);
            matchingParser = DateTimeParserInternalParser.of(dateTimeParserArr[0]);
        }
        return append0(internalPrinterOf, matchingParser);
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i2, int i3) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i2, i3);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i2) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i2, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i2) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i2, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i2) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i2, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i2) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i2, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i2) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i2, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i2, int i3) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i3 < i2) {
            i3 = i2;
        }
        if (i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        return i2 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i3, false)) : append0(new PaddedNumber(dateTimeFieldType, i3, false, i2));
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i2, false));
        }
        throw new IllegalArgumentException("Illegal number of digits: " + i2);
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i2, true));
        }
        throw new IllegalArgumentException("Illegal number of digits: " + i2);
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i2, int i3) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i3 < i2) {
            i3 = i2;
        }
        if (i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        return append0(new Fraction(dateTimeFieldType, i2, i3));
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i2, int i3) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i2, i3);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i2, int i3) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i2, i3);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i2, int i3) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i2, i3);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i2, int i3) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i2, i3);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i2) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i2, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i2) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i2, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c2) {
        return append0(new CharacterLiteral(c2));
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        int length = str.length();
        if (length != 0) {
            return append0(length != 1 ? new StringLiteral(str) : new CharacterLiteral(str.charAt(0)));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i2) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i2, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i2) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i2, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i2) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i2, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i2) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i2, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i2) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i2, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i2) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i2, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i2) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i2, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i2, int i3) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i3 < i2) {
            i3 = i2;
        }
        if (i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        return i2 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i3, true)) : append0(new PaddedNumber(dateTimeFieldType, i3, true, i2));
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z, int i2, int i3) {
        return append0(new TimeZoneOffset(str, str2, z, i2, i3));
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z, int i2, int i3) {
        return append0(new TimeZoneOffset(str, str, z, i2, i3));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i2) {
        return appendTwoDigitWeekyear(i2, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i2, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i2, z));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i2) {
        return appendTwoDigitYear(i2, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i2, boolean z) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i2, z));
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i2) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i2, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i2, int i3) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i2, i3);
    }

    public DateTimeFormatterBuilder appendYear(int i2, int i3) {
        return appendSignedDecimal(DateTimeFieldType.year(), i2, i3);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i2, int i3) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i2, i3);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i2, int i3) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i2, i3);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        InternalParser internalParser = isParser(formatter) ? (InternalParser) formatter : null;
        if (internalPrinter == null && internalParser == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new DateTimeFormatter(internalPrinter, internalParser);
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }
}
