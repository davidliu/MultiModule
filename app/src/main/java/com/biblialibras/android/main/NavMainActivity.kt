package com.biblialibras.android.main

import android.os.Bundle
import com.airbnb.mvrx.BaseMvRxActivity
import com.biblialibras.android.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class NavMainActivity : BaseMvRxActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<androidx.fragment.app.Fragment>

    override fun supportFragmentInjector(): AndroidInjector<androidx.fragment.app.Fragment> {
        return supportFragmentInjector
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        setTheme(R.style.mainTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_main_activity)
    }
}
