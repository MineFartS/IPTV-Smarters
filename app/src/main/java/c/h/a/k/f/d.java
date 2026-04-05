package c.h.a.k.f;

import com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingCheckGPACallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingGetDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingLoginClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingUpdateDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.RegisterClientCallback;

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
