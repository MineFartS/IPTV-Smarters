package a.b.q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class d extends AutoCompleteTextView implements a.i.r.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f586b = {R.attr.popupBackground};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f588d;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.p);
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(r0.b(context), attributeSet, i2);
        p0.a(this, getContext());
        u0 u0VarV = u0.v(getContext(), attributeSet, f586b, i2, 0);
        if (u0VarV.s(0)) {
            setDropDownBackgroundDrawable(u0VarV.g(0));
        }
        u0VarV.w();
        e eVar = new e(this);
        this.f587c = eVar;
        eVar.e(attributeSet, i2);
        w wVar = new w(this);
        this.f588d = wVar;
        wVar.m(attributeSet, i2);
        wVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f587c;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f588d;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f587c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f587c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f587c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f587c;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.i.s.i.s(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(a.b.l.a.a.d(getContext(), i2));
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f587c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f587c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        w wVar = this.f588d;
        if (wVar != null) {
            wVar.q(context, i2);
        }
    }
}
