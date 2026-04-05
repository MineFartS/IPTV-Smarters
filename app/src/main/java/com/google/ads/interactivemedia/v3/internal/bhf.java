package com.google.ads.interactivemedia.v3.internal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class bhf extends bfv<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfw f21122a = new bhe();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f21123b;

    public bhf() {
        ArrayList arrayList = new ArrayList();
        this.f21123b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (bgl.b()) {
            arrayList.add(art.d(2, 2));
        }
    }

    private final synchronized Date b(String str) {
        Iterator<DateFormat> it = this.f21123b.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return bjd.a(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new bfs(str, e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized void write(bjl bjlVar, Date date) {
        if (date == null) {
            bjlVar.g();
        } else {
            bjlVar.k(this.f21123b.get(0).format(date));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Date read(bjj bjjVar) {
        if (bjjVar.p() != 9) {
            return b(bjjVar.f());
        }
        bjjVar.k();
        return null;
    }
}
