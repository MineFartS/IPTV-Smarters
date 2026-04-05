package a.g.c;

import a.g.b.k.e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class g extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1581d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f1580c == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f1580c.getLayoutParams();
        bVar2.n0.A0(0);
        e.b bVarW = bVar.n0.w();
        e.b bVar3 = e.b.FIXED;
        if (bVarW != bVar3) {
            bVar.n0.B0(bVar2.n0.N());
        }
        if (bVar.n0.K() != bVar3) {
            bVar.n0.e0(bVar2.n0.t());
        }
        bVar2.n0.A0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1579b == -1 && !isInEditMode()) {
            setVisibility(this.f1581d);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f1579b);
        this.f1580c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).b0 = true;
            this.f1580c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1580c;
    }

    public int getEmptyVisibility() {
        return this.f1581d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View viewFindViewById;
        if (this.f1579b == i2) {
            return;
        }
        View view = this.f1580c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f1580c.getLayoutParams()).b0 = false;
            this.f1580c = null;
        }
        this.f1579b = i2;
        if (i2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f1581d = i2;
    }
}
