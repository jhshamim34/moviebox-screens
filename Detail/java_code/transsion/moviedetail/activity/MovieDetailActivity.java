package com.transsion.moviedetail.activity;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.tn.lib.widget.R$color;
import com.transsion.baselib.report.l;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.memberapi.IMemberApi;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.activity.MovieDetailActivity;
import com.transsion.moviedetail.fragment.MovieDetailFragment;
import com.transsion.videofloat.manager.c;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fz.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import so.a;
import th.m;

/* compiled from: source.java */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001BB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0010R\u0018\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010&R\u0016\u0010+\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0018\u00101\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00104\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00108\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u0016\u0010<\u001a\u0002098\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/transsion/moviedetail/activity/MovieDetailActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lso/a;", "Lcom/transsion/videofloat/manager/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "j0", "()Ljava/lang/String;", "", "s0", "()Z", "r0", "isMonitorNetworkState", "p0", "q0", "o0", "t0", "retryLoadData", "H0", "()Lso/a;", "isTranslucent", "isStatusDark", "isChangeStatusBar", "", "statusColor", "()I", "getPageName", "isMusicFloatingAttach", "onPause", j.f35131b, "isShowMemberPushViewTip", "i", "Ljava/lang/String;", "id", "ops", CampaignEx.JSON_KEY_AD_K, "Z", "autoDownload", "l", "autoPlay", "m", "autoPlayResourceId", "n", "moduleName", "o", "I", "preloadId", TtmlNode.TAG_P, "curSeason", CampaignEx.JSON_KEY_AD_Q, "subjectYpe", "", CampaignEx.JSON_KEY_AD_R, "J", "tsEnter", "Landroidx/fragment/app/Fragment;", "s", "Landroidx/fragment/app/Fragment;", "mFragment", "t", "a", "MovieDetail_psRelease"}, k = 1, mv = {2, 1, 0}, xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MovieDetailActivity extends BaseNewActivity<a> implements c {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public String id;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String ops;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean autoDownload;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean autoPlay;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public String autoPlayResourceId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public String moduleName;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int preloadId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int curSeason = 1;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int subjectYpe = -1;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public long tsEnter;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Fragment mFragment;

    /* compiled from: source.java */
    /* renamed from: com.transsion.moviedetail.activity.MovieDetailActivity$a, reason: from kotlin metadata */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String msg) {
            Intrinsics.h(msg, "msg");
            Log.w("zxb_log_movie_detail", msg);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0() {
        IMemberApi iMemberApi = (IMemberApi) TheRouter.d(IMemberApi.class, new Object[0]);
        if (iMemberApi != null) {
            iMemberApi.w(0.0f);
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public a getViewBinding() {
        a c11 = a.c(getLayoutInflater());
        Intrinsics.g(c11, "inflate(...)");
        return c11;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "subjectdetail";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public boolean isMonitorNetworkState() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity
    public boolean isMusicFloatingAttach() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity
    public boolean isShowMemberPushViewTip() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.videofloat.manager.c
    public void j() {
        MovieDetailFragment movieDetailFragment;
        Fragment fragment = this.mFragment;
        if (fragment instanceof MovieDetailFragment) {
            if (fragment instanceof MovieDetailFragment) {
                movieDetailFragment = (MovieDetailFragment) fragment;
            } else {
                movieDetailFragment = null;
            }
            if (movieDetailFragment != null) {
                movieDetailFragment.M1();
            }
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public String j0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        TheRouter.l(this);
        super.onCreate(savedInstanceState);
        l.f42928a.w(3, this);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        MovieDetailFragment movieDetailFragment;
        super.onPause();
        if (isFinishing()) {
            Fragment fragment = this.mFragment;
            if (fragment instanceof MovieDetailFragment) {
                movieDetailFragment = (MovieDetailFragment) fragment;
            } else {
                movieDetailFragment = null;
            }
            if (movieDetailFragment != null) {
                movieDetailFragment.M1();
            }
            e.f65120a.b().m(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void p0() {
        w0();
        ((a) getMViewBinding()).getRoot().post(new Runnable() { // from class: qo.a
            @Override // java.lang.Runnable
            public final void run() {
                MovieDetailActivity.I0();
            }
        });
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean r0() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        A0();
        if (m.f78942a.e()) {
            y0();
            t0();
        } else {
            C0();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean s0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public int statusColor() {
        return R$color.black;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void t0() {
        if (this.mFragment == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
            x p11 = supportFragmentManager.p();
            Intrinsics.g(p11, "beginTransaction()");
            MovieDetailFragment a11 = MovieDetailFragment.INSTANCE.a();
            Bundle bundle = new Bundle();
            bundle.putString("id", this.id);
            bundle.putString("ops", this.ops);
            bundle.putBoolean("auto_download", this.autoDownload);
            bundle.putBoolean("auto_play", this.autoPlay);
            bundle.putString("auto_play_resource_id", this.autoPlayResourceId);
            bundle.putString("module_name", this.moduleName);
            bundle.putInt("season", this.curSeason);
            bundle.putInt("subject_type", this.subjectYpe);
            bundle.putInt("yy_preload_id", this.preloadId);
            bundle.putLong("ts_enter", this.tsEnter);
            a11.setArguments(bundle);
            p11.s(R$id.container, a11);
            this.mFragment = a11;
            p11.j();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void o0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void q0() {
    }
}
