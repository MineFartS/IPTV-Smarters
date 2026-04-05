package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ame implements akf {
    private ame() {
    }

    public /* synthetic */ ame(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void h() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void i() {
        synchronized (amf.f20113a) {
            synchronized (amf.f20114b) {
                if (amf.f20115c) {
                    return;
                }
                long jA = amf.a();
                synchronized (amf.f20114b) {
                    amf.f20116d = jA;
                    amf.f20115c = true;
                }
            }
        }
    }
}
