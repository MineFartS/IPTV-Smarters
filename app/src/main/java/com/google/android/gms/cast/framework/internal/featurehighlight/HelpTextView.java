package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import c.f.a.c.d.u.l;
import c.f.a.c.j.c.z0;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class HelpTextView extends LinearLayout {
    private TextView zzpf;
    private TextView zzpg;

    @Keep
    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void zza(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Keep
    public View asView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.zzpf = (TextView) z0.a((TextView) findViewById(l.A));
        this.zzpg = (TextView) z0.a((TextView) findViewById(l.z));
    }

    @Keep
    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        zza(this.zzpf, charSequence);
        zza(this.zzpg, charSequence2);
    }
}
