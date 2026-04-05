package c.f.a.d.d0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class l extends ImageButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14774b;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public l(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14774b = getVisibility();
    }

    public final void b(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.f14774b = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.f14774b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        b(i2, true);
    }
}
