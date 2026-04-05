package minefarts.iptvsmarters.view.adapter;

import a.b.q.j0;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.pojo.ExternalPlayerModelClass;
import minefarts.iptvsmarters.view.activity.AddedExternalPlayerActivity;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AddedExternalPlayerAdapter extends RecyclerView.h<ViewHolder> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f27198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<ExternalPlayerModelClass> f27199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PackageManager f27200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AddedExternalPlayerActivity f27201h;

    public class ViewHolder extends RecyclerView.e0 {

        @BindView
        public ImageView iv_app_logo;

        @BindView
        public LinearLayout ll_outer;

        @BindView
        public TextView tv_appname;

        @BindView
        public TextView tv_packagename;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.b(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewHolder f27202b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f27202b = viewHolder;
            viewHolder.tv_packagename = (TextView) b.c.c.c(view, R.id.tv_packagename, "field 'tv_packagename'", TextView.class);
            viewHolder.tv_appname = (TextView) b.c.c.c(view, R.id.tv_appname, "field 'tv_appname'", TextView.class);
            viewHolder.iv_app_logo = (ImageView) b.c.c.c(view, R.id.iv_app_logo, "field 'iv_app_logo'", ImageView.class);
            viewHolder.ll_outer = (LinearLayout) b.c.c.c(view, R.id.ll_outer, "field 'll_outer'", LinearLayout.class);
        }

        @Override // butterknife.Unbinder
        public void a() {
            ViewHolder viewHolder = this.f27202b;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.f27202b = null;
            viewHolder.tv_packagename = null;
            viewHolder.tv_appname = null;
            viewHolder.iv_app_logo = null;
            viewHolder.ll_outer = null;
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27203b;

        public a(int i2) {
            this.f27203b = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AddedExternalPlayerAdapter addedExternalPlayerAdapter = AddedExternalPlayerAdapter.this;
            addedExternalPlayerAdapter.l0(view, ((ExternalPlayerModelClass) addedExternalPlayerAdapter.f27199f.get(this.f27203b)).a(), this.f27203b);
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27205b;

        public b(int i2) {
            this.f27205b = i2;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            AddedExternalPlayerAdapter addedExternalPlayerAdapter = AddedExternalPlayerAdapter.this;
            addedExternalPlayerAdapter.l0(view, ((ExternalPlayerModelClass) addedExternalPlayerAdapter.f27199f.get(this.f27205b)).a(), this.f27205b);
            return true;
        }
    }

    public class c implements j0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f27207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f27208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j0 f27209c;

        public c(String str, int i2, j0 j0Var) {
            this.f27207a = str;
            this.f27208b = i2;
            this.f27209c = j0Var;
        }

        @Override // a.b.q.j0.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.nav_remove) {
                return false;
            }
            AddedExternalPlayerAdapter.this.m0(this.f27207a, this.f27208b);
            this.f27209c.a();
            return false;
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f27211b;

        public d(PopupWindow popupWindow) {
            this.f27211b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f27211b;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f27211b.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f27213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f27215d;

        public e(String str, int i2, PopupWindow popupWindow) {
            this.f27213b = str;
            this.f27214c = i2;
            this.f27215d = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            String string;
            if (new c.h.a.i.q.d(AddedExternalPlayerAdapter.this.f27198e).m(this.f27213b) > 0) {
                AddedExternalPlayerAdapter.this.f27199f.remove(this.f27214c);
                AddedExternalPlayerAdapter.this.w();
                AddedExternalPlayerAdapter.this.C(this.f27214c);
                if (AddedExternalPlayerAdapter.this.f27199f != null && AddedExternalPlayerAdapter.this.f27199f.size() == 0) {
                    AddedExternalPlayerAdapter.this.f27201h.E0();
                }
                context = AddedExternalPlayerAdapter.this.f27198e;
                string = AddedExternalPlayerAdapter.this.f27198e.getString(R.string.removed_external_player);
            } else {
                context = AddedExternalPlayerAdapter.this.f27198e;
                string = " error on Removed player";
            }
            c.h.a.h.n.e.l0(context, string);
            PopupWindow popupWindow = this.f27215d;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f27215d.dismiss();
        }
    }

    public static class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f27217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Activity f27218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Context f27219d;

        public f(View view, Context context) {
            this.f27217b = view;
            this.f27219d = context;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27217b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27217b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                a(1.0f);
                b(1.0f);
                View view2 = this.f27217b;
                if (view2 != null && view2.getTag() != null && this.f27217b.getTag().equals("1")) {
                    view.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view3 = this.f27217b;
                if (view3 != null && view3.getTag() != null && this.f27217b.getTag().equals("2")) {
                    view.setBackgroundResource(R.drawable.black_button_dark);
                }
                View view4 = this.f27217b;
                if (view4 == null || view4.getTag() == null || !this.f27217b.getTag().equals("3")) {
                    return;
                }
                view.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            float f2 = z ? 1.12f : 1.0f;
            View view5 = this.f27217b;
            if (view5 == null || view5.getTag() == null || !this.f27217b.getTag().equals("1")) {
                View view6 = this.f27217b;
                if (view6 == null || view6.getTag() == null || !this.f27217b.getTag().equals("2")) {
                    View view7 = this.f27217b;
                    if (view7 == null || view7.getTag() == null || !this.f27217b.getTag().equals("3")) {
                        view.setBackground(this.f27218c.getResources().getDrawable(R.drawable.selector_checkbox));
                        return;
                    } else {
                        a(f2);
                        b(f2);
                        i2 = R.drawable.blue_btn_effect;
                    }
                } else {
                    a(f2);
                    b(f2);
                    i2 = R.drawable.logout_btn_effect;
                }
            } else {
                a(f2);
                b(f2);
                i2 = R.drawable.back_btn_effect;
            }
            view.setBackgroundResource(i2);
        }
    }

    public AddedExternalPlayerAdapter(Context context, List<ExternalPlayerModelClass> list, AddedExternalPlayerActivity addedExternalPlayerActivity) {
        this.f27198e = context;
        this.f27199f = list;
        this.f27200g = context.getPackageManager();
        this.f27201h = addedExternalPlayerActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void F(ViewHolder viewHolder, int i2) {
        viewHolder.tv_appname.setText(this.f27199f.get(i2).a());
        viewHolder.tv_packagename.setText(this.f27199f.get(i2).b());
        try {
            Drawable applicationIcon = this.f27198e.getPackageManager().getApplicationIcon(this.f27199f.get(i2).b());
            if (applicationIcon != null) {
                viewHolder.iv_app_logo.setImageDrawable(applicationIcon);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        viewHolder.ll_outer.setOnClickListener(new a(i2));
        viewHolder.ll_outer.setOnLongClickListener(new b(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public ViewHolder H(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom;
        int i3;
        if (new c.h.a.k.d.a.a(this.f27198e).A().equals(c.h.a.h.n.a.s0)) {
            layoutInflaterFrom = LayoutInflater.from(this.f27198e);
            i3 = R.layout.custom_externalplayer_layout_tv;
        } else {
            layoutInflaterFrom = LayoutInflater.from(this.f27198e);
            i3 = R.layout.custom_externalplayer_layout;
        }
        return new ViewHolder(layoutInflaterFrom.inflate(i3, viewGroup, false));
    }

    public final void l0(View view, String str, int i2) {
        Context context = this.f27198e;
        if (context != null) {
            j0 j0Var = new j0(context, view);
            j0Var.d(R.menu.menu_remove_player);
            j0Var.f(new c(str, i2, j0Var));
            j0Var.g();
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public final void m0(String str, int i2) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) ((Activity) this.f27198e).findViewById(R.id.rl_outer);
            LayoutInflater layoutInflater = (LayoutInflater) this.f27198e.getSystemService("layout_inflater");
            View viewInflate = new c.h.a.k.d.a.a(this.f27198e).A().equals(c.h.a.h.n.a.s0) ? layoutInflater.inflate(R.layout.playera_add_alert_box_tv, relativeLayout) : layoutInflater.inflate(R.layout.playera_add_alert_box, relativeLayout);
            PopupWindow popupWindow = new PopupWindow(this.f27198e);
            popupWindow.setContentView(viewInflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.btn_no);
            Button button2 = (Button) viewInflate.findViewById(R.id.btn_yes);
            button2.setText(this.f27198e.getResources().getString(R.string.yes));
            button2.setFocusable(true);
            button.setText(this.f27198e.getResources().getString(R.string.no));
            button.setFocusable(true);
            ((TextView) viewInflate.findViewById(R.id.tv_description)).setText(this.f27198e.getResources().getString(R.string.are_you_sure_you_want_to_remove_palyer));
            button.setOnFocusChangeListener(new f(button, this.f27198e));
            button2.setOnFocusChangeListener(new f(button2, this.f27198e));
            button2.requestFocus();
            button2.requestFocusFromTouch();
            button.setOnClickListener(new d(popupWindow));
            button2.setOnClickListener(new e(str, i2, popupWindow));
        } catch (NullPointerException | Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int o() {
        return this.f27199f.size();
    }
}
