package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1210Zw<K extends Comparable<K>> extends DownloadAction {
    public final List<K> A00;

    public abstract void A0B(DataOutputStream dataOutputStream, K k2) throws IOException;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zw != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<K extends java.lang.Comparable<K>> */
    public AbstractC1210Zw(String str, int i2, Uri uri, boolean z, @Nullable byte[] bArr, List<K> list) {
        super(str, i2, uri, z, bArr);
        if (z) {
            IM.A03(list.isEmpty());
            this.A00 = Collections.emptyList();
        } else {
            List<K> keys = new ArrayList<>(list);
            Collections.sort(keys);
            this.A00 = Collections.unmodifiableList(keys);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zw != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<K extends java.lang.Comparable<K>> */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        dataOutputStream.writeInt(this.A00.size());
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            A0B(dataOutputStream, this.A00.get(i2));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zw != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<?> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zw != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<K extends java.lang.Comparable<K>> */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((AbstractC1210Zw) obj).A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Zw != com.facebook.ads.internal.exoplayer2.offline.SegmentDownloadAction<K extends java.lang.Comparable<K>> */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        return (super.hashCode() * 31) + this.A00.hashCode();
    }
}
