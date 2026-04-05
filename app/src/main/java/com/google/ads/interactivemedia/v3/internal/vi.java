package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class vi extends vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f23327a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23328b;

    public static boolean d(alx alxVar) {
        if (alxVar.a() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        alxVar.D(bArr, 0, 8);
        return Arrays.equals(bArr, f23327a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final long a(alx alxVar) {
        byte[] bArrK = alxVar.K();
        int i2 = bArrK[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = bArrK[1] & 63;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        return g(((long) i4) * ((long) (i5 >= 16 ? 2500 << i6 : i5 >= 12 ? Constants.MAXIMUM_UPLOAD_PARTS << (i6 & 1) : i6 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : Constants.MAXIMUM_UPLOAD_PARTS << i6)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.f23328b = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final boolean c(alx alxVar, long j2, vj vjVar) {
        if (this.f23328b) {
            ajr.b(vjVar.f23329a);
            boolean z = alxVar.e() == 1332770163;
            alxVar.I(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(alxVar.K(), alxVar.d());
        byte b2 = bArrCopyOf[9];
        List<byte[]> listA = pn.a(bArrCopyOf);
        kd kdVar = new kd();
        kdVar.ae("audio/opus");
        kdVar.H(b2 & 255);
        kdVar.af(48000);
        kdVar.T(listA);
        vjVar.f23329a = kdVar.s();
        this.f23328b = true;
        return true;
    }
}
