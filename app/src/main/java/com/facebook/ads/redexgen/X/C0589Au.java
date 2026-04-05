package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0589Au extends AbstractC1210Zw<GQ> {
    public static byte[] A00;
    public static final DownloadAction.Deserializer A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-86, -89, -71, -82};
    }

    static {
        A02();
        A01 = new C0590Av(A01(0, 4, 27), 0);
    }

    public C0589Au(Uri uri, boolean z, @Nullable byte[] bArr, List<GQ> list) {
        super(A01(0, 4, 27), 0, uri, z, bArr, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0588At A08(C0667Ei c0667Ei) {
        return new C0588At(this.A01, ((AbstractC1210Zw) this).A00, c0667Ei);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1210Zw
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0B(DataOutputStream dataOutputStream, GQ gq) throws IOException {
        dataOutputStream.writeInt(gq.A01);
        dataOutputStream.writeInt(gq.A00);
        dataOutputStream.writeInt(gq.A02);
    }
}
