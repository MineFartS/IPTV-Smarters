package minefarts.iptvsmarters.view.utility;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import c.h.a.b;

/* JADX INFO: loaded from: classes2.dex */
public class ListViewMaxHeight extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29861b;

    public ListViewMaxHeight(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListViewMaxHeight(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (attributeSet == null) {
            this.f29861b = 0;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.U0);
        this.f29861b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i3);
        int i4 = this.f29861b;
        if (i4 > 0 && i4 < size) {
            i3 = View.MeasureSpec.makeMeasureSpec(this.f29861b, View.MeasureSpec.getMode(i3));
        }
        super.onMeasure(i2, i3);
    }
}
