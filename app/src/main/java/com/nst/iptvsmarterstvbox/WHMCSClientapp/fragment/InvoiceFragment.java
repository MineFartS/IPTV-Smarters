package minefarts.iptvsmarters.WHMCSClientapp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;
import java.lang.reflect.Field;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class InvoiceFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f24919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24920d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24921e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24922f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f24923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Unbinder f24924h;

    @BindView
    public WebView webView;

    public interface a {
    }

    public final void l() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f24920d = arguments.getString("invoice_id");
        }
        this.webView.setWebChromeClient(new WebChromeClient());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.f24923g = (a) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f24918b = getArguments().getString("param1");
            this.f24919c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_invoice_data, viewGroup, false);
        this.f24924h = ButterKnife.b(this, viewInflate);
        l();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }
}
