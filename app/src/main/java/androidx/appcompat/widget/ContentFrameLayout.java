package androidx.appcompat.widget;

import a.i.r.x;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f4184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f4185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f4186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f4187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f4188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f4189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f4190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f4191i;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4190h = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void b(int i2, int i3, int i4, int i5) {
        this.f4190h.set(i2, i3, i4, i5);
        if (x.U(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4188f == null) {
            this.f4188f = new TypedValue();
        }
        return this.f4188f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4189g == null) {
            this.f4189g = new TypedValue();
        }
        return this.f4189g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4186d == null) {
            this.f4186d = new TypedValue();
        }
        return this.f4186d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4187e == null) {
            this.f4187e = new TypedValue();
        }
        return this.f4187e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4184b == null) {
            this.f4184b = new TypedValue();
        }
        return this.f4184b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4185c == null) {
            this.f4185c = new TypedValue();
        }
        return this.f4185c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f4191i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f4191i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f4191i = aVar;
    }
}
