package a.n.q;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.leanback.widget.HorizontalGridView;

/* JADX INFO: loaded from: classes.dex */
public final class w extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HorizontalGridView f2970b;

    public w(Context context) {
        this(context, null);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(a.n.h.f2630a, this);
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById(a.n.f.A);
        this.f2970b = horizontalGridView;
        horizontalGridView.setHasFixedSize(false);
        setOrientation(1);
        setDescendantFocusability(262144);
    }

    public HorizontalGridView getGridView() {
        return this.f2970b;
    }
}
