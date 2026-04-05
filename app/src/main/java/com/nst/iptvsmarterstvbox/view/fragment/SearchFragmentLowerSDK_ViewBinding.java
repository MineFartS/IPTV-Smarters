package minefarts.iptvsmarters.view.fragment;

import android.view.View;
import android.widget.EditText;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class SearchFragmentLowerSDK_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SearchFragmentLowerSDK f29076b;

    public SearchFragmentLowerSDK_ViewBinding(SearchFragmentLowerSDK searchFragmentLowerSDK, View view) {
        this.f29076b = searchFragmentLowerSDK;
        searchFragmentLowerSDK.et_search = (EditText) c.c(view, R.id.et_search, "field 'et_search'", EditText.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SearchFragmentLowerSDK searchFragmentLowerSDK = this.f29076b;
        if (searchFragmentLowerSDK == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29076b = null;
        searchFragmentLowerSDK.et_search = null;
    }
}
