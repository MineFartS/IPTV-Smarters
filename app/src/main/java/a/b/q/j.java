package a.b.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class j extends EditText implements a.i.r.w, a.i.r.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a.i.s.j f663e;

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.D);
    }

    public j(Context context, AttributeSet attributeSet, int i2) {
        super(r0.b(context), attributeSet, i2);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f660b = eVar;
        eVar.e(attributeSet, i2);
        w wVar = new w(this);
        this.f661c = wVar;
        wVar.m(attributeSet, i2);
        wVar.b();
        this.f662d = new v(this);
        this.f663e = new a.i.s.j();
    }

    @Override // a.i.r.t
    public a.i.r.c a(a.i.r.c cVar) {
        return this.f663e.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f660b;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f661c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f660b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f660b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        v vVar;
        return (Build.VERSION.SDK_INT >= 28 || (vVar = this.f662d) == null) ? super.getTextClassifier() : vVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f661c.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = k.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        String[] strArrF = a.i.r.x.F(this);
        if (inputConnectionA == null || strArrF == null) {
            return inputConnectionA;
        }
        a.i.r.i0.a.d(editorInfo, strArrF);
        return a.i.r.i0.b.a(inputConnectionA, editorInfo, r.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (r.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i2) {
        if (r.c(this, i2)) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f660b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f660b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.i.s.i.s(this, callback));
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f660b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f660b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        w wVar = this.f661c;
        if (wVar != null) {
            wVar.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.f662d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            vVar.b(textClassifier);
        }
    }
}
