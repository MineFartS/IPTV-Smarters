package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class ri implements sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22896a = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ int a(aje ajeVar, int i2, boolean z) {
        return us.h(this, ajeVar, i2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void b(ke keVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ void c(alx alxVar, int i2) {
        us.i(this, alxVar, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void d(long j2, int i2, int i3, int i4, se seVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final int e(aje ajeVar, int i2, boolean z) throws EOFException {
        int iB = ajeVar.b(this.f22896a, 0, Math.min(ProgressEvent.PART_FAILED_EVENT_CODE, i2));
        if (iB != -1) {
            return iB;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void f(alx alxVar, int i2) {
        alxVar.J(i2);
    }
}
