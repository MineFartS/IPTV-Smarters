package com.google.ads.interactivemedia.v3.internal;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class bhr extends bfv<Time> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfw f21160a = new bhe(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DateFormat f21161b = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Time read(bjj bjjVar) {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        try {
            return new Time(this.f21161b.parse(bjjVar.f()).getTime());
        } catch (ParseException e2) {
            throw new bfs(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized void write(bjl bjlVar, Time time) {
        bjlVar.k(time == null ? null : this.f21161b.format((Date) time));
    }
}
