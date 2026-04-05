package c.f.a.c.f;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {
    public static int a(int i2) {
        int[] iArr = {1, 2, 3, 4, 5};
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }
}
