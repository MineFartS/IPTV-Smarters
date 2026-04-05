package a.e.f;

import a.e.f.g;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: a.e.f.a$a, reason: collision with other inner class name */
    public class C0021a implements g.a {
        public C0021a() {
        }

        @Override // a.e.f.g.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    @Override // a.e.f.c, a.e.f.e
    public void i() {
        g.f1229b = new C0021a();
    }
}
