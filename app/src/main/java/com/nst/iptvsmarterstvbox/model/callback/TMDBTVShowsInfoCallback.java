package minefarts.iptvsmarters.model.callback;

import c.f.d.v.a;
import c.f.d.v.c;
import minefarts.iptvsmarters.model.pojo.TMDBTVShowsCreatedByPojo;
import minefarts.iptvsmarters.model.pojo.TMDBTVShowsGenrePojo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TMDBTVShowsInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @a
    @c("created_by")
    public List<TMDBTVShowsCreatedByPojo> f25069a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a
    @c("genres")
    public List<TMDBTVShowsGenrePojo> f25070b = null;

    public List<TMDBTVShowsCreatedByPojo> a() {
        return this.f25069a;
    }

    public List<TMDBTVShowsGenrePojo> b() {
        return this.f25070b;
    }
}
