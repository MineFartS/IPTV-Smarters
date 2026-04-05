package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bhy extends bfv<Number> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Number read(bjj bjjVar) {
        int iP = bjjVar.p();
        int i2 = iP - 1;
        if (i2 == 5 || i2 == 6) {
            return new bgn(bjjVar.f());
        }
        if (i2 == 8) {
            bjjVar.k();
            return null;
        }
        String strA = bjk.a(iP);
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 23);
        sb.append("Expecting number, got: ");
        sb.append(strA);
        throw new bfs(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Number number) throws IOException {
        bjlVar.j(number);
    }
}
