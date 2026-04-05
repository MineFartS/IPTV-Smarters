package minefarts.iptvsmarters.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import minefarts.iptvsmarters.model.pojo.EpgListingPojo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LiveStreamsEpgCallback implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("epg_listings")
    public List<EpgListingPojo> f25015b = null;

    public List<EpgListingPojo> a() {
        return this.f25015b;
    }
}
