package c.a.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    START,
    CENTER,
    END;

    private static final boolean HAS_RTL;

    /* JADX INFO: renamed from: c.a.a.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0096a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5016a;

        static {
            int[] iArr = new int[a.values().length];
            f5016a = iArr;
            try {
                iArr[a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5016a[a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5016a[a.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HAS_RTL = Build.VERSION.SDK_INT >= 17;
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i2 = C0096a.f5016a[ordinal()];
        if (i2 == 1) {
            return HAS_RTL ? 8388611 : 3;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return HAS_RTL ? 8388613 : 5;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i2 = C0096a.f5016a[ordinal()];
        if (i2 != 2) {
            return i2 != 3 ? 5 : 6;
        }
        return 4;
    }
}
