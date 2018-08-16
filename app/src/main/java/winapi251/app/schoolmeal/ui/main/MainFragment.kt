package winapi251.app.schoolmeal.ui.main

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.navigation.fragment.NavHostFragment
import winapi251.app.schoolmeal.R

/** 메인 프래그먼트 */
class MainFragment : NavHostFragment()
{
    /** 메인 프래그먼트가 생성될 때 호출된다. */
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        // 프래그먼트에서 액티비티의 툴바를 제어하게 한다.
        setHasOptionsMenu(true)
    }

    /** 메인 프래그먼트의 뷰를 전개한다. */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    /** 메인 프래그먼트의 툴바 메뉴를 생성한다. */
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater)
    {
        inflater.inflate(R.menu.fragment_main, menu)

        // 검색창 메뉴 초기화
        (menu.findItem(R.id.action_search_school).actionView as? SearchView)?.run {
            // 힌트 등록
            queryHint = getString(R.string.action_search_school)
        }
    }
}
