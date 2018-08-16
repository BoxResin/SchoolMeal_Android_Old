package winapi251.app.schoolmeal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

/** 메인 액티비티 */
class MainActivity : AppCompatActivity()
{
    /** 메인 액티비티가 생성될 때 호출된다. */
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 커스텀 툴바 연결
        setSupportActionBar(toolbar)

        // 내비게이션 그래프 연결
        setupActionBarWithNavController(this, findNavController(R.id.nav_host_fragment))
    }

    /** 백 버튼을 내비게이션 컨트롤러가 처리하게 한다. */
    override fun onSupportNavigateUp() = findNavController(R.id.nav_host_fragment).navigateUp()
}
