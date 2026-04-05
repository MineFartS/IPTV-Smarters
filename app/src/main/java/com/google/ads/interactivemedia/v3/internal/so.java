package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class so extends rd {
    public so(final ru ruVar, int i2, long j2, long j3) {
        long j4;
        ruVar.getClass();
        ra raVar = new ra() { // from class: com.google.ads.interactivemedia.v3.internal.sm
            @Override // com.google.ads.interactivemedia.v3.internal.ra
            public final long a(long j5) {
                return ruVar.b(j5);
            }
        };
        sn snVar = new sn(ruVar, i2);
        long jA = ruVar.a();
        long j5 = ruVar.f22917j;
        int i3 = ruVar.f22911d;
        if (i3 > 0) {
            j4 = ((((long) i3) + ((long) ruVar.f22910c)) / 2) + 1;
        } else {
            int i4 = ruVar.f22908a;
            long j6 = 4096;
            if (i4 == ruVar.f22909b && i4 > 0) {
                j6 = i4;
            }
            j4 = (((j6 * ((long) ruVar.f22914g)) * ((long) ruVar.f22915h)) / 8) + 64;
        }
        super(raVar, snVar, jA, j5, j2, j3, j4, Math.max(6, ruVar.f22910c));
    }
}
