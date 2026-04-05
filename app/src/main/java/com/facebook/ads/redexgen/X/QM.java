package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface QM {
    boolean A9d(QK qk);

    HttpURLConnection ABU(String str) throws IOException;

    InputStream ABV(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ABW(HttpURLConnection httpURLConnection) throws IOException;

    void ABn(HttpURLConnection httpURLConnection, QI qi, String str) throws IOException;

    byte[] AC7(InputStream inputStream) throws IOException;

    void AE0(OutputStream outputStream, byte[] bArr) throws IOException;
}
