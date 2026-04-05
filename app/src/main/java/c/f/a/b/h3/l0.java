package c.f.a.b.h3;

import android.graphics.Color;
import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    public static String a(String str) {
        return InstructionFileId.DOT + str + ",." + str + " *";
    }

    public static String b(int i2) {
        double dAlpha = Color.alpha(i2);
        Double.isNaN(dAlpha);
        return c.f.a.b.j3.x0.D("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(dAlpha / 255.0d));
    }
}
