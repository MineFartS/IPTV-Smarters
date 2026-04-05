package a.e.f;

import a.e.f.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f1215a = new RectF();

    public class a implements g.a {
        public a() {
        }

        @Override // a.e.f.g.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            float f3 = 2.0f * f2;
            float fWidth = (rectF.width() - f3) - 1.0f;
            float fHeight = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                c.this.f1215a.set(f5, f5, f4, f4);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f4, rectF.top + f4);
                canvas.drawArc(c.this.f1215a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1215a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1215a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f1215a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f6 = (rectF.left + f4) - 1.0f;
                float f7 = rectF.top;
                canvas.drawRect(f6, f7, (rectF.right - f4) + 1.0f, f7 + f4, paint);
                float f8 = (rectF.left + f4) - 1.0f;
                float f9 = rectF.bottom;
                canvas.drawRect(f8, f9 - f4, (rectF.right - f4) + 1.0f, f9, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, rectF.bottom - f2, paint);
        }
    }

    @Override // a.e.f.e
    public void a(d dVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        g gVarO = o(context, colorStateList, f2, f3, f4);
        gVarO.m(dVar.d());
        dVar.c(gVarO);
        q(dVar);
    }

    @Override // a.e.f.e
    public void b(d dVar, float f2) {
        p(dVar).p(f2);
        q(dVar);
    }

    @Override // a.e.f.e
    public float c(d dVar) {
        return p(dVar).l();
    }

    @Override // a.e.f.e
    public float d(d dVar) {
        return p(dVar).g();
    }

    @Override // a.e.f.e
    public void e(d dVar) {
    }

    @Override // a.e.f.e
    public void f(d dVar, float f2) {
        p(dVar).r(f2);
    }

    @Override // a.e.f.e
    public float g(d dVar) {
        return p(dVar).i();
    }

    @Override // a.e.f.e
    public ColorStateList h(d dVar) {
        return p(dVar).f();
    }

    @Override // a.e.f.e
    public void i() {
        g.f1229b = new a();
    }

    @Override // a.e.f.e
    public float j(d dVar) {
        return p(dVar).j();
    }

    @Override // a.e.f.e
    public float k(d dVar) {
        return p(dVar).k();
    }

    @Override // a.e.f.e
    public void l(d dVar) {
        p(dVar).m(dVar.d());
        q(dVar);
    }

    @Override // a.e.f.e
    public void m(d dVar, ColorStateList colorStateList) {
        p(dVar).o(colorStateList);
    }

    @Override // a.e.f.e
    public void n(d dVar, float f2) {
        p(dVar).q(f2);
        q(dVar);
    }

    public final g o(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new g(context.getResources(), colorStateList, f2, f3, f4);
    }

    public final g p(d dVar) {
        return (g) dVar.f();
    }

    public void q(d dVar) {
        Rect rect = new Rect();
        p(dVar).h(rect);
        dVar.b((int) Math.ceil(k(dVar)), (int) Math.ceil(j(dVar)));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
