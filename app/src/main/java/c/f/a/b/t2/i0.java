package c.f.a.b.t2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i0 {
    public static List<byte[]> a(byte[] bArr) {
        long jH = h(e(bArr));
        long jH2 = h(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(jH));
        arrayList.add(b(jH2));
        return arrayList;
    }

    public static byte[] b(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static int d(List<byte[]> list) {
        return list.size() == 3 ? (int) g(ByteBuffer.wrap(list.get(1)).order(ByteOrder.nativeOrder()).getLong()) : e(list.get(0));
    }

    public static int e(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int f(List<byte[]> list) {
        if (list.size() == 3) {
            return (int) g(ByteBuffer.wrap(list.get(2)).order(ByteOrder.nativeOrder()).getLong());
        }
        return 3840;
    }

    public static long g(long j2) {
        return (j2 * 48000) / 1000000000;
    }

    public static long h(long j2) {
        return (j2 * 1000000000) / 48000;
    }
}
