package minefarts.iptvsmarters.view.utility;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class LoadingGearSpinner extends ImageView {
    public LoadingGearSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        clearAnimation();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        startAnimation(rotateAnimation);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setImageResource(R.drawable.gear_orange);
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        if (i2 == 0) {
            a();
        } else {
            clearAnimation();
        }
        super.setVisibility(i2);
    }
}
