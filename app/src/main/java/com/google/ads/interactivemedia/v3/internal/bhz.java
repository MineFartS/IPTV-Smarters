package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bhz extends bfv<Character> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Character read(bjj bjjVar) throws IOException {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        String strF = bjjVar.f();
        if (strF.length() != 1) {
            throw new bfs(strF.length() != 0 ? "Expecting character, got: ".concat(strF) : new String("Expecting character, got: "));
        }
        return Character.valueOf(strF.charAt(0));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Character ch) throws IOException {
        Character ch2 = ch;
        bjlVar.k(ch2 == null ? null : String.valueOf(ch2));
    }
}
