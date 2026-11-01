package com.transsion.postdetail.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.transsion.baseui.R$color;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.memberapi.IMemberApi;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment;
import com.transsion.room.api.IFloatingApi;
import com.transsion.subtitle.dialog.SubtitleMainDialog2;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import rg.a;

/* compiled from: source.java */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u000fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0018\u0010+\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0018\u0010-\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010\"R\u0018\u0010/\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010\"R\u0018\u00102\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00105\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0018\u00108\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010<\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0018\u0010>\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/transsion/postdetail/ui/activity/LocalVideoDetailActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Liq/b;", "Lcom/transsion/videofloat/manager/c;", "<init>", "()V", "", "h0", "j0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isAttach", "()Z", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "g0", "()Liq/b;", "isTranslucent", "isStatusDark", "", "statusColor", "()I", "onBackPressed", "onPause", com.mbridge.msdk.foundation.same.report.j.f35131b, "isMusicFloatingAttach", "isShowMemberPushViewTip", "", "a", "Ljava/lang/String;", "path", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "url", "c", "proxyUrl", "d", "name", "e", "resourceId", "f", "postId", ae.g.f568b, "subjectId", "h", "Ljava/lang/Boolean;", "completed", "i", "isSeries", "pageFrom", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/Integer;", "videoHeight", "l", "videoWidth", "m", "parentPosition", "n", RequestParameters.POSITION, "Lcom/transsion/postdetail/ui/fragment/LocalVideoDetailFragment;", "o", "Lcom/transsion/postdetail/ui/fragment/LocalVideoDetailFragment;", "fragment", TtmlNode.TAG_P, "PostDetail_psRelease"}, k = 1, mv = {2, 1, 0}, xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: classes7.dex */
public final class LocalVideoDetailActivity extends BaseActivity<iq.b> implements com.transsion.videofloat.manager.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String path;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String url;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String proxyUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String resourceId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public String postId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String subjectId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String pageFrom;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private LocalVideoDetailFragment fragment;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Boolean completed = Boolean.TRUE;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Boolean isSeries = Boolean.FALSE;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public Integer videoHeight = 0;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Integer videoWidth = 0;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Integer parentPosition = -1;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Integer position = -1;

    private final void h0() {
        String str;
        Uri data = getIntent().getData();
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getType();
        } else {
            str = null;
        }
        if ((str != null && StringsKt.W(str, "video/", false, 2, null)) || (str != null && StringsKt.W(str, "audio/", false, 2, null))) {
            if (StringsKt.W(String.valueOf(data), "http", false, 2, null)) {
                this.url = String.valueOf(data);
            } else {
                this.path = String.valueOf(data);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0() {
        IMemberApi iMemberApi = (IMemberApi) TheRouter.d(IMemberApi.class, new Object[0]);
        if (iMemberApi != null) {
            iMemberApi.w(0.0f);
        }
    }

    private final void j0() {
        LocalVideoDetailFragment localVideoDetailFragment = this.fragment;
        if (localVideoDetailFragment != null) {
            localVideoDetailFragment.u3();
        }
        this.fragment = LocalVideoDetailFragment.INSTANCE.a(this.path, this.url, this.name, this.resourceId, this.postId, this.subjectId, this.proxyUrl, this.completed, this.isSeries, this.pageFrom, this.videoHeight, this.videoWidth, this.parentPosition, this.position);
        x p11 = getSupportFragmentManager().p();
        int i11 = R$id.container;
        LocalVideoDetailFragment localVideoDetailFragment2 = this.fragment;
        Intrinsics.e(localVideoDetailFragment2);
        p11.s(i11, localVideoDetailFragment2).j();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public iq.b getViewBinding() {
        iq.b c11 = iq.b.c(getLayoutInflater());
        Intrinsics.g(c11, "inflate(...)");
        return c11;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isAttach() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity
    public boolean isMusicFloatingAttach() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity
    public boolean isShowMemberPushViewTip() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return false;
    }

    @Override // com.transsion.videofloat.manager.c
    public void j() {
        LocalVideoDetailFragment localVideoDetailFragment = this.fragment;
        if (localVideoDetailFragment != null) {
            localVideoDetailFragment.u3();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IFloatingApi iFloatingApi = (IFloatingApi) TheRouter.d(IFloatingApi.class, new Object[0]);
        if (iFloatingApi != null) {
            iFloatingApi.e();
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        boolean z11;
        TheRouter.l(this);
        super.onCreate(savedInstanceState);
        a.C0888a c0888a = rg.a.f76847a;
        a.C0888a.f(c0888a, "LocalVideoDetail", "LocalVideoDetailActivity onCreate", false, 4, null);
        if (savedInstanceState == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        a.C0888a.f(c0888a, "VideoFloat", "LocalVideoDetailActivity onCreate, " + z11, false, 4, null);
        IFloatingApi iFloatingApi = (IFloatingApi) TheRouter.d(IFloatingApi.class, new Object[0]);
        if (iFloatingApi != null) {
            iFloatingApi.h();
        }
        IFloatingApi iFloatingApi2 = (IFloatingApi) TheRouter.d(IFloatingApi.class, new Object[0]);
        if (iFloatingApi2 != null) {
            iFloatingApi2.c();
        }
        h0();
        com.transsion.baselib.report.l.f42928a.w(1, this);
        if (savedInstanceState == null) {
            j0();
        }
        ((iq.b) getMViewBinding()).getRoot().post(new Runnable() { // from class: com.transsion.postdetail.ui.activity.a
            @Override // java.lang.Runnable
            public final void run() {
                LocalVideoDetailActivity.i0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        boolean c11 = Intrinsics.c(this.subjectId, intent.getStringExtra("extra_subject_id"));
        String stringExtra = intent.getStringExtra("extra_page_from");
        setIntent(intent);
        TheRouter.l(this);
        h0();
        if (Intrinsics.c(stringExtra, "media_notification")) {
            LocalVideoDetailFragment localVideoDetailFragment = this.fragment;
            if (localVideoDetailFragment != null) {
                localVideoDetailFragment.m3();
                return;
            }
            return;
        }
        a.C0888a.f(rg.a.f76847a, "LocalVideoDetail", "LocalVideoDetailActivity onNewIntent,isCurrentSubject = " + c11, false, 4, null);
        if (c11) {
            LocalVideoDetailFragment localVideoDetailFragment2 = this.fragment;
            if (localVideoDetailFragment2 != null) {
                localVideoDetailFragment2.c2(this.subjectId, this.resourceId);
                return;
            }
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Fragment k02 = getSupportFragmentManager().k0("fragment_subtitle_main_dialog");
            if (k02 != null && (k02 instanceof SubtitleMainDialog2)) {
                ((SubtitleMainDialog2) k02).dismissAllowingStateLoss();
            }
            Result.m470constructorimpl(Unit.f69817a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m470constructorimpl(ResultKt.a(th2));
        }
        j0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            LocalVideoDetailFragment localVideoDetailFragment = this.fragment;
            if (localVideoDetailFragment != null) {
                localVideoDetailFragment.u3();
            }
            fz.e.f65120a.b().m(this);
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public int statusColor() {
        return R$color.base_color_black;
    }
}
