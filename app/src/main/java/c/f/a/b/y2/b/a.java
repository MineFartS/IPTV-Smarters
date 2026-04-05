package c.f.a.b.y2.b;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes.dex */
public final class a extends UploadDataProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10477c;

    public a(byte[] bArr) {
        this.f10476b = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
        return this.f10476b.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int iMin = Math.min(byteBuffer.remaining(), this.f10476b.length - this.f10477c);
        byteBuffer.put(this.f10476b, this.f10477c, iMin);
        this.f10477c += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) {
        this.f10477c = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
