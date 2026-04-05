package c.f.a.b.x2;

import android.media.MediaDrmException;
import c.f.a.b.x2.i0;
import c.f.a.b.x2.w;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements i0 {
    @Override // c.f.a.b.x2.i0
    public Class<r0> a() {
        return r0.class;
    }

    @Override // c.f.a.b.x2.i0
    public Map<String, String> b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // c.f.a.b.x2.i0
    public ExoMediaCrypto c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // c.f.a.b.x2.i0
    public i0.d d() {
        throw new IllegalStateException();
    }

    @Override // c.f.a.b.x2.i0
    public byte[] e() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // c.f.a.b.x2.i0
    public void f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // c.f.a.b.x2.i0
    public void g(byte[] bArr) {
    }

    @Override // c.f.a.b.x2.i0
    public void h(i0.b bVar) {
    }

    @Override // c.f.a.b.x2.i0
    public byte[] i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // c.f.a.b.x2.i0
    public void j(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // c.f.a.b.x2.i0
    public i0.a k(byte[] bArr, List<w.b> list, int i2, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // c.f.a.b.x2.i0
    public void release() {
    }
}
