package androidx.leanback.widget;

import a.n.l;
import a.n.q.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class VerticalGridView extends b {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.R0.W3(1);
        G1(context, attributeSet);
    }

    public void G1(Context context, AttributeSet attributeSet) {
        E1(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.k0);
        setColumnWidth(typedArrayObtainStyledAttributes);
        setNumColumns(typedArrayObtainStyledAttributes.getInt(l.m0, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setColumnWidth(int i2) {
        this.R0.Y3(i2);
        requestLayout();
    }

    public void setColumnWidth(TypedArray typedArray) {
        int i2 = l.l0;
        if (typedArray.peekValue(i2) != null) {
            setColumnWidth(typedArray.getLayoutDimension(i2, 0));
        }
    }

    public void setNumColumns(int i2) {
        this.R0.S3(i2);
        requestLayout();
    }
}
