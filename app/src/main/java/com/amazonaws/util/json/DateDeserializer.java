package com.amazonaws.util.json;

import c.f.d.h;
import c.f.d.i;
import c.f.d.j;
import c.f.d.n;
import c.f.d.o;
import c.f.d.p;
import c.f.d.q;
import com.amazonaws.util.DateUtils;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DateDeserializer implements i<Date>, q<Date> {
    private final List<String> dateFormats;
    private final SimpleDateFormat mIso8601DateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN);
    private SimpleDateFormat mSimpleDateFormat;

    public DateDeserializer(String[] strArr) {
        this.dateFormats = Arrays.asList(strArr);
    }

    @Override // c.f.d.i
    public Date deserialize(j jVar, Type type, h hVar) {
        String strI = jVar.i();
        for (String str : this.dateFormats) {
            try {
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
                this.mSimpleDateFormat = simpleDateFormat;
                date.setTime(simpleDateFormat.parse(strI).getTime());
                return date;
            } catch (ParseException unused) {
            }
        }
        try {
            return DateFormat.getDateInstance(2).parse(strI);
        } catch (ParseException e2) {
            throw new n(e2.getMessage(), e2);
        }
    }

    @Override // c.f.d.q
    public j serialize(Date date, Type type, p pVar) {
        o oVar;
        synchronized (this.mIso8601DateFormat) {
            oVar = new o(this.mIso8601DateFormat.format(date));
        }
        return oVar;
    }
}
