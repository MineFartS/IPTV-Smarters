package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MJ implements View.OnClickListener {
    public final /* synthetic */ C1Q A00;
    public final /* synthetic */ C0789Jg A01;
    public final /* synthetic */ MK A02;
    public final /* synthetic */ MR A03;
    public final /* synthetic */ String A04;

    public MJ(MK mk, C0789Jg c0789Jg, MR mr, String str, C1Q c1q) {
        this.A02 = mk;
        this.A01 = c0789Jg;
        this.A03 = mr;
        this.A04 = str;
        this.A00 = c1q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A03(EnumC0788Jf.A0A, null);
            if (AnonymousClass23.A0Q(this.A02.A02.A00(), true)) {
                this.A03.A7r(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                LH.A09(new LH(), this.A02.A02, Uri.parse(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
