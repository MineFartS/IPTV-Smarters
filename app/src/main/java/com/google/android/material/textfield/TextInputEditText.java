package com.google.android.material.textfield;

import a.b.q.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import c.f.a.d.b;
import c.f.a.d.d;
import c.f.a.d.d0.e;
import c.f.a.d.f;
import c.f.a.d.k;
import c.f.a.d.l;
import c.f.a.d.o0.a.a;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputEditText extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f24559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24560g;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f14637n);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i2) {
        super(a.c(context, attributeSet, i2, 0), attributeSet, i2);
        this.f24559f = new Rect();
        TypedArray typedArrayH = c.f.a.d.d0.j.h(context, attributeSet, l.w5, i2, k.f15001i, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayH.getBoolean(l.x5, false));
        typedArrayH.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final String b(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        if (Build.VERSION.SDK_INT >= 17) {
            setLabelFor(f.M);
        }
        String str = BuildConfig.FLAVOR;
        String string = z2 ? hint.toString() : BuildConfig.FLAVOR;
        if (!z) {
            return !TextUtils.isEmpty(string) ? string : BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        if (!TextUtils.isEmpty(string)) {
            str = ", " + string;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f24560g || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f24559f);
        rect.bottom = this.f24559f.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f24560g && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f24559f, point);
            rect.bottom = this.f24559f.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.O()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.O() && super.getHint() == null && e.a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // a.b.q.j, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(b(textInputLayout));
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean zRequestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f24560g) {
            this.f24559f.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(d.O), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f24559f, true);
        }
        return zRequestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f24560g = z;
    }
}
