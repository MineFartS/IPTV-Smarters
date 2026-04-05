package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bji extends bgm {
    @Override // com.google.ads.interactivemedia.v3.internal.bgm
    public final void a(bjj bjjVar) {
        if (bjjVar instanceof bhi) {
            ((bhi) bjjVar).l();
            return;
        }
        int iQ = bjjVar.f21217a;
        if (iQ == 0) {
            iQ = bjjVar.q();
        }
        if (iQ == 13) {
            bjjVar.f21217a = 9;
            return;
        }
        if (iQ == 12) {
            bjjVar.f21217a = 8;
            return;
        }
        if (iQ == 14) {
            bjjVar.f21217a = 10;
            return;
        }
        String strA = bjk.a(bjjVar.p());
        String strR = bjjVar.r();
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 24 + String.valueOf(strR).length());
        sb.append("Expected a name but was ");
        sb.append(strA);
        sb.append(strR);
        throw new IllegalStateException(sb.toString());
    }
}
