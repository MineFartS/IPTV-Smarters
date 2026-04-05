package c.e.b.a.a.g;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class b extends e {
    @Override // c.e.b.a.a.g.e
    public void J(Canvas canvas, Paint paint) {
        if (d() != null) {
            canvas.drawCircle(d().centerX(), d().centerY(), Math.min(d().width(), d().height()) / 2, paint);
        }
    }
}
