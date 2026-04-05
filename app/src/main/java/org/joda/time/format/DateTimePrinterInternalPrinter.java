package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes2.dex */
public class DateTimePrinterInternalPrinter implements InternalPrinter {
    private final DateTimePrinter underlying;

    private DateTimePrinterInternalPrinter(DateTimePrinter dateTimePrinter) {
        this.underlying = dateTimePrinter;
    }

    public static InternalPrinter of(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter instanceof InternalPrinterDateTimePrinter) {
            return (InternalPrinter) dateTimePrinter;
        }
        if (dateTimePrinter == null) {
            return null;
        }
        return new DateTimePrinterInternalPrinter(dateTimePrinter);
    }

    @Override // org.joda.time.format.InternalPrinter
    public int estimatePrintedLength() {
        return this.underlying.estimatePrintedLength();
    }

    public DateTimePrinter getUnderlying() {
        return this.underlying;
    }

    @Override // org.joda.time.format.InternalPrinter
    public void printTo(Appendable appendable, long j2, Chronology chronology, int i2, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.underlying.printTo((StringBuffer) appendable, j2, chronology, i2, dateTimeZone, locale);
        }
        if (appendable instanceof Writer) {
            this.underlying.printTo((Writer) appendable, j2, chronology, i2, dateTimeZone, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.underlying.printTo(stringBuffer, j2, chronology, i2, dateTimeZone, locale);
        appendable.append(stringBuffer);
    }

    @Override // org.joda.time.format.InternalPrinter
    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.underlying.printTo((StringBuffer) appendable, readablePartial, locale);
        }
        if (appendable instanceof Writer) {
            this.underlying.printTo((Writer) appendable, readablePartial, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.underlying.printTo(stringBuffer, readablePartial, locale);
        appendable.append(stringBuffer);
    }
}
