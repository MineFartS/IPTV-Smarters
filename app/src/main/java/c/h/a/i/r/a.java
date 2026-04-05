package c.h.a.i.r;

import c.f.d.j;
import c.f.d.m;
import com.nst.iptvsmarterstvbox.model.callback.ActivationCallBack;
import com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingCheckGPACallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingGetDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingLoginClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingUpdateDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsEpgCallback;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.callback.RegisterClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.callback.VPNServersCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodStreamsCallback;
import java.util.List;
import o.b;
import o.q.c;
import o.q.e;
import o.q.f;
import o.q.i;
import o.q.o;
import o.q.s;
import o.q.t;

/* JADX INFO: loaded from: classes2.dex */
public interface a {
    @f("search/tv")
    b<SearchTMDBTVShowsCallback> A(@t("api_key") String str, @t("query") String str2);

    @f("player_api.php")
    b<j> B(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4, @t("series_id") String str5);

    @e
    @o("/includes/smartersapi/api.php")
    b<BillingAddOrderCallback> a(@c("a") String str, @c("e") String str2, @c("sc") String str3, @c("s") String str4, @c("r") String str5, @c("m") String str6, @c("p") String str7, @c("action") String str8, @c("d") String str9, @c("u") int i2, @c("is_purchased") String str10, @c("order_id") String str11, @c("v") String str12);

    @e
    @o("/includes/smartersapi/api.php")
    b<BillingIsPurchasedCallback> b(@c("a") String str, @c("e") String str2, @c("sc") String str3, @c("s") String str4, @c("r") String str5, @c("m") String str6, @c("p") String str7, @c("action") String str8, @c("d") String str9, @c("u") int i2, @c("is_purchased") String str10, @c("order_id") String str11);

    @f("search/movie")
    b<SearchTMDBMoviesCallback> c(@t("api_key") String str, @t("query") String str2);

    @f("player_api.php")
    b<LiveStreamsEpgCallback> d(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4, @t("stream_id") int i2);

    @f("movie/{movie_id}")
    b<TMDBGenreCallback> e(@s("movie_id") int i2, @t("api_key") String str);

    @o("modules/addons/ActivationCoder/response.php")
    b<ActivationCallBack> f(@o.q.a m mVar);

    @f("player_api.php")
    b<List<LiveStreamsCallback>> g(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4);

    @f("tv/{show_id}")
    b<TMDBTVShowsInfoCallback> h(@s("show_id") int i2, @t("api_key") String str);

    @f("movie/{movie_id}/videos")
    b<TMDBTrailerCallback> i(@s("movie_id") int i2, @t("api_key") String str);

    @f("player_api.php")
    b<List<VodCategoriesCallback>> j(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4);

    @e
    @o("/includes/smartersapi/api.php")
    b<BillingGetDevicesCallback> k(@c("a") String str, @c("e") String str2, @c("sc") String str3, @c("s") String str4, @c("r") String str5, @c("p") String str6, @c("u") int i2, @c("action") String str7);

    @e
    @o("/includes/smartersapi/api.php")
    b<BillingCheckGPACallback> l(@c("a") String str, @c("order_id") String str2, @c("sc") String str3, @c("s") String str4, @c("r") String str5, @c("action") String str6);

    @e
    @o("/includes/smartersapi/api.php")
    b<BillingLoginClientCallback> m(@c("a") String str, @c("e") String str2, @c("sc") String str3, @c("s") String str4, @c("r") String str5, @c("m") String str6, @c("p") String str7, @c("action") String str8, @c("d") String str9);

    @f("player_api.php")
    b<LoginCallback> n(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3);

    @f("movie/{movie_id}/credits")
    b<TMDBCastsCallback> o(@s("movie_id") int i2, @t("api_key") String str);

    @f("player_api.php")
    b<VodInfoCallback> p(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4, @t("vod_id") int i2);

    @e
    @o("/includes/smartersapi/api.php")
    b<BillingUpdateDevicesCallback> q(@c("a") String str, @c("e") String str2, @c("sc") String str3, @c("s") String str4, @c("r") String str5, @c("u") int i2, @c("action") String str6, @c("m") String str7, @c("newmac") String str8, @c("newdevicename") String str9);

    @f("tv/{show_id}/videos")
    b<TMDBTrailerCallback> r(@s("show_id") int i2, @t("api_key") String str);

    @f("player_api.php")
    b<List<GetSeriesStreamCallback>> s(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4);

    @f("player_api.php")
    b<List<VodStreamsCallback>> t(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4);

    @f("tv/{show_id}/credits")
    b<TMDBCastsCallback> u(@s("show_id") int i2, @t("api_key") String str);

    @f("player_api.php")
    b<List<LiveStreamCategoriesCallback>> v(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4);

    @e
    @o("/request_api.php")
    b<VPNServersCallback> w(@c("m") String str, @c("ak") String str2, @c("r") String str3, @c("allowedKey") String str4, @c("sc") String str5);

    @f("person/{person_id}")
    b<TMDBPersonInfoCallback> x(@s("person_id") String str, @t("api_key") String str2, @t("append_to_response") String str3);

    @f("player_api.php")
    b<List<GetSeriesStreamCategoriesCallback>> y(@i("Content-Type") String str, @t("username") String str2, @t("password") String str3, @t("action") String str4);

    @e
    @o("/includes/smartersapi/api.php")
    b<RegisterClientCallback> z(@c("e") String str, @c("sc") String str2, @c("a") String str3, @c("r") String str4, @c("p") String str5, @c("s") String str6, @c("action") String str7, @c("d") String str8, @c("m") String str9);
}
