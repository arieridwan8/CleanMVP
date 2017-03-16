package id.arieridwan.cleanmvp.dagger.component;

import dagger.Component;
import id.arieridwan.cleanmvp.PerActivity;
import id.arieridwan.cleanmvp.dagger.module.ExchangeRateModule;
import id.arieridwan.cleanmvp.mvp.view.MainActivity;

/**
 * Created by arieridwan on 16/03/2017.
 */

@PerActivity
@Component(dependencies = AppComponent.class, modules = ExchangeRateModule.class)
public interface ExchangeRateComponent {
    void inject(MainActivity activity);
}
