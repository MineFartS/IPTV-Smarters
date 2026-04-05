package androidx.leanback.widget;

import a.i.s.i;
import a.n.l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ResizingTextView extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4528l;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        this.f4523g = false;
        this.f4524h = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.T, i2, i3);
        try {
            this.f4518b = typedArrayObtainStyledAttributes.getInt(l.V, 1);
            this.f4519c = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.Y, -1);
            this.f4520d = typedArrayObtainStyledAttributes.getBoolean(l.U, false);
            this.f4521e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.X, 0);
            this.f4522f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(l.W, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i2, int i3) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i2, getPaddingEnd(), i3);
        } else {
            setPadding(getPaddingLeft(), i2, getPaddingRight(), i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[PHI: r2
  0x00d1: PHI (r2v7 boolean) = (r2v2 boolean), (r2v9 boolean) binds: [B:41:0x00ce, B:27:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.s(this, callback));
    }
}
