package minefarts.iptvsmarters.vpn.adapters;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.h.n.e;
import c.k.b.t;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.vpn.activities.ProfileActivity;
import de.blinkt.openvpn.LaunchVPN;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VpnProfileAdapter extends RecyclerView.h<ViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f29991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c.h.a.l.e.a> f29992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.l.c.a f29993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProfileActivity f29994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PopupWindow f29995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29996j = BuildConfig.FLAVOR;

    public class ViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView iv_profile_image;

        @BindView
        public RelativeLayout rl_outer;

        @BindView
        public TextView tv_profile_name;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewHolder f29997b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f29997b = viewHolder;
            viewHolder.tv_profile_name = (TextView) b.c.c.c(view, R.id.tv_profile_name, "field 'tv_profile_name'", TextView.class);
            viewHolder.iv_profile_image = (ImageView) b.c.c.c(view, R.id.iv_profile_image, "field 'iv_profile_image'", ImageView.class);
            viewHolder.rl_outer = (RelativeLayout) b.c.c.c(view, R.id.rl_outer, "field 'rl_outer'", RelativeLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f29997b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f29997b = null;
            viewHolder.tv_profile_name = null;
            viewHolder.iv_profile_image = null;
            viewHolder.rl_outer = null;
        }
    }

    public class a implements c.k.b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f29998a;

        public a(ViewHolder viewHolder) {
            this.f29998a = viewHolder;
        }

        @Override // c.k.b.e
        public void a() {
            this.f29998a.iv_profile_image.setImageResource(R.drawable.new_user_img);
        }

        @Override // c.k.b.e
        public void onSuccess() {
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f30001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f30002d;

        public b(int i2, ViewHolder viewHolder, String str) {
            this.f30000b = i2;
            this.f30001c = viewHolder;
            this.f30002d = str;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            VpnProfileAdapter vpnProfileAdapter = VpnProfileAdapter.this;
            vpnProfileAdapter.n0(((c.h.a.l.e.a) vpnProfileAdapter.f29992f.get(this.f30000b)).i(), this.f30001c, this.f30002d, VpnProfileAdapter.this.f29992f, this.f30000b);
            return true;
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30005c;

        public c(int i2, String str) {
            this.f30004b = i2;
            this.f30005c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent;
            if (!((c.h.a.l.e.a) VpnProfileAdapter.this.f29992f.get(this.f30004b)).i().equals("1")) {
                intent = new Intent(VpnProfileAdapter.this.f29991e, (Class<?>) LaunchVPN.class);
            } else {
                if (((c.h.a.l.e.a) VpnProfileAdapter.this.f29992f.get(this.f30004b)).h().equals(BuildConfig.FLAVOR) || ((c.h.a.l.e.a) VpnProfileAdapter.this.f29992f.get(this.f30004b)).g().equals(BuildConfig.FLAVOR)) {
                    VpnProfileAdapter vpnProfileAdapter = VpnProfileAdapter.this;
                    vpnProfileAdapter.o0(this.f30005c, vpnProfileAdapter.f29992f, this.f30004b);
                    return;
                }
                intent = new Intent(VpnProfileAdapter.this.f29991e, (Class<?>) LaunchVPN.class);
            }
            intent.putExtra("vpnProfile", (Serializable) VpnProfileAdapter.this.f29992f.get(this.f30004b));
            VpnProfileAdapter.this.f29991e.startActivity(intent);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VpnProfileAdapter.this.f29995i.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VpnProfileAdapter.this.f29995i.dismiss();
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.h.a.l.e.a f30009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String[] f30010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f30011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f30012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ EditText f30013f;

        public f(c.h.a.l.e.a aVar, String[] strArr, String[] strArr2, EditText editText, EditText editText2) {
            this.f30009b = aVar;
            this.f30010c = strArr;
            this.f30011d = strArr2;
            this.f30012e = editText;
            this.f30013f = editText2;
        }

        public final boolean a() {
            Context context;
            Resources resources;
            int i2;
            this.f30010c[0] = String.valueOf(this.f30012e.getText());
            this.f30011d[0] = String.valueOf(this.f30013f.getText());
            String[] strArr = this.f30010c;
            if (strArr[0] == null || !strArr[0].equals(BuildConfig.FLAVOR)) {
                String[] strArr2 = this.f30011d;
                if (strArr2[0] == null || !strArr2[0].equals(BuildConfig.FLAVOR)) {
                    String[] strArr3 = this.f30010c;
                    return (strArr3[0] == null || this.f30011d[0] == null || strArr3[0].equals(BuildConfig.FLAVOR) || this.f30011d[0].equals(BuildConfig.FLAVOR)) ? false : true;
                }
                context = VpnProfileAdapter.this.f29991e;
                resources = VpnProfileAdapter.this.f29991e.getResources();
                i2 = R.string.enter_password_error;
            } else {
                context = VpnProfileAdapter.this.f29991e;
                resources = VpnProfileAdapter.this.f29991e.getResources();
                i2 = R.string.enter_username_error;
            }
            Toast.makeText(context, resources.getString(i2), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a()) {
                this.f30009b.t(this.f30010c[0]);
                this.f30009b.s(this.f30011d[0]);
                VpnProfileAdapter.this.f29993g.v(this.f30009b);
                VpnProfileAdapter.this.f29995i.dismiss();
                Intent intent = new Intent(VpnProfileAdapter.this.f29991e, (Class<?>) LaunchVPN.class);
                intent.putExtra("vpnProfile", this.f30009b);
                VpnProfileAdapter.this.f29991e.startActivity(intent);
            }
        }
    }

    public class g implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f30016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30017c;

        public g(String str, ArrayList arrayList, int i2) {
            this.f30015a = str;
            this.f30016b = arrayList;
            this.f30017c = i2;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.delete_user) {
                VpnProfileAdapter.this.p0(this.f30015a, this.f30016b, this.f30017c);
                return false;
            }
            if (itemId != R.id.edit_user) {
                return false;
            }
            VpnProfileAdapter.this.o0(this.f30015a, this.f30016b, this.f30017c);
            return false;
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VpnProfileAdapter.this.f29995i.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f30020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.h.a.l.e.a f30021c;

        public i(File file, c.h.a.l.e.a aVar) {
            this.f30020b = file;
            this.f30021c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f30020b.exists()) {
                this.f30020b.delete();
            }
            VpnProfileAdapter.this.f29993g.p(this.f30021c.c());
            ((ProfileActivity) VpnProfileAdapter.this.f29991e).N0();
            VpnProfileAdapter.this.f29995i.dismiss();
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f30023b;

        public j(View view) {
            this.f30023b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30023b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30023b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30023b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (z) {
                f2 = z ? 1.05f : 1.0f;
                b(f2);
                c(f2);
                Log.e("id is", BuildConfig.FLAVOR + this.f30023b.getTag());
                view2 = this.f30023b;
                i2 = R.drawable.shape_list_multidns_focused;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.05f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                view2 = this.f30023b;
                i2 = R.drawable.shape_list_multidns;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public VpnProfileAdapter(Context context, ArrayList<c.h.a.l.e.a> arrayList, ProfileActivity profileActivity) {
        this.f29991e = context;
        this.f29992f = arrayList;
        this.f29993g = new c.h.a.l.c.a(context);
        this.f29994h = profileActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void F(ViewHolder viewHolder, int i2) {
        String str;
        try {
            str = this.f29992f.get(i2).e().substring(0, 1).toUpperCase() + this.f29992f.get(i2).e().substring(1);
        } catch (Exception unused) {
            str = BuildConfig.FLAVOR;
        }
        viewHolder.tv_profile_name.setText(str);
        try {
            if (this.f29992f.get(i2).b().equals(BuildConfig.FLAVOR)) {
                viewHolder.iv_profile_image.setImageResource(R.drawable.new_user_img);
            } else {
                t.q(this.f29991e).l(this.f29992f.get(i2).b()).h(viewHolder.iv_profile_image, new a(viewHolder));
            }
        } catch (Exception unused2) {
            viewHolder.iv_profile_image.setImageResource(R.drawable.new_user_img);
        }
        viewHolder.rl_outer.setOnLongClickListener(new b(i2, viewHolder, str));
        viewHolder.rl_outer.setOnClickListener(new c(i2, str));
        RelativeLayout relativeLayout = viewHolder.rl_outer;
        relativeLayout.setOnFocusChangeListener(new j(relativeLayout));
        if (i2 == 0) {
            viewHolder.rl_outer.requestFocus();
            viewHolder.rl_outer.requestFocusFromTouch();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public ViewHolder H(ViewGroup viewGroup, int i2) {
        return new ViewHolder(LayoutInflater.from(this.f29991e).inflate(R.layout.custom_vpn_profile_layout, viewGroup, false));
    }

    public final void n0(String str, ViewHolder viewHolder, String str2, ArrayList<c.h.a.l.e.a> arrayList, int i2) {
        if (this.f29991e != null) {
            PopupMenu popupMenu = new PopupMenu(this.f29991e, viewHolder.rl_outer);
            popupMenu.inflate(R.menu.menu_card_multiuser);
            popupMenu.getMenu().getItem(0).setVisible(false);
            if (str.equals("1")) {
                popupMenu.getMenu().getItem(1).setVisible(true);
            } else {
                popupMenu.getMenu().getItem(1).setVisible(false);
            }
            popupMenu.setOnMenuItemClickListener(new g(str2, arrayList, i2));
            popupMenu.show();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f29992f.size();
    }

    public final void o0(String str, ArrayList<c.h.a.l.e.a> arrayList, int i2) {
        c.h.a.l.e.a aVar = arrayList.get(i2);
        new c.h.a.l.e.a();
        try {
            View viewInflate = ((LayoutInflater) this.f29991e.getSystemService("layout_inflater")).inflate(R.layout.layout_authenticate_vpn, (RelativeLayout) ((Activity) this.f29991e).findViewById(R.id.rl_authenticate_vpn));
            PopupWindow popupWindow = new PopupWindow(this.f29991e);
            this.f29995i = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f29995i.setWidth(-1);
            this.f29995i.setHeight(-1);
            this.f29995i.setFocusable(true);
            this.f29995i.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_and_connect);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new e.j(button, (Activity) this.f29991e));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j(button2, (Activity) this.f29991e));
            }
            EditText editText = (EditText) viewInflate.findViewById(R.id.tv_vpn_username);
            EditText editText2 = (EditText) viewInflate.findViewById(R.id.tv_vpn_password);
            TextView textView = (TextView) viewInflate.findViewById(R.id.et_description);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_cancel);
            editText.setText(aVar.h());
            editText2.setText(aVar.g());
            textView.setText(this.f29991e.getResources().getString(R.string.vpn_profile_desc) + " " + str);
            if (this.f29991e.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            String[] strArr = {BuildConfig.FLAVOR};
            String[] strArr2 = {BuildConfig.FLAVOR};
            if (button2 != null) {
                button2.setOnClickListener(new d());
            }
            if (imageView != null) {
                imageView.setOnClickListener(new e());
            }
            if (button != null) {
                button.setOnClickListener(new f(aVar, strArr, strArr2, editText, editText2));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void p0(String str, ArrayList<c.h.a.l.e.a> arrayList, int i2) {
        try {
            c.h.a.l.e.a aVar = arrayList.get(i2);
            File file = new File(aVar.d());
            View viewInflate = ((LayoutInflater) this.f29991e.getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) ((Activity) this.f29991e).findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this.f29991e);
            this.f29995i = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f29995i.setWidth(-1);
            this.f29995i.setHeight(-1);
            this.f29995i.setFocusable(true);
            this.f29995i.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(R.id.tv_delete_recording)).setText("Are you Sure you want to Delete this Profile?");
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new e.j(button, (Activity) this.f29991e));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j(button2, (Activity) this.f29991e));
            }
            button.requestFocus();
            button2.setOnClickListener(new h());
            button.setOnClickListener(new i(file, aVar));
        } catch (Exception unused) {
        }
    }
}
