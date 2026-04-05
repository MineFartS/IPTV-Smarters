package minefarts.iptvsmarters.view.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import c.h.a.i.q.f;
import c.h.a.i.q.h;
import c.h.a.i.q.m;
import minefarts.iptvsmarters.R;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlSettingFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Unbinder f29013b;

    @BindView
    public Button btSavePassword;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29014c = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29015d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29016e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f29017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f29018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f29021j;

    @BindView
    public EditText tvConfirmPassword;

    @BindView
    public EditText tvNewPassword;

    @BindView
    public EditText tvOldPassword;

    public interface a {
    }

    public final void l() {
        EditText editText = this.tvOldPassword;
        if (editText == null || this.tvConfirmPassword == null || this.tvNewPassword == null) {
            return;
        }
        editText.getText().clear();
        this.tvConfirmPassword.getText().clear();
        this.tvNewPassword.getText().clear();
    }

    public final boolean n(String str, String str2) {
        if (str == null || str.equals(BuildConfig.FLAVOR) || str.isEmpty()) {
            Context context = this.f29017f;
            if (context != null) {
                Toast.makeText(context, getResources().getString(R.string.enter_new_password_error), 0).show();
            }
            return false;
        }
        if ((!str.isEmpty() && !str.equals(BuildConfig.FLAVOR) && str2 == null && str2.isEmpty()) || str2.equals(BuildConfig.FLAVOR)) {
            Context context2 = this.f29017f;
            if (context2 != null) {
                Toast.makeText(context2, getResources().getString(R.string.enter_confirm_password_error), 0).show();
                return false;
            }
        } else if ((!str.isEmpty() && !str.equals(BuildConfig.FLAVOR) && !str2.isEmpty()) || !str2.equals(BuildConfig.FLAVOR)) {
            return true;
        }
        return false;
    }

    public final void o() {
        this.f29017f = getContext();
        this.f29018g = new f(this.f29017f);
        this.f29014c = String.valueOf(this.tvOldPassword.getText());
        this.f29015d = String.valueOf(this.tvNewPassword.getText());
        this.f29016e = String.valueOf(this.tvConfirmPassword.getText());
        this.tvOldPassword.requestFocus();
        ((InputMethodManager) this.f29017f.getSystemService("input_method")).showSoftInput(this.tvOldPassword, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.f29021j = (a) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f29019h = getArguments().getString("param1");
            this.f29020i = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_parental_control_setting, viewGroup, false);
        this.f29013b = ButterKnife.b(this, viewInflate);
        o();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29013b.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f29021j = null;
    }

    @OnClick
    public void onViewClicked() {
        Context context;
        Resources resources;
        int i2;
        if (this.f29017f != null) {
            this.f29014c = String.valueOf(this.tvOldPassword.getText());
            this.f29015d = String.valueOf(this.tvNewPassword.getText());
            this.f29016e = String.valueOf(this.tvConfirmPassword.getText());
            String string = this.f29017f.getSharedPreferences("loginPrefs", 0).getString("username", BuildConfig.FLAVOR);
            if (!q(string, this.f29014c, m.z(this.f29017f))) {
                context = this.f29017f;
                if (context != null) {
                    resources = getResources();
                    i2 = R.string.invalid_old_password;
                    Toast.makeText(context, resources.getString(i2), 0).show();
                }
            } else {
                if (!n(this.f29015d, this.f29016e)) {
                    return;
                }
                if (this.f29015d.equals(this.f29016e)) {
                    r(this.f29018g.s2(string, this.f29015d, m.z(this.f29017f)));
                    getActivity().finish();
                    return;
                } else {
                    context = this.f29017f;
                    if (context != null) {
                        resources = getResources();
                        i2 = R.string.parental_setting_new_confirm_password_error;
                        Toast.makeText(context, resources.getString(i2), 0).show();
                    }
                }
            }
            l();
        }
    }

    public final boolean q(String str, String str2, int i2) {
        String strC;
        boolean z;
        ArrayList<h> arrayListC1 = new f(this.f29017f).c1(m.z(this.f29017f));
        if (arrayListC1 != null) {
            strC = BuildConfig.FLAVOR;
            z = false;
            for (h hVar : arrayListC1) {
                if (hVar.a().equals(str) && !hVar.c().isEmpty()) {
                    strC = hVar.c();
                    z = true;
                }
            }
        } else {
            strC = BuildConfig.FLAVOR;
            z = false;
        }
        return (!z || str2 == null || str2.isEmpty() || str2.equals(BuildConfig.FLAVOR) || strC.equals(BuildConfig.FLAVOR) || !strC.equals(str2)) ? false : true;
    }

    public final void r(boolean z) {
        Context context;
        Resources resources;
        int i2;
        if (z) {
            context = this.f29017f;
            if (context != null) {
                resources = getResources();
                i2 = R.string.password_updated;
                Toast.makeText(context, resources.getString(i2), 0).show();
            }
        } else {
            context = this.f29017f;
            if (context != null) {
                resources = getResources();
                i2 = R.string.something_wrong;
                Toast.makeText(context, resources.getString(i2), 0).show();
            }
        }
        l();
    }
}
