package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NJ extends LinearLayout {
    public static final int A03 = (int) (C0856Lz.A01 * 40.0f);
    public static final int A04 = (int) (C0856Lz.A01 * 20.0f);
    public static final int A05 = (int) (C0856Lz.A01 * 10.0f);
    public final AnonymousClass26 A00;
    public final X2 A01;
    public final N3 A02;

    public NJ(X2 x2, AnonymousClass26 anonymousClass26, N3 n3, M7 m7) {
        this(x2, anonymousClass26, n3, null, m7);
    }

    public NJ(X2 x2, AnonymousClass26 anonymousClass26, N3 n3, @Nullable String str, M7 m7) {
        super(x2);
        this.A01 = x2;
        this.A00 = anonymousClass26;
        this.A02 = n3;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View viewA02 = A02(str);
            viewA02.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            C0856Lz.A0P(view, -10459280);
            addView(viewA02, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View viewA01 = A01(m7, this.A00.A03());
            int i2 = A05;
            viewA01.setPadding(0, i2, 0, i2);
            addView(viewA01, layoutParams);
        }
        View viewA00 = A00();
        viewA00.setPadding(0, A05, 0, 0);
        addView(viewA00, layoutParams);
    }

    private View A00() {
        NP np = new NP(this.A01);
        for (AnonymousClass26 anonymousClass26 : this.A00.A05()) {
            N5 n5 = new N5(this.A01);
            n5.setData(anonymousClass26.A04(), null);
            n5.setOnClickListener(new NI(this, n5, anonymousClass26));
            np.addView(n5);
        }
        return np;
    }

    private View A01(M7 m7, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i2 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(M8.A00(m7));
        TextView textView = new TextView(getContext());
        C0856Lz.A0b(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A02(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(M8.A00(M7.BACK_ARROW));
        int i2 = A05;
        imageView.setPadding(0, i2, i2 * 2, i2);
        int i3 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        imageView.setOnClickListener(new NH(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        C0856Lz.A0b(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A03, 0);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
