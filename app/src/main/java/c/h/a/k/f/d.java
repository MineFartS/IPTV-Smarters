package c.h.a.k.f;

import minefarts.iptvsmarters.model.callback.BillingAddOrderCallback;
import minefarts.iptvsmarters.model.callback.BillingCheckGPACallback;
import minefarts.iptvsmarters.model.callback.BillingGetDevicesCallback;
import minefarts.iptvsmarters.model.callback.BillingIsPurchasedCallback;
import minefarts.iptvsmarters.model.callback.BillingLoginClientCallback;
import minefarts.iptvsmarters.model.callback.BillingUpdateDevicesCallback;
import minefarts.iptvsmarters.model.callback.RegisterClientCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface d extends c {
    void E(BillingAddOrderCallback billingAddOrderCallback);

    void S(RegisterClientCallback registerClientCallback);

    void V(BillingIsPurchasedCallback billingIsPurchasedCallback);

    void d(BillingGetDevicesCallback billingGetDevicesCallback);

    void e0(BillingLoginClientCallback billingLoginClientCallback);

    void g0(BillingUpdateDevicesCallback billingUpdateDevicesCallback);

    void z(BillingCheckGPACallback billingCheckGPACallback);
}
