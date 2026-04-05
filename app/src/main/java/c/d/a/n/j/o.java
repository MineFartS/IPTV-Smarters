package c.d.a.n.j;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class o implements c.d.a.n.b<InputStream> {
    @Override // c.d.a.n.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArrB = c.d.a.t.a.a().b();
        while (true) {
            try {
                int i2 = inputStream.read(bArrB);
                if (i2 == -1) {
                    return true;
                }
                outputStream.write(bArrB, 0, i2);
            } catch (IOException e2) {
                if (Log.isLoggable("StreamEncoder", 3)) {
                    Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e2);
                }
                return false;
            } finally {
                c.d.a.t.a.a().c(bArrB);
            }
        }
    }

    @Override // c.d.a.n.b
    public String getId() {
        return BuildConfig.FLAVOR;
    }
}
