package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.utility.LoadingGearSpinner;

/* JADX INFO: loaded from: classes2.dex */
public class ImportEPGActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImportEPGActivity f25695b;

    public ImportEPGActivity_ViewBinding(ImportEPGActivity importEPGActivity, View view) {
        this.f25695b = importEPGActivity;
        importEPGActivity.tvSettingStreams = (TextView) c.c(view, R.id.tv_setting_streams, "field 'tvSettingStreams'", TextView.class);
        importEPGActivity.tvImportingEpg = (TextView) c.c(view, R.id.tv_importing_epg, "field 'tvImportingEpg'", TextView.class);
        importEPGActivity.progressBar = (ProgressBar) c.c(view, R.id.progressBar, "field 'progressBar'", ProgressBar.class);
        importEPGActivity.tvPercentage = (TextView) c.c(view, R.id.tv_percentage, "field 'tvPercentage'", TextView.class);
        importEPGActivity.tvCountings = (TextView) c.c(view, R.id.tv_countings, "field 'tvCountings'", TextView.class);
        importEPGActivity.rlImportProcess = (RelativeLayout) c.c(view, R.id.rl_import_process, "field 'rlImportProcess'", RelativeLayout.class);
        importEPGActivity.rlImportLayout = (RelativeLayout) c.c(view, R.id.rl_import_layout, "field 'rlImportLayout'", RelativeLayout.class);
        importEPGActivity.ivGearLoader = (LoadingGearSpinner) c.c(view, R.id.iv_gear_loader, "field 'ivGearLoader'", LoadingGearSpinner.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ImportEPGActivity importEPGActivity = this.f25695b;
        if (importEPGActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25695b = null;
        importEPGActivity.tvSettingStreams = null;
        importEPGActivity.tvImportingEpg = null;
        importEPGActivity.progressBar = null;
        importEPGActivity.tvPercentage = null;
        importEPGActivity.tvCountings = null;
        importEPGActivity.rlImportProcess = null;
        importEPGActivity.rlImportLayout = null;
        importEPGActivity.ivGearLoader = null;
    }
}
