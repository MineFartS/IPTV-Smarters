package d.a.a.d;

import java.util.Locale;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30095b;

    public b(String str, int i2) {
        this.f30095b = i2;
        this.f30094a = str;
    }

    public b(String str, String str2) {
        this.f30094a = str;
        this.f30095b = a(str2);
    }

    public static int a(String str) {
        long jC = c(str) + IjkMediaMeta.AV_CH_WIDE_RIGHT;
        int i2 = 0;
        while ((1 & jC) == 0) {
            i2++;
            jC >>= 1;
        }
        if (jC != (8589934591 >> i2)) {
            return 32;
        }
        return 32 - i2;
    }

    public static long c(String str) {
        String[] strArrSplit = str.split("\\.");
        return (Long.parseLong(strArrSplit[0]) << 24) + 0 + ((long) (Integer.parseInt(strArrSplit[1]) << 16)) + ((long) (Integer.parseInt(strArrSplit[2]) << 8)) + ((long) Integer.parseInt(strArrSplit[3]));
    }

    public long b() {
        return c(this.f30094a);
    }

    public boolean d() {
        long jC = c(this.f30094a);
        long j2 = (4294967295 << (32 - this.f30095b)) & jC;
        if (j2 == jC) {
            return false;
        }
        this.f30094a = String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf(((-16777216) & j2) >> 24), Long.valueOf((16711680 & j2) >> 16), Long.valueOf((65280 & j2) >> 8), Long.valueOf(j2 & 255));
        return true;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "%s/%d", this.f30094a, Integer.valueOf(this.f30095b));
    }
}
