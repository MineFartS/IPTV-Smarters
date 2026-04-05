package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1205Zr extends DownloadAction.Deserializer {
    public C1205Zr(String str, int i2) {
        super(str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction.Deserializer
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1206Zs A01(int i2, DataInputStream dataInputStream) throws IOException {
        Uri uri = Uri.parse(dataInputStream.readUTF());
        boolean z = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new C1206Zs(uri, z, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
