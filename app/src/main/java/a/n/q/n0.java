package a.n.q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f2860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f2861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2862d;

    public n0(Context context) {
        this(context, null, 0);
    }

    public n0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2862d = true;
        setOrientation(1);
        LayoutInflater.from(context).inflate(a.n.h.f2636g, this);
        this.f2860b = (ViewGroup) findViewById(a.n.f.f2623n);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    public void a(View view) {
        if (this.f2860b.indexOfChild(view) < 0) {
            this.f2860b.addView(view, 0);
        }
    }

    public void b(View view) {
        addView(view);
    }

    public void c(int i2) {
        Drawable drawable = this.f2861c;
        if (!(drawable instanceof ColorDrawable)) {
            setForeground(new ColorDrawable(i2));
        } else {
            ((ColorDrawable) drawable.mutate()).setColor(i2);
            invalidate();
        }
    }

    public void d(boolean z) {
        this.f2860b.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2861c;
        if (drawable != null) {
            if (this.f2862d) {
                this.f2862d = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.f2861c.draw(canvas);
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f2861c;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f2862d = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        this.f2861c = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
