package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0590Av extends AbstractC1209Zv<GQ> {
    public C0590Av(String str, int i2) {
        super(str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1209Zv
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final GQ A03(DataInputStream dataInputStream) throws IOException {
        return new GQ(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1209Zv
    public final DownloadAction A02(Uri uri, boolean z, byte[] bArr, List<GQ> list) {
        return new C0589Au(uri, z, bArr, list);
    }
}
