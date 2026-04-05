package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class pz extends pt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pv f22800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f22801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f22804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22805f;

    public pz() {
        this(1);
    }

    public pz(int i2) {
        this.f22800a = new pv();
        this.f22805f = i2;
    }

    private final ByteBuffer l(int i2) {
        int i3 = this.f22805f;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f22801b;
        throw new py(byteBuffer == null ? 0 : byteBuffer.capacity(), i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.pt
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f22801b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f22804e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f22802c = false;
    }

    public final void i(int i2) {
        ByteBuffer byteBuffer = this.f22801b;
        if (byteBuffer == null) {
            this.f22801b = l(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.f22801b = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i3);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f22801b = byteBufferL;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f22801b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f22804e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean k() {
        return d(1073741824);
    }
}
