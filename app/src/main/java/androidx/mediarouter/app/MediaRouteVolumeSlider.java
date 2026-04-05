package androidx.mediarouter.app;

import a.b.a;
import a.b.q.s;
import a.t.k.i;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class MediaRouteVolumeSlider extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f4697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4698f;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.N);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4695c = i.g(context);
    }

    public void a(int i2) {
        if (this.f4698f == i2) {
            return;
        }
        if (Color.alpha(i2) != 255) {
            Log.e("MediaRouteVolumeSlider", "Volume slider color cannot be translucent: #" + Integer.toHexString(i2));
        }
        this.f4698f = i2;
    }

    public void b(boolean z) {
        if (this.f4696d == z) {
            return;
        }
        this.f4696d = z;
        super.setThumb(z ? null : this.f4697e);
    }

    @Override // a.b.q.s, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i2 = isEnabled() ? 255 : (int) (this.f4695c * 255.0f);
        this.f4697e.setColorFilter(this.f4698f, PorterDuff.Mode.SRC_IN);
        this.f4697e.setAlpha(i2);
        getProgressDrawable().setColorFilter(this.f4698f, PorterDuff.Mode.SRC_IN);
        getProgressDrawable().setAlpha(i2);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.f4697e = drawable;
        if (this.f4696d) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
