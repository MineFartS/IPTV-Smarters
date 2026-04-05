package com.facebook.ads.internal.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0667Ei;
import com.facebook.ads.redexgen.X.EM;
import com.facebook.ads.redexgen.X.InterfaceC0666Eh;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class DownloadAction {
    public static byte[] A05;
    public final int A00;
    public final Uri A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A06();
    }

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-55, -67, DateTimeFieldType.HOUR_OF_HALFDAY, 47, -32, 36, 37, 51, 37, 50, 41, 33, 44, 41, 58, 37, 50, -32, 38, 47, 53, 46, 36, -32, 38, 47, 50, -6};
    }

    public abstract InterfaceC0666Eh A08(C0667Ei c0667Ei);

    public abstract void A09(DataOutputStream dataOutputStream) throws IOException;

    public static abstract class Deserializer {
        public final int A00;
        public final String A01;

        public abstract DownloadAction A01(int i2, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i2) {
            this.A01 = str;
            this.A00 = i2;
        }
    }

    public DownloadAction(String str, int i2, Uri uri, boolean z, @Nullable byte[] bArr) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = uri;
        this.A03 = z;
        this.A04 = bArr == null ? new byte[0] : bArr;
    }

    public static DownloadAction A04(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String utf = dataInputStream.readUTF();
        int i2 = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (utf.equals(deserializer.A01) && deserializer.A00 >= i2) {
                return deserializer.A01(i2, dataInputStream);
            }
        }
        throw new EM(A05(2, 26, 85) + utf + A05(0, 2, 50) + i2);
    }

    public static void A07(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.A02);
        dataOutputStream.writeInt(downloadAction.A00);
        downloadAction.A09(dataOutputStream);
        dataOutputStream.flush();
    }

    public boolean A0A(DownloadAction downloadAction) {
        return this.A01.equals(downloadAction.A01);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAction that = (DownloadAction) obj;
        return this.A02.equals(that.A02) && this.A00 == that.A00 && this.A01.equals(that.A01) && this.A03 == that.A03 && Arrays.equals(this.A04, that.A04);
    }

    public int hashCode() {
        return (((this.A01.hashCode() * 31) + (this.A03 ? 1 : 0)) * 31) + Arrays.hashCode(this.A04);
    }
}
