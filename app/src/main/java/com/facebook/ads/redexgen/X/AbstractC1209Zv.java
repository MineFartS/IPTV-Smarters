package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1209Zv<K> extends DownloadAction.Deserializer {
    public abstract DownloadAction A02(Uri uri, boolean z, byte[] bArr, List<K> list);

    public abstract K A03(DataInputStream dataInputStream) throws IOException;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zv != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction$SegmentDownloadActionDeserializer<K> */
    public AbstractC1209Zv(String str, int i2) {
        super(str, i2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zv != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction$SegmentDownloadActionDeserializer<K> */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction.Deserializer
    public final DownloadAction A01(int i2, DataInputStream dataInputStream) throws IOException {
        Uri uri = Uri.parse(dataInputStream.readUTF());
        boolean z = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        int i3 = dataInputStream.readInt();
        List<K> arrayList = new ArrayList<>();
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(A03(dataInputStream));
        }
        return A02(uri, z, bArr, arrayList);
    }
}
