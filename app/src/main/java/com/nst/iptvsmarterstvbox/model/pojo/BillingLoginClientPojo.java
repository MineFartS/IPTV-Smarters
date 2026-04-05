package minefarts.iptvsmarters.model.pojo;

import c.f.d.v.a;
import c.f.d.v.c;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class BillingLoginClientPojo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c(Name.MARK)
    public Integer f25112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("devices")
    public List<BillingDevicesPojo> f25113b = null;

    public Integer a() {
        return this.f25112a;
    }
}
