package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XD extends C0906Ny implements View.OnClickListener {

    @Nullable
    public String A00;

    @Nullable
    public String A01;
    public final C0904Nw A02;
    public final Map<String, String> A03;

    public XD(X2 x2, String str, C1H c1h, JZ jz, MR mr, Q2 q2, C0849Ls c0849Ls) {
        super(x2, c1h);
        this.A03 = new HashMap();
        this.A02 = new C0904Nw(x2, str, q2, c0849Ls, jz, mr);
        setOnClickListener(this);
        C0856Lz.A0J(AdError.NO_FILL_ERROR_CODE, this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A00) && !TextUtils.isEmpty(this.A01)) {
                this.A02.A08(this.A00, this.A01, this.A03);
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }

    public void setCta(C1I c1i, String str, Map<String, String> map) {
        setCta(c1i, str, map, null);
    }

    public void setCta(C1I c1i, String str, Map<String, String> map, @Nullable InterfaceC0903Nv interfaceC0903Nv) {
        this.A00 = str;
        this.A01 = c1i.A04();
        Map<String, String> extraData = this.A03;
        extraData.putAll(map);
        this.A02.A07(interfaceC0903Nv);
        String strA03 = c1i.A03();
        if (TextUtils.isEmpty(strA03) || TextUtils.isEmpty(this.A01)) {
            setVisibility(8);
        } else {
            setText(strA03);
        }
    }

    public void setIsInAppBrowser(boolean z) {
        this.A02.A09(z);
    }
}
