package co.ambystic.renkarin.main.navigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import co.ambystic.renkarin.R;
import co.ambystic.renkarin.main.navigation.nav_fragment.CarHistoryFragment;
import co.ambystic.renkarin.main.navigation.nav_fragment.ProfileFragment;
import co.ambystic.renkarin.main.navigation.nav_fragment.StockCarFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isFragmentLoaded(new StockCarFragment());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragmentLoad;
        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                fragmentLoad = new StockCarFragment();
                break;
            case R.id.navigation_dashboard:
                fragmentLoad = new CarHistoryFragment();
                break;
            case R.id.navigation_notifications:
                fragmentLoad = new ProfileFragment();
                break;
            default:
                return false;
        }
        return isFragmentLoaded(fragmentLoad);
    }

    private boolean isFragmentLoaded(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContainer, fragment);
        transaction.commit();
        return true;
    }
}
