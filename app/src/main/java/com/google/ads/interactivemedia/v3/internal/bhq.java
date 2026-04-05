package com.google.ads.interactivemedia.v3.internal;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
public final class bhq extends bfv<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfw f21158a = new bhe(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DateFormat f21159b = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Date read(bjj bjjVar) {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        try {
            return new Date(this.f21159b.parse(bjjVar.f()).getTime());
        } catch (ParseException e2) {
            throw new bfs(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized void write(bjl bjlVar, Date date) {
        bjlVar.k(date == null ? null : this.f21159b.format((java.util.Date) date));
    }
}
