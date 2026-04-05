package c.h.a.k.f;

import minefarts.iptvsmarters.model.callback.SearchTMDBMoviesCallback;
import minefarts.iptvsmarters.model.callback.TMDBCastsCallback;
import minefarts.iptvsmarters.model.callback.TMDBGenreCallback;
import minefarts.iptvsmarters.model.callback.TMDBPersonInfoCallback;
import minefarts.iptvsmarters.model.callback.TMDBTrailerCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface i extends b {
    void A(TMDBPersonInfoCallback tMDBPersonInfoCallback);

    void L(SearchTMDBMoviesCallback searchTMDBMoviesCallback);

    void j0(TMDBCastsCallback tMDBCastsCallback);

    void k0(TMDBTrailerCallback tMDBTrailerCallback);

    void s(TMDBGenreCallback tMDBGenreCallback);

    void x(TMDBCastsCallback tMDBCastsCallback);
}
