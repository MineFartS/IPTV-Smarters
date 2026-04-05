package c.f.a.b.j3;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f9206a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f9207b = {BuildConfig.FLAVOR, "A", "B", "C"};

    public static String a(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static List<byte[]> b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String c(j0 j0Var) {
        j0Var.l(24);
        int iE = j0Var.e(2);
        boolean zD = j0Var.d();
        int iE2 = j0Var.e(5);
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (j0Var.d()) {
                i2 |= 1 << i3;
            }
        }
        int i4 = 6;
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = j0Var.e(8);
        }
        int iE3 = j0Var.e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f9207b[iE];
        objArr[1] = Integer.valueOf(iE2);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Character.valueOf(zD ? 'H' : 'L');
        objArr[4] = Integer.valueOf(iE3);
        StringBuilder sb = new StringBuilder(x0.D("hvc1.%s%d.%X.%c%d", objArr));
        while (i4 > 0 && iArr[i4 - 1] == 0) {
            i4--;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = f9206a;
        byte[] bArr3 = new byte[bArr2.length + i3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, i3);
        return bArr3;
    }

    public static int e(byte[] bArr, int i2) {
        int length = bArr.length - f9206a.length;
        while (i2 <= length) {
            if (f(bArr, i2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static boolean f(byte[] bArr, int i2) {
        if (bArr.length - i2 <= f9206a.length) {
            return false;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f9206a;
            if (i3 >= bArr2.length) {
                return true;
            }
            if (bArr[i2 + i3] != bArr2[i3]) {
                return false;
            }
            i3++;
        }
    }

    public static Pair<Integer, Integer> g(byte[] bArr) {
        i0 i0Var = new i0(bArr);
        i0Var.P(9);
        int iD = i0Var.D();
        i0Var.P(20);
        return Pair.create(Integer.valueOf(i0Var.H()), Integer.valueOf(iD));
    }

    public static boolean h(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] i(byte[] bArr) {
        if (!f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iE = 0;
        do {
            arrayList.add(Integer.valueOf(iE));
            iE = e(bArr, iE + f9206a.length);
        } while (iE != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            int iIntValue2 = (i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }
}
