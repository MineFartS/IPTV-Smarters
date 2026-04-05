package c.h.a.k.f;

import minefarts.iptvsmarters.model.callback.GetSeriesStreamCallback;
import minefarts.iptvsmarters.model.callback.GetSeriesStreamCategoriesCallback;
import minefarts.iptvsmarters.model.callback.LiveStreamCategoriesCallback;
import minefarts.iptvsmarters.model.callback.LiveStreamsCallback;
import minefarts.iptvsmarters.model.callback.VodCategoriesCallback;
import minefarts.iptvsmarters.model.callback.VodStreamsCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface h extends c {
    void C(String str);

    void H(String str);

    void K(List<GetSeriesStreamCallback> list);

    void R(String str);

    void Z(List<LiveStreamsCallback> list);

    void c0(List<GetSeriesStreamCategoriesCallback> list);

    void i(String str);

    void i0(List<VodStreamsCallback> list);

    void l(String str);

    void q(List<LiveStreamCategoriesCallback> list);

    void u(String str);

    void y(List<VodCategoriesCallback> list);
}
