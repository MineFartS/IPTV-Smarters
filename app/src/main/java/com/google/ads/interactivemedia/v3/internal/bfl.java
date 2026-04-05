package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public class bfl {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            bjl bjlVar = new bjl(stringWriter);
            bjlVar.n(true);
            avq.i(this, bjlVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
