package c.h.a.k.f;

import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;

/* JADX INFO: loaded from: classes2.dex */
public interface j extends b {
    void M(SearchTMDBTVShowsCallback searchTMDBTVShowsCallback);

    void T(TMDBTVShowsInfoCallback tMDBTVShowsInfoCallback);

    void a0(TMDBTrailerCallback tMDBTrailerCallback);

    void f0(TMDBCastsCallback tMDBCastsCallback);
}
