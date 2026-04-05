package com.google.android.exoplayer2.decoder;

import c.f.a.b.v2.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class SimpleOutputBuffer extends h {
    public ByteBuffer data;
    private final h.a<SimpleOutputBuffer> owner;

    public SimpleOutputBuffer(h.a<SimpleOutputBuffer> aVar) {
        this.owner = aVar;
    }

    @Override // c.f.a.b.v2.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j2, int i2) {
        this.timeUs = j2;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            this.data = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i2);
        return this.data;
    }

    @Override // c.f.a.b.v2.h
    public void release() {
        this.owner.a(this);
    }
}
