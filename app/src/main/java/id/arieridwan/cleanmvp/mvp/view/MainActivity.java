package id.arieridwan.cleanmvp.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import javax.inject.Inject;
import id.arieridwan.cleanmvp.MyApp;
import id.arieridwan.cleanmvp.R;
import id.arieridwan.cleanmvp.api.dao.ExchangeRateDao;
import id.arieridwan.cleanmvp.dagger.component.DaggerExchangeRateComponent;
import id.arieridwan.cleanmvp.dagger.module.ExchangeRateModule;
import id.arieridwan.cleanmvp.mvp.contract.ExchangeRateContract;
import id.arieridwan.cleanmvp.mvp.presenter.ExchangeRatePresenter;

public class MainActivity extends AppCompatActivity implements ExchangeRateContract.View {

    @Inject
    ExchangeRatePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerExchangeRateComponent.builder()
                .appComponent(((MyApp) getApplicationContext()).getAppComponent())
                .exchangeRateModule(new ExchangeRateModule(this))
                .build().inject(this);
        mPresenter.getExchangeRate();

    }

    @Override
    public void bindExchangeRate(ExchangeRateDao exchangeRateDao) {
        TextView textView = (TextView) findViewById(R.id.txt_jpy);
        textView.setText("JPY : " + String.valueOf(exchangeRateDao.getRates().getJPY()));
    }
}
