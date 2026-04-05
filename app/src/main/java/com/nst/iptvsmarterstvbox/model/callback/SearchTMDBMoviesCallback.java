package minefarts.iptvsmarters.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import minefarts.iptvsmarters.model.pojo.SearchTMDBMoviesResultPojo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SearchTMDBMoviesCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("total_results")
    public Integer f25022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("results")
    public List<SearchTMDBMoviesResultPojo> f25023b = null;

    public List<SearchTMDBMoviesResultPojo> a() {
        return this.f25023b;
    }

    public Integer b() {
        return this.f25022a;
    }
}
