package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9X {

    @VisibleForTesting
    public static int A03;
    public static byte[] A04;

    @Nullable
    public C9W A00;
    public boolean A01;
    public final File A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{27, 54, 62, 65, 58, 57, -11, 73, 68, -11, 57, 58, 65, 58, 73, 58, -11, 59, 62, 65, 58, -11, -4, -6, 72, -63, -28, -25, -32, -101, -94, -96, -18, -94, -101, -28, -18, -101, -23, -22, -17, -101, -36, -101, -19, -32, -36, -33, -36, -35, -25, -32, -101, -31, -28, -25, -32, 24, 61, 69, 48, 59, 56, 51, -17, 53, 52, 67, 50, 55, -17, 66, 67, 48, 65, 67, -17, 56, 61, 51, 52, 71, 9, -17, -12, 51, -66, -47, -49, -37, -34, -48, -116, -46, -43, -40, -47, -116, -51, -40, -34, -47, -51, -48, -27, -116, -48, -43, -33, -36, -37, -33, -47, -48};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized C9O A06(int i2, byte[] bArr, int i3, int[] iArr, int i4) throws IOException {
        C9W c9wA00 = A00();
        boolean z = false;
        int i5 = 1;
        if (i2 < 0) {
            throw new IOException(String.format(Locale.US, A01(57, 29, 114), Integer.valueOf(i2)));
        }
        int i6 = i2;
        int i7 = 0;
        long j2 = -1;
        while (true) {
            if (i6 >= c9wA00.A00) {
                break;
            }
            if ((i6 - i2) + i4 >= iArr.length) {
                z = true;
                break;
            }
            long j3 = c9wA00.A03[i6];
            long j4 = (i6 == c9wA00.A00 - i5 ? c9wA00.A01 : c9wA00.A03[i6 + 1]) - j3;
            if (j2 == -1) {
                j2 = j3;
            }
            if (((int) j4) + i7 + i3 > bArr.length) {
                z = true;
                break;
            }
            i7 += (int) j4;
            iArr[(i6 - i2) + i4] = (int) j4;
            i6++;
            i5 = 1;
        }
        if (i6 <= i2) {
            return new C9O(z ? C9N.A03 : C9N.A04, i2, i2, 0);
        }
        c9wA00.A02.seek(j2);
        c9wA00.A02.read(bArr, i3, i7);
        return new C9O(C9N.A02, i2, i6, i7);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized boolean A09(byte[] bArr) throws IOException {
        C9W c9wA00 = A00();
        if (A05() == A03) {
            return false;
        }
        A03(c9wA00.A00, c9wA00.A01);
        A04(c9wA00.A01, bArr);
        c9wA00.A02.getFD().sync();
        c9wA00.A00++;
        c9wA00.A01 += (long) bArr.length;
        return true;
    }

    static {
        A02();
        A03 = 1000;
    }

    public C9X(File file) throws IOException {
        this.A02 = file;
        if (!file.exists()) {
            this.A00 = C9W.A03(file);
        } else if (file.isFile()) {
        } else {
            throw new IOException(String.format(Locale.US, A01(25, 32, 30), file.getCanonicalPath()));
        }
    }

    private C9W A00() throws IOException {
        if (!this.A01) {
            if (this.A00 == null) {
                this.A00 = C9W.A04(this.A02);
            }
            return this.A00;
        }
        throw new IOException(A01(86, 28, 15));
    }

    private void A03(int i2, long j2) throws IOException {
        this.A00.A03[i2] = j2;
        this.A00.A02.seek(C9W.A02(i2));
        this.A00.A02.writeLong(j2);
    }

    private void A04(long j2, byte[] bArr) throws IOException {
        this.A00.A02.seek(j2);
        this.A00.A02.write(bArr);
    }

    public final synchronized int A05() throws IOException {
        return A00().A00;
    }

    public final synchronized void A07() throws IOException {
        this.A01 = true;
        if (this.A00 == null) {
            return;
        }
        RandomAccessFile randomAccessFile = this.A00.A02;
        this.A00 = null;
        randomAccessFile.close();
    }

    public final synchronized void A08() throws IOException {
        if (!this.A01) {
            A07();
            if (!this.A02.delete()) {
                throw new IOException(String.format(Locale.US, A01(0, 25, 120), this.A02.getCanonicalPath()));
            }
        } else {
            throw new IOException(A01(86, 28, 15));
        }
    }
}
