package a.b.q;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public class g extends CheckedTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f622b = {R.attr.checkMark};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f623c;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(r0.b(context), attributeSet, i2);
        p0.a(this, getContext());
        w wVar = new w(this);
        this.f623c = wVar;
        wVar.m(attributeSet, i2);
        wVar.b();
        u0 u0VarV = u0.v(getContext(), attributeSet, f622b, i2, 0);
        setCheckMarkDrawable(u0VarV.g(0));
        u0VarV.w();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.f623c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(a.b.l.a.a.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.i.s.i.s(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        w wVar = this.f623c;
        if (wVar != null) {
            wVar.q(context, i2);
        }
    }
}
