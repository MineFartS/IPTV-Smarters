package com.google.android.material.theme;

import a.b.k.h;
import a.b.q.d;
import a.b.q.f;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import c.f.a.d.n0.g;
import c.f.a.d.t.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends h {
    @Override // a.b.k.h
    public d b(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    @Override // a.b.k.h
    public f c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // a.b.k.h
    public AppCompatCheckBox d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // a.b.k.h
    public AppCompatRadioButton j(Context context, AttributeSet attributeSet) {
        return new c.f.a.d.f0.a(context, attributeSet);
    }

    @Override // a.b.k.h
    public AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
