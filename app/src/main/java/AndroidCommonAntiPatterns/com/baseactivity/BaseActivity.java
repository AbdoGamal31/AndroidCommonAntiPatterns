package AndroidCommonAntiPatterns.com.baseactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {
  private Unbinder unbinder;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutID());
    unbinder = ButterKnife.bind(this);
  }

  @Override protected void onDestroy() {
    unbinder.unbind();
    super.onDestroy();
  }

  public abstract int getLayoutID();
}
