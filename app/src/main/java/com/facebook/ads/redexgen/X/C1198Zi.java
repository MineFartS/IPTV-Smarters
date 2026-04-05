package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1198Zi implements InterfaceC0652Dt {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0652Dt
    public final Metadata A4f(CV cv) {
        ByteBuffer buffer = cv.A01;
        byte[] bArrArray = buffer.array();
        int size = buffer.limit();
        C0768Il c0768Il = new C0768Il(bArrArray, size);
        String strA0R = c0768Il.A0R();
        String strA0R2 = c0768Il.A0R();
        long jA0N = c0768Il.A0N();
        long timescale = J1.A0G(c0768Il.A0N(), 1000000L, jA0N);
        long presentationTimeUs = c0768Il.A0N();
        long id = J1.A0G(presentationTimeUs, 1000L, jA0N);
        return new Metadata(new EventMessage(strA0R, strA0R2, id, c0768Il.A0N(), Arrays.copyOfRange(bArrArray, c0768Il.A07(), size), timescale));
    }
}
