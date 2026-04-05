package minefarts.iptvsmarters.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import minefarts.iptvsmarters.model.pojo.SearchTMDBTVShowsResultPojo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SearchTMDBTVShowsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("total_results")
    public Integer f25024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("results")
    public List<SearchTMDBTVShowsResultPojo> f25025b = null;

    public List<SearchTMDBTVShowsResultPojo> a() {
        return this.f25025b;
    }

    public Integer b() {
        return this.f25024a;
    }
}
