package c.h.a.k.f;

import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface i extends b {
    void A(TMDBPersonInfoCallback tMDBPersonInfoCallback);

    void L(SearchTMDBMoviesCallback searchTMDBMoviesCallback);

    void j0(TMDBCastsCallback tMDBCastsCallback);

    void k0(TMDBTrailerCallback tMDBTrailerCallback);

    void s(TMDBGenreCallback tMDBGenreCallback);

    void x(TMDBCastsCallback tMDBCastsCallback);
}
