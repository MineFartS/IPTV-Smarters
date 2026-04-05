package androidx.leanback.widget;

import a.n.l;
import a.n.q.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalGridView extends b {
    public boolean b1;
    public boolean c1;
    public Paint d1;
    public Bitmap e1;
    public LinearGradient f1;
    public int g1;
    public int h1;
    public Bitmap i1;
    public LinearGradient j1;
    public int k1;
    public int l1;
    public Rect m1;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d1 = new Paint();
        this.m1 = new Rect();
        this.R0.W3(0);
        G1(context, attributeSet);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.i1;
        if (bitmap == null || bitmap.getWidth() != this.k1 || this.i1.getHeight() != getHeight()) {
            this.i1 = Bitmap.createBitmap(this.k1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.i1;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.e1;
        if (bitmap == null || bitmap.getWidth() != this.g1 || this.e1.getHeight() != getHeight()) {
            this.e1 = Bitmap.createBitmap(this.g1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.e1;
    }

    public void G1(Context context, AttributeSet attributeSet) {
        E1(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.O);
        setRowHeight(typedArrayObtainStyledAttributes);
        setNumRows(typedArrayObtainStyledAttributes.getInt(l.P, 1));
        typedArrayObtainStyledAttributes.recycle();
        J1();
        Paint paint = new Paint();
        this.d1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final boolean H1() {
        if (!this.c1) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.R0.u2(getChildAt(childCount)) > (getWidth() - getPaddingRight()) + this.l1) {
                return true;
            }
        }
        return false;
    }

    public final boolean I1() {
        if (!this.b1) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (this.R0.t2(getChildAt(i2)) < getPaddingLeft() - this.h1) {
                return true;
            }
        }
        return false;
    }

    public final void J1() {
        if (this.b1 || this.c1) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        boolean zI1 = I1();
        boolean zH1 = H1();
        if (!zI1) {
            this.e1 = null;
        }
        if (!zH1) {
            this.i1 = null;
        }
        if (!zI1 && !zH1) {
            super.draw(canvas);
            return;
        }
        int paddingLeft = this.b1 ? (getPaddingLeft() - this.h1) - this.g1 : 0;
        int width = this.c1 ? (getWidth() - getPaddingRight()) + this.l1 + this.k1 : getWidth();
        int iSave = canvas.save();
        canvas.clipRect((this.b1 ? this.g1 : 0) + paddingLeft, 0, width - (this.c1 ? this.k1 : 0), getHeight());
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        Canvas canvas2 = new Canvas();
        Rect rect = this.m1;
        rect.top = 0;
        rect.bottom = getHeight();
        if (zI1 && this.g1 > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int iSave2 = canvas2.save();
            canvas2.clipRect(0, 0, this.g1, getHeight());
            float f2 = -paddingLeft;
            canvas2.translate(f2, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            this.d1.setShader(this.f1);
            canvas2.drawRect(0.0f, 0.0f, this.g1, getHeight(), this.d1);
            Rect rect2 = this.m1;
            rect2.left = 0;
            rect2.right = this.g1;
            canvas.translate(paddingLeft, 0.0f);
            Rect rect3 = this.m1;
            canvas.drawBitmap(tempBitmapLow, rect3, rect3, (Paint) null);
            canvas.translate(f2, 0.0f);
        }
        if (!zH1 || this.k1 <= 0) {
            return;
        }
        Bitmap tempBitmapHigh = getTempBitmapHigh();
        tempBitmapHigh.eraseColor(0);
        canvas2.setBitmap(tempBitmapHigh);
        int iSave3 = canvas2.save();
        canvas2.clipRect(0, 0, this.k1, getHeight());
        canvas2.translate(-(width - this.k1), 0.0f);
        super.draw(canvas2);
        canvas2.restoreToCount(iSave3);
        this.d1.setShader(this.j1);
        canvas2.drawRect(0.0f, 0.0f, this.k1, getHeight(), this.d1);
        Rect rect4 = this.m1;
        rect4.left = 0;
        rect4.right = this.k1;
        canvas.translate(width - r5, 0.0f);
        Rect rect5 = this.m1;
        canvas.drawBitmap(tempBitmapHigh, rect5, rect5, (Paint) null);
        canvas.translate(-(width - this.k1), 0.0f);
    }

    public final boolean getFadingLeftEdge() {
        return this.b1;
    }

    public final int getFadingLeftEdgeLength() {
        return this.g1;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.h1;
    }

    public final boolean getFadingRightEdge() {
        return this.c1;
    }

    public final int getFadingRightEdgeLength() {
        return this.k1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.l1;
    }

    public final void setFadingLeftEdge(boolean z) {
        if (this.b1 != z) {
            this.b1 = z;
            if (!z) {
                this.e1 = null;
            }
            invalidate();
            J1();
        }
    }

    public final void setFadingLeftEdgeLength(int i2) {
        if (this.g1 != i2) {
            this.g1 = i2;
            this.f1 = i2 != 0 ? new LinearGradient(0.0f, 0.0f, this.g1, 0.0f, 0, DefaultRenderer.BACKGROUND_COLOR, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i2) {
        if (this.h1 != i2) {
            this.h1 = i2;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z) {
        if (this.c1 != z) {
            this.c1 = z;
            if (!z) {
                this.i1 = null;
            }
            invalidate();
            J1();
        }
    }

    public final void setFadingRightEdgeLength(int i2) {
        if (this.k1 != i2) {
            this.k1 = i2;
            this.j1 = i2 != 0 ? new LinearGradient(0.0f, 0.0f, this.k1, 0.0f, DefaultRenderer.BACKGROUND_COLOR, 0, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i2) {
        if (this.l1 != i2) {
            this.l1 = i2;
            invalidate();
        }
    }

    public void setNumRows(int i2) {
        this.R0.S3(i2);
        requestLayout();
    }

    public void setRowHeight(int i2) {
        this.R0.Y3(i2);
        requestLayout();
    }

    public void setRowHeight(TypedArray typedArray) {
        int i2 = l.Q;
        if (typedArray.peekValue(i2) != null) {
            setRowHeight(typedArray.getLayoutDimension(i2, 0));
        }
    }
}
