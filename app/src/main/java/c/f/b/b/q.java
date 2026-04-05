package c.f.b.b;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static int a(int i2, double d2) {
        int iMax = Math.max(i2, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        double d3 = iHighestOneBit;
        Double.isNaN(d3);
        if (iMax <= ((int) (d2 * d3))) {
            return iHighestOneBit;
        }
        int i3 = iHighestOneBit << 1;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }

    public static int b(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    public static int c(@NullableDecl Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
