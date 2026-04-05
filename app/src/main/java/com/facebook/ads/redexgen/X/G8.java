package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G8 implements Q6 {
    public int A00;

    @Nullable
    public String A01;

    @Nullable
    public Map<String, List<String>> A02;

    @Nullable
    public byte[] A03;

    public G8(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    @Nullable
    public final byte[] A5U() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    @Nullable
    public final String A5V() {
        byte[] bArr = this.A03;
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    @Nullable
    public final Map<String, List<String>> A6O() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    public final int A79() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.Q6
    @Nullable
    public final String getUrl() {
        return this.A01;
    }
}
