package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class bim extends bfv<Calendar> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Calendar read(bjj bjjVar) throws IOException {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        bjjVar.h();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (bjjVar.p() != 4) {
            String strE = bjjVar.e();
            int iB = bjjVar.b();
            if ("year".equals(strE)) {
                i2 = iB;
            } else if ("month".equals(strE)) {
                i3 = iB;
            } else if ("dayOfMonth".equals(strE)) {
                i4 = iB;
            } else if ("hourOfDay".equals(strE)) {
                i5 = iB;
            } else if ("minute".equals(strE)) {
                i6 = iB;
            } else if ("second".equals(strE)) {
                i7 = iB;
            }
        }
        bjjVar.j();
        return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Calendar calendar) throws IOException {
        if (calendar == null) {
            bjlVar.g();
            return;
        }
        bjlVar.c();
        bjlVar.f("year");
        bjlVar.h(r4.get(1));
        bjlVar.f("month");
        bjlVar.h(r4.get(2));
        bjlVar.f("dayOfMonth");
        bjlVar.h(r4.get(5));
        bjlVar.f("hourOfDay");
        bjlVar.h(r4.get(11));
        bjlVar.f("minute");
        bjlVar.h(r4.get(12));
        bjlVar.f("second");
        bjlVar.h(r4.get(13));
        bjlVar.e();
    }
}
