package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import c.f.a.d.d0.i;
import c.f.a.d.f;
import c.f.a.d.h;
import c.f.a.d.p0.c;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chip f24585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextInputLayout f24586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f24587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextWatcher f24588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f24589f;

    public class b extends i {
        public b() {
        }

        @Override // c.f.a.d.d0.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f24585b.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f24585b.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.f14835i, (ViewGroup) this, false);
        this.f24585b = chip;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.f14836j, (ViewGroup) this, false);
        this.f24586c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f24587d = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f24588e = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f24589f = (TextView) findViewById(f.f14793l);
        editText.setSaveEnabled(false);
    }

    public final String c(CharSequence charSequence) {
        return c.b(getResources(), charSequence);
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f24587d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f24585b.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f24585b.setChecked(z);
        this.f24587d.setVisibility(z ? 0 : 4);
        this.f24585b.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.f24587d.requestFocus();
            if (TextUtils.isEmpty(this.f24587d.getText())) {
                return;
            }
            EditText editText = this.f24587d;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f24585b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        this.f24585b.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f24585b.toggle();
    }
}
