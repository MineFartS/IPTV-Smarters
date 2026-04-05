package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageView extends ImageView implements Checkable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4464b = {R.attr.state_checked};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4465c;

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4465c;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            ImageView.mergeDrawableStates(iArrOnCreateDrawableState, f4464b);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f4465c != z) {
            this.f4465c = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f4465c);
    }
}
