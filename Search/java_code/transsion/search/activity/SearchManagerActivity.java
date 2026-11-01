package com.transsion.search.activity;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.search.R$id;
import com.transsion.search.fragment.SearchSubjectFragment;
import com.transsion.search.fragment.group.SearchUploadGroupFragment;
import com.transsion.search.fragment.group.SearchUploadWorkFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import hs.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import th.m;

/* compiled from: source.java */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0019\u0010\u0004R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/transsion/search/activity/SearchManagerActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lhs/a;", "<init>", "()V", "", "H0", "", "j0", "()Ljava/lang/String;", "G0", "()Lhs/a;", "p0", "q0", "o0", "t0", "u0", "retryLoadData", "", "r0", "()Z", "isTranslucent", "isStatusDark", "isChangeStatusBar", "getPageName", "onDestroy", "Landroidx/fragment/app/Fragment;", "i", "Landroidx/fragment/app/Fragment;", "mFragment", j.f35131b, "Ljava/lang/String;", "keyWord", "", CampaignEx.JSON_KEY_AD_K, "I", "searchType", "l", "Z", "backExitSearch", "m", "a", "Search_psRelease"}, k = 1, mv = {2, 1, 0}, xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SearchManagerActivity extends BaseNewActivity<a> {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Fragment mFragment;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String keyWord;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int searchType = 3;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean backExitSearch;

    /* compiled from: source.java */
    /* renamed from: com.transsion.search.activity.SearchManagerActivity$a, reason: from kotlin metadata */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String msg) {
            Intrinsics.h(msg, "msg");
            Log.w("zxb_log_search", msg);
        }

        private Companion() {
        }
    }

    private final void H0() {
        Fragment a11;
        String str;
        if (this.mFragment != null) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
        x p11 = supportFragmentManager.p();
        Intrinsics.g(p11, "beginTransaction()");
        String stringExtra = getIntent().getStringExtra("hot_search_word");
        int i11 = this.searchType;
        if (i11 != 2) {
            if (i11 != 3) {
                a11 = SearchUploadWorkFragment.INSTANCE.a(i11);
            } else {
                a11 = SearchSubjectFragment.INSTANCE.a(stringExtra, this.keyWord, this.backExitSearch);
            }
        } else {
            a11 = SearchUploadGroupFragment.INSTANCE.a(i11);
        }
        Companion companion = INSTANCE;
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            str = fragment.getClass().getSimpleName();
        } else {
            str = null;
        }
        companion.a("fragment = " + str);
        p11.s(R$id.fl_content, a11);
        this.mFragment = a11;
        p11.j();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public a getViewBinding() {
        a c11 = a.c(getLayoutInflater());
        Intrinsics.g(c11, "inflate(...)");
        return c11;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "searchpage";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isChangeStatusBar() {
        return !kk.x.f69766a.a();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        return !kk.x.f69766a.a();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public String j0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
        x p11 = supportFragmentManager.p();
        Intrinsics.g(p11, "beginTransaction()");
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            p11.r(fragment);
        }
        p11.j();
        this.mFragment = null;
        super.onDestroy();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void p0() {
        TheRouter.l(this);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean r0() {
        if (this.searchType != 1) {
            return true;
        }
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        A0();
        if (m.f78942a.e()) {
            y0();
            H0();
        } else {
            C0();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void u0() {
        super.u0();
        H0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void o0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void q0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void t0() {
    }
}
