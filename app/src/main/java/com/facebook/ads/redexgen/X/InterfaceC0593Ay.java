package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC0593Ay {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean A47(int i2, int i3, int i4) throws C0592Ax;

    ByteBuffer A6d();

    int A6e();

    int A6f();

    int A6g();

    boolean A7a();

    boolean A7e();

    void ABx();

    void ABy(ByteBuffer byteBuffer);

    void flush();

    void reset();
}
